import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class244 implements Interface11 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private int anInt6170;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	private int anInt6171;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!hu;")
	private final Class167 aClass167_17;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!tha;")
	private final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_5;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Z")
	private final boolean aBoolean405;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!tha;Lclient!hu;Z)V")
	public Class244(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass167_17 = arg1;
		this.aClass22_Sub2_Sub1_5 = arg0;
		this.aBoolean405 = arg2;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)I")
	@Override
	public int method6752() {
		return this.anInt6170;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5367() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(19) boolean local19 = this.aBoolean405 & true;
		if (!this.aBoolean404 && fma.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6171, local19 ? 8192 : 0, this.aClass22_Sub2_Sub1_5.aGeometryBuffer1), (byte) 8)) {
			this.aBoolean404 = true;
			return this.aClass22_Sub2_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lclient!hu;")
	@Override
	public Class167 method5368() {
		return this.aClass167_17;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5366() {
		if (this.aBoolean404 && fma.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -17)) {
			this.aBoolean404 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	@Override
	public void method6754() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) 125);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6171 = 0;
		this.anInt6170 = 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	@Override
	public void method6757(@OriginalArg(0) int arg0) {
		this.anInt6170 = this.aClass167_17.anInt3992 * arg0;
		if (this.anInt6171 >= this.anInt6170) {
			return;
		}
		@Pc(17) short local17 = 8;
		@Pc(22) byte local22;
		if (this.aBoolean405) {
			local22 = 0;
			local17 = 520;
		} else {
			local22 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -80);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass22_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt6170, local17, this.aClass167_17 == Static259.aClass167_8 ? 101 : 102, local22, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6171 = this.anInt6170;
	}
}

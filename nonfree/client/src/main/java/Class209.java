import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class209 implements Interface21 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	private int anInt5849;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int anInt5850;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!nb;")
	private final Class220 aClass220_7;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!gb;")
	private final Class9_Sub3_Sub1 aClass9_Sub3_Sub1_3;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!gb;Lclient!nb;Z)V")
	public Class209(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass220_7 = arg1;
		this.aClass9_Sub3_Sub1_3 = arg0;
		this.aBoolean440 = arg2;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Lclient!nb;")
	@Override
	public Class220 method5021() {
		return this.aClass220_7;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	@Override
	public void method6520() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -34);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt5850 = 0;
		this.anInt5849 = 0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6524() {
		if (this.aBoolean439 && hb.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -90)) {
			this.aBoolean439 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	@Override
	public int method6519() {
		return this.anInt5849;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6521() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean440 & true;
		if (!this.aBoolean439 && hb.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt5850, local16 ? 8192 : 0, this.aClass9_Sub3_Sub1_3.aGeometryBuffer1), (byte) -69)) {
			this.aBoolean439 = true;
			return this.aClass9_Sub3_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	@Override
	public void method5022(@OriginalArg(1) int arg0) {
		this.anInt5849 = arg0 * this.aClass220_7.anInt6224;
		if (this.anInt5850 >= this.anInt5849) {
			return;
		}
		@Pc(13) short local13 = 8;
		@Pc(22) byte local22;
		if (this.aBoolean440) {
			local13 = 520;
			local22 = 0;
		} else {
			local22 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -34);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass9_Sub3_Sub1_3.anIDirect3DDevice1.a(this.anInt5849, local13, this.aClass220_7 == Static336.aClass220_13 ? 101 : 102, local22, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt5850 = this.anInt5849;
	}
}

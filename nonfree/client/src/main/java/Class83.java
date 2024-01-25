import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class83 implements Interface21 {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	private int anInt2247;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private int anInt2248;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
	private final boolean aBoolean137;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!sga;")
	private final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_5;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!oea;")
	private final Class250 aClass250_6;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!sga;Lclient!oea;Z)V")
	public Class83(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean137 = arg2;
		this.aClass132_Sub1_Sub2_5 = arg0;
		this.aClass250_6 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	@Override
	public int method8886() {
		return this.anInt2247;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	@Override
	public void method8887() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-5017);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt2248 = 0;
		this.anInt2247 = 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5806() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean137 & true;
		if (!this.aBoolean136 && saa.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt2248, local11 ? 8192 : 0, this.aClass132_Sub1_Sub2_5.aGeometryBuffer1), (byte) -121)) {
			this.aBoolean136 = true;
			return this.aClass132_Sub1_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5808() {
		if (this.aBoolean136 && saa.b(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -57)) {
			this.aBoolean136 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Lclient!oea;")
	@Override
	public Class250 method5807() {
		return this.aClass250_6;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	@Override
	public void method5800(@OriginalArg(0) int arg0) {
		this.anInt2247 = this.aClass250_6.anInt7253 * arg0;
		if (this.anInt2247 <= this.anInt2248) {
			return;
		}
		@Pc(17) short local17 = 8;
		@Pc(22) byte local22;
		if (this.aBoolean137) {
			local22 = 0;
			local17 = 520;
		} else {
			local22 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-5017);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass132_Sub1_Sub2_5.anIDirect3DDevice1.a(this.anInt2247, local17, this.aClass250_6 == Static417.aClass250_15 ? 101 : 102, local22, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt2248 = this.anInt2247;
	}
}

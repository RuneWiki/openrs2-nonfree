import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.js;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class232 implements Interface2 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
	private int anInt6498;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
	private int anInt6499;

	@OriginalMember(owner = "client!nw", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "Lclient!to;")
	private final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_6;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!mg;")
	private final Class204 aClass204_18;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "Z")
	private final boolean aBoolean459;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!to;Lclient!mg;Z)V")
	public Class232(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass31_Sub1_Sub2_6 = arg0;
		this.aClass204_18 = arg1;
		this.aBoolean459 = arg2;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7291() {
		if (this.aBoolean458 && js.b(this.anIDirect3DIndexBuffer1.Unlock(), 141953135)) {
			this.aBoolean458 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7292() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean459 & true;
		if (!this.aBoolean458 && js.b(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt6498, local17 ? 8192 : 0, this.aClass31_Sub1_Sub2_6.aGeometryBuffer1), 141953135)) {
			this.aBoolean458 = true;
			return this.aClass31_Sub1_Sub2_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	@Override
	public void method7285() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(false);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt6498 = 0;
		this.anInt6499 = 0;
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.anInt6499;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
	@Override
	public void method7282(@OriginalArg(1) int arg0) {
		this.anInt6499 = arg0 * this.aClass204_18.anInt6009;
		if (this.anInt6499 <= this.anInt6498) {
			return;
		}
		@Pc(18) short local18 = 8;
		@Pc(27) byte local27;
		if (this.aBoolean459) {
			local18 = 520;
			local27 = 0;
		} else {
			local27 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(false);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass31_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt6499, local18, this.aClass204_18 == Static331.aClass204_14 ? 101 : 102, local27, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt6498 = this.anInt6499;
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)Lclient!mg;")
	@Override
	public Class204 method7290() {
		return this.aClass204_18;
	}
}

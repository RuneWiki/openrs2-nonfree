import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class26 implements Interface9 {

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!pj;")
	private final Class278 aClass278_3;

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "Lclient!sd;")
	private final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_2;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!sd;Lclient!pj;Z)V")
	public Class26(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class278 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass278_3 = arg1;
		this.aBoolean45 = arg2;
		this.aClass57_Sub3_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	@Override
	public int method2915() {
		return this.anInt476;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2926() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean45 & true;
		if (!this.aBoolean44 && hc.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt477, local9 ? 8192 : 0, this.aClass57_Sub3_Sub2_2.aGeometryBuffer1), true)) {
			this.aBoolean44 = true;
			return this.aClass57_Sub3_Sub2_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Lclient!pj;")
	@Override
	public Class278 method2928() {
		return this.aClass278_3;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	@Override
	public void method2925(@OriginalArg(0) int arg0) {
		this.anInt476 = arg0 * this.aClass278_3.anInt7757;
		if (this.anInt477 >= this.anInt476) {
			return;
		}
		@Pc(28) short local28 = 8;
		@Pc(33) byte local33;
		if (this.aBoolean45) {
			local33 = 0;
			local28 = 520;
		} else {
			local33 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-82);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass57_Sub3_Sub2_2.anIDirect3DDevice1.a(this.anInt476, local28, this.aClass278_3 == Static453.aClass278_14 ? 101 : 102, local33, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt477 = this.anInt476;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	@Override
	public void method2921() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(111);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt477 = 0;
		this.anInt476 = 0;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2927() {
		if (this.aBoolean44 && hc.a(this.anIDirect3DIndexBuffer1.Unlock(), true)) {
			this.aBoolean44 = false;
			return true;
		} else {
			return false;
		}
	}
}

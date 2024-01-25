import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!oc;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class11_Sub2(@OriginalArg(0) Class47_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean227) {
			@Pc(12) opengl local12 = this.aClass47_Sub2_33.anOpengl2;
			this.aClass147_2 = new Class147(arg0, 2);
			this.aClass147_2.method4035(0);
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2790(34165, 7681);
			this.aClass47_Sub2_33.method2801(2, 34168, 770);
			this.aClass47_Sub2_33.method2804(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass47_Sub2_33.method2828(0);
			this.aClass147_2.method4036();
			this.aClass147_2.method4035(1);
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2790(8448, 8448);
			this.aClass47_Sub2_33.method2801(2, 34166, 770);
			this.aClass47_Sub2_33.method2804(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass47_Sub2_33.method2828(0);
			this.aClass147_2.method4036();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
		this.aClass47_Sub2_33.method2772(arg0);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		if (this.aBoolean218) {
			this.aClass147_2.method4034('\u0001');
			this.aClass47_Sub2_33.method2828(1);
			this.aClass47_Sub2_33.method2772(null);
			this.aClass47_Sub2_33.method2828(0);
		} else {
			this.aClass47_Sub2_33.method2804(0, 5890);
		}
		this.aClass47_Sub2_33.method2790(8448, 8448);
		this.aBoolean218 = false;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class52_Sub4 local3 = this.aClass47_Sub2_33.method2768();
		if (this.aClass147_2 == null || local3 == null || !arg0) {
			this.aClass47_Sub2_33.method2804(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass47_Sub2_33.anOpengl2;
		this.aClass147_2.method4034('\u0000');
		this.aClass47_Sub2_33.method2828(1);
		this.aClass47_Sub2_33.method2772(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass47_Sub2_33.aClass57_Sub2_1.method4205(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass47_Sub2_33.method2828(0);
		this.aBoolean218 = true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
		this.aClass47_Sub2_33.method2790(8448, 7681);
	}
}

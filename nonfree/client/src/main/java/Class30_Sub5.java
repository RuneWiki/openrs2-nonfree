import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class30_Sub5 extends Class30 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!p;")
	private Class178 aClass178_3;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class30_Sub5(@OriginalArg(0) Class164_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean411) {
			@Pc(12) opengl local12 = this.aClass164_Sub1_39.anOpengl1;
			this.aClass178_3 = new Class178(arg0, 2);
			this.aClass178_3.method4028(0);
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3629(34165, 7681);
			this.aClass164_Sub1_39.method3571(2, 34168, 770);
			this.aClass164_Sub1_39.method3612(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass164_Sub1_39.method3584(0);
			this.aClass178_3.method4030();
			this.aClass178_3.method4028(1);
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3629(8448, 8448);
			this.aClass164_Sub1_39.method3571(2, 34166, 770);
			this.aClass164_Sub1_39.method3612(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass164_Sub1_39.method3584(0);
			this.aClass178_3.method4030();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	@Override
	public void method4842() {
		if (this.aBoolean481) {
			this.aClass178_3.method4029('\u0001');
			this.aClass164_Sub1_39.method3584(1);
			this.aClass164_Sub1_39.method3603(null);
			this.aClass164_Sub1_39.method3584(0);
		} else {
			this.aClass164_Sub1_39.method3612(0, 5890);
		}
		this.aClass164_Sub1_39.method3629(8448, 8448);
		this.aBoolean481 = false;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "()Z")
	@Override
	public boolean method4843() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	@Override
	public void method4844(@OriginalArg(0) boolean arg0) {
		this.aClass164_Sub1_39.method3629(8448, 7681);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ap;)V")
	@Override
	public void method4847(@OriginalArg(0) Class15 arg0) {
		this.aClass164_Sub1_39.method3603(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
	@Override
	public void method4846(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class15_Sub1 local3 = this.aClass164_Sub1_39.method3621();
		if (this.aClass178_3 == null || local3 == null || !arg0) {
			this.aClass164_Sub1_39.method3612(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass164_Sub1_39.anOpengl1;
		this.aClass178_3.method4029('\u0000');
		this.aClass164_Sub1_39.method3584(1);
		this.aClass164_Sub1_39.method3603(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass164_Sub1_39.aClass127_Sub2_1.method5277(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass164_Sub1_39.method3584(0);
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
	}
}

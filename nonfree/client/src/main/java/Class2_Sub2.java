import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!hd;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class2_Sub2(@OriginalArg(0) Class63_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean260) {
			@Pc(12) opengl local12 = this.aClass63_Sub1_30.anOpengl1;
			this.aClass78_2 = new Class78(arg0, 2);
			this.aClass78_2.method2431(0);
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3356(34165, 7681);
			this.aClass63_Sub1_30.method3325(2, 34168, 770);
			this.aClass63_Sub1_30.method3371(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass63_Sub1_30.method3345(0);
			this.aClass78_2.method2432();
			this.aClass78_2.method2431(1);
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3356(8448, 8448);
			this.aClass63_Sub1_30.method3325(2, 34166, 770);
			this.aClass63_Sub1_30.method3371(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass63_Sub1_30.method3345(0);
			this.aClass78_2.method2432();
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)V")
	@Override
	public void method3767(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class19_Sub2 local3 = this.aClass63_Sub1_30.method3369();
		if (this.aClass78_2 == null || local3 == null || !arg0) {
			this.aClass63_Sub1_30.method3371(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass63_Sub1_30.anOpengl1;
		this.aClass78_2.method2433('\u0000');
		this.aClass63_Sub1_30.method3345(1);
		this.aClass63_Sub1_30.method3355(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass63_Sub1_30.aClass129_Sub2_1.method5789(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass63_Sub1_30.method3345(0);
		this.aBoolean83 = true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "()Z")
	@Override
	public boolean method3768() {
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
	@Override
	public void method3765(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub1_30.method3356(8448, 7681);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "()V")
	@Override
	public void method3770() {
		if (this.aBoolean83) {
			this.aClass78_2.method2433('\u0001');
			this.aClass63_Sub1_30.method3345(1);
			this.aClass63_Sub1_30.method3355(null);
			this.aClass63_Sub1_30.method3345(0);
		} else {
			this.aClass63_Sub1_30.method3371(0, 5890);
		}
		this.aClass63_Sub1_30.method3356(8448, 8448);
		this.aBoolean83 = false;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	@Override
	public void method3766(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!vo;)V")
	@Override
	public void method3769(@OriginalArg(0) Class19 arg0) {
		this.aClass63_Sub1_30.method3355(arg0);
	}
}

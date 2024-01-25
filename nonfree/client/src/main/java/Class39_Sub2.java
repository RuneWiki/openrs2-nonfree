import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!q;")
	private Class168 aClass168_2;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class39_Sub2(@OriginalArg(0) Class89_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean199) {
			@Pc(12) opengl local12 = this.aClass89_Sub1_39.anOpengl2;
			this.aClass168_2 = new Class168(arg0, 2);
			this.aClass168_2.method4286(0);
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2419(34165, 7681);
			this.aClass89_Sub1_39.method2392(2, 34168, 770);
			this.aClass89_Sub1_39.method2451(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass89_Sub1_39.method2433(0);
			this.aClass168_2.method4285();
			this.aClass168_2.method4286(1);
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2419(8448, 8448);
			this.aClass89_Sub1_39.method2392(2, 34166, 770);
			this.aClass89_Sub1_39.method2451(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass89_Sub1_39.method2433(0);
			this.aClass168_2.method4285();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
		this.aClass89_Sub1_39.method2445(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		if (this.aBoolean113) {
			this.aClass168_2.method4287('\u0001');
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(null);
			this.aClass89_Sub1_39.method2433(0);
		} else {
			this.aClass89_Sub1_39.method2451(0, 5890);
		}
		this.aClass89_Sub1_39.method2419(8448, 8448);
		this.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
		this.aClass89_Sub1_39.method2419(8448, 7681);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class92_Sub3 local3 = this.aClass89_Sub1_39.method2393();
		if (this.aClass168_2 == null || local3 == null || !arg0) {
			this.aClass89_Sub1_39.method2451(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_2.method4287('\u0000');
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2445(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass89_Sub1_39.aClass70_Sub2_1.method3722(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass89_Sub1_39.method2433(0);
		this.aBoolean113 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
	}
}

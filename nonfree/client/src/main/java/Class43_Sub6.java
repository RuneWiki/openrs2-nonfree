import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class43_Sub6 extends Class43 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!ns;")
	private Class147 aClass147_5;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class43_Sub6(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean352) {
			@Pc(12) opengl local12 = this.aClass122_Sub2_37.anOpengl2;
			this.aClass147_5 = new Class147(arg0, 2);
			this.aClass147_5.method3752(0);
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4860(34165, 7681);
			this.aClass122_Sub2_37.method4815(2, 34168, 770);
			this.aClass122_Sub2_37.method4816(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass122_Sub2_37.method4811(0);
			this.aClass147_5.method3753();
			this.aClass147_5.method3752(1);
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4860(8448, 8448);
			this.aClass122_Sub2_37.method4815(2, 34166, 770);
			this.aClass122_Sub2_37.method4816(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass122_Sub2_37.method4811(0);
			this.aClass147_5.method3753();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public void method4381(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	@Override
	public void method4382() {
		if (this.aBoolean255) {
			this.aClass147_5.method3754('\u0001');
			this.aClass122_Sub2_37.method4811(1);
			this.aClass122_Sub2_37.method4864(null);
			this.aClass122_Sub2_37.method4811(0);
		} else {
			this.aClass122_Sub2_37.method4816(0, 5890);
		}
		this.aClass122_Sub2_37.method4860(8448, 8448);
		this.aBoolean255 = false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!gd;)V")
	@Override
	public void method4385(@OriginalArg(0) Class66 arg0) {
		this.aClass122_Sub2_37.method4864(arg0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()Z")
	@Override
	public boolean method4383() {
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	@Override
	public void method4384(@OriginalArg(0) boolean arg0) {
		this.aClass122_Sub2_37.method4860(8448, 7681);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	@Override
	public void method4386(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class66_Sub4 local3 = this.aClass122_Sub2_37.method4836();
		if (this.aClass147_5 == null || local3 == null || !arg0) {
			this.aClass122_Sub2_37.method4816(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass122_Sub2_37.anOpengl2;
		this.aClass147_5.method3754('\u0000');
		this.aClass122_Sub2_37.method4811(1);
		this.aClass122_Sub2_37.method4864(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass122_Sub2_37.aClass56_Sub2_2.method4700(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass122_Sub2_37.method4811(0);
		this.aBoolean255 = true;
	}
}

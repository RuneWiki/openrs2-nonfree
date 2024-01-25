import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!tp;")
	private Class199 aClass199_1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class29_Sub1(@OriginalArg(0) Class32_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean234) {
			@Pc(12) opengl local12 = this.aClass32_Sub2_39.anOpengl2;
			this.aClass199_1 = new Class199(arg0, 2);
			this.aClass199_1.method5169(0);
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2255(34165, 7681);
			this.aClass32_Sub2_39.method2276(2, 34168, 770);
			this.aClass32_Sub2_39.method2265(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass32_Sub2_39.method2314(0);
			this.aClass199_1.method5168();
			this.aClass199_1.method5169(1);
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2255(8448, 8448);
			this.aClass32_Sub2_39.method2276(2, 34166, 770);
			this.aClass32_Sub2_39.method2265(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass32_Sub2_39.method2314(0);
			this.aClass199_1.method5168();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class20_Sub2 local3 = this.aClass32_Sub2_39.method2311();
		if (this.aClass199_1 == null || local3 == null || !arg0) {
			this.aClass32_Sub2_39.method2265(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass32_Sub2_39.anOpengl2;
		this.aClass199_1.method5170('\u0000');
		this.aClass32_Sub2_39.method2314(1);
		this.aClass32_Sub2_39.method2287(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass32_Sub2_39.aClass109_Sub2_2.method3883(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass32_Sub2_39.method2314(0);
		this.aBoolean122 = true;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
		this.aClass32_Sub2_39.method2255(8448, 7681);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		if (this.aBoolean122) {
			this.aClass199_1.method5170('\u0001');
			this.aClass32_Sub2_39.method2314(1);
			this.aClass32_Sub2_39.method2287(null);
			this.aClass32_Sub2_39.method2314(0);
		} else {
			this.aClass32_Sub2_39.method2265(0, 5890);
		}
		this.aClass32_Sub2_39.method2255(8448, 8448);
		this.aBoolean122 = false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
		this.aClass32_Sub2_39.method2287(arg0);
	}
}

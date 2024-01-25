import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class22_Sub7 extends Class22 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!bb;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class22_Sub7(@OriginalArg(0) Class129_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean393) {
			@Pc(12) opengl local12 = this.aClass129_Sub2_32.anOpengl2;
			this.aClass20_6 = new Class20(arg0, 2);
			this.aClass20_6.method222(0);
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5067(34165, 7681);
			this.aClass129_Sub2_32.method5037(2, 34168, 770);
			this.aClass129_Sub2_32.method5097(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass129_Sub2_32.method5091(0);
			this.aClass20_6.method221();
			this.aClass20_6.method222(1);
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5067(8448, 8448);
			this.aClass129_Sub2_32.method5037(2, 34166, 770);
			this.aClass129_Sub2_32.method5097(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass129_Sub2_32.method5091(0);
			this.aClass20_6.method221();
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class56_Sub1 local3 = this.aClass129_Sub2_32.method5056();
		if (this.aClass20_6 == null || local3 == null || !arg0) {
			this.aClass129_Sub2_32.method5097(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_6.method223('\u0000');
		this.aClass129_Sub2_32.method5091(1);
		this.aClass129_Sub2_32.method5084(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass129_Sub2_32.aClass61_Sub2_1.method3673(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass129_Sub2_32.method5091(0);
		this.aBoolean326 = true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
		this.aClass129_Sub2_32.method5084(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
		this.aClass129_Sub2_32.method5067(8448, 7681);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		if (this.aBoolean326) {
			this.aClass20_6.method223('\u0001');
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(null);
			this.aClass129_Sub2_32.method5091(0);
		} else {
			this.aClass129_Sub2_32.method5097(0, 5890);
		}
		this.aClass129_Sub2_32.method5067(8448, 8448);
		this.aBoolean326 = false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
	}
}

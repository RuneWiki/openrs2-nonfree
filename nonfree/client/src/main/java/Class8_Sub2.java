import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!t;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class8_Sub2(@OriginalArg(0) Class82_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean412) {
			@Pc(12) opengl local12 = this.aClass82_Sub2_34.anOpengl2;
			this.aClass217_2 = new Class217(arg0, 2);
			this.aClass217_2.method5088(0);
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4624(34165, 7681);
			this.aClass82_Sub2_34.method4592(2, 34168, 770);
			this.aClass82_Sub2_34.method4631(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass82_Sub2_34.method4582(0);
			this.aClass217_2.method5090();
			this.aClass217_2.method5088(1);
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4624(8448, 8448);
			this.aClass82_Sub2_34.method4592(2, 34166, 770);
			this.aClass82_Sub2_34.method4631(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass82_Sub2_34.method4582(0);
			this.aClass217_2.method5090();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
		this.aClass82_Sub2_34.method4614(arg0);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		if (this.aBoolean12) {
			this.aClass217_2.method5089('\u0001');
			this.aClass82_Sub2_34.method4582(1);
			this.aClass82_Sub2_34.method4614(null);
			this.aClass82_Sub2_34.method4582(0);
		} else {
			this.aClass82_Sub2_34.method4631(0, 5890);
		}
		this.aClass82_Sub2_34.method4624(8448, 8448);
		this.aBoolean12 = false;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
		this.aClass82_Sub2_34.method4624(8448, 7681);
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class7_Sub4 local3 = this.aClass82_Sub2_34.method4596();
		if (this.aClass217_2 == null || local3 == null || !arg0) {
			this.aClass82_Sub2_34.method4631(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass82_Sub2_34.anOpengl2;
		this.aClass217_2.method5089('\u0000');
		this.aClass82_Sub2_34.method4582(1);
		this.aClass82_Sub2_34.method4614(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass82_Sub2_34.aClass54_Sub2_1.method4795(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass82_Sub2_34.method4582(0);
		this.aBoolean12 = true;
	}
}

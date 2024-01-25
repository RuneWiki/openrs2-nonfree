import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!hi;")
	private Class86 aClass86_4;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class33_Sub3(@OriginalArg(0) Class55_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean318) {
			@Pc(12) opengl local12 = this.aClass55_Sub1_42.anOpengl1;
			this.aClass86_4 = new Class86(arg0, 2);
			this.aClass86_4.method2104(0);
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3709(34165, 7681);
			this.aClass55_Sub1_42.method3684(2, 34168, 770);
			this.aClass55_Sub1_42.method3689(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass55_Sub1_42.method3693(0);
			this.aClass86_4.method2105();
			this.aClass86_4.method2104(1);
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3709(8448, 8448);
			this.aClass55_Sub1_42.method3684(2, 34166, 770);
			this.aClass55_Sub1_42.method3689(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass55_Sub1_42.method3693(0);
			this.aClass86_4.method2105();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!t;)V")
	@Override
	public void method6045(@OriginalArg(0) Class60 arg0) {
		this.aClass55_Sub1_42.method3677(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	@Override
	public void method6042(@OriginalArg(0) boolean arg0) {
		this.aClass55_Sub1_42.method3709(8448, 7681);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()Z")
	@Override
	public boolean method6041() {
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)V")
	@Override
	public void method6046(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class60_Sub2 local3 = this.aClass55_Sub1_42.method3643();
		if (this.aClass86_4 == null || local3 == null || !arg0) {
			this.aClass55_Sub1_42.method3689(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass55_Sub1_42.anOpengl1;
		this.aClass86_4.method2106('\u0000');
		this.aClass55_Sub1_42.method3693(1);
		this.aClass55_Sub1_42.method3677(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass55_Sub1_42.aClass66_Sub2_1.method5830(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass55_Sub1_42.method3693(0);
		this.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
	@Override
	public void method6043() {
		if (this.aBoolean155) {
			this.aClass86_4.method2106('\u0001');
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3677(null);
			this.aClass55_Sub1_42.method3693(0);
		} else {
			this.aClass55_Sub1_42.method3689(0, 5890);
		}
		this.aClass55_Sub1_42.method3709(8448, 8448);
		this.aBoolean155 = false;
	}
}

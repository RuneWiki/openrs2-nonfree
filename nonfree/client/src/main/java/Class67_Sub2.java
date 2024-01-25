import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!cq;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class67_Sub2(@OriginalArg(0) Class37_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean58) {
			@Pc(12) opengl local12 = this.aClass37_Sub1_27.anOpengl1;
			this.aClass45_2 = new Class45(arg0, 2);
			this.aClass45_2.method947(0);
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method735(34165, 7681);
			this.aClass37_Sub1_27.method732(2, 34168, 770);
			this.aClass37_Sub1_27.method769(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass37_Sub1_27.method759(0);
			this.aClass45_2.method949();
			this.aClass45_2.method947(1);
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method735(8448, 8448);
			this.aClass37_Sub1_27.method732(2, 34166, 770);
			this.aClass37_Sub1_27.method769(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass37_Sub1_27.method759(0);
			this.aClass45_2.method949();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	public void method4167(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z")
	@Override
	public boolean method4168() {
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	@Override
	public void method4163(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class81_Sub1 local3 = this.aClass37_Sub1_27.method743();
		if (this.aClass45_2 == null || local3 == null || !arg0) {
			this.aClass37_Sub1_27.method769(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass37_Sub1_27.anOpengl1;
		this.aClass45_2.method948('\u0000');
		this.aClass37_Sub1_27.method759(1);
		this.aClass37_Sub1_27.method767(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass37_Sub1_27.aClass38_Sub2_2.method4482(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass37_Sub1_27.method759(0);
		this.aBoolean212 = true;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	@Override
	public void method4164(@OriginalArg(0) boolean arg0) {
		this.aClass37_Sub1_27.method735(8448, 7681);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "()V")
	@Override
	public void method4166() {
		if (this.aBoolean212) {
			this.aClass45_2.method948('\u0001');
			this.aClass37_Sub1_27.method759(1);
			this.aClass37_Sub1_27.method767(null);
			this.aClass37_Sub1_27.method759(0);
		} else {
			this.aClass37_Sub1_27.method769(0, 5890);
		}
		this.aClass37_Sub1_27.method735(8448, 8448);
		this.aBoolean212 = false;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4165(@OriginalArg(0) Class81 arg0) {
		this.aClass37_Sub1_27.method767(arg0);
	}
}

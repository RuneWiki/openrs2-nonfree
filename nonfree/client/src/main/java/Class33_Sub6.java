import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class33_Sub6 extends Class33 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!rj;")
	private Class203 aClass203_5;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bf;)V", line = 44)
	public Class33_Sub6(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean38) {
			@Pc(12) opengl local12 = this.aClass19_Sub1_35.anOpengl1;
			this.aClass203_5 = new Class203(arg0, 2);
			this.aClass203_5.method5193(0);
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method794(34165, 7681);
			this.aClass19_Sub1_35.method793(2, 34168, 770);
			this.aClass19_Sub1_35.method833(0, 34167);
			local12.glTexGeni(8192, 9472, 34066);
			local12.glTexGeni(8193, 9472, 34066);
			local12.glTexGeni(8194, 9472, 34066);
			local12.glEnable(3168);
			local12.glEnable(3169);
			local12.glEnable(3170);
			this.aClass19_Sub1_35.method832(0);
			this.aClass203_5.method5192();
			this.aClass203_5.method5193(1);
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method794(8448, 8448);
			this.aClass19_Sub1_35.method793(2, 34166, 770);
			this.aClass19_Sub1_35.method833(0, 5890);
			local12.glDisable(3168);
			local12.glDisable(3169);
			local12.glDisable(3170);
			local12.glMatrixMode(5890);
			local12.glLoadIdentity();
			local12.glMatrixMode(5888);
			this.aClass19_Sub1_35.method832(0);
			this.aClass203_5.method5192();
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)V", line = 4)
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class8_Sub3 local3 = this.aClass19_Sub1_35.method838();
		if (this.aClass203_5 == null || local3 == null || !arg0) {
			this.aClass19_Sub1_35.method833(0, 34168);
			return;
		}
		@Pc(14) opengl local14 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass203_5.method5191('\u0000');
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method848(local3);
		local14.glMatrixMode(5890);
		local14.glLoadMatrixf(this.aClass19_Sub1_35.aClass14_Sub2_1.method3941(), 0);
		local14.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		local14.glMatrixMode(5888);
		this.aClass19_Sub1_35.method832(0);
		this.aBoolean327 = true;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!kq;)V", line = 24)
	@Override
	public void method5711(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 27)
	@Override
	public void method5713(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "()V", line = 29)
	@Override
	public void method5716() {
		if (this.aBoolean327) {
			this.aClass203_5.method5191('\u0001');
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method832(0);
		} else {
			this.aClass19_Sub1_35.method833(0, 5890);
		}
		this.aClass19_Sub1_35.method794(8448, 8448);
		this.aBoolean327 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 82)
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method794(8448, 7681);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()Z", line = 86)
	@Override
	public boolean method5712() {
		return true;
	}
}

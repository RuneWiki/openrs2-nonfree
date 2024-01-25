import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class60_Sub8 extends Class60 {

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "Lclient!qda;")
	private Class266 aClass266_6;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class60_Sub8(@OriginalArg(0) Class14_Sub3 arg0) {
		super(arg0);
		if (arg0.bf) {
			this.aClass266_6 = new Class266(arg0, 2);
			this.aClass266_6.method5983(0);
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3976(34165, 7681);
			super.aClass14_Sub3_42.method3966(34168, 2, 770);
			super.aClass14_Sub3_42.method3918(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass14_Sub3_42.method3917(0);
			this.aClass266_6.method5989();
			this.aClass266_6.method5983(1);
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3976(8448, 8448);
			super.aClass14_Sub3_42.method3966(34166, 2, 770);
			super.aClass14_Sub3_42.method3918(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass14_Sub3_42.method3917(0);
			this.aClass266_6.method5989();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		if (this.aBoolean648) {
			this.aClass266_6.method5987('\u0001');
			super.aClass14_Sub3_42.method3917(1);
			super.aClass14_Sub3_42.method3985(null);
			super.aClass14_Sub3_42.method3917(0);
		} else {
			super.aClass14_Sub3_42.method3918(0, 5890);
		}
		super.aClass14_Sub3_42.method3976(8448, 8448);
		this.aBoolean648 = false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub3_42.method3976(8448, 7681);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		super.aClass14_Sub3_42.method3985(arg1);
		super.aClass14_Sub3_42.method3925(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class51_Sub3 local8 = super.aClass14_Sub3_42.method3978();
		if (this.aClass266_6 == null || local8 == null || !arg0) {
			super.aClass14_Sub3_42.method3918(0, 34168);
			return;
		}
		this.aClass266_6.method5987('\u0000');
		super.aClass14_Sub3_42.method3917(1);
		super.aClass14_Sub3_42.method3985(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass14_Sub3_42.aClass54_Sub2_3.method4408(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass14_Sub3_42.method3917(0);
		this.aBoolean648 = true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

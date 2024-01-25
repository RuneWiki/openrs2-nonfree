import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "Lclient!up;")
	private Class358 aClass358_3;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class11_Sub3(@OriginalArg(0) Class132_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean536) {
			this.aClass358_3 = new Class358(arg0, 2);
			this.aClass358_3.method8419(0);
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6770(7681, 34165);
			super.aClass132_Sub3_43.method6763(2, 770, 34168);
			super.aClass132_Sub3_43.method6760(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass132_Sub3_43.method6802(0);
			this.aClass358_3.method8417();
			this.aClass358_3.method8419(1);
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6770(8448, 8448);
			super.aClass132_Sub3_43.method6763(2, 770, 34166);
			super.aClass132_Sub3_43.method6760(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass132_Sub3_43.method6802(0);
			this.aClass358_3.method8417();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	@Override
	public void method8982() {
		if (this.aBoolean160) {
			this.aClass358_3.method8418('\u0001');
			super.aClass132_Sub3_43.method6802(1);
			super.aClass132_Sub3_43.method6759((Class53) null);
			super.aClass132_Sub3_43.method6802(0);
		} else {
			super.aClass132_Sub3_43.method6760(5890, 0);
		}
		super.aClass132_Sub3_43.method6770(8448, 8448);
		this.aBoolean160 = false;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8984(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class53_Sub3 local8 = super.aClass132_Sub3_43.method6784();
		if (this.aClass358_3 == null || local8 == null || !arg0) {
			super.aClass132_Sub3_43.method6760(34168, 0);
			return;
		}
		this.aClass358_3.method8418('\u0000');
		super.aClass132_Sub3_43.method6802(1);
		super.aClass132_Sub3_43.method6759(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass132_Sub3_43.aClass207_Sub1_5.method4999(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass132_Sub3_43.method6802(0);
		this.aBoolean160 = true;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZLclient!wha;)V")
	@Override
	public void method8983(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		super.aClass132_Sub3_43.method6759(arg1);
		super.aClass132_Sub3_43.method6803(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8989(@OriginalArg(0) boolean arg0) {
		super.aClass132_Sub3_43.method6770(7681, 8448);
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8991() {
		return true;
	}
}

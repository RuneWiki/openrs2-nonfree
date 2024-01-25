import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
	private boolean aBoolean276 = false;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!pha;")
	private Class290 aClass290_1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class112_Sub1(@OriginalArg(0) Class145_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean871) {
			this.aClass290_1 = new Class290(arg0, 2);
			this.aClass290_1.method6989(0);
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8897(7681, 34165);
			super.aClass145_Sub3_43.method8854(2, 34168, 770);
			super.aClass145_Sub3_43.method8857(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass145_Sub3_43.method8859(0);
			this.aClass290_1.method6988();
			this.aClass290_1.method6989(1);
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8897(8448, 8448);
			super.aClass145_Sub3_43.method8854(2, 34166, 770);
			super.aClass145_Sub3_43.method8857(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass145_Sub3_43.method8859(0);
			this.aClass290_1.method6988();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public void method8390() {
		if (this.aBoolean276) {
			this.aClass290_1.method6987('\u0001');
			super.aClass145_Sub3_43.method8859(1);
			super.aClass145_Sub3_43.method8872((Class64) null);
			super.aClass145_Sub3_43.method8859(0);
		} else {
			super.aClass145_Sub3_43.method8857(5890, 0);
		}
		super.aClass145_Sub3_43.method8897(8448, 8448);
		this.aBoolean276 = false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8396(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class64_Sub2 local8 = super.aClass145_Sub3_43.method8860();
		if (this.aClass290_1 == null || local8 == null || !arg0) {
			super.aClass145_Sub3_43.method8857(34168, 0);
			return;
		}
		this.aClass290_1.method6987('\u0000');
		super.aClass145_Sub3_43.method8859(1);
		super.aClass145_Sub3_43.method8872(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass145_Sub3_43.aClass86_Sub1_5.method1813(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass145_Sub3_43.method8859(0);
		this.aBoolean276 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!jca;II)V")
	@Override
	public void method8397(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub3_43.method8872(arg0);
		super.aClass145_Sub3_43.method8900(arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8388(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub3_43.method8897(7681, 8448);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
	@Override
	public void method8393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8389() {
		return true;
	}
}

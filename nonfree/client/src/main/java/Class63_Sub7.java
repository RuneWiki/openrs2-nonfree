import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class63_Sub7 extends Class63 {

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
	private boolean aBoolean567 = false;

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "Lclient!gca;")
	private Class131 aClass131_5;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class63_Sub7(@OriginalArg(0) Class22_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean72) {
			this.aClass131_5 = new Class131(arg0, 2);
			this.aClass131_5.method3046(0);
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method900(7681, 34165);
			super.aClass22_Sub1_43.method935(770, 2, 34168);
			super.aClass22_Sub1_43.method963(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass22_Sub1_43.method931(0);
			this.aClass131_5.method3048();
			this.aClass131_5.method3046(1);
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method900(8448, 8448);
			super.aClass22_Sub1_43.method935(770, 2, 34166);
			super.aClass22_Sub1_43.method963(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass22_Sub1_43.method931(0);
			this.aClass131_5.method3048();
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub1_43.method900(7681, 8448);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		if (this.aBoolean567) {
			this.aClass131_5.method3047('\u0001');
			super.aClass22_Sub1_43.method931(1);
			super.aClass22_Sub1_43.method955((Class125) null);
			super.aClass22_Sub1_43.method931(0);
		} else {
			super.aClass22_Sub1_43.method963(0, 5890);
		}
		super.aClass22_Sub1_43.method900(8448, 8448);
		this.aBoolean567 = false;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub1_43.method955(arg0);
		super.aClass22_Sub1_43.method894(arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class125_Sub2 local8 = super.aClass22_Sub1_43.method920();
		if (this.aClass131_5 == null || local8 == null || !arg0) {
			super.aClass22_Sub1_43.method963(0, 34168);
			return;
		}
		this.aClass131_5.method3047('\u0000');
		super.aClass22_Sub1_43.method931(1);
		super.aClass22_Sub1_43.method955(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass22_Sub1_43.aClass58_Sub3_5.method9532(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass22_Sub1_43.method931(0);
		this.aBoolean567 = true;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}

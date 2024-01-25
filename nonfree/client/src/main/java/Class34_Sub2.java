import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "Lclient!vi;")
	private Class360 aClass360_3;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class34_Sub2(@OriginalArg(0) Class126_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean678) {
			this.aClass360_3 = new Class360(arg0, 2);
			this.aClass360_3.method8433(0);
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7082(7681, 34165);
			super.aClass126_Sub3_39.method7135(770, 34168, 2);
			super.aClass126_Sub3_39.method7073(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass126_Sub3_39.method7104(0);
			this.aClass360_3.method8436();
			this.aClass360_3.method8433(1);
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7082(8448, 8448);
			super.aClass126_Sub3_39.method7135(770, 34166, 2);
			super.aClass126_Sub3_39.method7073(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass126_Sub3_39.method7104(0);
			this.aClass360_3.method8436();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (this.aBoolean284) {
			this.aClass360_3.method8434('\u0001');
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113((Class24) null);
			super.aClass126_Sub3_39.method7104(0);
		} else {
			super.aClass126_Sub3_39.method7073(0, 5890);
		}
		super.aClass126_Sub3_39.method7082(8448, 8448);
		this.aBoolean284 = false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass126_Sub3_39.method7113(arg1);
		super.aClass126_Sub3_39.method7105(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
		super.aClass126_Sub3_39.method7082(7681, 8448);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		@Pc(12) Class24_Sub3 local12 = super.aClass126_Sub3_39.method7099();
		if (this.aClass360_3 == null || local12 == null || !arg0) {
			super.aClass126_Sub3_39.method7073(0, 34168);
			return;
		}
		this.aClass360_3.method8434('\u0000');
		super.aClass126_Sub3_39.method7104(1);
		super.aClass126_Sub3_39.method7113(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass126_Sub3_39.aClass117_Sub3_5.method7269(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass126_Sub3_39.method7104(0);
		this.aBoolean284 = true;
	}
}

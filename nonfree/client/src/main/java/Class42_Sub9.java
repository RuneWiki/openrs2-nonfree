import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class42_Sub9 extends Class42 {

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
	private boolean aBoolean807 = false;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!bq;")
	private Class41 aClass41_6;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class42_Sub9(@OriginalArg(0) Class162_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean725) {
			this.aClass41_6 = new Class41(arg0, 2);
			this.aClass41_6.method823(0);
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6903(34165, 7681);
			super.aClass162_Sub3_44.method6957(34168, 770, 2);
			super.aClass162_Sub3_44.method6926(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass162_Sub3_44.method6947(0);
			this.aClass41_6.method822();
			this.aClass41_6.method823(1);
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6903(8448, 8448);
			super.aClass162_Sub3_44.method6957(34166, 770, 2);
			super.aClass162_Sub3_44.method6926(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass162_Sub3_44.method6947(0);
			this.aClass41_6.method822();
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
	@Override
	public void method7741() {
		if (this.aBoolean807) {
			this.aClass41_6.method821('\u0001');
			super.aClass162_Sub3_44.method6947(1);
			super.aClass162_Sub3_44.method6911(null);
			super.aClass162_Sub3_44.method6947(0);
		} else {
			super.aClass162_Sub3_44.method6926(5890, 0);
		}
		super.aClass162_Sub3_44.method6903(8448, 8448);
		this.aBoolean807 = false;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7737(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub3_44.method6903(8448, 7681);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!vaa;B)V")
	@Override
	public void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass162_Sub3_44.method6911(arg1);
		super.aClass162_Sub3_44.method6953(arg0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7739(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class3_Sub3 local8 = super.aClass162_Sub3_44.method6900();
		if (this.aClass41_6 == null || local8 == null || !arg0) {
			super.aClass162_Sub3_44.method6926(34168, 0);
			return;
		}
		this.aClass41_6.method821('\u0000');
		super.aClass162_Sub3_44.method6947(1);
		super.aClass162_Sub3_44.method6911(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass162_Sub3_44.aClass25_Sub1_5.method376(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass162_Sub3_44.method6947(0);
		this.aBoolean807 = true;
	}
}

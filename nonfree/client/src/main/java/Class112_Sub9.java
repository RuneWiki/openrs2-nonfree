import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class112_Sub9 extends Class112 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!ud;")
	private Class294 aClass294_5;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class112_Sub9(@OriginalArg(0) Class42_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean299) {
			this.aClass294_5 = new Class294(arg0, 2);
			this.aClass294_5.method7287(0);
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3250(34165, 7681);
			super.aClass42_Sub3_39.method3268(2, 770, 34168);
			super.aClass42_Sub3_39.method3201(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass42_Sub3_39.method3259(0);
			this.aClass294_5.method7288();
			this.aClass294_5.method7287(1);
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3250(8448, 8448);
			super.aClass42_Sub3_39.method3268(2, 770, 34166);
			super.aClass42_Sub3_39.method3201(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass42_Sub3_39.method3259(0);
			this.aClass294_5.method7288();
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	@Override
	public void method7308() {
		if (this.aBoolean629) {
			this.aClass294_5.method7284('\u0001');
			super.aClass42_Sub3_39.method3259(1);
			super.aClass42_Sub3_39.method3219(null);
			super.aClass42_Sub3_39.method3259(0);
		} else {
			super.aClass42_Sub3_39.method3201(0, 5890);
		}
		super.aClass42_Sub3_39.method3250(8448, 8448);
		this.aBoolean629 = false;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!mw;I)V")
	@Override
	public void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub3_39.method3219(arg0);
		super.aClass42_Sub3_39.method3257(arg1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7309(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub3_39.method3250(8448, 7681);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7305() {
		return true;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7306(@OriginalArg(1) boolean arg0) {
		@Pc(8) Class79_Sub4 local8 = super.aClass42_Sub3_39.method3270();
		if (this.aClass294_5 == null || local8 == null || !arg0) {
			super.aClass42_Sub3_39.method3201(0, 34168);
			return;
		}
		this.aClass294_5.method7284('\u0000');
		super.aClass42_Sub3_39.method3259(1);
		super.aClass42_Sub3_39.method3219(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass42_Sub3_39.aClass91_Sub1_3.method2459(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass42_Sub3_39.method3259(0);
		this.aBoolean629 = true;
	}
}

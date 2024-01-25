import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class231_Sub3 extends Class231 {

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Lclient!nc;")
	private Class243 aClass243_4;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class231_Sub3(@OriginalArg(0) Class65_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean109) {
			this.aClass243_4 = new Class243(arg0, 2);
			this.aClass243_4.method5742(0);
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1228(34165, 7681);
			super.aClass65_Sub1_41.method1265(2, 770, 34168);
			super.aClass65_Sub1_41.method1233(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass65_Sub1_41.method1256(0);
			this.aClass243_4.method5741();
			this.aClass243_4.method5742(1);
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1228(8448, 8448);
			super.aClass65_Sub1_41.method1265(2, 770, 34166);
			super.aClass65_Sub1_41.method1233(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass65_Sub1_41.method1256(0);
			this.aClass243_4.method5741();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class80_Sub4 local12 = super.aClass65_Sub1_41.method1244();
		if (this.aClass243_4 == null || local12 == null || !arg0) {
			super.aClass65_Sub1_41.method1233(0, 34168);
			return;
		}
		this.aClass243_4.method5740('\u0000');
		super.aClass65_Sub1_41.method1256(1);
		super.aClass65_Sub1_41.method1286(local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass65_Sub1_41.aClass254_Sub1_4.method5931(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass65_Sub1_41.method1256(0);
		this.aBoolean657 = true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub1_41.method1286(arg0);
		super.aClass65_Sub1_41.method1290(arg1);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		if (this.aBoolean657) {
			this.aClass243_4.method5740('\u0001');
			super.aClass65_Sub1_41.method1256(1);
			super.aClass65_Sub1_41.method1286((Class80) null);
			super.aClass65_Sub1_41.method1256(0);
		} else {
			super.aClass65_Sub1_41.method1233(0, 5890);
		}
		super.aClass65_Sub1_41.method1228(8448, 8448);
		this.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
		super.aClass65_Sub1_41.method1228(8448, 7681);
	}
}

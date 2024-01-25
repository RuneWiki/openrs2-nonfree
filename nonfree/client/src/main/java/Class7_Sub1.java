import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Lclient!cl;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class7_Sub1(@OriginalArg(0) Class12_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean18) {
			this.aClass53_1 = new Class53(arg0, 2);
			this.aClass53_1.method1513(0);
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method420(7681, 34165);
			super.aClass12_Sub1_42.method387(2, 770, 34168);
			super.aClass12_Sub1_42.method388(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass12_Sub1_42.method376(0);
			this.aClass53_1.method1514();
			this.aClass53_1.method1513(1);
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method420(8448, 8448);
			super.aClass12_Sub1_42.method387(2, 770, 34166);
			super.aClass12_Sub1_42.method388(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass12_Sub1_42.method376(0);
			this.aClass53_1.method1514();
		}
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7784() {
		return true;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	@Override
	public void method7785() {
		if (this.aBoolean5) {
			this.aClass53_1.method1511('\u0001');
			super.aClass12_Sub1_42.method376(1);
			super.aClass12_Sub1_42.method378(null);
			super.aClass12_Sub1_42.method376(0);
		} else {
			super.aClass12_Sub1_42.method388(0, 5890);
		}
		super.aClass12_Sub1_42.method420(8448, 8448);
		this.aBoolean5 = false;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!vfa;B)V")
	@Override
	public void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		super.aClass12_Sub1_42.method378(arg1);
		super.aClass12_Sub1_42.method401(arg0);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7777(@OriginalArg(1) boolean arg0) {
		@Pc(14) Class52_Sub2 local14 = super.aClass12_Sub1_42.method432();
		if (this.aClass53_1 == null || local14 == null || !arg0) {
			super.aClass12_Sub1_42.method388(0, 34168);
			return;
		}
		this.aClass53_1.method1511('\u0000');
		super.aClass12_Sub1_42.method376(1);
		super.aClass12_Sub1_42.method378(local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass12_Sub1_42.aClass209_Sub3_5.method5491(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass12_Sub1_42.method376(0);
		this.aBoolean5 = true;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7780(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub1_42.method420(7681, 8448);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)V")
	@Override
	public void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}

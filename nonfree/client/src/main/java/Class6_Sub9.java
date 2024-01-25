import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
	private boolean aBoolean706 = false;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!hq;")
	private Class149 aClass149_6;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class6_Sub9(@OriginalArg(0) Class82_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean191) {
			this.aClass149_6 = new Class149(arg0, 2);
			this.aClass149_6.method3800(0);
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2077(34165, 7681);
			super.aClass82_Sub1_41.method2066(34168, 770, 2);
			super.aClass82_Sub1_41.method2063(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass82_Sub1_41.method2086(0);
			this.aClass149_6.method3803();
			this.aClass149_6.method3800(1);
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2077(8448, 8448);
			super.aClass82_Sub1_41.method2066(34166, 770, 2);
			super.aClass82_Sub1_41.method2063(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass82_Sub1_41.method2086(0);
			this.aClass149_6.method3803();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub1_41.method2077(8448, 7681);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		super.aClass82_Sub1_41.method2029(arg0);
		super.aClass82_Sub1_41.method2068(arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.aBoolean706) {
			this.aClass149_6.method3804('\u0001');
			super.aClass82_Sub1_41.method2086(1);
			super.aClass82_Sub1_41.method2029((Class94) null);
			super.aClass82_Sub1_41.method2086(0);
		} else {
			super.aClass82_Sub1_41.method2063(5890, 0);
		}
		super.aClass82_Sub1_41.method2077(8448, 8448);
		this.aBoolean706 = false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class94_Sub4 local8 = super.aClass82_Sub1_41.method2024();
		if (this.aClass149_6 == null || local8 == null || !arg0) {
			super.aClass82_Sub1_41.method2063(34168, 0);
			return;
		}
		this.aClass149_6.method3804('\u0000');
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass82_Sub1_41.aClass31_Sub3_5.method7945(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass82_Sub1_41.method2086(0);
		this.aBoolean706 = true;
	}
}

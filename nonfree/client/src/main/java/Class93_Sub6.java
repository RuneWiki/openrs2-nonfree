import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class93_Sub6 extends Class93 {

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "Z")
	private boolean aBoolean584 = false;

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "Lclient!ni;")
	private Class201 aClass201_5;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class93_Sub6(@OriginalArg(0) Class39_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean499) {
			this.aClass201_5 = new Class201(arg0, 2);
			this.aClass201_5.method5135(0);
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5760(34165, 7681);
			super.aClass39_Sub3_40.method5709(34168, 2, 770);
			super.aClass39_Sub3_40.method5680(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass39_Sub3_40.method5750(0);
			this.aClass201_5.method5136();
			this.aClass201_5.method5135(1);
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5760(8448, 8448);
			super.aClass39_Sub3_40.method5709(34166, 2, 770);
			super.aClass39_Sub3_40.method5680(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass39_Sub3_40.method5750(0);
			this.aClass201_5.method5136();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class19_Sub1 local13 = super.aClass39_Sub3_40.method5727();
		if (this.aClass201_5 == null || local13 == null || !arg0) {
			super.aClass39_Sub3_40.method5680(34168, 0);
			return;
		}
		this.aClass201_5.method5132('\u0000');
		super.aClass39_Sub3_40.method5750(1);
		super.aClass39_Sub3_40.method5719(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass39_Sub3_40.aClass181_Sub3_4.method5497(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass39_Sub3_40.method5750(0);
		this.aBoolean584 = true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub3_40.method5719(arg0);
		super.aClass39_Sub3_40.method5699(arg1);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub3_40.method5760(8448, 7681);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		if (this.aBoolean584) {
			this.aClass201_5.method5132('\u0001');
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(null);
			super.aClass39_Sub3_40.method5750(0);
		} else {
			super.aClass39_Sub3_40.method5680(5890, 0);
		}
		super.aClass39_Sub3_40.method5760(8448, 8448);
		this.aBoolean584 = false;
	}
}

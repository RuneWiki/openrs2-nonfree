import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class105_Sub9 extends Class105 {

	@OriginalMember(owner = "client!uaa", name = "t", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lclient!uq;")
	private Class334 aClass334_6;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class105_Sub9(@OriginalArg(0) Class7_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean385) {
			this.aClass334_6 = new Class334(arg0, 2);
			this.aClass334_6.method7573(0);
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4346(34165, 7681);
			super.aClass7_Sub2_41.method4280(34168, 2, 770);
			super.aClass7_Sub2_41.method4276(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass7_Sub2_41.method4326(0);
			this.aClass334_6.method7574();
			this.aClass334_6.method7573(1);
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4346(8448, 8448);
			super.aClass7_Sub2_41.method4280(34166, 2, 770);
			super.aClass7_Sub2_41.method4276(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass7_Sub2_41.method4326(0);
			this.aClass334_6.method7574();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub2_41.method4346(8448, 7681);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (this.aBoolean652) {
			this.aClass334_6.method7575('\u0001');
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(null);
			super.aClass7_Sub2_41.method4326(0);
		} else {
			super.aClass7_Sub2_41.method4276(5890, 0);
		}
		super.aClass7_Sub2_41.method4346(8448, 8448);
		this.aBoolean652 = false;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass7_Sub2_41.method4313(arg1);
		super.aClass7_Sub2_41.method4288(arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		@Pc(8) Class3_Sub4 local8 = super.aClass7_Sub2_41.method4353();
		if (this.aClass334_6 == null || local8 == null || !arg0) {
			super.aClass7_Sub2_41.method4276(34168, 0);
			return;
		}
		this.aClass334_6.method7575('\u0000');
		super.aClass7_Sub2_41.method4326(1);
		super.aClass7_Sub2_41.method4313(local8);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass7_Sub2_41.aClass81_Sub2_4.method3237(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass7_Sub2_41.method4326(0);
		this.aBoolean652 = true;
	}
}

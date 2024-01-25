import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class75_Sub3 extends Class75 {

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "Lclient!uj;")
	private Class328 aClass328_3;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class75_Sub3(@OriginalArg(0) Class15_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean438) {
			this.aClass328_3 = new Class328(arg0, 2);
			this.aClass328_3.method7870(0);
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4451(7681, 34165);
			super.aClass15_Sub3_42.method4442(770, 34168, 2);
			super.aClass15_Sub3_42.method4378(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass15_Sub3_42.method4458(0);
			this.aClass328_3.method7868();
			this.aClass328_3.method7870(1);
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4451(8448, 8448);
			super.aClass15_Sub3_42.method4442(770, 34166, 2);
			super.aClass15_Sub3_42.method4378(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass15_Sub3_42.method4458(0);
			this.aClass328_3.method7868();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		@Pc(16) Class11_Sub3 local16 = super.aClass15_Sub3_42.method4436();
		if (this.aClass328_3 == null || local16 == null || !arg0) {
			super.aClass15_Sub3_42.method4378(0, 34168);
			return;
		}
		this.aClass328_3.method7872('\u0000');
		super.aClass15_Sub3_42.method4458(1);
		super.aClass15_Sub3_42.method4377(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass15_Sub3_42.aClass255_Sub1_3.method6434(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass15_Sub3_42.method4458(0);
		this.aBoolean677 = true;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		if (this.aBoolean677) {
			this.aClass328_3.method7872('\u0001');
			super.aClass15_Sub3_42.method4458(1);
			super.aClass15_Sub3_42.method4377(null);
			super.aClass15_Sub3_42.method4458(0);
		} else {
			super.aClass15_Sub3_42.method4378(0, 5890);
		}
		super.aClass15_Sub3_42.method4451(8448, 8448);
		this.aBoolean677 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
		super.aClass15_Sub3_42.method4451(7681, 8448);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass15_Sub3_42.method4377(arg1);
		super.aClass15_Sub3_42.method4432(arg0);
	}
}

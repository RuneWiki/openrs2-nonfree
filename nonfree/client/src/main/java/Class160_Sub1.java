import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "Z")
	private boolean aBoolean276 = false;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "Lclient!fga;")
	private Class113 aClass113_1;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class160_Sub1(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean721) {
			this.aClass113_1 = new Class113(arg0, 2);
			this.aClass113_1.method2789(0);
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8738(7681, 34165);
			super.aClass100_Sub3_40.method8702(770, 34168, 2);
			super.aClass100_Sub3_40.method8673(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass100_Sub3_40.method8678(0);
			this.aClass113_1.method2790();
			this.aClass113_1.method2789(1);
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8738(8448, 8448);
			super.aClass100_Sub3_40.method8702(770, 34166, 2);
			super.aClass100_Sub3_40.method8673(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass100_Sub3_40.method8678(0);
			this.aClass113_1.method2790();
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		@Pc(18) Class29_Sub2 local18 = super.aClass100_Sub3_40.method8714();
		if (this.aClass113_1 == null || local18 == null || !arg0) {
			super.aClass100_Sub3_40.method8673(34168, 0);
			return;
		}
		this.aClass113_1.method2793('\u0000');
		super.aClass100_Sub3_40.method8678(1);
		super.aClass100_Sub3_40.method8743(local18);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass100_Sub3_40.aClass10_Sub3_5.method2814(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass100_Sub3_40.method8678(0);
		this.aBoolean276 = true;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		if (this.aBoolean276) {
			this.aClass113_1.method2793('\u0001');
			super.aClass100_Sub3_40.method8678(1);
			super.aClass100_Sub3_40.method8743((Class29) null);
			super.aClass100_Sub3_40.method8678(0);
		} else {
			super.aClass100_Sub3_40.method8673(5890, 0);
		}
		super.aClass100_Sub3_40.method8738(8448, 8448);
		this.aBoolean276 = false;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub3_40.method8743(arg0);
		super.aClass100_Sub3_40.method8671(arg1);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_40.method8738(7681, 8448);
	}
}

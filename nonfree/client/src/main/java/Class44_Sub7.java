import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class44_Sub7 extends Class44 {

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!ab;")
	private Class3 aClass3_4;

	static {
		new Class40("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class44_Sub7(@OriginalArg(0) Class62_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean276) {
			this.aClass3_4 = new Class3(arg0, 2);
			this.aClass3_4.method205(0);
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4011(7681, 34165);
			super.aClass62_Sub3_43.method3984(34168, 2, 770);
			super.aClass62_Sub3_43.method4003(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass62_Sub3_43.method4009(0);
			this.aClass3_4.method210();
			this.aClass3_4.method205(1);
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4011(8448, 8448);
			super.aClass62_Sub3_43.method3984(34166, 2, 770);
			super.aClass62_Sub3_43.method4003(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass62_Sub3_43.method4009(0);
			this.aClass3_4.method210();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7274(@OriginalArg(0) boolean arg0) {
		@Pc(16) Class4_Sub4 local16 = super.aClass62_Sub3_43.method3996();
		if (this.aClass3_4 == null || local16 == null || !arg0) {
			super.aClass62_Sub3_43.method4003(0, 34168);
			return;
		}
		this.aClass3_4.method207('\u0000');
		super.aClass62_Sub3_43.method4009(1);
		super.aClass62_Sub3_43.method4007(local16);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass62_Sub3_43.aClass78_Sub3_3.method5518(), 0);
		OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		super.aClass62_Sub3_43.method4009(0);
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7277(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub3_43.method4011(7681, 8448);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	@Override
	public void method7280() {
		if (this.aBoolean505) {
			this.aClass3_4.method207('\u0001');
			super.aClass62_Sub3_43.method4009(1);
			super.aClass62_Sub3_43.method4007(null);
			super.aClass62_Sub3_43.method4009(0);
		} else {
			super.aClass62_Sub3_43.method4003(0, 5890);
		}
		super.aClass62_Sub3_43.method4011(8448, 8448);
		this.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	@Override
	public void method7278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!aba;I)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		super.aClass62_Sub3_43.method4007(arg1);
		super.aClass62_Sub3_43.method3999(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7281() {
		return true;
	}
}

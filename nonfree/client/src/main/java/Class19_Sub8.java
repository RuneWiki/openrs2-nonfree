import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class19_Sub8 extends Class19 {

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Z")
	private boolean aBoolean712 = false;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "Lclient!jv;")
	private Class170 aClass170_5;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class19_Sub8(@OriginalArg(0) Class20_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean636) {
			this.aClass170_5 = new Class170(arg0, 2);
			this.aClass170_5.method5087(0);
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7316(34165, 7681);
			super.aClass20_Sub3_42.method7349(34168, 770, 2);
			super.aClass20_Sub3_42.method7362(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass20_Sub3_42.method7325(0);
			this.aClass170_5.method5083();
			this.aClass170_5.method5087(1);
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7316(8448, 8448);
			super.aClass20_Sub3_42.method7349(34166, 770, 2);
			super.aClass20_Sub3_42.method7362(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass20_Sub3_42.method7325(0);
			this.aClass170_5.method5083();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	@Override
	public void method9161() {
		if (this.aBoolean712) {
			this.aClass170_5.method5086('\u0001');
			super.aClass20_Sub3_42.method7325(1);
			super.aClass20_Sub3_42.method7358(null);
			super.aClass20_Sub3_42.method7325(0);
		} else {
			super.aClass20_Sub3_42.method7362(0, 5890);
		}
		super.aClass20_Sub3_42.method7316(8448, 8448);
		this.aBoolean712 = false;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!ud;BI)V")
	@Override
	public void method9168(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		super.aClass20_Sub3_42.method7358(arg0);
		super.aClass20_Sub3_42.method7348(arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9167(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub3_42.method7316(8448, 7681);
	}

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9165() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9162(@OriginalArg(0) boolean arg0) {
		@Pc(13) Class85_Sub3 local13 = super.aClass20_Sub3_42.method7328();
		if (this.aClass170_5 == null || local13 == null || !arg0) {
			super.aClass20_Sub3_42.method7362(0, 34168);
			return;
		}
		this.aClass170_5.method5086('\u0000');
		super.aClass20_Sub3_42.method7325(1);
		super.aClass20_Sub3_42.method7358(local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass20_Sub3_42.aClass30_Sub3_5.method4398(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass20_Sub3_42.method7325(0);
		this.aBoolean712 = true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

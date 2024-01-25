import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "Lclient!iw;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class39_Sub1(@OriginalArg(0) Class133_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean625) {
			this.aClass169_1 = new Class169(arg0, 2);
			this.aClass169_1.method4029(0);
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7342(7681, 34165);
			super.aClass133_Sub3_42.method7326(2, 34168, 770);
			super.aClass133_Sub3_42.method7347(34167, 0);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			super.aClass133_Sub3_42.method7368(0);
			this.aClass169_1.method4027();
			this.aClass169_1.method4029(1);
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7342(8448, 8448);
			super.aClass133_Sub3_42.method7326(2, 34166, 770);
			super.aClass133_Sub3_42.method7347(5890, 0);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			super.aClass133_Sub3_42.method7368(0);
			this.aClass169_1.method4027();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		super.aClass133_Sub3_42.method7375(arg1);
		super.aClass133_Sub3_42.method7401(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
		super.aClass133_Sub3_42.method7342(7681, 8448);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		@Pc(14) Class167_Sub1 local14 = super.aClass133_Sub3_42.method7399();
		if (this.aClass169_1 == null || local14 == null || !arg0) {
			super.aClass133_Sub3_42.method7347(34168, 0);
			return;
		}
		this.aClass169_1.method4025('\u0000');
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(super.aClass133_Sub3_42.aClass113_Sub2_5.method5675(), 0);
		OpenGL.glMatrixMode(5888);
		super.aClass133_Sub3_42.method7368(0);
		this.aBoolean56 = true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		if (this.aBoolean56) {
			this.aClass169_1.method4025('\u0001');
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(null);
			super.aClass133_Sub3_42.method7368(0);
		} else {
			super.aClass133_Sub3_42.method7347(5890, 0);
		}
		super.aClass133_Sub3_42.method7342(8448, 8448);
		this.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}
}

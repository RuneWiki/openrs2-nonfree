import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class104_Sub7 extends Class104 {

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "Lclient!gq;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
	private boolean aBoolean583 = false;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "[Lclient!ng;")
	private Class132_Sub4[] aClass132_Sub4Array1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class104_Sub7(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean68) {
			this.aBoolean582 = arg0.anInt825 < 3;
			@Pc(26) int local26 = this.aBoolean582 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(101) float local101;
						if (local91 == 0) {
							local101 = -local89;
						} else if (local91 == 1) {
							local101 = local89;
						} else if (local91 == 2) {
							local101 = local85;
						} else if (local91 == 3) {
							local101 = -local85;
						} else if (local91 == 4) {
							local101 = local81;
						} else {
							local101 = -local81;
						}
						@Pc(150) int local150;
						@Pc(159) int local159;
						@Pc(168) int local168;
						if (local101 > 0.0F) {
							local150 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local159 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local168 = (int) (Math.pow((double) local101, 12.0D) * (double) local26);
						} else {
							local168 = 0;
							local159 = 0;
							local150 = 0;
						}
						local34[local91][local40] = (byte) local150;
						local38[local91][local40] = (byte) local159;
						local30[local91][local40] = (byte) local168;
					}
					local40++;
				}
			}
			this.aClass132_Sub4Array1 = new Class132_Sub4[3];
			this.aClass132_Sub4Array1[0] = new Class132_Sub4(super.aClass9_Sub2_40, 6406, 64, false, local34, 6406);
			this.aClass132_Sub4Array1[1] = new Class132_Sub4(super.aClass9_Sub2_40, 6406, 64, false, local38, 6406);
			this.aClass132_Sub4Array1[2] = new Class132_Sub4(super.aClass9_Sub2_40, 6406, 64, false, local30, 6406);
			this.method6595();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean583) {
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(this.aClass132_Sub4Array1[arg0 - 1]);
			super.aClass9_Sub2_40.method806(0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	@Override
	public void method7868() {
		if (this.aBoolean583) {
			if (!this.aBoolean582) {
				super.aClass9_Sub2_40.method806(2);
				super.aClass9_Sub2_40.method814(null);
			}
			super.aClass9_Sub2_40.method806(1);
			super.aClass9_Sub2_40.method814(null);
			super.aClass9_Sub2_40.method806(0);
			this.aClass121_3.method3522('\u0001');
			this.aBoolean583 = false;
		} else {
			super.aClass9_Sub2_40.method816(5890, 0);
		}
		super.aClass9_Sub2_40.method797(8448, 8448);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7865() {
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!uda;)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		super.aClass9_Sub2_40.method814(arg1);
		super.aClass9_Sub2_40.method822(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7867(@OriginalArg(0) boolean arg0) {
		if (this.aClass121_3 == null || !arg0) {
			super.aClass9_Sub2_40.method816(34168, 0);
			return;
		}
		if (!this.aBoolean582) {
			super.aClass9_Sub2_40.method806(2);
			super.aClass9_Sub2_40.method814(super.aClass9_Sub2_40.aClass132_Sub1_2);
			super.aClass9_Sub2_40.method806(0);
		}
		this.aClass121_3.method3522('\u0000');
		this.aBoolean583 = true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7871(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub2_40.method797(8448, 7681);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	private void method6595() {
		this.aClass121_3 = new Class121(super.aClass9_Sub2_40, 2);
		this.aClass121_3.method3523(0);
		super.aClass9_Sub2_40.method806(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean582) {
			super.aClass9_Sub2_40.method797(260, 7681);
			super.aClass9_Sub2_40.method798(0, 770, 5890);
			super.aClass9_Sub2_40.method816(34167, 0);
		} else {
			super.aClass9_Sub2_40.method797(7681, 8448);
			super.aClass9_Sub2_40.method798(0, 768, 34168);
			super.aClass9_Sub2_40.method806(2);
			super.aClass9_Sub2_40.method797(260, 7681);
			super.aClass9_Sub2_40.method798(0, 768, 34168);
			super.aClass9_Sub2_40.method798(1, 770, 34168);
			super.aClass9_Sub2_40.method816(34167, 0);
		}
		super.aClass9_Sub2_40.method806(0);
		this.aClass121_3.method3524();
		this.aClass121_3.method3523(1);
		super.aClass9_Sub2_40.method806(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean582) {
			super.aClass9_Sub2_40.method797(8448, 8448);
			super.aClass9_Sub2_40.method798(0, 768, 5890);
			super.aClass9_Sub2_40.method816(5890, 0);
		} else {
			super.aClass9_Sub2_40.method797(8448, 8448);
			super.aClass9_Sub2_40.method798(0, 768, 5890);
			super.aClass9_Sub2_40.method806(2);
			super.aClass9_Sub2_40.method797(8448, 8448);
			super.aClass9_Sub2_40.method798(0, 768, 5890);
			super.aClass9_Sub2_40.method798(1, 768, 34168);
			super.aClass9_Sub2_40.method816(5890, 0);
		}
		super.aClass9_Sub2_40.method806(0);
		this.aClass121_3.method3524();
	}
}

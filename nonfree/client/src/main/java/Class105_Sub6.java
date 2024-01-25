import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class105_Sub6 extends Class105 {

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "Lclient!uq;")
	private Class334 aClass334_3;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "[Lclient!gfa;")
	private Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class105_Sub6(@OriginalArg(0) Class7_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean385) {
			this.aBoolean479 = arg0.anInt5625 < 3;
			@Pc(26) int local26 = this.aBoolean479 ? 48 : 127;
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
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local101 > 0.0F) {
							local154 = (int) (Math.pow((double) local101, 96.0D) * (double) local26);
							local163 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local172 = (int) (Math.pow((double) local101, 12.0D) * (double) local26);
						} else {
							local172 = 0;
							local163 = 0;
							local154 = 0;
						}
						local34[local91][local40] = (byte) local154;
						local38[local91][local40] = (byte) local163;
						local30[local91][local40] = (byte) local172;
					}
					local40++;
				}
			}
			this.aClass3_Sub4Array1 = new Class3_Sub4[3];
			this.aClass3_Sub4Array1[0] = new Class3_Sub4(super.aClass7_Sub2_41, 6406, 64, false, local34, 6406);
			this.aClass3_Sub4Array1[1] = new Class3_Sub4(super.aClass7_Sub2_41, 6406, 64, false, local38, 6406);
			this.aClass3_Sub4Array1[2] = new Class3_Sub4(super.aClass7_Sub2_41, 6406, 64, false, local30, 6406);
			this.method5413();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7385() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!jo;I)V")
	@Override
	public void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		super.aClass7_Sub2_41.method4313(arg1);
		super.aClass7_Sub2_41.method4288(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)V")
	@Override
	public void method7387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean478) {
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(this.aClass3_Sub4Array1[arg1 - 1]);
			super.aClass7_Sub2_41.method4326(0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	private void method5413() {
		this.aClass334_3 = new Class334(super.aClass7_Sub2_41, 2);
		this.aClass334_3.method7573(0);
		super.aClass7_Sub2_41.method4326(1);
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
		if (this.aBoolean479) {
			super.aClass7_Sub2_41.method4346(260, 7681);
			super.aClass7_Sub2_41.method4280(5890, 0, 770);
			super.aClass7_Sub2_41.method4276(34167, 0);
		} else {
			super.aClass7_Sub2_41.method4346(7681, 8448);
			super.aClass7_Sub2_41.method4280(34168, 0, 768);
			super.aClass7_Sub2_41.method4326(2);
			super.aClass7_Sub2_41.method4346(260, 7681);
			super.aClass7_Sub2_41.method4280(34168, 0, 768);
			super.aClass7_Sub2_41.method4280(34168, 1, 770);
			super.aClass7_Sub2_41.method4276(34167, 0);
		}
		super.aClass7_Sub2_41.method4326(0);
		this.aClass334_3.method7574();
		this.aClass334_3.method7573(1);
		super.aClass7_Sub2_41.method4326(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean479) {
			super.aClass7_Sub2_41.method4346(8448, 8448);
			super.aClass7_Sub2_41.method4280(5890, 0, 768);
			super.aClass7_Sub2_41.method4276(5890, 0);
		} else {
			super.aClass7_Sub2_41.method4346(8448, 8448);
			super.aClass7_Sub2_41.method4280(5890, 0, 768);
			super.aClass7_Sub2_41.method4326(2);
			super.aClass7_Sub2_41.method4346(8448, 8448);
			super.aClass7_Sub2_41.method4280(5890, 0, 768);
			super.aClass7_Sub2_41.method4280(34168, 1, 768);
			super.aClass7_Sub2_41.method4276(5890, 0);
		}
		super.aClass7_Sub2_41.method4326(0);
		this.aClass334_3.method7574();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	@Override
	public void method7381() {
		if (this.aBoolean478) {
			if (!this.aBoolean479) {
				super.aClass7_Sub2_41.method4326(2);
				super.aClass7_Sub2_41.method4313(null);
			}
			super.aClass7_Sub2_41.method4326(1);
			super.aClass7_Sub2_41.method4313(null);
			super.aClass7_Sub2_41.method4326(0);
			this.aClass334_3.method7575('\u0001');
			this.aBoolean478 = false;
		} else {
			super.aClass7_Sub2_41.method4276(5890, 0);
		}
		super.aClass7_Sub2_41.method4346(8448, 8448);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7382(@OriginalArg(0) boolean arg0) {
		if (this.aClass334_3 == null || !arg0) {
			super.aClass7_Sub2_41.method4276(34168, 0);
			return;
		}
		if (!this.aBoolean479) {
			super.aClass7_Sub2_41.method4326(2);
			super.aClass7_Sub2_41.method4313(super.aClass7_Sub2_41.aClass3_Sub2_2);
			super.aClass7_Sub2_41.method4326(0);
		}
		this.aClass334_3.method7575('\u0000');
		this.aBoolean478 = true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7390(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub2_41.method4346(8448, 7681);
	}
}

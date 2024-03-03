import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class33_Sub7 extends Class33 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!rj;")
	private Class203 aClass203_6;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "[Lclient!qd;")
	private Class8_Sub3[] aClass8_Sub3Array1;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!bf;)V", line = 13)
	public Class33_Sub7(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean38) {
			this.aBoolean425 = arg0.anInt597 < 3;
			@Pc(24) int local24 = this.aBoolean425 ? 48 : 127;
			@Pc(28) byte[][] local28 = new byte[6][4096];
			@Pc(32) byte[][] local32 = new byte[6][4096];
			@Pc(36) byte[][] local36 = new byte[6][4096];
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 64; local45++) {
					@Pc(57) float local57 = (float) local45 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local40 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(99) float local99;
						if (local91 == 0) {
							local99 = -local85;
						} else if (local91 == 1) {
							local99 = local85;
						} else if (local91 == 2) {
							local99 = local89;
						} else if (local91 == 3) {
							local99 = -local89;
						} else if (local91 == 4) {
							local99 = local81;
						} else {
							local99 = -local81;
						}
						@Pc(141) int local141;
						@Pc(150) int local150;
						@Pc(159) int local159;
						if (local99 > 0.0F) {
							local141 = (int) (Math.pow((double) local99, 96.0D) * (double) local24);
							local150 = (int) (Math.pow((double) local99, 36.0D) * (double) local24);
							local159 = (int) (Math.pow((double) local99, 12.0D) * (double) local24);
						} else {
							local159 = 0;
							local150 = 0;
							local141 = 0;
						}
						local32[local91][local38] = (byte) local141;
						local36[local91][local38] = (byte) local150;
						local28[local91][local38] = (byte) local159;
					}
					local38++;
				}
			}
			this.aClass8_Sub3Array1 = new Class8_Sub3[3];
			this.aClass8_Sub3Array1[0] = new Class8_Sub3(this.aClass19_Sub1_35, 6406, 64, false, local32, 6406);
			this.aClass8_Sub3Array1[1] = new Class8_Sub3(this.aClass19_Sub1_35, 6406, 64, false, local36, 6406);
			this.aClass8_Sub3Array1[2] = new Class8_Sub3(this.aClass19_Sub1_35, 6406, 64, false, local28, 6406);
			this.method5717();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 6)
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method794(8448, 7681);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!kq;)V", line = 9)
	@Override
	public void method5711(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 124)
	@Override
	public void method5713(@OriginalArg(0) int arg0) {
		if (this.aBoolean426) {
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(this.aClass8_Sub3Array1[arg0 - 1]);
			this.aClass19_Sub1_35.method832(0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "()V", line = 133)
	@Override
	public void method5716() {
		if (this.aBoolean426) {
			if (!this.aBoolean425) {
				this.aClass19_Sub1_35.method832(2);
				this.aClass19_Sub1_35.method848(null);
			}
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method832(0);
			this.aClass203_6.method5191('\u0001');
			this.aBoolean426 = false;
		} else {
			this.aClass19_Sub1_35.method833(0, 5890);
		}
		this.aClass19_Sub1_35.method794(8448, 8448);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "()V", line = 158)
	private void method5717() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass203_6 = new Class203(this.aClass19_Sub1_35, 2);
		this.aClass203_6.method5193(0);
		this.aClass19_Sub1_35.method832(1);
		local3.glTexGeni(8192, 9472, 34065);
		local3.glTexGeni(8193, 9472, 34065);
		local3.glTexGeni(8194, 9472, 34065);
		local3.glEnable(3168);
		local3.glEnable(3169);
		local3.glEnable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		local3.glMatrixMode(5888);
		if (this.aBoolean425) {
			this.aClass19_Sub1_35.method794(260, 7681);
			this.aClass19_Sub1_35.method793(0, 5890, 770);
			this.aClass19_Sub1_35.method833(0, 34167);
		} else {
			this.aClass19_Sub1_35.method794(7681, 8448);
			this.aClass19_Sub1_35.method793(0, 34168, 768);
			this.aClass19_Sub1_35.method832(2);
			this.aClass19_Sub1_35.method794(260, 7681);
			this.aClass19_Sub1_35.method793(0, 34168, 768);
			this.aClass19_Sub1_35.method793(1, 34168, 770);
			this.aClass19_Sub1_35.method833(0, 34167);
		}
		this.aClass19_Sub1_35.method832(0);
		this.aClass203_6.method5192();
		this.aClass203_6.method5193(1);
		this.aClass19_Sub1_35.method832(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean425) {
			this.aClass19_Sub1_35.method794(8448, 8448);
			this.aClass19_Sub1_35.method793(0, 5890, 768);
			this.aClass19_Sub1_35.method833(0, 5890);
		} else {
			this.aClass19_Sub1_35.method794(8448, 8448);
			this.aClass19_Sub1_35.method793(0, 5890, 768);
			this.aClass19_Sub1_35.method832(2);
			this.aClass19_Sub1_35.method794(8448, 8448);
			this.aClass19_Sub1_35.method793(0, 5890, 768);
			this.aClass19_Sub1_35.method793(1, 34168, 768);
			this.aClass19_Sub1_35.method833(0, 5890);
		}
		this.aClass19_Sub1_35.method832(0);
		this.aClass203_6.method5192();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "()Z", line = 221)
	@Override
	public boolean method5712() {
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 225)
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		if (this.aClass203_6 == null || !arg0) {
			this.aClass19_Sub1_35.method833(0, 34168);
			return;
		}
		if (!this.aBoolean425) {
			this.aClass19_Sub1_35.method832(2);
			this.aClass19_Sub1_35.method848(this.aClass19_Sub1_35.aClass8_Sub1_1);
			this.aClass19_Sub1_35.method832(0);
		}
		this.aClass203_6.method5191('\u0000');
		this.aBoolean426 = true;
	}
}

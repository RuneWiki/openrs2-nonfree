import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class86_Sub6 extends Class86 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!ma;")
	private Class151 aClass151_5;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "[Lclient!nq;")
	private Class30_Sub4[] aClass30_Sub4Array1;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class86_Sub6(@OriginalArg(0) Class155_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean297) {
			this.aBoolean415 = arg0.anInt3852 < 3;
			@Pc(24) int local24 = this.aBoolean415 ? 48 : 127;
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
			this.aClass30_Sub4Array1 = new Class30_Sub4[3];
			this.aClass30_Sub4Array1[0] = new Class30_Sub4(this.aClass155_Sub1_39, 6406, 64, false, local32, 6406);
			this.aClass30_Sub4Array1[1] = new Class30_Sub4(this.aClass155_Sub1_39, 6406, 64, false, local36, 6406);
			this.aClass30_Sub4Array1[2] = new Class30_Sub4(this.aClass155_Sub1_39, 6406, 64, false, local28, 6406);
			this.method4742();
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
		this.aClass155_Sub1_39.method3610(8448, 7681);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "()V")
	private void method4742() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_5 = new Class151(this.aClass155_Sub1_39, 2);
		this.aClass151_5.method3281(0);
		this.aClass155_Sub1_39.method3590(1);
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
		if (this.aBoolean415) {
			this.aClass155_Sub1_39.method3610(260, 7681);
			this.aClass155_Sub1_39.method3624(0, 5890, 770);
			this.aClass155_Sub1_39.method3635(0, 34167);
		} else {
			this.aClass155_Sub1_39.method3610(7681, 8448);
			this.aClass155_Sub1_39.method3624(0, 34168, 768);
			this.aClass155_Sub1_39.method3590(2);
			this.aClass155_Sub1_39.method3610(260, 7681);
			this.aClass155_Sub1_39.method3624(0, 34168, 768);
			this.aClass155_Sub1_39.method3624(1, 34168, 770);
			this.aClass155_Sub1_39.method3635(0, 34167);
		}
		this.aClass155_Sub1_39.method3590(0);
		this.aClass151_5.method3280();
		this.aClass151_5.method3281(1);
		this.aClass155_Sub1_39.method3590(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean415) {
			this.aClass155_Sub1_39.method3610(8448, 8448);
			this.aClass155_Sub1_39.method3624(0, 5890, 768);
			this.aClass155_Sub1_39.method3635(0, 5890);
		} else {
			this.aClass155_Sub1_39.method3610(8448, 8448);
			this.aClass155_Sub1_39.method3624(0, 5890, 768);
			this.aClass155_Sub1_39.method3590(2);
			this.aClass155_Sub1_39.method3610(8448, 8448);
			this.aClass155_Sub1_39.method3624(0, 5890, 768);
			this.aClass155_Sub1_39.method3624(1, 34168, 768);
			this.aClass155_Sub1_39.method3635(0, 5890);
		}
		this.aClass155_Sub1_39.method3590(0);
		this.aClass151_5.method3280();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
		if (this.aBoolean416) {
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(this.aClass30_Sub4Array1[arg0 - 1]);
			this.aClass155_Sub1_39.method3590(0);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
		this.aClass155_Sub1_39.method3585(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		if (this.aClass151_5 == null || !arg0) {
			this.aClass155_Sub1_39.method3635(0, 34168);
			return;
		}
		if (!this.aBoolean415) {
			this.aClass155_Sub1_39.method3590(2);
			this.aClass155_Sub1_39.method3585(this.aClass155_Sub1_39.aClass30_Sub3_3);
			this.aClass155_Sub1_39.method3590(0);
		}
		this.aClass151_5.method3279('\u0000');
		this.aBoolean416 = true;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		if (this.aBoolean416) {
			if (!this.aBoolean415) {
				this.aClass155_Sub1_39.method3590(2);
				this.aClass155_Sub1_39.method3585(null);
			}
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(null);
			this.aClass155_Sub1_39.method3590(0);
			this.aClass151_5.method3279('\u0001');
			this.aBoolean416 = false;
		} else {
			this.aClass155_Sub1_39.method3635(0, 5890);
		}
		this.aClass155_Sub1_39.method3610(8448, 8448);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}
}

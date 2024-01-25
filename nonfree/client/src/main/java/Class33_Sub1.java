import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!hi;")
	private Class86 aClass86_2;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Z")
	private boolean aBoolean48;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lclient!fq;")
	private Class60_Sub2[] aClass60_Sub2Array1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class33_Sub1(@OriginalArg(0) Class55_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean318) {
			this.aBoolean48 = arg0.anInt4005 < 3;
			@Pc(24) int local24 = this.aBoolean48 ? 48 : 127;
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
			this.aClass60_Sub2Array1 = new Class60_Sub2[3];
			this.aClass60_Sub2Array1[0] = new Class60_Sub2(this.aClass55_Sub1_42, 6406, 64, false, local32, 6406);
			this.aClass60_Sub2Array1[1] = new Class60_Sub2(this.aClass55_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass60_Sub2Array1[2] = new Class60_Sub2(this.aClass55_Sub1_42, 6406, 64, false, local28, 6406);
			this.method614();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	@Override
	public void method6046(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_2 == null || !arg0) {
			this.aClass55_Sub1_42.method3689(0, 34168);
			return;
		}
		if (!this.aBoolean48) {
			this.aClass55_Sub1_42.method3693(2);
			this.aClass55_Sub1_42.method3677(this.aClass55_Sub1_42.aClass60_Sub4_4);
			this.aClass55_Sub1_42.method3693(0);
		}
		this.aClass86_2.method2106('\u0000');
		this.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()V")
	@Override
	public void method6043() {
		if (this.aBoolean47) {
			if (!this.aBoolean48) {
				this.aClass55_Sub1_42.method3693(2);
				this.aClass55_Sub1_42.method3677(null);
			}
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3677(null);
			this.aClass55_Sub1_42.method3693(0);
			this.aClass86_2.method2106('\u0001');
			this.aBoolean47 = false;
		} else {
			this.aClass55_Sub1_42.method3689(0, 5890);
		}
		this.aClass55_Sub1_42.method3709(8448, 8448);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	private void method614() {
		@Pc(3) opengl local3 = this.aClass55_Sub1_42.anOpengl1;
		this.aClass86_2 = new Class86(this.aClass55_Sub1_42, 2);
		this.aClass86_2.method2104(0);
		this.aClass55_Sub1_42.method3693(1);
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
		if (this.aBoolean48) {
			this.aClass55_Sub1_42.method3709(260, 7681);
			this.aClass55_Sub1_42.method3684(0, 5890, 770);
			this.aClass55_Sub1_42.method3689(0, 34167);
		} else {
			this.aClass55_Sub1_42.method3709(7681, 8448);
			this.aClass55_Sub1_42.method3684(0, 34168, 768);
			this.aClass55_Sub1_42.method3693(2);
			this.aClass55_Sub1_42.method3709(260, 7681);
			this.aClass55_Sub1_42.method3684(0, 34168, 768);
			this.aClass55_Sub1_42.method3684(1, 34168, 770);
			this.aClass55_Sub1_42.method3689(0, 34167);
		}
		this.aClass55_Sub1_42.method3693(0);
		this.aClass86_2.method2105();
		this.aClass86_2.method2104(1);
		this.aClass55_Sub1_42.method3693(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean48) {
			this.aClass55_Sub1_42.method3709(8448, 8448);
			this.aClass55_Sub1_42.method3684(0, 5890, 768);
			this.aClass55_Sub1_42.method3689(0, 5890);
		} else {
			this.aClass55_Sub1_42.method3709(8448, 8448);
			this.aClass55_Sub1_42.method3684(0, 5890, 768);
			this.aClass55_Sub1_42.method3693(2);
			this.aClass55_Sub1_42.method3709(8448, 8448);
			this.aClass55_Sub1_42.method3684(0, 5890, 768);
			this.aClass55_Sub1_42.method3684(1, 34168, 768);
			this.aClass55_Sub1_42.method3689(0, 5890);
		}
		this.aClass55_Sub1_42.method3693(0);
		this.aClass86_2.method2105();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!t;)V")
	@Override
	public void method6045(@OriginalArg(0) Class60 arg0) {
		this.aClass55_Sub1_42.method3677(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	@Override
	public void method6042(@OriginalArg(0) boolean arg0) {
		this.aClass55_Sub1_42.method3709(8448, 7681);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()Z")
	@Override
	public boolean method6041() {
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0) {
		if (this.aBoolean47) {
			this.aClass55_Sub1_42.method3693(1);
			this.aClass55_Sub1_42.method3677(this.aClass60_Sub2Array1[arg0 - 1]);
			this.aClass55_Sub1_42.method3693(0);
		}
	}
}

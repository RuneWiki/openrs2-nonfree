import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class17_Sub7 extends Class17 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!km;")
	private Class119 aClass119_5;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[Lclient!rj;")
	private Class8_Sub4[] aClass8_Sub4Array1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class17_Sub7(@OriginalArg(0) Class46_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean398) {
			this.aBoolean410 = arg0.anInt5750 < 3;
			@Pc(24) int local24 = this.aBoolean410 ? 48 : 127;
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
			this.aClass8_Sub4Array1 = new Class8_Sub4[3];
			this.aClass8_Sub4Array1[0] = new Class8_Sub4(this.aClass46_Sub2_37, 6406, 64, false, local32, 6406);
			this.aClass8_Sub4Array1[1] = new Class8_Sub4(this.aClass46_Sub2_37, 6406, 64, false, local36, 6406);
			this.aClass8_Sub4Array1[2] = new Class8_Sub4(this.aClass46_Sub2_37, 6406, 64, false, local28, 6406);
			this.method5303();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
		this.aClass46_Sub2_37.method5248(8448, 7681);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		if (this.aClass119_5 == null || !arg0) {
			this.aClass46_Sub2_37.method5236(0, 34168);
			return;
		}
		if (!this.aBoolean410) {
			this.aClass46_Sub2_37.method5225(2);
			this.aClass46_Sub2_37.method5251(this.aClass46_Sub2_37.aClass8_Sub1_6);
			this.aClass46_Sub2_37.method5225(0);
		}
		this.aClass119_5.method3301('\u0000');
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "()V")
	private void method5303() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_5 = new Class119(this.aClass46_Sub2_37, 2);
		this.aClass119_5.method3303(0);
		this.aClass46_Sub2_37.method5225(1);
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
		if (this.aBoolean410) {
			this.aClass46_Sub2_37.method5248(260, 7681);
			this.aClass46_Sub2_37.method5261(0, 5890, 770);
			this.aClass46_Sub2_37.method5236(0, 34167);
		} else {
			this.aClass46_Sub2_37.method5248(7681, 8448);
			this.aClass46_Sub2_37.method5261(0, 34168, 768);
			this.aClass46_Sub2_37.method5225(2);
			this.aClass46_Sub2_37.method5248(260, 7681);
			this.aClass46_Sub2_37.method5261(0, 34168, 768);
			this.aClass46_Sub2_37.method5261(1, 34168, 770);
			this.aClass46_Sub2_37.method5236(0, 34167);
		}
		this.aClass46_Sub2_37.method5225(0);
		this.aClass119_5.method3302();
		this.aClass119_5.method3303(1);
		this.aClass46_Sub2_37.method5225(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean410) {
			this.aClass46_Sub2_37.method5248(8448, 8448);
			this.aClass46_Sub2_37.method5261(0, 5890, 768);
			this.aClass46_Sub2_37.method5236(0, 5890);
		} else {
			this.aClass46_Sub2_37.method5248(8448, 8448);
			this.aClass46_Sub2_37.method5261(0, 5890, 768);
			this.aClass46_Sub2_37.method5225(2);
			this.aClass46_Sub2_37.method5248(8448, 8448);
			this.aClass46_Sub2_37.method5261(0, 5890, 768);
			this.aClass46_Sub2_37.method5261(1, 34168, 768);
			this.aClass46_Sub2_37.method5236(0, 5890);
		}
		this.aClass46_Sub2_37.method5225(0);
		this.aClass119_5.method3302();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
		this.aClass46_Sub2_37.method5251(arg0);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		if (this.aBoolean411) {
			if (!this.aBoolean410) {
				this.aClass46_Sub2_37.method5225(2);
				this.aClass46_Sub2_37.method5251(null);
			}
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(null);
			this.aClass46_Sub2_37.method5225(0);
			this.aClass119_5.method3301('\u0001');
			this.aBoolean411 = false;
		} else {
			this.aClass46_Sub2_37.method5236(0, 5890);
		}
		this.aClass46_Sub2_37.method5248(8448, 8448);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if (this.aBoolean411) {
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(this.aClass8_Sub4Array1[arg0 - 1]);
			this.aClass46_Sub2_37.method5225(0);
		}
	}
}

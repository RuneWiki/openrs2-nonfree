import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!jb;")
	private Class115 aClass115_4;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "[Lclient!bl;")
	private Class20_Sub1[] aClass20_Sub1Array1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class7_Sub5(@OriginalArg(0) Class63_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean164) {
			this.aBoolean299 = arg0.anInt2117 < 3;
			@Pc(24) int local24 = this.aBoolean299 ? 48 : 127;
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
			this.aClass20_Sub1Array1 = new Class20_Sub1[3];
			this.aClass20_Sub1Array1[0] = new Class20_Sub1(this.aClass63_Sub2_41, 6406, 64, false, local32, 6406);
			this.aClass20_Sub1Array1[1] = new Class20_Sub1(this.aClass63_Sub2_41, 6406, 64, false, local36, 6406);
			this.aClass20_Sub1Array1[2] = new Class20_Sub1(this.aClass63_Sub2_41, 6406, 64, false, local28, 6406);
			this.method3633();
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "()V")
	private void method3633() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_4 = new Class115(this.aClass63_Sub2_41, 2);
		this.aClass115_4.method2846(0);
		this.aClass63_Sub2_41.method2115(1);
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
		if (this.aBoolean299) {
			this.aClass63_Sub2_41.method2091(260, 7681);
			this.aClass63_Sub2_41.method2081(0, 5890, 770);
			this.aClass63_Sub2_41.method2064(0, 34167);
		} else {
			this.aClass63_Sub2_41.method2091(7681, 8448);
			this.aClass63_Sub2_41.method2081(0, 34168, 768);
			this.aClass63_Sub2_41.method2115(2);
			this.aClass63_Sub2_41.method2091(260, 7681);
			this.aClass63_Sub2_41.method2081(0, 34168, 768);
			this.aClass63_Sub2_41.method2081(1, 34168, 770);
			this.aClass63_Sub2_41.method2064(0, 34167);
		}
		this.aClass63_Sub2_41.method2115(0);
		this.aClass115_4.method2848();
		this.aClass115_4.method2846(1);
		this.aClass63_Sub2_41.method2115(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean299) {
			this.aClass63_Sub2_41.method2091(8448, 8448);
			this.aClass63_Sub2_41.method2081(0, 5890, 768);
			this.aClass63_Sub2_41.method2064(0, 5890);
		} else {
			this.aClass63_Sub2_41.method2091(8448, 8448);
			this.aClass63_Sub2_41.method2081(0, 5890, 768);
			this.aClass63_Sub2_41.method2115(2);
			this.aClass63_Sub2_41.method2091(8448, 8448);
			this.aClass63_Sub2_41.method2081(0, 5890, 768);
			this.aClass63_Sub2_41.method2081(1, 34168, 768);
			this.aClass63_Sub2_41.method2064(0, 5890);
		}
		this.aClass63_Sub2_41.method2115(0);
		this.aClass115_4.method2848();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_4 == null || !arg0) {
			this.aClass63_Sub2_41.method2064(0, 34168);
			return;
		}
		if (!this.aBoolean299) {
			this.aClass63_Sub2_41.method2115(2);
			this.aClass63_Sub2_41.method2068(this.aClass63_Sub2_41.aClass20_Sub4_3);
			this.aClass63_Sub2_41.method2115(0);
		}
		this.aClass115_4.method2847('\u0000');
		this.aBoolean298 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
		this.aClass63_Sub2_41.method2068(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
		if (this.aBoolean298) {
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(this.aClass20_Sub1Array1[arg0 - 1]);
			this.aClass63_Sub2_41.method2115(0);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub2_41.method2091(8448, 7681);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		if (this.aBoolean298) {
			if (!this.aBoolean299) {
				this.aClass63_Sub2_41.method2115(2);
				this.aClass63_Sub2_41.method2068(null);
			}
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(null);
			this.aClass63_Sub2_41.method2115(0);
			this.aClass115_4.method2847('\u0001');
			this.aBoolean298 = false;
		} else {
			this.aClass63_Sub2_41.method2064(0, 5890);
		}
		this.aClass63_Sub2_41.method2091(8448, 8448);
	}
}

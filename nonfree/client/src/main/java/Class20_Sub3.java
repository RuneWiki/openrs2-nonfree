import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!pa;")
	private Class155 aClass155_3;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lclient!vm;")
	private Class44_Sub4[] aClass44_Sub4Array1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class20_Sub3(@OriginalArg(0) Class105_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean315) {
			this.aBoolean215 = arg0.anInt4177 < 3;
			@Pc(24) int local24 = this.aBoolean215 ? 48 : 127;
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
			this.aClass44_Sub4Array1 = new Class44_Sub4[3];
			this.aClass44_Sub4Array1[0] = new Class44_Sub4(this.aClass105_Sub1_42, 6406, 64, false, local32, 6406);
			this.aClass44_Sub4Array1[1] = new Class44_Sub4(this.aClass105_Sub1_42, 6406, 64, false, local36, 6406);
			this.aClass44_Sub4Array1[2] = new Class44_Sub4(this.aClass105_Sub1_42, 6406, 64, false, local28, 6406);
			this.method2303();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5682(@OriginalArg(0) boolean arg0) {
		this.aClass105_Sub1_42.method3562(8448, 7681);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5681(@OriginalArg(0) boolean arg0) {
		if (this.aClass155_3 == null || !arg0) {
			this.aClass105_Sub1_42.method3628(0, 34168);
			return;
		}
		if (!this.aBoolean215) {
			this.aClass105_Sub1_42.method3634(2);
			this.aClass105_Sub1_42.method3591(this.aClass105_Sub1_42.aClass44_Sub1_6);
			this.aClass105_Sub1_42.method3634(0);
		}
		this.aClass155_3.method4112('\u0000');
		this.aBoolean214 = true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public void method5685(@OriginalArg(0) int arg0) {
		if (this.aBoolean214) {
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3591(this.aClass44_Sub4Array1[arg0 - 1]);
			this.aClass105_Sub1_42.method3634(0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "()V")
	@Override
	public void method5684() {
		if (this.aBoolean214) {
			if (!this.aBoolean215) {
				this.aClass105_Sub1_42.method3634(2);
				this.aClass105_Sub1_42.method3591(null);
			}
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3591(null);
			this.aClass105_Sub1_42.method3634(0);
			this.aClass155_3.method4112('\u0001');
			this.aBoolean214 = false;
		} else {
			this.aClass105_Sub1_42.method3628(0, 5890);
		}
		this.aClass105_Sub1_42.method3562(8448, 8448);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
	private void method2303() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_42.anOpengl1;
		this.aClass155_3 = new Class155(this.aClass105_Sub1_42, 2);
		this.aClass155_3.method4111(0);
		this.aClass105_Sub1_42.method3634(1);
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
		if (this.aBoolean215) {
			this.aClass105_Sub1_42.method3562(260, 7681);
			this.aClass105_Sub1_42.method3568(0, 5890, 770);
			this.aClass105_Sub1_42.method3628(0, 34167);
		} else {
			this.aClass105_Sub1_42.method3562(7681, 8448);
			this.aClass105_Sub1_42.method3568(0, 34168, 768);
			this.aClass105_Sub1_42.method3634(2);
			this.aClass105_Sub1_42.method3562(260, 7681);
			this.aClass105_Sub1_42.method3568(0, 34168, 768);
			this.aClass105_Sub1_42.method3568(1, 34168, 770);
			this.aClass105_Sub1_42.method3628(0, 34167);
		}
		this.aClass105_Sub1_42.method3634(0);
		this.aClass155_3.method4110();
		this.aClass155_3.method4111(1);
		this.aClass105_Sub1_42.method3634(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean215) {
			this.aClass105_Sub1_42.method3562(8448, 8448);
			this.aClass105_Sub1_42.method3568(0, 5890, 768);
			this.aClass105_Sub1_42.method3628(0, 5890);
		} else {
			this.aClass105_Sub1_42.method3562(8448, 8448);
			this.aClass105_Sub1_42.method3568(0, 5890, 768);
			this.aClass105_Sub1_42.method3634(2);
			this.aClass105_Sub1_42.method3562(8448, 8448);
			this.aClass105_Sub1_42.method3568(0, 5890, 768);
			this.aClass105_Sub1_42.method3568(1, 34168, 768);
			this.aClass105_Sub1_42.method3628(0, 5890);
		}
		this.aClass105_Sub1_42.method3634(0);
		this.aClass155_3.method4110();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!me;)V")
	@Override
	public void method5680(@OriginalArg(0) Class44 arg0) {
		this.aClass105_Sub1_42.method3591(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()Z")
	@Override
	public boolean method5683() {
		return true;
	}
}

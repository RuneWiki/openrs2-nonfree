import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!el;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[Lclient!bc;")
	private Class11_Sub2[] aClass11_Sub2Array1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class23_Sub4(@OriginalArg(0) Class59_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean354) {
			this.aBoolean250 = arg0.anInt4788 < 3;
			@Pc(24) int local24 = this.aBoolean250 ? 48 : 127;
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
			this.aClass11_Sub2Array1 = new Class11_Sub2[3];
			this.aClass11_Sub2Array1[0] = new Class11_Sub2(this.aClass59_Sub1_41, 6406, 64, false, local32, 6406);
			this.aClass11_Sub2Array1[1] = new Class11_Sub2(this.aClass59_Sub1_41, 6406, 64, false, local36, 6406);
			this.aClass11_Sub2Array1[2] = new Class11_Sub2(this.aClass59_Sub1_41, 6406, 64, false, local28, 6406);
			this.method3225();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		if (this.aClass57_3 == null || !arg0) {
			this.aClass59_Sub1_41.method4298(0, 34168);
			return;
		}
		if (!this.aBoolean250) {
			this.aClass59_Sub1_41.method4273(2);
			this.aClass59_Sub1_41.method4296(this.aClass59_Sub1_41.aClass11_Sub1_6);
			this.aClass59_Sub1_41.method4273(0);
		}
		this.aClass57_3.method1598('\u0000');
		this.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
		this.aClass59_Sub1_41.method4296(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		if (this.aBoolean249) {
			if (!this.aBoolean250) {
				this.aClass59_Sub1_41.method4273(2);
				this.aClass59_Sub1_41.method4296(null);
			}
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(null);
			this.aClass59_Sub1_41.method4273(0);
			this.aClass57_3.method1598('\u0001');
			this.aBoolean249 = false;
		} else {
			this.aClass59_Sub1_41.method4298(0, 5890);
		}
		this.aClass59_Sub1_41.method4311(8448, 8448);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
		if (this.aBoolean249) {
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(this.aClass11_Sub2Array1[arg0 - 1]);
			this.aClass59_Sub1_41.method4273(0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
		this.aClass59_Sub1_41.method4311(8448, 7681);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()V")
	private void method3225() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_3 = new Class57(this.aClass59_Sub1_41, 2);
		this.aClass57_3.method1600(0);
		this.aClass59_Sub1_41.method4273(1);
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
		if (this.aBoolean250) {
			this.aClass59_Sub1_41.method4311(260, 7681);
			this.aClass59_Sub1_41.method4297(0, 5890, 770);
			this.aClass59_Sub1_41.method4298(0, 34167);
		} else {
			this.aClass59_Sub1_41.method4311(7681, 8448);
			this.aClass59_Sub1_41.method4297(0, 34168, 768);
			this.aClass59_Sub1_41.method4273(2);
			this.aClass59_Sub1_41.method4311(260, 7681);
			this.aClass59_Sub1_41.method4297(0, 34168, 768);
			this.aClass59_Sub1_41.method4297(1, 34168, 770);
			this.aClass59_Sub1_41.method4298(0, 34167);
		}
		this.aClass59_Sub1_41.method4273(0);
		this.aClass57_3.method1599();
		this.aClass57_3.method1600(1);
		this.aClass59_Sub1_41.method4273(1);
		local3.glDisable(3168);
		local3.glDisable(3169);
		local3.glDisable(3170);
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
		if (this.aBoolean250) {
			this.aClass59_Sub1_41.method4311(8448, 8448);
			this.aClass59_Sub1_41.method4297(0, 5890, 768);
			this.aClass59_Sub1_41.method4298(0, 5890);
		} else {
			this.aClass59_Sub1_41.method4311(8448, 8448);
			this.aClass59_Sub1_41.method4297(0, 5890, 768);
			this.aClass59_Sub1_41.method4273(2);
			this.aClass59_Sub1_41.method4311(8448, 8448);
			this.aClass59_Sub1_41.method4297(0, 5890, 768);
			this.aClass59_Sub1_41.method4297(1, 34168, 768);
			this.aClass59_Sub1_41.method4298(0, 5890);
		}
		this.aClass59_Sub1_41.method4273(0);
		this.aClass57_3.method1599();
	}
}

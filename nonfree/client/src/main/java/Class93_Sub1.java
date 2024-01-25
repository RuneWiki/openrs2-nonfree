import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "Lclient!ni;")
	private Class201 aClass201_2;

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "[Lclient!bo;")
	private Class19_Sub1[] aClass19_Sub1Array1;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class93_Sub1(@OriginalArg(0) Class39_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean499) {
			this.aBoolean219 = arg0.anInt6744 < 3;
			@Pc(26) int local26 = this.aBoolean219 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
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
						@Pc(149) int local149;
						@Pc(148) int local148;
						@Pc(146) int local146;
						if (local101 > 0.0F) {
							local149 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local148 = (int) ((double) local26 * Math.pow((double) local101, 36.0D));
							local146 = (int) ((double) local26 * Math.pow((double) local101, 12.0D));
						} else {
							local146 = 0;
							local148 = 0;
							local149 = 0;
						}
						local34[local91][local40] = (byte) local149;
						local38[local91][local40] = (byte) local148;
						local30[local91][local40] = (byte) local146;
					}
					local40++;
				}
			}
			this.aClass19_Sub1Array1 = new Class19_Sub1[3];
			this.aClass19_Sub1Array1[0] = new Class19_Sub1(super.aClass39_Sub3_40, 6406, 64, false, local34, 6406);
			this.aClass19_Sub1Array1[1] = new Class19_Sub1(super.aClass39_Sub3_40, 6406, 64, false, local38, 6406);
			this.aClass19_Sub1Array1[2] = new Class19_Sub1(super.aClass39_Sub3_40, 6406, 64, false, local30, 6406);
			this.method2515();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		if (this.aClass201_2 == null || !arg0) {
			super.aClass39_Sub3_40.method5680(34168, 0);
			return;
		}
		if (!this.aBoolean219) {
			super.aClass39_Sub3_40.method5750(2);
			super.aClass39_Sub3_40.method5719(super.aClass39_Sub3_40.aClass19_Sub2_5);
			super.aClass39_Sub3_40.method5750(0);
		}
		this.aClass201_2.method5132('\u0000');
		this.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub3_40.method5760(8448, 7681);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean220) {
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(this.aClass19_Sub1Array1[arg0 - 1]);
			super.aClass39_Sub3_40.method5750(0);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		if (this.aBoolean220) {
			if (!this.aBoolean219) {
				super.aClass39_Sub3_40.method5750(2);
				super.aClass39_Sub3_40.method5719(null);
			}
			super.aClass39_Sub3_40.method5750(1);
			super.aClass39_Sub3_40.method5719(null);
			super.aClass39_Sub3_40.method5750(0);
			this.aClass201_2.method5132('\u0001');
			this.aBoolean220 = false;
		} else {
			super.aClass39_Sub3_40.method5680(5890, 0);
		}
		super.aClass39_Sub3_40.method5760(8448, 8448);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub3_40.method5719(arg0);
		super.aClass39_Sub3_40.method5699(arg1);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	private void method2515() {
		this.aClass201_2 = new Class201(super.aClass39_Sub3_40, 2);
		this.aClass201_2.method5135(0);
		super.aClass39_Sub3_40.method5750(1);
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
		if (this.aBoolean219) {
			super.aClass39_Sub3_40.method5760(260, 7681);
			super.aClass39_Sub3_40.method5709(5890, 0, 770);
			super.aClass39_Sub3_40.method5680(34167, 0);
		} else {
			super.aClass39_Sub3_40.method5760(7681, 8448);
			super.aClass39_Sub3_40.method5709(34168, 0, 768);
			super.aClass39_Sub3_40.method5750(2);
			super.aClass39_Sub3_40.method5760(260, 7681);
			super.aClass39_Sub3_40.method5709(34168, 0, 768);
			super.aClass39_Sub3_40.method5709(34168, 1, 770);
			super.aClass39_Sub3_40.method5680(34167, 0);
		}
		super.aClass39_Sub3_40.method5750(0);
		this.aClass201_2.method5136();
		this.aClass201_2.method5135(1);
		super.aClass39_Sub3_40.method5750(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean219) {
			super.aClass39_Sub3_40.method5760(8448, 8448);
			super.aClass39_Sub3_40.method5709(5890, 0, 768);
			super.aClass39_Sub3_40.method5680(5890, 0);
		} else {
			super.aClass39_Sub3_40.method5760(8448, 8448);
			super.aClass39_Sub3_40.method5709(5890, 0, 768);
			super.aClass39_Sub3_40.method5750(2);
			super.aClass39_Sub3_40.method5760(8448, 8448);
			super.aClass39_Sub3_40.method5709(5890, 0, 768);
			super.aClass39_Sub3_40.method5709(34168, 1, 768);
			super.aClass39_Sub3_40.method5680(5890, 0);
		}
		super.aClass39_Sub3_40.method5750(0);
		this.aClass201_2.method5136();
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Lclient!vi;")
	private Class360 aClass360_2;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[Lclient!jc;")
	private Class24_Sub3[] aClass24_Sub3Array1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class34_Sub1(@OriginalArg(0) Class126_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean678) {
			this.aBoolean63 = arg0.anInt8300 < 3;
			@Pc(26) int local26 = this.aBoolean63 ? 48 : 127;
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
						@Pc(154) int local154;
						@Pc(163) int local163;
						@Pc(172) int local172;
						if (local101 > 0.0F) {
							local154 = (int) ((double) local26 * Math.pow((double) local101, 96.0D));
							local163 = (int) (Math.pow((double) local101, 36.0D) * (double) local26);
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
			this.aClass24_Sub3Array1 = new Class24_Sub3[3];
			this.aClass24_Sub3Array1[0] = new Class24_Sub3(super.aClass126_Sub3_39, 6406, 64, false, local34, 6406);
			this.aClass24_Sub3Array1[1] = new Class24_Sub3(super.aClass126_Sub3_39, 6406, 64, false, local38, 6406);
			this.aClass24_Sub3Array1[2] = new Class24_Sub3(super.aClass126_Sub3_39, 6406, 64, false, local30, 6406);
			this.method746();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass126_Sub3_39.method7113(arg1);
		super.aClass126_Sub3_39.method7105(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean62) {
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113(this.aClass24_Sub3Array1[arg0 - 1]);
			super.aClass126_Sub3_39.method7104(0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
		super.aClass126_Sub3_39.method7082(7681, 8448);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		if (this.aBoolean62) {
			if (!this.aBoolean63) {
				super.aClass126_Sub3_39.method7104(2);
				super.aClass126_Sub3_39.method7113((Class24) null);
			}
			super.aClass126_Sub3_39.method7104(1);
			super.aClass126_Sub3_39.method7113((Class24) null);
			super.aClass126_Sub3_39.method7104(0);
			this.aClass360_2.method8434('\u0001');
			this.aBoolean62 = false;
		} else {
			super.aClass126_Sub3_39.method7073(0, 5890);
		}
		super.aClass126_Sub3_39.method7082(8448, 8448);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		if (this.aClass360_2 == null || !arg0) {
			super.aClass126_Sub3_39.method7073(0, 34168);
			return;
		}
		if (!this.aBoolean63) {
			super.aClass126_Sub3_39.method7104(2);
			super.aClass126_Sub3_39.method7113(super.aClass126_Sub3_39.aClass24_Sub4_2);
			super.aClass126_Sub3_39.method7104(0);
		}
		this.aClass360_2.method8434('\u0000');
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	private void method746() {
		this.aClass360_2 = new Class360(super.aClass126_Sub3_39, 2);
		this.aClass360_2.method8433(0);
		super.aClass126_Sub3_39.method7104(1);
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
		if (this.aBoolean63) {
			super.aClass126_Sub3_39.method7082(7681, 260);
			super.aClass126_Sub3_39.method7135(770, 5890, 0);
			super.aClass126_Sub3_39.method7073(0, 34167);
		} else {
			super.aClass126_Sub3_39.method7082(8448, 7681);
			super.aClass126_Sub3_39.method7135(768, 34168, 0);
			super.aClass126_Sub3_39.method7104(2);
			super.aClass126_Sub3_39.method7082(7681, 260);
			super.aClass126_Sub3_39.method7135(768, 34168, 0);
			super.aClass126_Sub3_39.method7135(770, 34168, 1);
			super.aClass126_Sub3_39.method7073(0, 34167);
		}
		super.aClass126_Sub3_39.method7104(0);
		this.aClass360_2.method8436();
		this.aClass360_2.method8433(1);
		super.aClass126_Sub3_39.method7104(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean63) {
			super.aClass126_Sub3_39.method7082(8448, 8448);
			super.aClass126_Sub3_39.method7135(768, 5890, 0);
			super.aClass126_Sub3_39.method7073(0, 5890);
		} else {
			super.aClass126_Sub3_39.method7082(8448, 8448);
			super.aClass126_Sub3_39.method7135(768, 5890, 0);
			super.aClass126_Sub3_39.method7104(2);
			super.aClass126_Sub3_39.method7082(8448, 8448);
			super.aClass126_Sub3_39.method7135(768, 5890, 0);
			super.aClass126_Sub3_39.method7135(768, 34168, 1);
			super.aClass126_Sub3_39.method7073(0, 5890);
		}
		super.aClass126_Sub3_39.method7104(0);
		this.aClass360_2.method8436();
	}
}

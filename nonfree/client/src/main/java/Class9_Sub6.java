import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "Lclient!ct;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "[Lclient!im;")
	private Class6_Sub4[] aClass6_Sub4Array1;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class9_Sub6(@OriginalArg(0) Class19_Sub2 arg0) {
		super(arg0);
		if (arg0.aBoolean199) {
			this.aBoolean493 = arg0.anInt2306 < 3;
			@Pc(26) int local26 = this.aBoolean493 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local57 * local57 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(114) float local114;
						if (local91 == 0) {
							local114 = -local85;
						} else if (local91 == 1) {
							local114 = local85;
						} else if (local91 == 2) {
							local114 = local89;
						} else if (local91 == 3) {
							local114 = -local89;
						} else if (local91 == 4) {
							local114 = local81;
						} else {
							local114 = -local81;
						}
						@Pc(147) int local147;
						@Pc(146) int local146;
						@Pc(144) int local144;
						if (local114 > 0.0F) {
							local147 = (int) (Math.pow((double) local114, 96.0D) * (double) local26);
							local146 = (int) (Math.pow((double) local114, 36.0D) * (double) local26);
							local144 = (int) (Math.pow((double) local114, 12.0D) * (double) local26);
						} else {
							local144 = 0;
							local146 = 0;
							local147 = 0;
						}
						local34[local91][local40] = (byte) local147;
						local38[local91][local40] = (byte) local146;
						local30[local91][local40] = (byte) local144;
					}
					local40++;
				}
			}
			this.aClass6_Sub4Array1 = new Class6_Sub4[3];
			this.aClass6_Sub4Array1[0] = new Class6_Sub4(super.aClass19_Sub2_41, 6406, 64, false, local34, 6406);
			this.aClass6_Sub4Array1[1] = new Class6_Sub4(super.aClass19_Sub2_41, 6406, 64, false, local38, 6406);
			this.aClass6_Sub4Array1[2] = new Class6_Sub4(super.aClass19_Sub2_41, 6406, 64, false, local30, 6406);
			this.method4233();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5377(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub2_41.method1912(8448, 7681);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
	@Override
	public void method5373() {
		if (this.aBoolean494) {
			if (!this.aBoolean493) {
				super.aClass19_Sub2_41.method1936(2);
				super.aClass19_Sub2_41.method1905(null);
			}
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1905(null);
			super.aClass19_Sub2_41.method1936(0);
			this.aClass43_5.method989('\u0001');
			this.aBoolean494 = false;
		} else {
			super.aClass19_Sub2_41.method1954(5890, 0);
		}
		super.aClass19_Sub2_41.method1912(8448, 8448);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!kj;Z)V")
	@Override
	public void method5376(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		super.aClass19_Sub2_41.method1905(arg1);
		super.aClass19_Sub2_41.method1900(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
	private void method4233() {
		this.aClass43_5 = new Class43(super.aClass19_Sub2_41, 2);
		this.aClass43_5.method990(0);
		super.aClass19_Sub2_41.method1936(1);
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
		if (this.aBoolean493) {
			super.aClass19_Sub2_41.method1912(260, 7681);
			super.aClass19_Sub2_41.method1945(0, 770, 5890);
			super.aClass19_Sub2_41.method1954(34167, 0);
		} else {
			super.aClass19_Sub2_41.method1912(7681, 8448);
			super.aClass19_Sub2_41.method1945(0, 768, 34168);
			super.aClass19_Sub2_41.method1936(2);
			super.aClass19_Sub2_41.method1912(260, 7681);
			super.aClass19_Sub2_41.method1945(0, 768, 34168);
			super.aClass19_Sub2_41.method1945(1, 770, 34168);
			super.aClass19_Sub2_41.method1954(34167, 0);
		}
		super.aClass19_Sub2_41.method1936(0);
		this.aClass43_5.method991();
		this.aClass43_5.method990(1);
		super.aClass19_Sub2_41.method1936(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean493) {
			super.aClass19_Sub2_41.method1912(8448, 8448);
			super.aClass19_Sub2_41.method1945(0, 768, 5890);
			super.aClass19_Sub2_41.method1954(5890, 0);
		} else {
			super.aClass19_Sub2_41.method1912(8448, 8448);
			super.aClass19_Sub2_41.method1945(0, 768, 5890);
			super.aClass19_Sub2_41.method1936(2);
			super.aClass19_Sub2_41.method1912(8448, 8448);
			super.aClass19_Sub2_41.method1945(0, 768, 5890);
			super.aClass19_Sub2_41.method1945(1, 768, 34168);
			super.aClass19_Sub2_41.method1954(5890, 0);
		}
		super.aClass19_Sub2_41.method1936(0);
		this.aClass43_5.method991();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5371(@OriginalArg(1) boolean arg0) {
		if (this.aClass43_5 == null || !arg0) {
			super.aClass19_Sub2_41.method1954(34168, 0);
			return;
		}
		if (!this.aBoolean493) {
			super.aClass19_Sub2_41.method1936(2);
			super.aClass19_Sub2_41.method1905(super.aClass19_Sub2_41.aClass6_Sub1_3);
			super.aClass19_Sub2_41.method1936(0);
		}
		this.aClass43_5.method989('\u0000');
		this.aBoolean494 = true;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aBoolean494) {
			super.aClass19_Sub2_41.method1936(1);
			super.aClass19_Sub2_41.method1905(this.aClass6_Sub4Array1[arg0 - 1]);
			super.aClass19_Sub2_41.method1936(0);
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!tq;")
	private Class55_Sub3_Sub1 aClass55_Sub3_Sub1_2;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	private int anInt2802 = 0;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	private int anInt2807 = 0;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	private int anInt2800 = 0;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	private int anInt2805 = 0;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
	private int anInt2813 = 0;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_14;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "Lclient!tq;")
	private final Class55_Sub3_Sub1 aClass55_Sub3_Sub1_3;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ef;IIII)V")
	public Class17_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass49_Sub2_14 = arg0;
		this.aClass55_Sub3_Sub1_3 = Static213.method3363(arg2, arg1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!ef;II[III)V")
	public Class17_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass49_Sub2_14 = arg0;
		this.aClass55_Sub3_Sub1_3 = Static5.method158(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
	private void method2222(@OriginalArg(0) int arg0) {
		this.aClass49_Sub2_14.method1600(1);
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
		this.aClass49_Sub2_14.method1613(this.aClass49_Sub2_14.method1620(arg0), 7681);
		this.aClass49_Sub2_14.method1625(34167, 768, 1);
		this.aClass49_Sub2_14.method1623(34168, 0);
		this.aClass49_Sub2_14.method1600(0);
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_2);
		this.aClass49_Sub2_14.method1613(34479, 7681);
		this.aClass49_Sub2_14.method1625(34166, 768, 1);
		if (this.anInt2807 == 0) {
			this.aClass49_Sub2_14.method1621(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt2807 == 1) {
			this.aClass49_Sub2_14.method1621(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt2807 == 2) {
			this.aClass49_Sub2_14.method1621(0.0F, 1.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt2807 == 3) {
			this.aClass49_Sub2_14.method1621(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!gn", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass55_Sub3_Sub1_3.method5553(false);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
		this.aClass49_Sub2_14.method1626(arg6);
		this.aClass49_Sub2_14.method1624(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass55_Sub3_Sub1_3.aBoolean444 && !this.aBoolean217) {
			@Pc(72) float local72 = (float) arg3 * this.aClass55_Sub3_Sub1_3.aFloat101 / (float) this.aClass55_Sub3_Sub1_3.anInt6503;
			@Pc(84) float local84 = (float) arg2 * this.aClass55_Sub3_Sub1_3.aFloat100 / (float) this.aClass55_Sub3_Sub1_3.anInt6500;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt2800, (float) this.anInt2813, 0.0F);
		@Pc(124) int local124 = this.j();
		@Pc(127) int local127 = this.T();
		@Pc(133) int local133 = this.aClass55_Sub3_Sub1_3.anInt6503 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local13 >= local133) {
			local145 = this.aClass55_Sub3_Sub1_3.anInt6500 + arg0;
			@Pc(147) int local147 = arg0;
			while (local9 >= local145) {
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local145, local137);
				local145 += local124;
				local147 += local124;
			}
			if (local9 > local147) {
				@Pc(210) float local210 = (float) (local9 - local147) * this.aClass55_Sub3_Sub1_3.aFloat100 / (float) this.aClass55_Sub3_Sub1_3.anInt6500;
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local210, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local210, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local13 > local137) {
			@Pc(279) float local279 = this.aClass55_Sub3_Sub1_3.aFloat101 * (float) (this.aClass55_Sub3_Sub1_3.anInt6503 + local137 - local13) / (float) this.aClass55_Sub3_Sub1_3.anInt6503;
			@Pc(286) int local286 = arg0 + this.aClass55_Sub3_Sub1_3.anInt6500;
			local145 = arg0;
			while (local286 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, local279);
				OpenGL.glVertex2i(local286, local13);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local286, local137);
				local145 += local124;
				local286 += local124;
			}
			if (local145 < local9) {
				@Pc(355) float local355 = (float) (local9 - local145) * this.aClass55_Sub3_Sub1_3.aFloat100 / (float) this.aClass55_Sub3_Sub1_3.anInt6500;
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(local355, local279);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local355, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gn", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass55_Sub3_Sub1_3.anInt6503;
	}

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass55_Sub3_Sub1_3.method5553(false);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1626(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt2800;
		@Pc(42) int local42 = arg1 + this.anInt2813;
		if (this.aClass55_Sub3_Sub1_2 == null) {
			this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
			this.aClass49_Sub2_14.method1624(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass55_Sub3_Sub1_3.anInt6503 + local42);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass55_Sub3_Sub1_3.anInt6500, local42 - -this.aClass55_Sub3_Sub1_3.anInt6503);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(this.aClass55_Sub3_Sub1_3.anInt6500 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2222(arg2);
		this.aClass55_Sub3_Sub1_2.method5553(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass55_Sub3_Sub1_3.anInt6503);
		OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
		OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass55_Sub3_Sub1_3.anInt6500, this.aClass55_Sub3_Sub1_3.anInt6503 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glVertex2i(local37 + this.aClass55_Sub3_Sub1_3.anInt6500, local42);
		OpenGL.glEnd();
		this.method2225();
	}

	@OriginalMember(owner = "client!gn", name = "MA", descriptor = "(IIII)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2802 = arg2;
		this.anInt2805 = arg3;
		this.anInt2800 = arg0;
		this.anInt2813 = arg1;
		this.aBoolean217 = this.anInt2800 != 0 || this.anInt2813 != 0 || this.anInt2802 != 0 || this.anInt2805 != 0;
	}

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "()I")
	@Override
	public int j() {
		return this.anInt2800 + this.aClass55_Sub3_Sub1_3.anInt6500 + this.anInt2802;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class73_Sub2 local6 = (Class73_Sub2) arg2;
		@Pc(9) Class55_Sub3_Sub1 local9 = local6.aClass55_Sub3_Sub1_5;
		this.aClass55_Sub3_Sub1_3.method5553(false);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
		this.aClass49_Sub2_14.method1624(1);
		this.aClass49_Sub2_14.method1600(1);
		this.aClass49_Sub2_14.method1646(local9);
		this.aClass49_Sub2_14.method1613(7681, 8448);
		this.aClass49_Sub2_14.method1625(34168, 768, 0);
		this.aClass49_Sub2_14.method1626(1);
		@Pc(62) int local62 = arg1 + this.anInt2813;
		@Pc(67) int local67 = arg0 + this.anInt2800;
		@Pc(73) int local73 = this.aClass55_Sub3_Sub1_3.anInt6500 + local67;
		@Pc(79) int local79 = this.aClass55_Sub3_Sub1_3.anInt6503 + local62;
		@Pc(86) float local86 = local9.aFloat100 / (float) local9.anInt6500;
		@Pc(93) float local93 = local9.aFloat101 / (float) local9.anInt6503;
		@Pc(100) float local100 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat101 - local93 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat101 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glMultiTexCoord2f(33985, local100, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local132);
		OpenGL.glVertex2i(local67, this.aClass55_Sub3_Sub1_3.anInt6503 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local132);
		OpenGL.glVertex2i(local67 + this.aClass55_Sub3_Sub1_3.anInt6500, local62 + this.aClass55_Sub3_Sub1_3.anInt6503);
		OpenGL.glMultiTexCoord2f(33984, this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(local67 + this.aClass55_Sub3_Sub1_3.anInt6500, local62);
		OpenGL.glEnd();
		this.aClass49_Sub2_14.method1625(5890, 768, 0);
		this.aClass49_Sub2_14.method1624(0);
		this.aClass49_Sub2_14.method1646(null);
		this.aClass49_Sub2_14.method1600(0);
	}

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass55_Sub3_Sub1_3.method5553(true);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1626(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean217) {
			@Pc(184) float local184 = (float) arg2 / (float) this.j();
			@Pc(191) float local191 = (float) arg3 / (float) this.T();
			@Pc(200) float local200 = (float) this.anInt2800 * local184 + (float) arg0;
			@Pc(209) float local209 = local191 * (float) this.anInt2813 + (float) arg1;
			@Pc(218) float local218 = local184 * (float) this.aClass55_Sub3_Sub1_3.anInt6500 + local200;
			@Pc(227) float local227 = local209 + local191 * (float) this.aClass55_Sub3_Sub1_3.anInt6503;
			if (this.aClass55_Sub3_Sub1_2 == null) {
				this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
				this.aClass49_Sub2_14.method1624(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2f(local200, local209);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local200, local227);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
				OpenGL.glVertex2f(local218, local227);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2f(local218, local209);
				OpenGL.glEnd();
			} else {
				this.method2222(arg4);
				this.aClass55_Sub3_Sub1_2.method5553(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2f(local200, local209);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local200, local227);
				OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
				OpenGL.glVertex2f(local218, local227);
				OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
				OpenGL.glVertex2f(local218, local209);
				OpenGL.glEnd();
				this.method2225();
			}
		} else if (this.aClass55_Sub3_Sub1_2 == null) {
			this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
			this.aClass49_Sub2_14.method1624(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method2222(arg4);
			this.aClass55_Sub3_Sub1_2.method5553(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method2225();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean217) {
			local10 = this.j();
			local14 = this.T();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = (float) this.anInt2813 * local34;
			@Pc(53) float local53 = local41 * (float) this.anInt2813;
			@Pc(59) float local59 = local21 * (float) this.anInt2800;
			@Pc(65) float local65 = local27 * (float) this.anInt2800;
			@Pc(72) float local72 = (float) this.anInt2802 * -local21;
			@Pc(79) float local79 = (float) this.anInt2802 * -local27;
			@Pc(86) float local86 = (float) this.anInt2805 * -local34;
			arg4 = arg4 + local59 + local86;
			arg0 = arg0 + local59 + local47;
			@Pc(105) float local105 = -local41 * (float) this.anInt2805;
			arg1 = local53 + arg1 + local65;
			arg3 = arg3 + local79 + local53;
			arg2 = local47 + local72 + arg2;
			arg5 = arg5 + local65 + local105;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass55_Sub3_Sub1_3.method5553(true);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
		this.aClass49_Sub2_14.method1626(arg8);
		this.aClass49_Sub2_14.method1624(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gn", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass55_Sub3_Sub1_3.anInt6500;
	}

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass55_Sub3_Sub1_3.method5119(arg4, arg1, arg0, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class73 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class55_Sub3_Sub1 local7 = ((Class73_Sub2) arg6).aClass55_Sub3_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean217) {
			local14 = this.j();
			local18 = this.T();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt2813 * local37;
			@Pc(55) float local55 = (float) this.anInt2813 * local43;
			@Pc(61) float local61 = (float) this.anInt2800 * local24;
			@Pc(67) float local67 = local30 * (float) this.anInt2800;
			@Pc(74) float local74 = (float) this.anInt2802 * -local24;
			@Pc(81) float local81 = (float) this.anInt2802 * -local30;
			@Pc(88) float local88 = (float) this.anInt2805 * -local37;
			arg4 = local88 + local61 + arg4;
			arg0 = local49 + local61 + arg0;
			arg3 = local81 + arg3 + local55;
			arg2 = local49 + arg2 + local74;
			@Pc(119) float local119 = -local43 * (float) this.anInt2805;
			arg1 = local67 + arg1 + local55;
			arg5 = local119 + arg5 + local67;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass55_Sub3_Sub1_3.method5553(true);
		this.aClass49_Sub2_14.method1584();
		this.aClass49_Sub2_14.method1646(this.aClass55_Sub3_Sub1_3);
		this.aClass49_Sub2_14.method1624(1);
		this.aClass49_Sub2_14.method1600(1);
		this.aClass49_Sub2_14.method1646(local7);
		this.aClass49_Sub2_14.method1613(7681, 8448);
		this.aClass49_Sub2_14.method1625(34168, 768, 0);
		this.aClass49_Sub2_14.method1626(1);
		local24 = local7.aFloat100 / (float) local7.anInt6500;
		local30 = local7.aFloat101 / (float) local7.anInt6503;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat101 - local30 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat101 - (arg5 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass55_Sub3_Sub1_3.aFloat100, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat101 - local30 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass55_Sub3_Sub1_3.aFloat100, this.aClass55_Sub3_Sub1_3.aFloat101);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat101 - ((float) -arg8 + arg3) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass49_Sub2_14.method1625(5890, 768, 0);
		this.aClass49_Sub2_14.method1624(0);
		this.aClass49_Sub2_14.method1646(null);
		this.aClass49_Sub2_14.method1600(0);
	}

	@OriginalMember(owner = "client!gn", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass55_Sub3_Sub1_2 = Static213.method3363(arg1, arg0, this.aClass55_Sub3_Sub1_3.anInt6500, this.aClass49_Sub2_14, this.aClass55_Sub3_Sub1_3.anInt6503);
		this.anInt2807 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	private void method2225() {
		this.aClass49_Sub2_14.method1600(1);
		this.aClass49_Sub2_14.method1646(null);
		this.aClass49_Sub2_14.method1613(8448, 8448);
		this.aClass49_Sub2_14.method1625(34168, 768, 1);
		this.aClass49_Sub2_14.method1623(5890, 0);
		this.aClass49_Sub2_14.method1600(0);
		this.aClass49_Sub2_14.method1625(34168, 768, 1);
	}

	@OriginalMember(owner = "client!gn", name = "T", descriptor = "()I")
	@Override
	public int T() {
		return this.anInt2805 + this.aClass55_Sub3_Sub1_3.anInt6503 + this.anInt2813;
	}
}

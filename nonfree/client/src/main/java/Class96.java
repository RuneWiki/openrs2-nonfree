import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class96 implements Interface12 {

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "[F")
	public static final float[] aFloatArray16;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "[F")
	public static final float[] aFloatArray17;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!eaa;")
	private final Class65 aClass65_2 = new Class65(256);

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "Lclient!dda;")
	private final Class53 aClass53_46;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "Lclient!dda;")
	private final Class53 aClass53_45;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
	private final int anInt2725;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "[Lclient!ns;")
	private final Class204[] aClass204Array1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
		aFloatArray16 = new float[16384];
		aFloatArray17 = new float[16384];
		@Pc(23) double local23 = 3.834951969714103E-4D;
		for (@Pc(25) int local25 = 0; local25 < 16384; local25++) {
			aFloatArray17[local25] = (float) Math.sin(local23 * (double) local25);
			aFloatArray16[local25] = (float) Math.cos((double) local25 * local23);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!dda;Lclient!dda;Lclient!dda;)V")
	public Class96(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_46 = arg2;
		this.aClass53_45 = arg1;
		@Pc(24) Class2_Sub29 local24 = new Class2_Sub29(arg0.method1616(0, 0));
		this.anInt2725 = local24.method5229();
		this.aClass204Array1 = new Class204[this.anInt2725];
		for (@Pc(36) int local36 = 0; local36 < this.anInt2725; local36++) {
			if (local24.method5170() == 1) {
				this.aClass204Array1[local36] = new Class204();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt2725; local63++) {
			if (this.aClass204Array1[local63] != null) {
				this.aClass204Array1[local63].aBoolean460 = local24.method5170() == 0;
			}
		}
		for (@Pc(93) int local93 = 0; local93 < this.anInt2725; local93++) {
			if (this.aClass204Array1[local93] != null) {
				this.aClass204Array1[local93].aBoolean458 = local24.method5170() == 1;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < this.anInt2725; local124++) {
			if (this.aClass204Array1[local124] != null) {
				this.aClass204Array1[local124].aBoolean454 = local24.method5170() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < this.anInt2725; local151++) {
			if (this.aClass204Array1[local151] != null) {
				this.aClass204Array1[local151].aBoolean459 = local24.method5170() == 1;
			}
		}
		for (@Pc(182) int local182 = 0; local182 < this.anInt2725; local182++) {
			if (this.aClass204Array1[local182] != null) {
				this.aClass204Array1[local182].aByte82 = local24.method5179();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt2725; local204++) {
			if (this.aClass204Array1[local204] != null) {
				this.aClass204Array1[local204].aByte83 = local24.method5179();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt2725; local226++) {
			if (this.aClass204Array1[local226] != null) {
				this.aClass204Array1[local226].aByte85 = local24.method5179();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt2725; local248++) {
			if (this.aClass204Array1[local248] != null) {
				this.aClass204Array1[local248].aByte86 = local24.method5179();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < this.anInt2725; local274++) {
			if (this.aClass204Array1[local274] != null) {
				this.aClass204Array1[local274].aShort118 = (short) local24.method5229();
			}
		}
		for (@Pc(301) int local301 = 0; local301 < this.anInt2725; local301++) {
			if (this.aClass204Array1[local301] != null) {
				this.aClass204Array1[local301].aByte87 = local24.method5179();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < this.anInt2725; local323++) {
			if (this.aClass204Array1[local323] != null) {
				this.aClass204Array1[local323].aByte84 = local24.method5179();
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt2725; local345++) {
			if (this.aClass204Array1[local345] != null) {
				this.aClass204Array1[local345].aBoolean455 = local24.method5170() == 1;
			}
		}
		for (@Pc(374) int local374 = 0; local374 < this.anInt2725; local374++) {
			if (this.aClass204Array1[local374] != null) {
				this.aClass204Array1[local374].aBoolean457 = local24.method5170() == 1;
			}
		}
		for (@Pc(403) int local403 = 0; local403 < this.anInt2725; local403++) {
			if (this.aClass204Array1[local403] != null) {
				this.aClass204Array1[local403].aByte81 = local24.method5179();
			}
		}
		for (@Pc(429) int local429 = 0; local429 < this.anInt2725; local429++) {
			if (this.aClass204Array1[local429] != null) {
				this.aClass204Array1[local429].aBoolean456 = local24.method5170() == 1;
			}
		}
		for (@Pc(458) int local458 = 0; local458 < this.anInt2725; local458++) {
			if (this.aClass204Array1[local458] != null) {
				this.aClass204Array1[local458].aBoolean461 = local24.method5170() == 1;
			}
		}
		for (@Pc(485) int local485 = 0; local485 < this.anInt2725; local485++) {
			if (this.aClass204Array1[local485] != null) {
				this.aClass204Array1[local485].aBoolean462 = local24.method5170() == 1;
			}
		}
		for (@Pc(512) int local512 = 0; local512 < this.anInt2725; local512++) {
			if (this.aClass204Array1[local512] != null) {
				this.aClass204Array1[local512].anInt6219 = local24.method5170();
			}
		}
		for (@Pc(538) int local538 = 0; local538 < this.anInt2725; local538++) {
			if (this.aClass204Array1[local538] != null) {
				this.aClass204Array1[local538].anInt6222 = local24.method5198();
			}
		}
		for (@Pc(560) int local560 = 0; local560 < this.anInt2725; local560++) {
			if (this.aClass204Array1[local560] != null) {
				this.aClass204Array1[local560].aBoolean453 = local24.method5170() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2572(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub13_Sub13 local15 = this.method2579(arg0);
		return local15 != null && local15.method6257(this, this.aClass53_46);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIFBIZ)[I")
	@Override
	public int[] method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method2579(arg3).method6259(this, this.aClass53_46, (double) arg2, arg0, arg4, this.aClass204Array1[arg3].aBoolean457, arg1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)Lclient!ns;")
	@Override
	public Class204 method2573(@OriginalArg(0) int arg0) {
		return this.aClass204Array1[arg0];
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(FIIIZI)[I")
	@Override
	public int[] method2574(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method2579(arg2).method6254(this, (double) arg0, arg1, arg3, this.aClass204Array1[arg2].aBoolean457, this.aClass53_46);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Lclient!qd;")
	private Class2_Sub13_Sub13 method2579(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub13 local10 = this.aClass65_2.method1918((long) arg0);
		if (local10 != null) {
			return (Class2_Sub13_Sub13) local10;
		}
		@Pc(23) byte[] local23 = this.aClass53_45.method1599(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(35) Class2_Sub13_Sub13 local35 = new Class2_Sub13_Sub13(new Class2_Sub29(local23));
			this.aClass65_2.method1921((long) arg0, local35);
			return local35;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIFIZ)[F")
	@Override
	public float[] method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		return this.method2579(arg2).method6258(this.aClass53_46, arg0, this.aClass204Array1[arg2].aBoolean457, this, arg1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)I")
	@Override
	public int method2570() {
		return this.anInt2725;
	}
}

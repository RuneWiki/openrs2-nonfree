import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class34 implements Interface2 {

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
	public static int[] anIntArray164 = new int[99];

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!se;")
	private Class65 aClass65_42 = new Class65();

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	private int anInt1645 = 0;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
	private int anInt1643 = 128;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!ef;")
	private final Class16 aClass16_72;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	private final int anInt1646;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[Lclient!qf;")
	private final Class3_Sub20[] aClass3_Sub20Array1;

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 99; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) (Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D + (double) local14);
			local7 += local27;
			anIntArray164[local9] = local7 / 4;
		}
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!ef;Lclient!ef;IDI)V")
	public Class34(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aClass16_72 = arg1;
		this.aDouble1 = arg3;
		this.anInt1643 = arg4;
		this.anInt1646 = arg2;
		this.anInt1645 = this.anInt1646;
		@Pc(38) int[] local38 = arg0.method571(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub20Array1 = new Class3_Sub20[arg0.method561(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub11 local63 = new Class3_Sub11(arg0.method566(0, local38[local50]));
			this.aClass3_Sub20Array1[local38[local50]] = new Class3_Sub20(local63);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method1101() {
		for (@Pc(7) int local7 = 0; local7 < this.aClass3_Sub20Array1.length; local7++) {
			if (this.aClass3_Sub20Array1[local7] != null) {
				this.aClass3_Sub20Array1[local7].method1796();
			}
		}
		this.aClass65_42 = new Class65();
		this.anInt1645 = this.anInt1646;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ID)V")
	public void method1102(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method1101();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public void method1104(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aClass3_Sub20Array1.length; local7++) {
			@Pc(14) Class3_Sub20 local14 = this.aClass3_Sub20Array1[local7];
			if (local14 != null && local14.anInt2627 != 0 && local14.aBoolean148) {
				local14.method1795(arg0);
				local14.aBoolean148 = false;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1097(@OriginalArg(1) int arg0) {
		return this.anInt1643 == 64;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1099(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub20 local8 = this.aClass3_Sub20Array1[arg0];
		if (local8 != null) {
			if (local8.anIntArray317 != null) {
				this.aClass65_42.method1964(local8);
				local8.aBoolean148 = true;
				return local8.anIntArray317;
			}
			@Pc(41) boolean local41 = local8.method1794(this.aDouble1, this.anInt1643, this.aClass16_72);
			if (local41) {
				if (this.anInt1645 == 0) {
					@Pc(63) Class3_Sub20 local63 = (Class3_Sub20) this.aClass65_42.method1956();
					local63.method1796();
				} else {
					this.anInt1645--;
				}
				this.aClass65_42.method1964(local8);
				local8.aBoolean148 = true;
				return local8.anIntArray317;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)I")
	@Override
	public int method1098(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub20Array1[arg0] == null ? 0 : this.aClass3_Sub20Array1[arg0].anInt2625;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1100(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub20Array1[arg0].aBoolean149;
	}
}

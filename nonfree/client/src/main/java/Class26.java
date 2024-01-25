import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class26 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!l;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
	private int anInt764 = -1;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Z")
	private boolean aBoolean32 = true;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "[Lclient!rp;")
	private final Class177[] aClass177Array1;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	private final int anInt762;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	private final int anInt756;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	private final int anInt759;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	private final int anInt758;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "[Lclient!rp;")
	private final Class177[] aClass177Array2;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "Lclient!rp;")
	private final Class177 aClass177_1;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(I[Lclient!rp;IIII)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) Class177[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass177Array1 = arg1;
		this.anInt762 = arg3;
		this.anInt756 = arg0;
		this.anInt759 = arg4;
		this.anInt758 = arg5;
		if (arg1 == null) {
			this.aClass177_1 = null;
			this.aClass177Array2 = null;
		} else {
			this.aClass177Array2 = new Class177[arg1.length];
			this.aClass177_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BIIIILclient!tj;IIII)V")
	public void method618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg8 + arg6 & 0x3FFF;
		if (this.anInt756 == -1) {
			arg4.method4732(arg3, arg5, arg7, arg1, arg0, 0);
		} else {
			@Pc(35) Class171 local35 = Static123.anInterface9_2.method2396(this.anInt756);
			if (this.aClass57_3 == null && Static123.anInterface9_2.method2394(this.anInt756)) {
				@Pc(71) int[] local71 = local35.aBoolean326 ? Static123.anInterface9_2.method2395(this.anInt761, false, this.anInt756, 0.7F, this.anInt761) : Static123.anInterface9_2.method2392(this.anInt761, this.anInt761, this.anInt756, 0.7F);
				this.aClass57_3 = arg4.method4762(local71, this.anInt761, this.anInt761, this.anInt761);
			}
			if (!local35.aBoolean326) {
				arg4.method4732(arg3, arg5, arg7, arg1, arg0, 0);
			}
			if (this.aClass57_3 != null) {
				@Pc(104) int local104 = local35.aBoolean326 ? 0 : 1;
				@Pc(110) int local110 = arg2 * arg1 / -4096;
				@Pc(123) int local123;
				for (local123 = (arg7 - arg1) / 2 + local15 * arg1 / 4096; local123 > arg1; local123 -= arg1) {
				}
				while (local110 > arg1) {
					local110 -= arg1;
				}
				while (local123 < 0) {
					local123 += arg1;
				}
				while (local110 < 0) {
					local110 += arg1;
				}
				for (@Pc(168) int local168 = local123 - arg1; local168 < arg7; local168 += arg1) {
					for (@Pc(175) int local175 = local110 - arg1; local175 < arg1; local175 += arg1) {
						this.aClass57_3.method5449(arg3 + local168, arg5 + local175, arg1, arg1, 0, 0, local104);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt755 - 1; local214 >= 0; local214--) {
			this.aClass177Array2[local214].method4621(arg4, arg3, arg5, arg7, arg1, arg2, local15);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZLclient!tj;)Z")
	public boolean method620(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		if (this.anInt764 != arg0) {
			this.anInt764 = arg0;
			@Pc(20) int local20 = Static83.method1300(arg0);
			if (arg0 < local20) {
				local20 = Static89.method5618(arg0);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (this.anInt761 != local20) {
				this.aClass57_3 = null;
				this.anInt761 = local20;
			}
			if (this.aClass177Array1 != null) {
				this.anInt755 = 0;
				@Pc(59) int[] local59 = new int[this.aClass177Array1.length];
				for (@Pc(61) int local61 = 0; local61 < this.aClass177Array1.length; local61++) {
					@Pc(68) Class177 local68 = this.aClass177Array1[local61];
					if (local68.method4614(this.anInt762, this.anInt759, this.anInt758, this.anInt764)) {
						local59[this.anInt755] = local68.anInt5495;
						this.aClass177Array2[this.anInt755++] = local68;
					}
				}
				Static121.method2138(this.aClass177Array2, local59, this.anInt755 - 1, 0);
			}
			this.aBoolean32 = true;
		}
		@Pc(117) boolean local117 = false;
		if (this.aBoolean32) {
			this.aBoolean32 = false;
			for (@Pc(128) int local128 = this.anInt755 - 1; local128 >= 0; local128--) {
				@Pc(139) boolean local139 = this.aClass177Array2[local128].method4616(arg1, this.aClass177_1);
				this.aBoolean32 |= !local139;
				local117 |= local139;
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method625() {
		if (this.aClass177Array1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass177Array1.length; local14++) {
				this.aClass177Array1[local14].method4615();
			}
		}
		this.aClass57_3 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class141 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "Lclient!xa;")
	private Class71 aClass71_24;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	private int anInt4060;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
	private int anInt4066;

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	private int anInt4065 = -1;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "Z")
	private boolean aBoolean309 = true;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	private final int anInt4069;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	private final int anInt4059;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	private final int anInt4061;

	@OriginalMember(owner = "client!iea", name = "m", descriptor = "[Lclient!ce;")
	private final Class48[] aClass48Array2;

	@OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
	private final int anInt4067;

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "[Lclient!ce;")
	private final Class48[] aClass48Array1;

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "Lclient!ce;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(I[Lclient!ce;IIII)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) Class48[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4069 = arg0;
		this.anInt4059 = arg5;
		this.anInt4061 = arg3;
		this.aClass48Array2 = arg1;
		this.anInt4067 = arg4;
		if (arg1 == null) {
			this.aClass48Array1 = null;
			this.aClass48_1 = null;
		} else {
			this.aClass48Array1 = new Class48[arg1.length];
			this.aClass48_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIIIIIILclient!oa;B)V")
	public void method3487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class90 arg8) {
		@Pc(8) int local8 = arg7 + arg6 & 0x3FFF;
		if (this.anInt4069 == -1) {
			arg8.C(arg4, arg0, arg5, arg1, arg3, 0);
		} else {
			@Pc(29) Class115 local29 = Static386.anInterface2_12.method3085(this.anInt4069);
			if (this.aClass71_24 == null && Static386.anInterface2_12.method3089(this.anInt4069)) {
				@Pc(65) int[] local65 = local29.aBoolean228 ? Static386.anInterface2_12.method3087(this.anInt4066, this.anInt4066, this.anInt4069, 0.7F) : Static386.anInterface2_12.method3088(this.anInt4069, this.anInt4066, 0.7F, this.anInt4066, false);
				this.aClass71_24 = arg8.method7471(local65, this.anInt4066, this.anInt4066, this.anInt4066);
			}
			if (local29.aBoolean228) {
				arg8.C(arg4, arg0, arg5, arg1, arg3, 0);
			}
			if (this.aClass71_24 != null) {
				@Pc(98) int local98 = local29.aBoolean228 ? 1 : 0;
				@Pc(104) int local104 = arg1 * arg2 / -4096;
				@Pc(116) int local116;
				for (local116 = (arg5 - arg1) / 2 + local8 * arg1 / 4096; local116 > arg1; local116 -= arg1) {
				}
				while (local116 < 0) {
					local116 += arg1;
				}
				while (arg1 < local104) {
					local104 -= arg1;
				}
				while (local104 < 0) {
					local104 += arg1;
				}
				for (@Pc(162) int local162 = local116 - arg1; local162 < arg5; local162 += arg1) {
					for (@Pc(169) int local169 = local104 - arg1; local169 < arg1; local169 += arg1) {
						this.aClass71_24.KA(arg4 + local162, arg0 + local169, arg1, arg1, 1, 0, local98);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt4060 - 1; local214 >= 0; local214--) {
			this.aClass48Array1[local214].method906(arg8, arg4, arg0, arg5, arg1, arg2, local8);
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!oa;II)Z")
	public boolean method3489(@OriginalArg(0) Class90 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4065 != arg1) {
			this.anInt4065 = arg1;
			@Pc(18) int local18 = Static118.method7958(arg1);
			if (local18 > 512) {
				local18 = 512;
			}
			if (local18 <= 0) {
				local18 = 1;
			}
			if (this.anInt4066 != local18) {
				this.anInt4066 = local18;
				this.aClass71_24 = null;
			}
			if (this.aClass48Array2 != null) {
				this.anInt4060 = 0;
				@Pc(54) int[] local54 = new int[this.aClass48Array2.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass48Array2.length; local56++) {
					@Pc(63) Class48 local63 = this.aClass48Array2[local56];
					if (local63.method902(this.anInt4061, this.anInt4067, this.anInt4059, this.anInt4065)) {
						local54[this.anInt4060] = local63.anInt1094;
						this.aClass48Array1[this.anInt4060++] = local63;
					}
				}
				Static377.method5515(this.aClass48Array1, local54, 0, this.anInt4060 - 1);
			}
			this.aBoolean309 = true;
		}
		@Pc(116) boolean local116 = false;
		if (this.aBoolean309) {
			this.aBoolean309 = false;
			for (@Pc(134) int local134 = this.anInt4060 - 1; local134 >= 0; local134--) {
				@Pc(145) boolean local145 = this.aClass48Array1[local134].method904(arg0, this.aClass48_1);
				local116 |= local145;
				this.aBoolean309 |= !local145;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public void method3490() {
		if (this.aClass48Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass48Array2.length; local6++) {
				this.aClass48Array2[local6].method905();
			}
		}
		this.aClass71_24 = null;
	}
}

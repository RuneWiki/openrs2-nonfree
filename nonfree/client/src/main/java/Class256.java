import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class256 {

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private int anInt7382;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!f;")
	private Class73 aClass73_37;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	private int anInt7389;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Z")
	private boolean aBoolean517 = true;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
	private int anInt7387 = -1;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	private final int anInt7386;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	private final int anInt7377;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	private final int anInt7380;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	private final int anInt7385;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[Lclient!lc;")
	private final Class183[] aClass183Array2;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "[Lclient!lc;")
	private final Class183[] aClass183Array1;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!lc;")
	private final Class183 aClass183_1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I[Lclient!lc;IIII)V")
	public Class256(@OriginalArg(0) int arg0, @OriginalArg(1) Class183[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7386 = arg4;
		this.anInt7377 = arg3;
		this.anInt7380 = arg0;
		this.anInt7385 = arg5;
		this.aClass183Array2 = arg1;
		if (arg1 == null) {
			this.aClass183Array1 = null;
			this.aClass183_1 = null;
		} else {
			this.aClass183Array1 = new Class183[arg1.length];
			this.aClass183_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!r;IB)Z")
	public boolean method5766(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7387 != arg1) {
			this.anInt7387 = arg1;
			@Pc(16) int local16 = Static49.method1209(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt7382 != local16) {
				this.aClass73_37 = null;
				this.anInt7382 = local16;
			}
			if (this.aClass183Array2 != null) {
				this.anInt7389 = 0;
				@Pc(53) int[] local53 = new int[this.aClass183Array2.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass183Array2.length; local55++) {
					@Pc(62) Class183 local62 = this.aClass183Array2[local55];
					if (local62.method4559(this.anInt7377, this.anInt7386, this.anInt7385, this.anInt7387)) {
						local53[this.anInt7389] = local62.anInt5612;
						this.aClass183Array1[this.anInt7389++] = local62;
					}
				}
				Static363.method4395(this.anInt7389 - 1, this.aClass183Array1, 0, local53);
			}
			this.aBoolean517 = true;
		}
		@Pc(115) boolean local115 = false;
		if (this.aBoolean517) {
			this.aBoolean517 = false;
			for (@Pc(126) int local126 = this.anInt7389 - 1; local126 >= 0; local126--) {
				@Pc(137) boolean local137 = this.aClass183Array1[local126].method4561(arg0, this.aClass183_1);
				local115 |= local137;
				this.aBoolean517 |= !local137;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBILclient!r;IIIIII)V")
	public void method5769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg5 & 0x3FFF;
		if (this.anInt7380 == -1 || this.anInt7382 == 0) {
			arg2.J(arg8, arg3, arg7, arg6, arg0, 0);
		} else {
			@Pc(35) Class172 local35 = Static532.anInterface4_12.method7229(this.anInt7380);
			if (this.aClass73_37 == null && Static532.anInterface4_12.method7227(this.anInt7380)) {
				@Pc(71) int[] local71 = local35.aBoolean351 ? Static532.anInterface4_12.method7228(0.7F, this.anInt7380, this.anInt7382, this.anInt7382) : Static532.anInterface4_12.method7226(this.anInt7382, this.anInt7380, false, this.anInt7382, 0.7F);
				this.aClass73_37 = arg2.method8033(local71, this.anInt7382, this.anInt7382, this.anInt7382);
			}
			if (local35.aBoolean351) {
				arg2.J(arg8, arg3, arg7, arg6, arg0, 0);
			}
			if (this.aClass73_37 != null) {
				@Pc(104) int local104 = local35.aBoolean351 ? 1 : 0;
				@Pc(110) int local110 = arg6 * arg1 / -4096;
				@Pc(123) int local123;
				for (local123 = local7 * arg6 / 4096 + (arg7 - arg6) / 2; local123 > arg6; local123 -= arg6) {
				}
				while (local123 < 0) {
					local123 += arg6;
				}
				while (local110 > arg6) {
					local110 -= arg6;
				}
				while (local110 < 0) {
					local110 += arg6;
				}
				for (@Pc(171) int local171 = local123 - arg6; local171 < arg7; local171 += arg6) {
					for (@Pc(178) int local178 = local110 - arg6; local178 < arg6; local178 += arg6) {
						this.aClass73_37.method7949(arg8 + local171, arg3 + local178, arg6, arg6, 1, 0, local104);
					}
				}
			}
		}
		for (@Pc(228) int local228 = this.anInt7389 - 1; local228 >= 0; local228--) {
			this.aClass183Array1[local228].method4565(arg2, arg8, arg3, arg7, arg6, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public void method5770() {
		if (this.aClass183Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass183Array2.length; local6++) {
				this.aClass183Array2[local6].method4562();
			}
		}
		this.aClass73_37 = null;
	}
}

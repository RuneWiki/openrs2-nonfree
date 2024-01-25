import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class191 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	private int anInt5519;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	private int anInt5529;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "Lclient!ha;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	private int anInt5520 = -1;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Z")
	private boolean aBoolean411 = true;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	private final int anInt5522;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	private final int anInt5525;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	private final int anInt5523;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "[Lclient!wt;")
	private final Class319[] aClass319Array2;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
	private final int anInt5527;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!wt;")
	private final Class319 aClass319_1;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "[Lclient!wt;")
	private final Class319[] aClass319Array1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I[Lclient!wt;IIII)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) Class319[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5522 = arg0;
		this.anInt5525 = arg4;
		this.anInt5523 = arg3;
		this.aClass319Array2 = arg1;
		this.anInt5527 = arg5;
		if (arg1 == null) {
			this.aClass319_1 = null;
			this.aClass319Array1 = null;
		} else {
			this.aClass319Array1 = new Class319[arg1.length];
			this.aClass319_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLclient!qa;)Z")
	public boolean method4741(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		if (arg0 != this.anInt5520) {
			this.anInt5520 = arg0;
			@Pc(16) int local16 = Static266.method4292(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt5519 != local16) {
				this.anInt5519 = local16;
				this.aClass35_25 = null;
			}
			if (this.aClass319Array2 != null) {
				this.anInt5529 = 0;
				@Pc(50) int[] local50 = new int[this.aClass319Array2.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass319Array2.length; local52++) {
					@Pc(59) Class319 local59 = this.aClass319Array2[local52];
					if (local59.method7794(this.anInt5523, this.anInt5525, this.anInt5527, this.anInt5520)) {
						local50[this.anInt5529] = local59.anInt9366;
						this.aClass319Array1[this.anInt5529++] = local59;
					}
				}
				Static378.method5946(this.aClass319Array1, 0, local50, this.anInt5529 - 1);
			}
			this.aBoolean411 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean411) {
			this.aBoolean411 = false;
			for (@Pc(124) int local124 = this.anInt5529 - 1; local124 >= 0; local124--) {
				@Pc(135) boolean local135 = this.aClass319Array1[local124].method7787(arg1, this.aClass319_1);
				this.aBoolean411 |= !local135;
				local113 |= local135;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIILclient!qa;III)V")
	public void method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg3 + arg8 & 0x3FFF;
		if (this.anInt5522 == -1) {
			arg5.f(arg7, arg4, arg1, arg0, arg2, 0);
		} else {
			@Pc(22) Class204 local22 = Static436.anInterface12_16.method2573(this.anInt5522);
			if (this.aClass35_25 == null && Static436.anInterface12_16.method2572(this.anInt5522)) {
				@Pc(58) int[] local58 = local22.aBoolean453 ? Static436.anInterface12_16.method2574(0.7F, this.anInt5519, this.anInt5522, this.anInt5519) : Static436.anInterface12_16.method2571(this.anInt5519, this.anInt5519, 0.7F, this.anInt5522, false);
				this.aClass35_25 = arg5.method6049(local58, this.anInt5519, this.anInt5519, this.anInt5519);
			}
			if (local22.aBoolean453) {
				arg5.f(arg7, arg4, arg1, arg0, arg2, 0);
			}
			if (this.aClass35_25 != null) {
				@Pc(91) int local91 = local22.aBoolean453 ? 1 : 0;
				@Pc(97) int local97 = arg0 * arg6 / -4096;
				@Pc(110) int local110;
				for (local110 = local7 * arg0 / 4096 + (arg1 - arg0) / 2; local110 > arg0; local110 -= arg0) {
				}
				while (local110 < 0) {
					local110 += arg0;
				}
				while (local97 > arg0) {
					local97 -= arg0;
				}
				while (local97 < 0) {
					local97 += arg0;
				}
				for (@Pc(156) int local156 = local110 - arg0; local156 < arg1; local156 += arg0) {
					for (@Pc(162) int local162 = local97 - arg0; local162 < arg0; local162 += arg0) {
						this.aClass35_25.ra(arg7 + local156, arg4 + local162, arg0, arg0, 1, 0, local91);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt5529 - 1; local215 >= 0; local215--) {
			this.aClass319Array1[local215].method7795(arg5, arg7, arg4, arg1, arg0, arg6, local7);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method4745() {
		if (this.aClass319Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass319Array2.length; local6++) {
				this.aClass319Array2[local6].method7791();
			}
		}
		this.aClass35_25 = null;
	}
}

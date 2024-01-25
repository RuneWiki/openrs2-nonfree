import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class186 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!ha;")
	private Class84 aClass84_13;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	private int anInt5455;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	private int anInt5456;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	private int anInt5458 = -1;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Z")
	private boolean aBoolean416 = true;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	private final int anInt5463;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[Lclient!al;")
	private final Class15[] aClass15Array2;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	private final int anInt5457;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private final int anInt5461;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	private final int anInt5460;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "[Lclient!al;")
	private final Class15[] aClass15Array1;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!al;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I[Lclient!al;IIII)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) Class15[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5463 = arg4;
		this.aClass15Array2 = arg1;
		this.anInt5457 = arg0;
		this.anInt5461 = arg5;
		this.anInt5460 = arg3;
		if (arg1 == null) {
			this.aClass15Array1 = null;
			this.aClass15_1 = null;
		} else {
			this.aClass15Array1 = new Class15[arg1.length];
			this.aClass15_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!qa;)Z")
	public boolean method4604(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1) {
		if (this.anInt5458 != arg0) {
			this.anInt5458 = arg0;
			@Pc(20) int local20 = Static472.method7121(arg0);
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 <= 0) {
				local20 = 1;
			}
			if (this.anInt5455 != local20) {
				this.aClass84_13 = null;
				this.anInt5455 = local20;
			}
			if (this.aClass15Array2 != null) {
				this.anInt5456 = 0;
				@Pc(57) int[] local57 = new int[this.aClass15Array2.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass15Array2.length; local59++) {
					@Pc(66) Class15 local66 = this.aClass15Array2[local59];
					if (local66.method365(this.anInt5460, this.anInt5463, this.anInt5461, this.anInt5458)) {
						local57[this.anInt5456] = local66.anInt245;
						this.aClass15Array1[this.anInt5456++] = local66;
					}
				}
				Static519.method7727(this.aClass15Array1, local57, 0, this.anInt5456 - 1);
			}
			this.aBoolean416 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean416) {
			this.aBoolean416 = false;
			for (@Pc(135) int local135 = this.anInt5456 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass15Array1[local135].method361(arg1, this.aClass15_1);
				this.aBoolean416 |= !local146;
				local124 |= local146;
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method4605() {
		if (this.aClass15Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass15Array2.length; local6++) {
				this.aClass15Array2[local6].method364();
			}
		}
		this.aClass84_13 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILclient!qa;I)V")
	public void method4607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class42 arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg8 + arg3 & 0x3FFF;
		if (this.anInt5457 == -1) {
			arg7.f(arg0, arg4, arg5, arg2, arg6, 0);
		} else {
			@Pc(26) Class278 local26 = Static530.anInterface11_14.method6215(this.anInt5457);
			if (this.aClass84_13 == null && Static530.anInterface11_14.method6213(this.anInt5457)) {
				@Pc(62) int[] local62 = local26.aBoolean569 ? Static530.anInterface11_14.method6210(0.7F, this.anInt5455, this.anInt5457, this.anInt5455) : Static530.anInterface11_14.method6211(false, this.anInt5457, this.anInt5455, this.anInt5455, 0.7F);
				this.aClass84_13 = arg7.method5862(local62, this.anInt5455, this.anInt5455, this.anInt5455);
			}
			if (local26.aBoolean569) {
				arg7.f(arg0, arg4, arg5, arg2, arg6, 0);
			}
			if (this.aClass84_13 != null) {
				@Pc(95) int local95 = local26.aBoolean569 ? 1 : 0;
				@Pc(101) int local101 = arg2 * arg1 / -4096;
				@Pc(115) int local115;
				for (local115 = (arg5 - arg2) / 2 + local15 * arg2 / 4096; local115 > arg2; local115 -= arg2) {
				}
				while (local115 < 0) {
					local115 += arg2;
				}
				while (local101 > arg2) {
					local101 -= arg2;
				}
				while (local101 < 0) {
					local101 += arg2;
				}
				for (@Pc(161) int local161 = local115 - arg2; local161 < arg5; local161 += arg2) {
					for (@Pc(168) int local168 = local101 - arg2; local168 < arg2; local168 += arg2) {
						this.aClass84_13.ra(arg0 + local161, local168 - -arg4, arg2, arg2, 1, 0, local95);
					}
				}
			}
		}
		for (@Pc(222) int local222 = this.anInt5456 - 1; local222 >= 0; local222--) {
			this.aClass15Array1[local222].method366(arg7, arg0, arg4, arg5, arg2, arg1, local15);
		}
	}
}

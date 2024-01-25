import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class147 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	private int anInt5445;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Lclient!ac;")
	private Class5 aClass5_28;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	private int anInt5454;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	private int anInt5449 = -1;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
	private boolean aBoolean479 = true;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	private final int anInt5450;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "[Lclient!laa;")
	private final Class193[] aClass193Array2;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	private final int anInt5452;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	private final int anInt5447;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	private final int anInt5448;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "[Lclient!laa;")
	private final Class193[] aClass193Array1;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!laa;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(I[Lclient!laa;IIII)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) Class193[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5450 = arg4;
		this.aClass193Array2 = arg1;
		this.anInt5452 = arg3;
		this.anInt5447 = arg5;
		this.anInt5448 = arg0;
		if (arg1 == null) {
			this.aClass193_1 = null;
			this.aClass193Array1 = null;
		} else {
			this.aClass193Array1 = new Class193[arg1.length];
			this.aClass193_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIIILclient!ha;II)V")
	public void method4612(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class33 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg1 + arg0 & 0x3FFF;
		if (this.anInt5448 == -1 || this.anInt5445 == 0) {
			arg6.aa(arg3, arg7, arg4, arg2, arg8, 0);
		} else {
			@Pc(24) Class156 local24 = Static283.anInterface5_9.method6869(this.anInt5448);
			if (this.aClass5_28 == null && Static283.anInterface5_9.method6867(this.anInt5448)) {
				@Pc(63) int[] local63 = local24.anInt5679 == 2 ? Static283.anInterface5_9.method6870(this.anInt5448, 0.7F, this.anInt5445, this.anInt5445) : Static283.anInterface5_9.method6868(false, 0.7F, this.anInt5445, this.anInt5448, this.anInt5445);
				this.aClass5_28 = arg6.method6204(this.anInt5445, this.anInt5445, local63, this.anInt5445);
			}
			if (local24.anInt5679 == 2) {
				arg6.aa(arg3, arg7, arg4, arg2, arg8, 0);
			}
			if (this.aClass5_28 != null) {
				@Pc(103) int local103 = local24.anInt5679 == 2 ? 1 : 0;
				@Pc(109) int local109 = arg2 * arg5 / -4096;
				@Pc(123) int local123;
				for (local123 = (arg4 - arg2) / 2 + local11 * arg2 / 4096; local123 > arg2; local123 -= arg2) {
				}
				while (local109 > arg2) {
					local109 -= arg2;
				}
				while (local123 < 0) {
					local123 += arg2;
				}
				while (local109 < 0) {
					local109 += arg2;
				}
				for (@Pc(172) int local172 = local123 - arg2; local172 < arg4; local172 += arg2) {
					for (@Pc(179) int local179 = local109 - arg2; local179 < arg2; local179 += arg2) {
						this.aClass5_28.method7596(local172 + arg3, arg7 + local179, arg2, arg2, 1, 0, local103);
					}
				}
			}
		}
		for (@Pc(231) int local231 = this.anInt5454 - 1; local231 >= 0; local231--) {
			this.aClass193Array1[local231].method5210(arg6, arg3, arg7, arg4, arg2, arg5, local11);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
	public void method4613() {
		if (this.aClass193Array2 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass193Array2.length; local18++) {
				this.aClass193Array2[local18].method5207();
			}
		}
		this.aClass5_28 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ha;IB)Z")
	public boolean method4615(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anInt5449) {
			this.anInt5449 = arg1;
			@Pc(16) int local16 = Static51.method1165(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt5445) {
				this.aClass5_28 = null;
				this.anInt5445 = local16;
			}
			if (this.aClass193Array2 != null) {
				this.anInt5454 = 0;
				@Pc(53) int[] local53 = new int[this.aClass193Array2.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass193Array2.length; local55++) {
					@Pc(62) Class193 local62 = this.aClass193Array2[local55];
					if (local62.method5205(this.anInt5452, this.anInt5450, this.anInt5447, this.anInt5449)) {
						local53[this.anInt5454] = local62.anInt6144;
						this.aClass193Array1[this.anInt5454++] = local62;
					}
				}
				Static409.method5113(this.anInt5454 - 1, 0, this.aClass193Array1, local53);
			}
			this.aBoolean479 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean479) {
			this.aBoolean479 = false;
			for (@Pc(130) int local130 = this.anInt5454 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass193Array1[local130].method5203(arg0, this.aClass193_1);
				this.aBoolean479 |= !local141;
				local119 |= local141;
			}
		}
		return local119;
	}
}

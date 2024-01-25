import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class148 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!dm;")
	public Class50 aClass50_2;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "[I")
	private final int[] anIntArray342 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!tl;)V")
	public void method3204(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method3207(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Lclient!ro;")
	public Class208 method3205() {
		@Pc(8) Class208[] local8 = new Class208[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class166 local14 = this.aClass50_2.aClass166_62;
		@Pc(25) int local25;
		synchronized (this.aClass50_2.aClass166_62) {
			local25 = 0;
			while (true) {
				if (local25 >= 5) {
					break;
				}
				if (this.anIntArray342[local25] != -1) {
					local8[local10++] = Static219.method3103(this.anIntArray342[local25], this.aClass50_2.aClass166_62);
				}
				local25++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < 5; local62++) {
			if (local8[local62] != null && local8[local62].anInt6202 < 13) {
				local8[local62].method4813();
			}
		}
		@Pc(92) Class208 local92 = new Class208(local8, local10);
		if (this.aShortArray64 != null) {
			for (local25 = 0; local25 < this.aShortArray64.length; local25++) {
				local92.method4808(this.aShortArray64[local25], this.aShortArray62[local25]);
			}
		}
		if (this.aShortArray63 != null) {
			for (local25 = 0; local25 < this.aShortArray63.length; local25++) {
				local92.method4812(this.aShortArray61[local25], this.aShortArray63[local25]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Lclient!ro;")
	public Class208 method3206() {
		if (this.anIntArray343 == null) {
			return null;
		}
		@Pc(15) Class208[] local15 = new Class208[this.anIntArray343.length];
		@Pc(19) Class166 local19 = this.aClass50_2.aClass166_62;
		@Pc(23) int local23;
		synchronized (this.aClass50_2.aClass166_62) {
			local23 = 0;
			while (true) {
				if (this.anIntArray343.length <= local23) {
					break;
				}
				local15[local23] = Static219.method3103(this.anIntArray343[local23], this.aClass50_2.aClass166_62);
				local23++;
			}
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray343.length; local52++) {
			if (local15[local52].anInt6202 < 13) {
				local15[local52].method4813();
			}
		}
		@Pc(85) Class208 local85;
		if (local15.length == 1) {
			local85 = local15[0];
		} else {
			local85 = new Class208(local15, local15.length);
		}
		if (local85 == null) {
			return null;
		}
		if (this.aShortArray64 != null) {
			for (local23 = 0; local23 < this.aShortArray64.length; local23++) {
				local85.method4808(this.aShortArray64[local23], this.aShortArray62[local23]);
			}
		}
		if (this.aShortArray63 != null) {
			for (local23 = 0; local23 < this.aShortArray63.length; local23++) {
				local85.method4812(this.aShortArray61[local23], this.aShortArray63[local23]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!tl;)V")
	private void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			arg1.method4864();
			return;
		}
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (arg0 == 2) {
			local40 = arg1.method4864();
			this.anIntArray343 = new int[local40];
			for (local50 = 0; local50 < local40; local50++) {
				this.anIntArray343[local50] = arg1.method4877();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local40 = arg1.method4864();
				this.aShortArray62 = new short[local40];
				this.aShortArray64 = new short[local40];
				for (local50 = 0; local50 < local40; local50++) {
					this.aShortArray64[local50] = (short) arg1.method4877();
					this.aShortArray62[local50] = (short) arg1.method4877();
				}
			} else if (arg0 == 41) {
				local40 = arg1.method4864();
				this.aShortArray61 = new short[local40];
				this.aShortArray63 = new short[local40];
				for (local50 = 0; local50 < local40; local50++) {
					this.aShortArray63[local50] = (short) arg1.method4877();
					this.aShortArray61[local50] = (short) arg1.method4877();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray342[arg0 - 60] = arg1.method4877();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z")
	public boolean method3208() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class166 local16 = this.aClass50_2.aClass166_62;
		synchronized (this.aClass50_2.aClass166_62) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray342[local20] != -1 && !this.aClass50_2.aClass166_62.method3693(this.anIntArray342[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z")
	public boolean method3210() {
		if (this.anIntArray343 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class166 local21 = this.aClass50_2.aClass166_62;
		synchronized (this.aClass50_2.aClass166_62) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray343.length; local25++) {
				if (!this.aClass50_2.aClass166_62.method3693(this.anIntArray343[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}
}

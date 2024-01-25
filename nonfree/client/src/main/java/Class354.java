import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class354 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!vn;")
	public Class352 aClass352_3;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "[S")
	private short[] aShortArray288;

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "[S")
	private short[] aShortArray289;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "[I")
	private int[] anIntArray672;

	@OriginalMember(owner = "client!vp", name = "r", descriptor = "[S")
	private short[] aShortArray290;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "[S")
	private short[] aShortArray291;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "[I")
	private final int[] anIntArray671 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Lclient!nda;")
	public Class226 method7561() {
		@Pc(8) Class226[] local8 = new Class226[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class246 local14 = this.aClass352_3.aClass246_262;
		@Pc(18) int local18;
		synchronized (this.aClass352_3.aClass246_262) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray671[local18] != -1) {
					local8[local10++] = Static519.method6916(this.anIntArray671[local18], this.aClass352_3.aClass246_262);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt6103 < 13) {
				local8[local53].method5296();
			}
		}
		@Pc(85) Class226 local85 = new Class226(local8, local10);
		if (this.aShortArray291 != null) {
			for (local18 = 0; local18 < this.aShortArray291.length; local18++) {
				local85.method5295(this.aShortArray291[local18], this.aShortArray289[local18]);
			}
		}
		if (this.aShortArray290 != null) {
			for (local18 = 0; local18 < this.aShortArray290.length; local18++) {
				local85.method5283(this.aShortArray288[local18], this.aShortArray290[local18]);
			}
		}
		return local85;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method7562(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3118();
			if (local13 == 0) {
				return;
			}
			this.method7565(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
	public boolean method7563() {
		if (this.anIntArray672 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(21) Class246 local21 = this.aClass352_3.aClass246_262;
		synchronized (this.aClass352_3.aClass246_262) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray672.length; local25++) {
				if (!this.aClass352_3.aClass246_262.method5654(this.anIntArray672[local25], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
	public boolean method7564() {
		@Pc(13) boolean local13 = true;
		@Pc(17) Class246 local17 = this.aClass352_3.aClass246_262;
		synchronized (this.aClass352_3.aClass246_262) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray671[local21] != -1 && !this.aClass352_3.aClass246_262.method5654(this.anIntArray671[local21], 0)) {
					local13 = false;
				}
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!qh;IB)V")
	private void method7565(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method3118();
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (arg1 == 2) {
			local43 = arg0.method3118();
			this.anIntArray672 = new int[local43];
			for (local53 = 0; local53 < local43; local53++) {
				this.anIntArray672[local53] = arg0.method3109();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local43 = arg0.method3118();
				this.aShortArray289 = new short[local43];
				this.aShortArray291 = new short[local43];
				for (local53 = 0; local53 < local43; local53++) {
					this.aShortArray291[local53] = (short) arg0.method3109();
					this.aShortArray289[local53] = (short) arg0.method3109();
				}
			} else if (arg1 == 41) {
				local43 = arg0.method3118();
				this.aShortArray288 = new short[local43];
				this.aShortArray290 = new short[local43];
				for (local53 = 0; local53 < local43; local53++) {
					this.aShortArray290[local53] = (short) arg0.method3109();
					this.aShortArray288[local53] = (short) arg0.method3109();
				}
				return;
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray671[arg1 - 60] = arg0.method3109();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Lclient!nda;")
	public Class226 method7566() {
		if (this.anIntArray672 == null) {
			return null;
		}
		@Pc(21) Class226[] local21 = new Class226[this.anIntArray672.length];
		@Pc(25) Class246 local25 = this.aClass352_3.aClass246_262;
		@Pc(29) int local29;
		synchronized (this.aClass352_3.aClass246_262) {
			local29 = 0;
			while (true) {
				if (this.anIntArray672.length <= local29) {
					break;
				}
				local21[local29] = Static519.method6916(this.anIntArray672[local29], this.aClass352_3.aClass246_262);
				local29++;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < this.anIntArray672.length; local64++) {
			if (local21[local64].anInt6103 < 13) {
				local21[local64].method5296();
			}
		}
		@Pc(99) Class226 local99;
		if (local21.length == 1) {
			local99 = local21[0];
		} else {
			local99 = new Class226(local21, local21.length);
		}
		if (local99 == null) {
			return null;
		}
		if (this.aShortArray291 != null) {
			for (local29 = 0; local29 < this.aShortArray291.length; local29++) {
				local99.method5295(this.aShortArray291[local29], this.aShortArray289[local29]);
			}
		}
		if (this.aShortArray290 != null) {
			for (local29 = 0; local29 < this.aShortArray290.length; local29++) {
				local99.method5283(this.aShortArray288[local29], this.aShortArray290[local29]);
			}
		}
		return local99;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class156 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!nk;")
	public Class211 aClass211_1;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
	private final int[] anIntArray298 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lclient!ld;")
	public Class184 method3768() {
		if (this.anIntArray297 == null) {
			return null;
		}
		@Pc(20) Class184[] local20 = new Class184[this.anIntArray297.length];
		@Pc(24) Class117 local24 = this.aClass211_1.aClass117_146;
		@Pc(28) int local28;
		synchronized (this.aClass211_1.aClass117_146) {
			local28 = 0;
			while (true) {
				if (this.anIntArray297.length <= local28) {
					break;
				}
				local20[local28] = Static287.method4830(this.anIntArray297[local28], this.aClass211_1.aClass117_146);
				local28++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray297.length; local61++) {
			if (local20[local61].anInt5413 < 13) {
				local20[local61].method4518();
			}
		}
		@Pc(96) Class184 local96;
		if (local20.length == 1) {
			local96 = local20[0];
		} else {
			local96 = new Class184(local20, local20.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray41 != null) {
			for (local28 = 0; local28 < this.aShortArray41.length; local28++) {
				local96.method4524(this.aShortArray42[local28], this.aShortArray41[local28]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local28 = 0; local28 < this.aShortArray39.length; local28++) {
				local96.method4517(this.aShortArray39[local28], this.aShortArray40[local28]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Z")
	public boolean method3769() {
		if (this.anIntArray297 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(24) Class117 local24 = this.aClass211_1.aClass117_146;
		synchronized (this.aClass211_1.aClass117_146) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray297.length; local28++) {
				if (!this.aClass211_1.aClass117_146.method2974(0, this.anIntArray297[local28])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!co;B)V")
	public void method3771(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4220();
			if (local17 == 0) {
				return;
			}
			this.method3777(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lclient!ld;")
	public Class184 method3774() {
		@Pc(8) Class184[] local8 = new Class184[5];
		@Pc(10) int local10 = 0;
		@Pc(19) Class117 local19 = this.aClass211_1.aClass117_146;
		@Pc(23) int local23;
		synchronized (this.aClass211_1.aClass117_146) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray298[local23] != -1) {
					local8[local10++] = Static287.method4830(this.anIntArray298[local23], this.aClass211_1.aClass117_146);
				}
				local23++;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < 5; local58++) {
			if (local8[local58] != null && local8[local58].anInt5413 < 13) {
				local8[local58].method4518();
			}
		}
		@Pc(90) Class184 local90 = new Class184(local8, local10);
		if (this.aShortArray41 != null) {
			for (local23 = 0; local23 < this.aShortArray41.length; local23++) {
				local90.method4524(this.aShortArray42[local23], this.aShortArray41[local23]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local23 = 0; local23 < this.aShortArray39.length; local23++) {
				local90.method4517(this.aShortArray39[local23], this.aShortArray40[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
	public boolean method3775() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class117 local11 = this.aClass211_1.aClass117_146;
		synchronized (this.aClass211_1.aClass117_146) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray298[local15] != -1 && !this.aClass211_1.aClass117_146.method2974(0, this.anIntArray298[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!co;BI)V")
	private void method3777(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4220();
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (arg1 == 2) {
			local52 = arg0.method4220();
			this.anIntArray297 = new int[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.anIntArray297[local62] = arg0.method4227();
			}
		} else if (arg1 != 3) {
			if (arg1 != 40) {
				if (arg1 == 41) {
					local52 = arg0.method4220();
					this.aShortArray39 = new short[local52];
					this.aShortArray40 = new short[local52];
					for (local62 = 0; local62 < local52; local62++) {
						this.aShortArray39[local62] = (short) arg0.method4227();
						this.aShortArray40[local62] = (short) arg0.method4227();
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray298[arg1 - 60] = arg0.method4227();
					return;
				}
				return;
			}
			local52 = arg0.method4220();
			this.aShortArray42 = new short[local52];
			this.aShortArray41 = new short[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.aShortArray41[local62] = (short) arg0.method4227();
				this.aShortArray42[local62] = (short) arg0.method4227();
			}
			return;
		}
	}
}

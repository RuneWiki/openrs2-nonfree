import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
	public int anInt1422;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public int anInt1423;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
	public int anInt1429;

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
	public int anInt1430;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
	public int anInt1438;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Z")
	public boolean aBoolean51 = true;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	public int anInt1427 = -1;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
	public int anInt1432 = -1;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
	public int anInt1434 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!be;III)V")
	private void method1068(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1434 = arg0.method940();
		} else if (arg2 == 2) {
			this.anInt1427 = arg0.method933();
		} else if (arg2 == 5) {
			this.aBoolean51 = false;
		} else if (arg2 == 7) {
			this.anInt1432 = arg0.method940();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	public void method1069() {
		if (this.anInt1432 != -1) {
			this.method1070(this.anInt1432);
			this.anInt1422 = this.anInt1433;
			this.anInt1430 = this.anInt1423;
			this.anInt1429 = this.anInt1438;
		}
		this.method1070(this.anInt1434);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	private void method1070(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local23;
		if (local23 > local14) {
			local25 = local14;
		}
		@Pc(33) double local33 = local23;
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 < local14) {
			local33 = local14;
		}
		if (local33 < local40) {
			local33 = local40;
		}
		@Pc(54) double local54 = 0.0D;
		if (local25 > local40) {
			local25 = local40;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local33 + local25) / 2.0D;
		if (local25 != local33) {
			if (local68 < 0.5D) {
				local54 = (local33 - local25) / (local33 + local25);
			}
			if (local33 == local23) {
				local62 = (local14 - local40) / (-local25 + local33);
			} else if (local14 == local33) {
				local62 = (local40 - local23) / (local33 - local25) + 2.0D;
			} else if (local33 == local40) {
				local62 = (local23 - local14) / (-local25 + local33) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local54 = (local33 - local25) / (2.0D - local33 - local25);
			}
		}
		this.anInt1433 = (int) (local54 * 256.0D);
		local62 /= 6.0D;
		if (this.anInt1433 < 0) {
			this.anInt1433 = 0;
		} else if (this.anInt1433 > 255) {
			this.anInt1433 = 255;
		}
		this.anInt1423 = (int) (local62 * 256.0D);
		this.anInt1438 = (int) (local68 * 256.0D);
		if (this.anInt1438 < 0) {
			this.anInt1438 = 0;
		} else if (this.anInt1438 > 255) {
			this.anInt1438 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!be;ZI)V")
	public void method1072(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method933();
			if (local18 == 0) {
				return;
			}
			this.method1068(arg0, arg1, local18);
		}
	}
}

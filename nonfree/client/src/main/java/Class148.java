import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class148 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Lclient!ed;")
	public Class69 aClass69_1;

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	private final int[] anIntArray433 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	public boolean method4045() {
		if (this.anIntArray434 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		@Pc(24) Class161 local24 = this.aClass69_1.aClass161_24;
		synchronized (this.aClass69_1.aClass161_24) {
			for (@Pc(28) int local28 = 0; local28 < this.anIntArray434.length; local28++) {
				if (!this.aClass69_1.aClass161_24.method4241(this.anIntArray434[local28], 0)) {
					local20 = false;
				}
			}
			return local20;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Lclient!or;")
	public Class222 method4046() {
		@Pc(8) Class222[] local8 = new Class222[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class161 local14 = this.aClass69_1.aClass161_24;
		@Pc(18) int local18;
		synchronized (this.aClass69_1.aClass161_24) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray433[local18] != -1) {
					local8[local10++] = Static264.method4649(this.anIntArray433[local18], this.aClass69_1.aClass161_24);
				}
				local18++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local8[local54] != null && local8[local54].anInt6710 < 13) {
				local8[local54].method5605();
			}
		}
		@Pc(84) Class222 local84 = new Class222(local8, local10);
		if (this.aShortArray92 != null) {
			for (local18 = 0; local18 < this.aShortArray92.length; local18++) {
				local84.method5608(this.aShortArray92[local18], this.aShortArray91[local18]);
			}
		}
		if (this.aShortArray90 != null) {
			for (local18 = 0; local18 < this.aShortArray90.length; local18++) {
				local84.method5601(this.aShortArray93[local18], this.aShortArray90[local18]);
			}
		}
		return local84;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)Z")
	public boolean method4047() {
		@Pc(14) boolean local14 = true;
		@Pc(18) Class161 local18 = this.aClass69_1.aClass161_24;
		synchronized (this.aClass69_1.aClass161_24) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray433[local22] != -1 && !this.aClass69_1.aClass161_24.method4241(this.anIntArray433[local22], 0)) {
					local14 = false;
				}
			}
			return local14;
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Lclient!or;")
	public Class222 method4048() {
		if (this.anIntArray434 == null) {
			return null;
		}
		@Pc(15) Class222[] local15 = new Class222[this.anIntArray434.length];
		@Pc(24) Class161 local24 = this.aClass69_1.aClass161_24;
		@Pc(28) int local28;
		synchronized (this.aClass69_1.aClass161_24) {
			local28 = 0;
			while (true) {
				if (this.anIntArray434.length <= local28) {
					break;
				}
				local15[local28] = Static264.method4649(this.anIntArray434[local28], this.aClass69_1.aClass161_24);
				local28++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray434.length; local61++) {
			if (local15[local61].anInt6710 < 13) {
				local15[local61].method5605();
			}
		}
		@Pc(96) Class222 local96;
		if (local15.length == 1) {
			local96 = local15[0];
		} else {
			local96 = new Class222(local15, local15.length);
		}
		if (local96 == null) {
			return null;
		}
		if (this.aShortArray92 != null) {
			for (local28 = 0; local28 < this.aShortArray92.length; local28++) {
				local96.method5608(this.aShortArray92[local28], this.aShortArray91[local28]);
			}
		}
		if (this.aShortArray90 != null) {
			for (local28 = 0; local28 < this.aShortArray90.length; local28++) {
				local96.method5601(this.aShortArray93[local28], this.aShortArray90[local28]);
			}
		}
		return local96;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!rt;)V")
	public void method4049(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7548();
			if (local9 == 0) {
				return;
			}
			this.method4050(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!rt;BI)V")
	private void method4050(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method7548();
			return;
		}
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (arg1 == 2) {
			local24 = arg0.method7548();
			this.anIntArray434 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray434[local30] = arg0.method7591();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local24 = arg0.method7548();
				this.aShortArray92 = new short[local24];
				this.aShortArray91 = new short[local24];
				for (local30 = 0; local30 < local24; local30++) {
					this.aShortArray92[local30] = (short) arg0.method7591();
					this.aShortArray91[local30] = (short) arg0.method7591();
				}
			} else if (arg1 == 41) {
				local24 = arg0.method7548();
				this.aShortArray93 = new short[local24];
				this.aShortArray90 = new short[local24];
				for (local30 = 0; local30 < local24; local30++) {
					this.aShortArray90[local30] = (short) arg0.method7591();
					this.aShortArray93[local30] = (short) arg0.method7591();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray433[arg1 - 60] = arg0.method7591();
			}
		}
	}
}

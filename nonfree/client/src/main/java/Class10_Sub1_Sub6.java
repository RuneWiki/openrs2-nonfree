import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class10_Sub1_Sub6 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!ge", name = "hb", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!ge", name = "ib", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
	public int anInt972 = 5;

	@OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
	public int anInt977 = 99;

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
	public int anInt980 = 2;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public int anInt968 = -1;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
	public int anInt967 = -1;

	@OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
	public int anInt976 = -1;

	@OriginalMember(owner = "client!ge", name = "sb", descriptor = "I")
	public int anInt981 = -1;

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	public int anInt974 = -1;

	@OriginalMember(owner = "client!ge", name = "Db", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rb;I)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method579(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub5_Sub4 arg1) {
		@Pc(20) int local20 = this.anIntArray106[arg0];
		@Pc(26) Class10_Sub1_Sub7 local26 = Static47.method741(local20 >> 16);
		@Pc(30) int local30 = local20 & 0xFFFF;
		if (local26 == null) {
			return arg1.method1337(true);
		} else {
			@Pc(47) Class10_Sub1_Sub5_Sub4 local47 = arg1.method1337(!local26.method631(local30));
			local47.method1334(local26, local30);
			return local47;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!rb;II)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method581(@OriginalArg(1) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = this.anIntArray106[arg2];
		@Pc(17) Class10_Sub1_Sub7 local17 = Static47.method741(local11 >> 16);
		@Pc(21) int local21 = local11 & 0xFFFF;
		if (local17 == null) {
			return arg0.method1337(true);
		}
		@Pc(42) Class10_Sub1_Sub5_Sub4 local42 = arg0.method1337(!local17.method631(local21));
		@Pc(46) int local46 = arg1 & 0x3;
		if (local46 == 1) {
			local42.method1311();
		} else if (local46 == 2) {
			local42.method1321();
		} else if (local46 == 3) {
			local42.method1312();
		}
		local42.method1334(local17, local21);
		if (local46 == 1) {
			local42.method1312();
		} else if (local46 == 2) {
			local42.method1321();
		} else if (local46 == 3) {
			local42.method1311();
		}
		return local42;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!tc;)V")
	private void method582(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub10 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(35) int local35;
		if (arg0 == 1) {
			local10 = arg1.method1111();
			this.anIntArray109 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray109[local16] = arg1.method1160();
			}
			this.anIntArray106 = new int[local10];
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray106[local35] = arg1.method1160();
			}
			for (@Pc(54) int local54 = 0; local54 < local10; local54++) {
				this.anIntArray106[local54] += arg1.method1160() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt976 = arg1.method1160();
		} else if (arg0 == 3) {
			local10 = arg1.method1111();
			this.anIntArray105 = new int[local10 + 1];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray105[local16] = arg1.method1111();
			}
			this.anIntArray105[local10] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean46 = true;
		} else if (arg0 == 5) {
			this.anInt972 = arg1.method1111();
		} else if (arg0 == 6) {
			this.anInt967 = arg1.method1160();
		} else if (arg0 == 7) {
			this.anInt981 = arg1.method1160();
		} else if (arg0 == 8) {
			this.anInt977 = arg1.method1111();
		} else if (arg0 == 9) {
			this.anInt968 = arg1.method1111();
		} else if (arg0 == 10) {
			this.anInt974 = arg1.method1111();
		} else if (arg0 == 11) {
			this.anInt980 = arg1.method1111();
		} else if (arg0 == 12) {
			local10 = arg1.method1111();
			this.anIntArray107 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray107[local16] = arg1.method1160();
			}
			for (local35 = 0; local35 < local10; local35++) {
				this.anIntArray107[local35] = (arg1.method1160() << 16) + this.anIntArray107[local35];
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!rb;IILclient!ge;)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method583(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub5_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class10_Sub1_Sub6 arg3) {
		@Pc(4) int local4 = this.anIntArray106[arg0];
		@Pc(14) Class10_Sub1_Sub7 local14 = Static47.method741(local4 >> 1506013200);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg3.method579(arg2, arg1);
		}
		@Pc(33) int local33 = arg3.anIntArray106[arg2];
		@Pc(39) Class10_Sub1_Sub7 local39 = Static47.method741(local33 >> 16);
		@Pc(43) int local43 = local33 & 0xFFFF;
		@Pc(56) Class10_Sub1_Sub5_Sub4 local56;
		if (local39 == null) {
			local56 = arg1.method1337(!local14.method631(local18));
			local56.method1334(local14, local18);
			return local56;
		} else {
			local56 = arg1.method1337(!local14.method631(local18) & !local39.method631(local43));
			local56.method1329(local14, local18, local39, local43, this.anIntArray105);
			return local56;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!tc;I)V")
	public void method585(@OriginalArg(0) Class10_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1111();
			if (local5 == 0) {
				return;
			}
			this.method582(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rb;II)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method586(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray106[arg1];
		@Pc(14) Class10_Sub1_Sub7 local14 = Static47.method741(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1337(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(36) Class10_Sub1_Sub7 local36 = null;
		if (this.anIntArray107 != null && arg1 < this.anIntArray107.length) {
			local26 = this.anIntArray107[arg1];
			local36 = Static47.method741(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(75) Class10_Sub1_Sub5_Sub4 local75;
		if (local36 == null || local26 == 65535) {
			local75 = arg0.method1337(!local14.method631(local18));
			local75.method1334(local14, local18);
			return local75;
		} else {
			local75 = arg0.method1337(!local14.method631(local18) & !local36.method631(local26));
			local75.method1334(local14, local18);
			local75.method1334(local36, local26);
			return local75;
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public void method587() {
		if (this.anInt974 == -1) {
			if (this.anIntArray105 == null) {
				this.anInt974 = 0;
			} else {
				this.anInt974 = 2;
			}
		}
		if (this.anInt968 != -1) {
			return;
		}
		if (this.anIntArray105 == null) {
			this.anInt968 = 0;
		} else {
			this.anInt968 = 2;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!rb;BI)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method588(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray106[arg1];
		@Pc(14) Class10_Sub1_Sub7 local14 = Static47.method741(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1314(true);
		} else {
			@Pc(40) Class10_Sub1_Sub5_Sub4 local40 = arg0.method1314(!local14.method631(local23));
			local40.method1334(local14, local23);
			return local40;
		}
	}
}

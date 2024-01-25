import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class31 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public int anInt935 = -1;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	private final int[] anIntArray45 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLclient!bk;)V")
	private void method862(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt935 = arg1.method1832();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg0 == 2) {
			local26 = arg1.method1832();
			this.anIntArray44 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray44[local36] = arg1.method1845();
			}
		} else if (arg0 == 3) {
			this.aBoolean66 = true;
		} else if (arg0 == 40) {
			local26 = arg1.method1832();
			this.aShortArray4 = new short[local26];
			this.aShortArray1 = new short[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.aShortArray1[local36] = (short) arg1.method1845();
				this.aShortArray4[local36] = (short) arg1.method1845();
			}
		} else if (arg0 == 41) {
			local26 = arg1.method1832();
			this.aShortArray3 = new short[local26];
			this.aShortArray2 = new short[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.aShortArray2[local36] = (short) arg1.method1845();
				this.aShortArray3[local36] = (short) arg1.method1845();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray45[arg0 - 60] = arg1.method1845();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
	public boolean method864() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class170 local9 = Static196.aClass170_73;
		synchronized (Static196.aClass170_73) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray45[local13] != -1 && !Static196.aClass170_73.method4578(0, this.anIntArray45[local13])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Z")
	public boolean method865() {
		if (this.anIntArray44 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class170 local14 = Static196.aClass170_73;
		synchronized (Static196.aClass170_73) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray44.length; local18++) {
				if (!Static196.aClass170_73.method4578(0, this.anIntArray44[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Lclient!oq;")
	public Class150 method866() {
		@Pc(8) Class150[] local8 = new Class150[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class170 local12 = Static196.aClass170_73;
		synchronized (Static196.aClass170_73) {
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.anIntArray45[local25] != -1) {
					local8[local10++] = Static17.method5326(this.anIntArray45[local25], Static196.aClass170_73);
				}
			}
		}
		@Pc(63) Class150 local63 = new Class150(local8, local10);
		@Pc(68) int local68;
		if (this.aShortArray1 != null) {
			for (local68 = 0; local68 < this.aShortArray1.length; local68++) {
				local63.method3984(this.aShortArray4[local68], this.aShortArray1[local68]);
			}
		}
		if (this.aShortArray2 != null) {
			for (local68 = 0; local68 < this.aShortArray2.length; local68++) {
				local63.method3975(this.aShortArray2[local68], this.aShortArray3[local68]);
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!bk;)V")
	public void method867(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1832();
			if (local5 == 0) {
				return;
			}
			this.method862(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Lclient!oq;")
	public Class150 method872() {
		if (this.anIntArray44 == null) {
			return null;
		}
		@Pc(15) Class150[] local15 = new Class150[this.anIntArray44.length];
		@Pc(17) Class170 local17 = Static196.aClass170_73;
		synchronized (Static196.aClass170_73) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray44.length) {
					break;
				}
				local15[local21] = Static17.method5326(this.anIntArray44[local21], Static196.aClass170_73);
				local21++;
			}
		}
		@Pc(63) Class150 local63;
		if (local15.length == 1) {
			local63 = local15[0];
		} else {
			local63 = new Class150(local15, local15.length);
		}
		if (local63 == null) {
			return null;
		}
		@Pc(77) int local77;
		if (this.aShortArray1 != null) {
			for (local77 = 0; local77 < this.aShortArray1.length; local77++) {
				local63.method3984(this.aShortArray4[local77], this.aShortArray1[local77]);
			}
		}
		if (this.aShortArray2 != null) {
			for (local77 = 0; local77 < this.aShortArray2.length; local77++) {
				local63.method3975(this.aShortArray2[local77], this.aShortArray3[local77]);
			}
		}
		return local63;
	}
}

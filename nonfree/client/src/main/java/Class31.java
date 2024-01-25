import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class31 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!cr;")
	public Class40 aClass40_2;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
	private final int[] anIntArray109 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z")
	public boolean method742() {
		@Pc(7) boolean local7 = true;
		@Pc(18) Class71 local18 = this.aClass40_2.aClass71_14;
		synchronized (this.aClass40_2.aClass71_14) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray109[local22] != -1 && !this.aClass40_2.aClass71_14.method1561(this.anIntArray109[local22], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lclient!gr;")
	public Class91 method743() {
		@Pc(8) Class91[] local8 = new Class91[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class71 local14 = this.aClass40_2.aClass71_14;
		synchronized (this.aClass40_2.aClass71_14) {
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.anIntArray109[local27] != -1) {
					local8[local10++] = Static67.method1243(this.anIntArray109[local27], this.aClass40_2.aClass71_14);
				}
			}
		}
		@Pc(68) Class91 local68 = new Class91(local8, local10);
		@Pc(73) int local73;
		if (this.aShortArray16 != null) {
			for (local73 = 0; local73 < this.aShortArray16.length; local73++) {
				local68.method2212(this.aShortArray16[local73], this.aShortArray19[local73]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local73 = 0; local73 < this.aShortArray17.length; local73++) {
				local68.method2214(this.aShortArray17[local73], this.aShortArray18[local73]);
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
	public boolean method744() {
		if (this.anIntArray108 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class71 local23 = this.aClass40_2.aClass71_14;
		synchronized (this.aClass40_2.aClass71_14) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray108.length; local27++) {
				if (!this.aClass40_2.aClass71_14.method1561(this.anIntArray108[local27], 0)) {
					local19 = false;
				}
			}
			return local19;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!lk;B)V")
	public void method745(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method746(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!lk;IB)V")
	private void method746(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method4240();
			return;
		}
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (arg1 == 2) {
			local26 = arg0.method4240();
			this.anIntArray108 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.anIntArray108[local32] = arg0.method4245();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local26 = arg0.method4240();
				this.aShortArray19 = new short[local26];
				this.aShortArray16 = new short[local26];
				for (local32 = 0; local32 < local26; local32++) {
					this.aShortArray16[local32] = (short) arg0.method4245();
					this.aShortArray19[local32] = (short) arg0.method4245();
				}
			} else if (arg1 == 41) {
				local26 = arg0.method4240();
				this.aShortArray17 = new short[local26];
				this.aShortArray18 = new short[local26];
				for (local32 = 0; local32 < local26; local32++) {
					this.aShortArray17[local32] = (short) arg0.method4245();
					this.aShortArray18[local32] = (short) arg0.method4245();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray109[arg1 - 60] = arg0.method4245();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Lclient!gr;")
	public Class91 method748() {
		if (this.anIntArray108 == null) {
			return null;
		}
		@Pc(15) Class91[] local15 = new Class91[this.anIntArray108.length];
		@Pc(19) Class71 local19 = this.aClass40_2.aClass71_14;
		synchronized (this.aClass40_2.aClass71_14) {
			@Pc(23) int local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray108.length) {
					break;
				}
				local15[local23] = Static67.method1243(this.anIntArray108[local23], this.aClass40_2.aClass71_14);
				local23++;
			}
		}
		@Pc(68) Class91 local68;
		if (local15.length == 1) {
			local68 = local15[0];
		} else {
			local68 = new Class91(local15, local15.length);
		}
		if (local68 == null) {
			return null;
		}
		@Pc(82) int local82;
		if (this.aShortArray16 != null) {
			for (local82 = 0; local82 < this.aShortArray16.length; local82++) {
				local68.method2212(this.aShortArray16[local82], this.aShortArray19[local82]);
			}
		}
		if (this.aShortArray17 != null) {
			for (local82 = 0; local82 < this.aShortArray17.length; local82++) {
				local68.method2214(this.aShortArray17[local82], this.aShortArray18[local82]);
			}
		}
		return local68;
	}
}

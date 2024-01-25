import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class12 {

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "Lclient!es;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "[I")
	private final int[] anIntArray13 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)Lclient!dea;")
	public Class72 method108() {
		@Pc(8) Class72[] local8 = new Class72[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class310 local14 = this.aClass103_1.aClass310_34;
		synchronized (this.aClass103_1.aClass310_34) {
			@Pc(27) int local27 = 0;
			while (true) {
				if (local27 >= 5) {
					break;
				}
				if (this.anIntArray13[local27] != -1) {
					local8[local10++] = Static227.method3839(this.aClass103_1.aClass310_34, this.anIntArray13[local27]);
				}
				local27++;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < 5; local67++) {
			if (local8[local67] != null && local8[local67].anInt1744 < 13) {
				local8[local67].method1689();
			}
		}
		@Pc(109) Class72 local109 = new Class72(local8, local10);
		@Pc(114) int local114;
		if (this.aShortArray2 != null) {
			for (local114 = 0; local114 < this.aShortArray2.length; local114++) {
				local109.method1688(this.aShortArray3[local114], this.aShortArray2[local114]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local114 = 0; local114 < this.aShortArray4.length; local114++) {
				local109.method1690(this.aShortArray1[local114], this.aShortArray4[local114]);
			}
		}
		return local109;
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)Lclient!dea;")
	public Class72 method109() {
		if (this.anIntArray14 == null) {
			return null;
		}
		@Pc(20) Class72[] local20 = new Class72[this.anIntArray14.length];
		@Pc(24) Class310 local24 = this.aClass103_1.aClass310_34;
		@Pc(28) int local28;
		synchronized (this.aClass103_1.aClass310_34) {
			local28 = 0;
			while (true) {
				if (this.anIntArray14.length <= local28) {
					break;
				}
				local20[local28] = Static227.method3839(this.aClass103_1.aClass310_34, this.anIntArray14[local28]);
				local28++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray14.length; local56++) {
			if (local20[local56].anInt1744 < 13) {
				local20[local56].method1689();
			}
		}
		@Pc(98) Class72 local98;
		if (local20.length == 1) {
			local98 = local20[0];
		} else {
			local98 = new Class72(local20, local20.length);
		}
		if (local98 == null) {
			return null;
		}
		if (this.aShortArray2 != null) {
			for (local28 = 0; local28 < this.aShortArray2.length; local28++) {
				local98.method1688(this.aShortArray3[local28], this.aShortArray2[local28]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local28 = 0; local28 < this.aShortArray4.length; local28++) {
				local98.method1690(this.aShortArray1[local28], this.aShortArray4[local28]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!jc;)V")
	public void method110(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7695(125);
			if (local13 == 0) {
				return;
			}
			this.method114(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)Z")
	public boolean method111() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class310 local11 = this.aClass103_1.aClass310_34;
		synchronized (this.aClass103_1.aClass310_34) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray13[local22] != -1 && !this.aClass103_1.aClass310_34.method7793(0, this.anIntArray13[local22])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)Z")
	public boolean method112() {
		if (this.anIntArray14 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		@Pc(23) Class310 local23 = this.aClass103_1.aClass310_34;
		synchronized (this.aClass103_1.aClass310_34) {
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray14.length; local27++) {
				if (!this.aClass103_1.aClass310_34.method7793(0, this.anIntArray14[local27])) {
					local19 = false;
				}
			}
			return local19;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			arg1.method7695(94);
			return;
		}
		@Pc(33) int local33;
		@Pc(39) int local39;
		if (arg0 == 2) {
			local33 = arg1.method7695(125);
			this.anIntArray14 = new int[local33];
			for (local39 = 0; local39 < local33; local39++) {
				this.anIntArray14[local39] = arg1.method7717(-1978450544);
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local33 = arg1.method7695(109);
				this.aShortArray2 = new short[local33];
				this.aShortArray3 = new short[local33];
				for (local39 = 0; local39 < local33; local39++) {
					this.aShortArray2[local39] = (short) arg1.method7717(-1978450544);
					this.aShortArray3[local39] = (short) arg1.method7717(-1978450544);
				}
			} else if (arg0 == 41) {
				local33 = arg1.method7695(124);
				this.aShortArray1 = new short[local33];
				this.aShortArray4 = new short[local33];
				for (local39 = 0; local39 < local33; local39++) {
					this.aShortArray4[local39] = (short) arg1.method7717(-1978450544);
					this.aShortArray1[local39] = (short) arg1.method7717(-1978450544);
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray13[arg0 - 60] = arg1.method7717(-1978450544);
				return;
			}
		}
	}
}

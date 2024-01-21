import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "[I")
	private final int[] anIntArray122 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "[S")
	private final short[] aShortArray6 = new short[6];

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "Z")
	public boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
	public int anInt1300 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZLclient!re;)V")
	private void method934(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1300 = arg1.method1223();
		} else if (arg0 == 2) {
			@Pc(92) int local92 = arg1.method1223();
			this.anIntArray123 = new int[local92];
			for (@Pc(98) int local98 = 0; local98 < local92; local98++) {
				this.anIntArray123[local98] = arg1.method1244();
			}
		} else if (arg0 == 3) {
			this.aBoolean43 = true;
			return;
		} else if (arg0 < 40 || arg0 >= 50) {
			if (arg0 >= 50 && arg0 < 60) {
				this.aShortArray7[arg0 - 50] = (short) arg1.method1244();
				return;
			}
			if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray122[arg0 - 60] = arg1.method1244();
				return;
			}
		} else {
			this.aShortArray6[arg0 - 40] = (short) arg1.method1244();
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!re;I)V")
	public void method935(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1223();
			if (local13 == 0) {
				return;
			}
			this.method934(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Z")
	public boolean method937() {
		if (this.anIntArray123 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray123.length; local14++) {
			if (!Static1.aClass40_1.method1120(this.anIntArray123[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Z")
	public boolean method939() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray122[local9] != -1 && !Static1.aClass40_1.method1120(this.anIntArray122[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method941() {
		@Pc(4) Class4_Sub4_Sub1_Sub7[] local4 = new Class4_Sub4_Sub1_Sub7[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray122[local12] != -1) {
				local4[local10++] = Static118.method2001(Static1.aClass40_1, this.anIntArray122[local12]);
			}
		}
		@Pc(41) Class4_Sub4_Sub1_Sub7 local41 = new Class4_Sub4_Sub1_Sub7(local4, local10);
		for (@Pc(43) int local43 = 0; local43 < 6 && this.aShortArray6[local43] != 0; local43++) {
			local41.method1998(this.aShortArray6[local43], this.aShortArray7[local43]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method942() {
		if (this.anIntArray123 == null) {
			return null;
		}
		@Pc(20) Class4_Sub4_Sub1_Sub7[] local20 = new Class4_Sub4_Sub1_Sub7[this.anIntArray123.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray123.length; local22++) {
			local20[local22] = Static118.method2001(Static1.aClass40_1, this.anIntArray123[local22]);
		}
		@Pc(52) Class4_Sub4_Sub1_Sub7 local52;
		if (local20.length == 1) {
			local52 = local20[0];
		} else {
			local52 = new Class4_Sub4_Sub1_Sub7(local20, local20.length);
		}
		for (@Pc(63) int local63 = 0; local63 < 6 && this.aShortArray6[local63] != 0; local63++) {
			local52.method1998(this.aShortArray6[local63], this.aShortArray7[local63]);
		}
		return local52;
	}
}

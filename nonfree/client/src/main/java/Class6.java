import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
	private final int[] anIntArray5 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	public int anInt25 = -1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	public boolean method21() {
		if (this.anIntArray6 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		@Pc(22) Class144 local22 = Static82.aClass144_29;
		synchronized (Static82.aClass144_29) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray6.length; local26++) {
				if (!Static82.aClass144_29.method3916(this.anIntArray6[local26], 0)) {
					local20 = false;
				}
			}
			return local20;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!kh;II)V")
	private void method22(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt25 = arg0.method5185();
			return;
		}
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (arg1 == 2) {
			local24 = arg0.method5185();
			this.anIntArray6 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray6[local30] = arg0.method5187();
			}
		} else if (arg1 == 3) {
			this.aBoolean1 = true;
		} else if (arg1 == 40) {
			local24 = arg0.method5185();
			this.aShortArray2 = new short[local24];
			this.aShortArray3 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray3[local30] = (short) arg0.method5187();
				this.aShortArray2[local30] = (short) arg0.method5187();
			}
		} else if (arg1 == 41) {
			local24 = arg0.method5185();
			this.aShortArray4 = new short[local24];
			this.aShortArray1 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray1[local30] = (short) arg0.method5187();
				this.aShortArray4[local30] = (short) arg0.method5187();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray5[arg1 - 60] = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public boolean method24() {
		@Pc(12) boolean local12 = true;
		@Pc(14) Class144 local14 = Static82.aClass144_29;
		synchronized (Static82.aClass144_29) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray5[local18] != -1 && !Static82.aClass144_29.method3916(this.anIntArray5[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Lclient!br;")
	public Class31 method25() {
		if (this.anIntArray6 == null) {
			return null;
		}
		@Pc(15) Class31[] local15 = new Class31[this.anIntArray6.length];
		@Pc(17) Class144 local17 = Static82.aClass144_29;
		synchronized (Static82.aClass144_29) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (local21 >= this.anIntArray6.length) {
					break;
				}
				local15[local21] = Static119.method1790(Static82.aClass144_29, this.anIntArray6[local21]);
				local21++;
			}
		}
		@Pc(60) Class31 local60;
		if (local15.length == 1) {
			local60 = local15[0];
		} else {
			local60 = new Class31(local15, local15.length);
		}
		if (local60 == null) {
			return null;
		}
		@Pc(84) int local84;
		if (this.aShortArray3 != null) {
			for (local84 = 0; local84 < this.aShortArray3.length; local84++) {
				local60.method443(this.aShortArray3[local84], this.aShortArray2[local84]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local84 = 0; local84 < this.aShortArray1.length; local84++) {
				local60.method434(this.aShortArray1[local84], this.aShortArray4[local84]);
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method26(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method22(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lclient!br;")
	public Class31 method27() {
		@Pc(8) Class31[] local8 = new Class31[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class144 local12 = Static82.aClass144_29;
		synchronized (Static82.aClass144_29) {
			for (@Pc(25) int local25 = 0; local25 < 5; local25++) {
				if (this.anIntArray5[local25] != -1) {
					local8[local10++] = Static119.method1790(Static82.aClass144_29, this.anIntArray5[local25]);
				}
			}
		}
		@Pc(62) Class31 local62 = new Class31(local8, local10);
		@Pc(67) int local67;
		if (this.aShortArray3 != null) {
			for (local67 = 0; local67 < this.aShortArray3.length; local67++) {
				local62.method443(this.aShortArray3[local67], this.aShortArray2[local67]);
			}
		}
		if (this.aShortArray1 != null) {
			for (local67 = 0; local67 < this.aShortArray1.length; local67++) {
				local62.method434(this.aShortArray1[local67], this.aShortArray4[local67]);
			}
		}
		return local62;
	}
}

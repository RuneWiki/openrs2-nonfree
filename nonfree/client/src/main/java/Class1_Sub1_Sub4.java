import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
	private final int[] anIntArray17 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
	public int anInt335 = -1;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!hc;B)V")
	public void method197(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method544();
			if (local13 == 0) {
				return;
			}
			this.method199(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!hc;I)V")
	private void method199(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt335 = arg0.method544();
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (arg1 == 2) {
			local37 = arg0.method544();
			this.anIntArray16 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray16[local47] = arg0.method546();
			}
		} else if (arg1 == 3) {
			this.aBoolean11 = true;
		} else if (arg1 == 40) {
			local37 = arg0.method544();
			this.aShortArray7 = new short[local37];
			this.aShortArray8 = new short[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.aShortArray7[local47] = (short) arg0.method546();
				this.aShortArray8[local47] = (short) arg0.method546();
			}
		} else if (arg1 == 41) {
			local37 = arg0.method544();
			this.aShortArray6 = new short[local37];
			this.aShortArray9 = new short[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.aShortArray6[local47] = (short) arg0.method546();
				this.aShortArray9[local47] = (short) arg0.method546();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray17[arg1 - 60] = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Z")
	public boolean method201() {
		if (this.anIntArray16 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray16.length; local20++) {
			if (!Static85.aClass16_11.method2238(this.anIntArray16[local20], 0)) {
				local18 = false;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method202() {
		if (this.anIntArray16 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub5_Sub5[] local15 = new Class1_Sub1_Sub5_Sub5[this.anIntArray16.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray16.length; local17++) {
			local15[local17] = Static70.method1483(Static85.aClass16_11, this.anIntArray16[local17]);
		}
		@Pc(45) Class1_Sub1_Sub5_Sub5 local45;
		if (local15.length == 1) {
			local45 = local15[0];
		} else {
			local45 = new Class1_Sub1_Sub5_Sub5(local15, local15.length);
		}
		@Pc(59) int local59;
		if (this.aShortArray7 != null) {
			for (local59 = 0; local59 < this.aShortArray7.length; local59++) {
				local45.method1489(this.aShortArray7[local59], this.aShortArray8[local59]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local59 = 0; local59 < this.aShortArray6.length; local59++) {
				local45.method1479(this.aShortArray6[local59], this.aShortArray9[local59]);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)Lclient!ja;")
	public Class1_Sub1_Sub5_Sub5 method203() {
		@Pc(4) Class1_Sub1_Sub5_Sub5[] local4 = new Class1_Sub1_Sub5_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray17[local12] != -1) {
				local4[local10++] = Static70.method1483(Static85.aClass16_11, this.anIntArray17[local12]);
			}
		}
		@Pc(43) Class1_Sub1_Sub5_Sub5 local43 = new Class1_Sub1_Sub5_Sub5(local4, local10);
		@Pc(48) int local48;
		if (this.aShortArray7 != null) {
			for (local48 = 0; local48 < this.aShortArray7.length; local48++) {
				local43.method1489(this.aShortArray7[local48], this.aShortArray8[local48]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local48 = 0; local48 < this.aShortArray6.length; local48++) {
				local43.method1479(this.aShortArray6[local48], this.aShortArray9[local48]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)Z")
	public boolean method204() {
		@Pc(3) boolean local3 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray17[local14] != -1 && !Static85.aClass16_11.method2238(this.anIntArray17[local14], 0)) {
				local3 = false;
			}
		}
		return local3;
	}
}

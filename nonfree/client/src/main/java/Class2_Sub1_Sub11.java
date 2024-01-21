import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "[I")
	private final int[] anIntArray177 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public int anInt1893 = -1;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)Z")
	public boolean method1421() {
		@Pc(7) boolean local7 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray177[local15] != -1 && !Static143.aClass13_31.method538(this.anIntArray177[local15], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Z")
	public boolean method1426() {
		if (this.anIntArray176 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray176.length; local20++) {
			if (!Static143.aClass13_31.method538(this.anIntArray176[local20], 0)) {
				local18 = false;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method1427() {
		@Pc(8) Class2_Sub1_Sub1_Sub1[] local8 = new Class2_Sub1_Sub1_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray177[local12] != -1) {
				local8[local10++] = Static23.method578(Static143.aClass13_31, this.anIntArray177[local12]);
			}
		}
		@Pc(49) Class2_Sub1_Sub1_Sub1 local49 = new Class2_Sub1_Sub1_Sub1(local8, local10);
		@Pc(54) int local54;
		if (this.aShortArray36 != null) {
			for (local54 = 0; local54 < this.aShortArray36.length; local54++) {
				local49.method588(this.aShortArray36[local54], this.aShortArray37[local54]);
			}
		}
		if (this.aShortArray38 != null) {
			for (local54 = 0; local54 < this.aShortArray38.length; local54++) {
				local49.method576(this.aShortArray38[local54], this.aShortArray35[local54]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Lclient!cb;")
	public Class2_Sub1_Sub1_Sub1 method1428() {
		if (this.anIntArray176 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub1[] local15 = new Class2_Sub1_Sub1_Sub1[this.anIntArray176.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray176.length; local24++) {
			local15[local24] = Static23.method578(Static143.aClass13_31, this.anIntArray176[local24]);
		}
		@Pc(52) Class2_Sub1_Sub1_Sub1 local52;
		if (local15.length == 1) {
			local52 = local15[0];
		} else {
			local52 = new Class2_Sub1_Sub1_Sub1(local15, local15.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray36 != null) {
			for (local66 = 0; local66 < this.aShortArray36.length; local66++) {
				local52.method588(this.aShortArray36[local66], this.aShortArray37[local66]);
			}
		}
		if (this.aShortArray38 != null) {
			for (local66 = 0; local66 < this.aShortArray38.length; local66++) {
				local52.method576(this.aShortArray38[local66], this.aShortArray35[local66]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!og;B)V")
	public void method1431(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method218();
			if (local16 == 0) {
				return;
			}
			this.method1433(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!og;II)V")
	private void method1433(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1893 = arg0.method218();
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method218();
			this.anIntArray176 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray176[local24] = arg0.method234();
			}
		} else if (arg1 == 3) {
			this.aBoolean78 = true;
		} else if (arg1 == 40) {
			local18 = arg0.method218();
			this.aShortArray37 = new short[local18];
			this.aShortArray36 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray36[local24] = (short) arg0.method234();
				this.aShortArray37[local24] = (short) arg0.method234();
			}
		} else if (arg1 == 41) {
			local18 = arg0.method218();
			this.aShortArray38 = new short[local18];
			this.aShortArray35 = new short[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.aShortArray38[local24] = (short) arg0.method234();
				this.aShortArray35[local24] = (short) arg0.method234();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray177[arg1 - 60] = arg0.method234();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!eb", name = "lb", descriptor = "[I")
	private final int[] anIntArray44 = new int[6];

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
	public int anInt619 = -1;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "[I")
	private final int[] anIntArray45 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "[I")
	private final int[] anIntArray46 = new int[6];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILclient!wd;)V")
	private void method510(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt619 = arg1.method1399();
		} else if (arg0 == 2) {
			@Pc(32) int local32 = arg1.method1399();
			this.anIntArray42 = new int[local32];
			for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
				this.anIntArray42[local38] = arg1.method1366();
			}
		} else if (arg0 == 3) {
			this.aBoolean23 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray46[arg0 - 40] = arg1.method1366();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray44[arg0 - 50] = arg1.method1366();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray45[arg0 - 60] = arg1.method1366();
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method512() {
		@Pc(8) Class2_Sub1_Sub4_Sub1[] local8 = new Class2_Sub1_Sub4_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray45[local17] != -1) {
				local8[local10++] = Static30.method669(Static45.aClass3_11, this.anIntArray45[local17]);
			}
		}
		@Pc(49) Class2_Sub1_Sub4_Sub1 local49 = new Class2_Sub1_Sub4_Sub1(local8, local10);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.anIntArray46[local51] != 0; local51++) {
			local49.method674(this.anIntArray46[local51], this.anIntArray44[local51]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method513() {
		if (this.anIntArray42 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub4_Sub1[] local15 = new Class2_Sub1_Sub4_Sub1[this.anIntArray42.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray42.length; local17++) {
			local15[local17] = Static30.method669(Static45.aClass3_11, this.anIntArray42[local17]);
		}
		@Pc(45) Class2_Sub1_Sub4_Sub1 local45;
		if (local15.length == 1) {
			local45 = local15[0];
		} else {
			local45 = new Class2_Sub1_Sub4_Sub1(local15, local15.length);
		}
		for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray46[local56] != 0; local56++) {
			local45.method674(this.anIntArray46[local56], this.anIntArray44[local56]);
		}
		return local45;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)Z")
	public boolean method514() {
		if (this.anIntArray42 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray42.length; local19++) {
			if (!Static45.aClass3_11.method934(this.anIntArray42[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wd;)V")
	public void method516(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1399();
			if (local16 == 0) {
				return;
			}
			this.method510(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)Z")
	public boolean method517() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray45[local5] != -1 && !Static45.aClass3_11.method934(this.anIntArray45[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}
}

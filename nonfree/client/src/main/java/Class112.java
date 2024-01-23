import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class112 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
	private int[] anIntArray335 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public int anInt3737 = -1;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Z")
	public boolean aBoolean281 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!cg;II)V")
	private void method2994(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3737 = arg0.method2690();
			return;
		}
		@Pc(53) int local53;
		@Pc(63) int local63;
		if (arg1 == 2) {
			local53 = arg0.method2690();
			this.anIntArray334 = new int[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.anIntArray334[local63] = arg0.method2691();
			}
		} else if (arg1 == 3) {
			this.aBoolean281 = true;
		} else if (arg1 == 40) {
			local53 = arg0.method2690();
			this.aShortArray68 = new short[local53];
			this.aShortArray69 = new short[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.aShortArray69[local63] = (short) arg0.method2691();
				this.aShortArray68[local63] = (short) arg0.method2691();
			}
		} else if (arg1 == 41) {
			local53 = arg0.method2690();
			this.aShortArray67 = new short[local53];
			this.aShortArray66 = new short[local53];
			for (local63 = 0; local63 < local53; local63++) {
				this.aShortArray67[local63] = (short) arg0.method2691();
				this.aShortArray66[local63] = (short) arg0.method2691();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray335[arg1 - 60] = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lclient!dl;")
	public Class14_Sub3 method2995() {
		if (this.anIntArray334 == null) {
			return null;
		}
		@Pc(15) Class14_Sub3[] local15 = new Class14_Sub3[this.anIntArray334.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray334.length; local17++) {
			local15[local17] = Static51.method976(Static123.aClass91_98, this.anIntArray334[local17]);
		}
		@Pc(43) Class14_Sub3 local43;
		if (local15.length == 1) {
			local43 = local15[0];
		} else {
			local43 = new Class14_Sub3(local15, local15.length);
		}
		@Pc(56) int local56;
		if (this.aShortArray69 != null) {
			for (local56 = 0; local56 < this.aShortArray69.length; local56++) {
				local43.method982(this.aShortArray69[local56], this.aShortArray68[local56]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local56 = 0; local56 < this.aShortArray67.length; local56++) {
				local43.method979(this.aShortArray67[local56], this.aShortArray66[local56]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!cg;)V")
	public void method2996(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2690();
			if (local12 == 0) {
				return;
			}
			this.method2994(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Lclient!dl;")
	public Class14_Sub3 method2998() {
		@Pc(4) Class14_Sub3[] local4 = new Class14_Sub3[5];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray335[local19] != -1) {
				local4[local17++] = Static51.method976(Static123.aClass91_98, this.anIntArray335[local19]);
			}
		}
		@Pc(51) Class14_Sub3 local51 = new Class14_Sub3(local4, local17);
		@Pc(57) int local57;
		if (this.aShortArray69 != null) {
			for (local57 = 0; local57 < this.aShortArray69.length; local57++) {
				local51.method982(this.aShortArray69[local57], this.aShortArray68[local57]);
			}
		}
		if (this.aShortArray67 != null) {
			for (local57 = 0; local57 < this.aShortArray67.length; local57++) {
				local51.method979(this.aShortArray67[local57], this.aShortArray66[local57]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)Z")
	public boolean method3000() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray335[local16] != -1 && !Static123.aClass91_98.method2515(0, this.anIntArray335[local16])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Z")
	public boolean method3002() {
		if (this.anIntArray334 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray334.length; local15++) {
			if (!Static123.aClass91_98.method2515(0, this.anIntArray334[local15])) {
				local13 = false;
			}
		}
		return local13;
	}
}

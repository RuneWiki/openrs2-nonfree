import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class16 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	private int[] anIntArray53 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
	public int anInt741 = -1;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lclient!ca;")
	public Class9_Sub3 method402() {
		@Pc(8) Class9_Sub3[] local8 = new Class9_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			if (this.anIntArray53[local19] != -1) {
				local8[local10++] = Static27.method545(Static144.aClass51_47, this.anIntArray53[local19]);
			}
		}
		@Pc(50) Class9_Sub3 local50 = new Class9_Sub3(local8, local10);
		@Pc(55) int local55;
		if (this.aShortArray6 != null) {
			for (local55 = 0; local55 < this.aShortArray6.length; local55++) {
				local50.method528(this.aShortArray6[local55], this.aShortArray7[local55]);
			}
		}
		if (this.aShortArray8 != null) {
			for (local55 = 0; local55 < this.aShortArray8.length; local55++) {
				local50.method529(this.aShortArray8[local55], this.aShortArray5[local55]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
	public boolean method403() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray53[local14] != -1 && !Static144.aClass51_47.method1862(this.anIntArray53[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lclient!ca;")
	public Class9_Sub3 method411() {
		if (this.anIntArray54 == null) {
			return null;
		}
		@Pc(15) Class9_Sub3[] local15 = new Class9_Sub3[this.anIntArray54.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray54.length; local17++) {
			local15[local17] = Static27.method545(Static144.aClass51_47, this.anIntArray54[local17]);
		}
		@Pc(52) Class9_Sub3 local52;
		if (local15.length == 1) {
			local52 = local15[0];
		} else {
			local52 = new Class9_Sub3(local15, local15.length);
		}
		@Pc(71) int local71;
		if (this.aShortArray6 != null) {
			for (local71 = 0; local71 < this.aShortArray6.length; local71++) {
				local52.method528(this.aShortArray6[local71], this.aShortArray7[local71]);
			}
		}
		if (this.aShortArray8 != null) {
			for (local71 = 0; local71 < this.aShortArray8.length; local71++) {
				local52.method529(this.aShortArray8[local71], this.aShortArray5[local71]);
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!ql;)V")
	public void method413(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1772();
			if (local16 == 0) {
				return;
			}
			this.method416(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Z")
	public boolean method415() {
		if (this.anIntArray54 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray54.length; local19++) {
			if (!Static144.aClass51_47.method1862(this.anIntArray54[local19], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILclient!ql;)V")
	private void method416(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt741 = arg1.method1772();
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (arg0 == 2) {
			local41 = arg1.method1772();
			this.anIntArray54 = new int[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.anIntArray54[local51] = arg1.method1764();
			}
		} else if (arg0 == 3) {
			this.aBoolean39 = true;
		} else if (arg0 == 40) {
			local41 = arg1.method1772();
			this.aShortArray6 = new short[local41];
			this.aShortArray7 = new short[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.aShortArray6[local51] = (short) arg1.method1764();
				this.aShortArray7[local51] = (short) arg1.method1764();
			}
		} else if (arg0 == 41) {
			local41 = arg1.method1772();
			this.aShortArray8 = new short[local41];
			this.aShortArray5 = new short[local41];
			for (local51 = 0; local51 < local41; local51++) {
				this.aShortArray8[local51] = (short) arg1.method1764();
				this.aShortArray5[local51] = (short) arg1.method1764();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray53[arg0 - 60] = arg1.method1764();
			return;
		}
	}
}

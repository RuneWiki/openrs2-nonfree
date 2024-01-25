import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class171 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "Lclient!gm;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "[I")
	private final int[] anIntArray283 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)Z")
	public boolean method4046() {
		if (this.anIntArray282 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class348 local21 = this.aClass127_1.aClass348_43;
		synchronized (this.aClass127_1.aClass348_43) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray282.length; local25++) {
				if (!this.aClass127_1.aClass348_43.method7972(this.anIntArray282[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Lclient!cr;")
	public Class59 method4047() {
		if (this.anIntArray282 == null) {
			return null;
		}
		@Pc(15) Class59[] local15 = new Class59[this.anIntArray282.length];
		@Pc(19) Class348 local19 = this.aClass127_1.aClass348_43;
		@Pc(23) int local23;
		synchronized (this.aClass127_1.aClass348_43) {
			local23 = 0;
			while (true) {
				if (this.anIntArray282.length <= local23) {
					break;
				}
				local15[local23] = Static485.method7071(this.aClass127_1.aClass348_43, this.anIntArray282[local23]);
				local23++;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < this.anIntArray282.length; local62++) {
			if (local15[local62].anInt1895 < 13) {
				local15[local62].method1588();
			}
		}
		@Pc(90) Class59 local90;
		if (local15.length == 1) {
			local90 = local15[0];
		} else {
			local90 = new Class59(local15, local15.length);
		}
		if (local90 == null) {
			return null;
		}
		if (this.aShortArray59 != null) {
			for (local23 = 0; local23 < this.aShortArray59.length; local23++) {
				local90.method1581(this.aShortArray59[local23], this.aShortArray60[local23]);
			}
		}
		if (this.aShortArray58 != null) {
			for (local23 = 0; local23 < this.aShortArray58.length; local23++) {
				local90.method1586(this.aShortArray58[local23], this.aShortArray57[local23]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method4049(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7004();
			if (local7 == 0) {
				return;
			}
			this.method4050(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ek;II)V")
	private void method4050(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method7004();
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local35 = arg0.method7004();
			this.anIntArray282 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray282[local45] = arg0.method7054();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local35 = arg0.method7004();
				this.aShortArray60 = new short[local35];
				this.aShortArray59 = new short[local35];
				for (local45 = 0; local45 < local35; local45++) {
					this.aShortArray59[local45] = (short) arg0.method7054();
					this.aShortArray60[local45] = (short) arg0.method7054();
				}
				return;
			}
			if (arg1 == 41) {
				local35 = arg0.method7004();
				this.aShortArray58 = new short[local35];
				this.aShortArray57 = new short[local35];
				for (local45 = 0; local45 < local35; local45++) {
					this.aShortArray58[local45] = (short) arg0.method7054();
					this.aShortArray57[local45] = (short) arg0.method7054();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray283[arg1 - 60] = arg0.method7054();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Lclient!cr;")
	public Class59 method4051() {
		@Pc(8) Class59[] local8 = new Class59[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class348 local14 = this.aClass127_1.aClass348_43;
		@Pc(18) int local18;
		synchronized (this.aClass127_1.aClass348_43) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray283[local18] != -1) {
					local8[local10++] = Static485.method7071(this.aClass127_1.aClass348_43, this.anIntArray283[local18]);
				}
				local18++;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < 5; local53++) {
			if (local8[local53] != null && local8[local53].anInt1895 < 13) {
				local8[local53].method1588();
			}
		}
		@Pc(83) Class59 local83 = new Class59(local8, local10);
		if (this.aShortArray59 != null) {
			for (local18 = 0; local18 < this.aShortArray59.length; local18++) {
				local83.method1581(this.aShortArray59[local18], this.aShortArray60[local18]);
			}
		}
		if (this.aShortArray58 != null) {
			for (local18 = 0; local18 < this.aShortArray58.length; local18++) {
				local83.method1586(this.aShortArray58[local18], this.aShortArray57[local18]);
			}
		}
		return local83;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)Z")
	public boolean method4052() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class348 local11 = this.aClass127_1.aClass348_43;
		synchronized (this.aClass127_1.aClass348_43) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray283[local15] != -1 && !this.aClass127_1.aClass348_43.method7972(this.anIntArray283[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}

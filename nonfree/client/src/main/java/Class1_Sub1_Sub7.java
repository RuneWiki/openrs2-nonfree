import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "[I")
	private int[] anIntArray177 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	public int anInt1546 = -1;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lclient!bc;")
	public Class9_Sub1 method1114() {
		@Pc(8) Class9_Sub1[] local8 = new Class9_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray177[local12] != -1) {
				local8[local10++] = Static14.method275(Static25.aClass7_6, this.anIntArray177[local12]);
			}
		}
		@Pc(42) Class9_Sub1 local42 = new Class9_Sub1(local8, local10);
		@Pc(47) int local47;
		if (this.aShortArray20 != null) {
			for (local47 = 0; local47 < this.aShortArray20.length; local47++) {
				local42.method276(this.aShortArray20[local47], this.aShortArray21[local47]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local47 = 0; local47 < this.aShortArray19.length; local47++) {
				local42.method282(this.aShortArray19[local47], this.aShortArray18[local47]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!nc;I)V")
	private void method1115(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1546 = arg0.method895();
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		if (arg1 == 2) {
			local37 = arg0.method895();
			this.anIntArray178 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray178[local47] = arg0.method946();
			}
		} else if (arg1 == 3) {
			this.aBoolean80 = true;
		} else if (arg1 == 40) {
			local37 = arg0.method895();
			this.aShortArray20 = new short[local37];
			this.aShortArray21 = new short[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.aShortArray20[local47] = (short) arg0.method946();
				this.aShortArray21[local47] = (short) arg0.method946();
			}
		} else if (arg1 == 41) {
			local37 = arg0.method895();
			this.aShortArray18 = new short[local37];
			this.aShortArray19 = new short[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.aShortArray19[local47] = (short) arg0.method946();
				this.aShortArray18[local47] = (short) arg0.method946();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray177[arg1 - 60] = arg0.method946();
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)Z")
	public boolean method1116() {
		@Pc(3) boolean local3 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray177[local15] != -1 && !Static25.aClass7_6.method3247(this.anIntArray177[local15], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!nc;I)V")
	public void method1117(@OriginalArg(0) Class1_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method895();
			if (local13 == 0) {
				return;
			}
			this.method1115(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(B)Z")
	public boolean method1121() {
		if (this.anIntArray178 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray178.length; local21++) {
			if (!Static25.aClass7_6.method3247(this.anIntArray178[local21], 0)) {
				local19 = false;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(B)Lclient!bc;")
	public Class9_Sub1 method1122() {
		if (this.anIntArray178 == null) {
			return null;
		}
		@Pc(15) Class9_Sub1[] local15 = new Class9_Sub1[this.anIntArray178.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray178.length; local17++) {
			local15[local17] = Static14.method275(Static25.aClass7_6, this.anIntArray178[local17]);
		}
		@Pc(56) Class9_Sub1 local56;
		if (local15.length == 1) {
			local56 = local15[0];
		} else {
			local56 = new Class9_Sub1(local15, local15.length);
		}
		@Pc(70) int local70;
		if (this.aShortArray20 != null) {
			for (local70 = 0; local70 < this.aShortArray20.length; local70++) {
				local56.method276(this.aShortArray20[local70], this.aShortArray21[local70]);
			}
		}
		if (this.aShortArray19 != null) {
			for (local70 = 0; local70 < this.aShortArray19.length; local70++) {
				local56.method282(this.aShortArray19[local70], this.aShortArray18[local70]);
			}
		}
		return local56;
	}
}

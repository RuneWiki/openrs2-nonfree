import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "[I")
	private int[] anIntArray425;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!s", name = "mb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!s", name = "ob", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
	public int anInt2532 = -1;

	@OriginalMember(owner = "client!s", name = "wb", descriptor = "[I")
	private final int[] anIntArray426 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!mc;)V")
	private void method1781(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2532 = arg1.method1190();
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg0 == 2) {
			local35 = arg1.method1190();
			this.anIntArray425 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray425[local45] = arg1.method1176();
			}
		} else if (arg0 == 3) {
			this.aBoolean108 = true;
		} else if (arg0 == 40) {
			local35 = arg1.method1190();
			this.aShortArray81 = new short[local35];
			this.aShortArray79 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray79[local45] = (short) arg1.method1176();
				this.aShortArray81[local45] = (short) arg1.method1176();
			}
		} else if (arg0 == 41) {
			local35 = arg1.method1190();
			this.aShortArray80 = new short[local35];
			this.aShortArray82 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray80[local45] = (short) arg1.method1176();
				this.aShortArray82[local45] = (short) arg1.method1176();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray426[arg0 - 60] = arg1.method1176();
			return;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1782() {
		@Pc(8) Class1_Sub1_Sub1_Sub7[] local8 = new Class1_Sub1_Sub1_Sub7[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray426[local12] != -1) {
				local8[local10++] = Static113.method1911(Static23.aClass5_24, this.anIntArray426[local12]);
			}
		}
		@Pc(44) Class1_Sub1_Sub1_Sub7 local44 = new Class1_Sub1_Sub1_Sub7(local8, local10);
		@Pc(49) int local49;
		if (this.aShortArray79 != null) {
			for (local49 = 0; local49 < this.aShortArray79.length; local49++) {
				local44.method1914(this.aShortArray79[local49], this.aShortArray81[local49]);
			}
		}
		if (this.aShortArray80 != null) {
			for (local49 = 0; local49 < this.aShortArray80.length; local49++) {
				local44.method1915(this.aShortArray80[local49], this.aShortArray82[local49]);
			}
		}
		return local44;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Z")
	public boolean method1783() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray426[local16] != -1 && !Static23.aClass5_24.method119(this.anIntArray426[local16], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1784() {
		if (this.anIntArray425 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub1_Sub7[] local15 = new Class1_Sub1_Sub1_Sub7[this.anIntArray425.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray425.length; local17++) {
			local15[local17] = Static113.method1911(Static23.aClass5_24, this.anIntArray425[local17]);
		}
		@Pc(49) Class1_Sub1_Sub1_Sub7 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class1_Sub1_Sub1_Sub7(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray79 != null) {
			for (local63 = 0; local63 < this.aShortArray79.length; local63++) {
				local49.method1914(this.aShortArray79[local63], this.aShortArray81[local63]);
			}
		}
		if (this.aShortArray80 != null) {
			for (local63 = 0; local63 < this.aShortArray80.length; local63++) {
				local49.method1915(this.aShortArray80[local63], this.aShortArray82[local63]);
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method1785(@OriginalArg(0) Class1_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1190();
			if (local5 == 0) {
				return;
			}
			this.method1781(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Z")
	public boolean method1790() {
		if (this.anIntArray425 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray425.length; local14++) {
			if (!Static23.aClass5_24.method119(this.anIntArray425[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}
}

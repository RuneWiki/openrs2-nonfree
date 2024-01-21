import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public int anInt2828 = -1;

	@OriginalMember(owner = "client!w", name = "Z", descriptor = "[S")
	private final short[] aShortArray14 = new short[6];

	@OriginalMember(owner = "client!w", name = "K", descriptor = "[S")
	private final short[] aShortArray13 = new short[6];

	@OriginalMember(owner = "client!w", name = "V", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!w", name = "ib", descriptor = "[I")
	private final int[] anIntArray409 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1933() {
		if (this.anIntArray410 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub4_Sub5[] local15 = new Class3_Sub1_Sub4_Sub5[this.anIntArray410.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray410.length; local17++) {
			local15[local17] = Static67.method1155(Static71.aClass62_11, this.anIntArray410[local17]);
		}
		@Pc(48) Class3_Sub1_Sub4_Sub5 local48;
		if (local15.length == 1) {
			local48 = local15[0];
		} else {
			local48 = new Class3_Sub1_Sub4_Sub5(local15, local15.length);
		}
		for (@Pc(59) int local59 = 0; local59 < 6 && this.aShortArray14[local59] != 0; local59++) {
			local48.method1172(this.aShortArray14[local59], this.aShortArray13[local59]);
		}
		return local48;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ob;II)V")
	private void method1936(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2828 = arg0.method647();
		} else if (arg1 == 2) {
			@Pc(26) int local26 = arg0.method647();
			this.anIntArray410 = new int[local26];
			for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
				this.anIntArray410[local32] = arg0.method602();
			}
		} else if (arg1 == 3) {
			this.aBoolean127 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray14[arg1 - 40] = (short) arg0.method602();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray13[arg1 - 50] = (short) arg0.method602();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray409[arg1 - 60] = arg0.method602();
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)Z")
	public boolean method1937() {
		if (this.anIntArray410 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray410.length; local22++) {
			if (!Static71.aClass62_11.method1515(0, this.anIntArray410[local22])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)Z")
	public boolean method1940() {
		@Pc(7) boolean local7 = true;
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			if (this.anIntArray409[local16] != -1 && !Static71.aClass62_11.method1515(0, this.anIntArray409[local16])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)Lclient!lc;")
	public Class3_Sub1_Sub4_Sub5 method1942() {
		@Pc(8) Class3_Sub1_Sub4_Sub5[] local8 = new Class3_Sub1_Sub4_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray409[local12] != -1) {
				local8[local10++] = Static67.method1155(Static71.aClass62_11, this.anIntArray409[local12]);
			}
		}
		@Pc(41) Class3_Sub1_Sub4_Sub5 local41 = new Class3_Sub1_Sub4_Sub5(local8, local10);
		for (@Pc(43) int local43 = 0; local43 < 6 && this.aShortArray14[local43] != 0; local43++) {
			local41.method1172(this.aShortArray14[local43], this.aShortArray13[local43]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ob;I)V")
	public void method1943(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method647();
			if (local5 == 0) {
				return;
			}
			this.method1936(arg0, local5);
		}
	}
}

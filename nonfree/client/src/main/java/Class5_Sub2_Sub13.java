import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "[I")
	private int[] anIntArray336;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
	private final int[] anIntArray335 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
	public int anInt2768 = -1;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z")
	public boolean method1786() {
		@Pc(7) boolean local7 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray335[local17] != -1 && !Static132.aClass26_32.method1041(this.anIntArray335[local17], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Z")
	public boolean method1788() {
		if (this.anIntArray336 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray336.length; local14++) {
			if (!Static132.aClass26_32.method1041(this.anIntArray336[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!pa;)V")
	private void method1789(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt2768 = arg1.method1471();
			return;
		}
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (arg0 == 2) {
			local24 = arg1.method1471();
			this.anIntArray336 = new int[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.anIntArray336[local30] = arg1.method1478();
			}
			return;
		}
		if (arg0 == 3) {
			this.aBoolean100 = true;
			return;
		}
		if (arg0 == 40) {
			local24 = arg1.method1471();
			this.aShortArray33 = new short[local24];
			this.aShortArray34 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray34[local30] = (short) arg1.method1478();
				this.aShortArray33[local30] = (short) arg1.method1478();
			}
			return;
		}
		if (arg0 == 41) {
			local24 = arg1.method1471();
			this.aShortArray32 = new short[local24];
			this.aShortArray31 = new short[local24];
			for (local30 = 0; local30 < local24; local30++) {
				this.aShortArray31[local30] = (short) arg1.method1478();
				this.aShortArray32[local30] = (short) arg1.method1478();
			}
			return;
		}
		if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray335[arg0 - 60] = arg1.method1478();
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1790() {
		@Pc(12) int local12 = 0;
		@Pc(15) Class5_Sub2_Sub2_Sub1[] local15 = new Class5_Sub2_Sub2_Sub1[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray335[local17] != -1) {
				local15[local12++] = Static15.method341(Static132.aClass26_32, this.anIntArray335[local17]);
			}
		}
		@Pc(46) Class5_Sub2_Sub2_Sub1 local46 = new Class5_Sub2_Sub2_Sub1(local15, local12);
		@Pc(51) int local51;
		if (this.aShortArray34 != null) {
			for (local51 = 0; local51 < this.aShortArray34.length; local51++) {
				local46.method329(this.aShortArray34[local51], this.aShortArray33[local51]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local51 = 0; local51 < this.aShortArray31.length; local51++) {
				local46.method343(this.aShortArray31[local51], this.aShortArray32[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!pa;I)V")
	public void method1791(@OriginalArg(0) Class5_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1471();
			if (local9 == 0) {
				return;
			}
			this.method1789(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1792() {
		if (this.anIntArray336 == null) {
			return null;
		}
		@Pc(15) Class5_Sub2_Sub2_Sub1[] local15 = new Class5_Sub2_Sub2_Sub1[this.anIntArray336.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray336.length; local17++) {
			local15[local17] = Static15.method341(Static132.aClass26_32, this.anIntArray336[local17]);
		}
		@Pc(49) Class5_Sub2_Sub2_Sub1 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class5_Sub2_Sub2_Sub1(local15, local15.length);
		}
		@Pc(63) int local63;
		if (this.aShortArray34 != null) {
			for (local63 = 0; local63 < this.aShortArray34.length; local63++) {
				local49.method329(this.aShortArray34[local63], this.aShortArray33[local63]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local63 = 0; local63 < this.aShortArray31.length; local63++) {
				local49.method343(this.aShortArray31[local63], this.aShortArray32[local63]);
			}
		}
		return local49;
	}
}

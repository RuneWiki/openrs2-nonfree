import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!jc", name = "cb", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
	public int anInt1524 = -1;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "[I")
	private final int[] anIntArray155 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
	public boolean method1017() {
		if (this.anIntArray156 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray156.length; local14++) {
			if (!Static13.aClass20_9.method604(this.anIntArray156[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!jd;)V")
	public void method1019(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method719();
			if (local9 == 0) {
				return;
			}
			this.method1023(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
	public boolean method1020() {
		@Pc(1) boolean local1 = true;
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			if (this.anIntArray155[local3] != -1 && !Static13.aClass20_9.method604(this.anIntArray155[local3], 0)) {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method1022() {
		if (this.anIntArray156 == null) {
			return null;
		}
		@Pc(20) Class4_Sub1_Sub3_Sub4[] local20 = new Class4_Sub1_Sub3_Sub4[this.anIntArray156.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray156.length; local22++) {
			local20[local22] = Static86.method1524(Static13.aClass20_9, this.anIntArray156[local22]);
		}
		@Pc(48) Class4_Sub1_Sub3_Sub4 local48;
		if (local20.length == 1) {
			local48 = local20[0];
		} else {
			local48 = new Class4_Sub1_Sub3_Sub4(local20, local20.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray13 != null) {
			for (local62 = 0; local62 < this.aShortArray13.length; local62++) {
				local48.method1517(this.aShortArray13[local62], this.aShortArray15[local62]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local62 = 0; local62 < this.aShortArray16.length; local62++) {
				local48.method1537(this.aShortArray16[local62], this.aShortArray14[local62]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!jd;B)V")
	private void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1524 = arg1.method719();
			return;
		}
		@Pc(19) int local19;
		@Pc(25) int local25;
		if (arg0 == 2) {
			local19 = arg1.method719();
			this.anIntArray156 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray156[local25] = arg1.method718();
			}
		} else if (arg0 == 3) {
			this.aBoolean144 = true;
		} else if (arg0 == 40) {
			local19 = arg1.method719();
			this.aShortArray15 = new short[local19];
			this.aShortArray13 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray13[local25] = (short) arg1.method718();
				this.aShortArray15[local25] = (short) arg1.method718();
			}
		} else if (arg0 == 41) {
			local19 = arg1.method719();
			this.aShortArray14 = new short[local19];
			this.aShortArray16 = new short[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.aShortArray16[local25] = (short) arg1.method718();
				this.aShortArray14[local25] = (short) arg1.method718();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray155[arg0 - 60] = arg1.method718();
		}
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method1024() {
		@Pc(4) Class4_Sub1_Sub3_Sub4[] local4 = new Class4_Sub1_Sub3_Sub4[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray155[local12] != -1) {
				local4[local10++] = Static86.method1524(Static13.aClass20_9, this.anIntArray155[local12]);
			}
		}
		@Pc(42) Class4_Sub1_Sub3_Sub4 local42 = new Class4_Sub1_Sub3_Sub4(local4, local10);
		@Pc(47) int local47;
		if (this.aShortArray13 != null) {
			for (local47 = 0; local47 < this.aShortArray13.length; local47++) {
				local42.method1517(this.aShortArray13[local47], this.aShortArray15[local47]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local47 = 0; local47 < this.aShortArray16.length; local47++) {
				local42.method1537(this.aShortArray16[local47], this.aShortArray14[local47]);
			}
		}
		return local42;
	}
}

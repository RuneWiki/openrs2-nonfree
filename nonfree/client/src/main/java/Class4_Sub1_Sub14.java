import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt2752;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
	public int anInt2761;

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ta", name = "Ub", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ta", name = "Wb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "I")
	private int anInt2762 = 0;

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
	private int anInt2759 = 0;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	private int anInt2755 = 0;

	@OriginalMember(owner = "client!ta", name = "Ob", descriptor = "I")
	public int anInt2768 = -1;

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
	private int anInt2763 = 128;

	@OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
	private int anInt2764 = 128;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!jd;)V")
	public void method1786(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method719();
			if (local12 == 0) {
				return;
			}
			this.method1788(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILclient!jd;)V")
	private void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2752 = arg1.method718();
		} else if (arg0 == 2) {
			this.anInt2768 = arg1.method718();
		} else if (arg0 == 4) {
			this.anInt2764 = arg1.method718();
		} else if (arg0 == 5) {
			this.anInt2763 = arg1.method718();
		} else if (arg0 == 6) {
			this.anInt2755 = arg1.method718();
		} else if (arg0 == 7) {
			this.anInt2762 = arg1.method719();
		} else if (arg0 == 8) {
			this.anInt2759 = arg1.method719();
		} else {
			@Pc(74) int local74;
			@Pc(84) int local84;
			if (arg0 == 40) {
				local74 = arg1.method719();
				this.aShortArray37 = new short[local74];
				this.aShortArray36 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray37[local84] = (short) arg1.method718();
					this.aShortArray36[local84] = (short) arg1.method718();
				}
			} else if (arg0 == 41) {
				local74 = arg1.method719();
				this.aShortArray39 = new short[local74];
				this.aShortArray38 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray38[local84] = (short) arg1.method718();
					this.aShortArray39[local84] = (short) arg1.method718();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1790(@OriginalArg(1) int arg0) {
		@Pc(21) Class4_Sub1_Sub3_Sub3 local21 = (Class4_Sub1_Sub3_Sub3) Static41.aClass33_17.method998((long) this.anInt2761);
		if (local21 == null) {
			@Pc(29) Class4_Sub1_Sub3_Sub4 local29 = Static86.method1524(Static133.aClass20_62, this.anInt2752);
			if (local29 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray37 != null) {
				for (local38 = 0; local38 < this.aShortArray37.length; local38++) {
					local29.method1517(this.aShortArray37[local38], this.aShortArray36[local38]);
				}
			}
			if (this.aShortArray38 != null) {
				for (local38 = 0; local38 < this.aShortArray38.length; local38++) {
					local29.method1537(this.aShortArray38[local38], this.aShortArray39[local38]);
				}
			}
			local21 = local29.method1531(this.anInt2762 + 64, this.anInt2759 + 850, -30, -50, -30);
			Static41.aClass33_17.method997((long) this.anInt2761, local21);
		}
		@Pc(119) Class4_Sub1_Sub3_Sub3 local119;
		if (this.anInt2768 == -1 || arg0 == -1) {
			local119 = local21.method1490(true);
		} else {
			local119 = Static79.method1437(this.anInt2768).method1915(local21, arg0);
		}
		if (this.anInt2764 != 128 || this.anInt2763 != 128) {
			local119.method1475(this.anInt2764, this.anInt2763, this.anInt2764);
		}
		if (this.anInt2755 != 0) {
			if (this.anInt2755 == 90) {
				local119.method1471();
			}
			if (this.anInt2755 == 180) {
				local119.method1471();
				local119.method1471();
			}
			if (this.anInt2755 == 270) {
				local119.method1471();
				local119.method1471();
				local119.method1471();
			}
		}
		return local119;
	}
}

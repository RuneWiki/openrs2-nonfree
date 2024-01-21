import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ec", name = "Db", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!ec", name = "Ub", descriptor = "I")
	public int anInt1024;

	@OriginalMember(owner = "client!ec", name = "Fb", descriptor = "I")
	private int anInt1017 = 0;

	@OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
	private int anInt1018 = 0;

	@OriginalMember(owner = "client!ec", name = "Pb", descriptor = "I")
	private int anInt1021 = 128;

	@OriginalMember(owner = "client!ec", name = "xb", descriptor = "I")
	public int anInt1013 = -1;

	@OriginalMember(owner = "client!ec", name = "Tb", descriptor = "[I")
	private final int[] anIntArray109 = new int[6];

	@OriginalMember(owner = "client!ec", name = "Sb", descriptor = "I")
	private int anInt1023 = 0;

	@OriginalMember(owner = "client!ec", name = "Xb", descriptor = "I")
	private int anInt1025 = 128;

	@OriginalMember(owner = "client!ec", name = "Wb", descriptor = "[I")
	private final int[] anIntArray110 = new int[6];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLclient!ba;)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt1016 = arg1.method792();
		} else if (arg0 == 2) {
			this.anInt1013 = arg1.method792();
		} else if (arg0 == 4) {
			this.anInt1021 = arg1.method792();
		} else if (arg0 == 5) {
			this.anInt1025 = arg1.method792();
		} else if (arg0 == 6) {
			this.anInt1023 = arg1.method792();
		} else if (arg0 == 7) {
			this.anInt1018 = arg1.method791();
		} else if (arg0 == 8) {
			this.anInt1017 = arg1.method791();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray109[arg0 - 40] = arg1.method792();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray110[arg0 - 50] = arg1.method792();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method715(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub1_Sub1_Sub5 local13 = (Class2_Sub1_Sub1_Sub5) Static62.aClass11_15.method431((long) this.anInt1024);
		if (local13 == null) {
			local13 = Static75.method1431(Static64.aClass8_21, this.anInt1016);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray109[0] != 0) {
					local13.method1404(this.anIntArray109[local27], this.anIntArray110[local27]);
				}
			}
			local13.method1411();
			local13.method1403(this.anInt1018 + 64, this.anInt1017 + 850, -30, -50, -30, true);
			Static62.aClass11_15.method430((long) this.anInt1024, local13);
		}
		@Pc(94) Class2_Sub1_Sub1_Sub5 local94;
		if (this.anInt1013 == -1 || arg0 == -1) {
			local94 = local13.method1407(true);
		} else {
			local94 = Static4.method192(this.anInt1013).method984(local13, arg0);
		}
		if (this.anInt1021 != 128 || this.anInt1025 != 128) {
			local94.method1422(this.anInt1021, this.anInt1025, this.anInt1021);
		}
		if (this.anInt1023 != 0) {
			if (this.anInt1023 == 90) {
				local94.method1414();
			}
			if (this.anInt1023 == 180) {
				local94.method1414();
				local94.method1414();
			}
			if (this.anInt1023 == 270) {
				local94.method1414();
				local94.method1414();
				local94.method1414();
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ba;B)V")
	public void method717(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method713(local9, arg0);
		}
	}
}

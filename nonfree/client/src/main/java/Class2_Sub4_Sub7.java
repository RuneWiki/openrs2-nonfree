import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class2_Sub4_Sub7 extends Class2_Sub4 {

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
	public int anInt1226;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
	private int anInt1229;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
	private int anInt1227 = 0;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	private int anInt1225 = 128;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	public int anInt1224 = -1;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
	private int anInt1233 = 0;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
	private int anInt1234 = 128;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	private int anInt1232 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ab;I)V")
	public void method889(@OriginalArg(0) Class2_Sub2 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1698();
			if (local11 == 0) {
				return;
			}
			this.method891(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!ab;)V")
	private void method891(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt1229 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt1224 = arg1.method1680();
		} else if (arg0 == 4) {
			this.anInt1234 = arg1.method1680();
		} else if (arg0 == 5) {
			this.anInt1225 = arg1.method1680();
		} else if (arg0 == 6) {
			this.anInt1227 = arg1.method1680();
		} else if (arg0 == 7) {
			this.anInt1232 = arg1.method1698();
		} else if (arg0 == 8) {
			this.anInt1233 = arg1.method1698();
		} else {
			@Pc(61) int local61;
			@Pc(71) int local71;
			if (arg0 == 40) {
				local61 = arg1.method1698();
				this.aShortArray16 = new short[local61];
				this.aShortArray14 = new short[local61];
				for (local71 = 0; local71 < local61; local71++) {
					this.aShortArray14[local71] = (short) arg1.method1680();
					this.aShortArray16[local71] = (short) arg1.method1680();
				}
			} else if (arg0 == 41) {
				local61 = arg1.method1698();
				this.aShortArray15 = new short[local61];
				this.aShortArray13 = new short[local61];
				for (local71 = 0; local71 < local61; local71++) {
					this.aShortArray15[local71] = (short) arg1.method1680();
					this.aShortArray13[local71] = (short) arg1.method1680();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method892(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub4_Sub1_Sub3 local9 = (Class2_Sub4_Sub1_Sub3) Static49.aClass14_75.method603((long) this.anInt1226);
		if (local9 == null) {
			@Pc(21) Class2_Sub4_Sub1_Sub5 local21 = Static86.method1530(Static88.aClass40_27, this.anInt1229);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray14 != null) {
				for (local30 = 0; local30 < this.aShortArray14.length; local30++) {
					local21.method1531(this.aShortArray14[local30], this.aShortArray16[local30]);
				}
			}
			if (this.aShortArray15 != null) {
				for (local30 = 0; local30 < this.aShortArray15.length; local30++) {
					local21.method1537(this.aShortArray15[local30], this.aShortArray13[local30]);
				}
			}
			local9 = local21.method1544(this.anInt1232 + 64, this.anInt1233 + 850, -30, -50, -30, true);
			Static49.aClass14_75.method607((long) this.anInt1226, local9);
		}
		@Pc(114) Class2_Sub4_Sub1_Sub3 local114;
		if (this.anInt1224 == -1 || arg0 == -1) {
			local114 = local9.method1194(true);
		} else {
			local114 = Static49.method926(this.anInt1224).method316(local9, arg0);
		}
		if (this.anInt1234 != 128 || this.anInt1225 != 128) {
			local114.method1189(this.anInt1234, this.anInt1225, this.anInt1234);
		}
		if (this.anInt1227 != 0) {
			if (this.anInt1227 == 90) {
				local114.method1195();
			}
			if (this.anInt1227 == 180) {
				local114.method1195();
				local114.method1195();
			}
			if (this.anInt1227 == 270) {
				local114.method1195();
				local114.method1195();
				local114.method1195();
			}
		}
		return local114;
	}
}

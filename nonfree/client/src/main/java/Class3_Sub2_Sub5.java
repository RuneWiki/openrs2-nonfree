import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	private int anInt1289;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	public int anInt1291;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	private int anInt1281 = 128;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
	private int anInt1282 = 0;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
	private int anInt1290 = 128;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	public int anInt1284 = -1;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	private int anInt1287 = 0;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	private int anInt1294 = 0;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method933(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub2_Sub1_Sub2 local18 = (Class3_Sub2_Sub1_Sub2) Static97.aClass57_14.method1719((long) this.anInt1291);
		if (local18 == null) {
			@Pc(26) Class3_Sub2_Sub1_Sub6 local26 = Static115.method1944(Static93.aClass44_16, this.anInt1289);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray4 != null) {
				for (local35 = 0; local35 < this.aShortArray4.length; local35++) {
					local26.method1954(this.aShortArray4[local35], this.aShortArray1[local35]);
				}
			}
			if (this.aShortArray2 != null) {
				for (local35 = 0; local35 < this.aShortArray2.length; local35++) {
					local26.method1933(this.aShortArray2[local35], this.aShortArray3[local35]);
				}
			}
			local18 = local26.method1938(this.anInt1282 + 64, this.anInt1287 + 850, -30, -50, -30, true);
			Static97.aClass57_14.method1717(local18, (long) this.anInt1291);
		}
		@Pc(117) Class3_Sub2_Sub1_Sub2 local117;
		if (this.anInt1284 == -1 || arg0 == -1) {
			local117 = local18.method1793(true);
		} else {
			local117 = Static35.method628(this.anInt1284).method598(arg0, local18);
		}
		if (this.anInt1281 != 128 || this.anInt1290 != 128) {
			local117.method1799(this.anInt1281, this.anInt1290, this.anInt1281);
		}
		if (this.anInt1294 != 0) {
			if (this.anInt1294 == 90) {
				local117.method1786();
			}
			if (this.anInt1294 == 180) {
				local117.method1786();
				local117.method1786();
			}
			if (this.anInt1294 == 270) {
				local117.method1786();
				local117.method1786();
				local117.method1786();
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method935(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1289 = arg0.method208();
		} else if (arg1 == 2) {
			this.anInt1284 = arg0.method208();
		} else if (arg1 == 4) {
			this.anInt1281 = arg0.method208();
		} else if (arg1 == 5) {
			this.anInt1290 = arg0.method208();
		} else if (arg1 == 6) {
			this.anInt1294 = arg0.method208();
		} else if (arg1 == 7) {
			this.anInt1282 = arg0.method191();
		} else if (arg1 == 8) {
			this.anInt1287 = arg0.method191();
		} else {
			@Pc(67) int local67;
			@Pc(77) int local77;
			if (arg1 == 40) {
				local67 = arg0.method191();
				this.aShortArray4 = new short[local67];
				this.aShortArray1 = new short[local67];
				for (local77 = 0; local77 < local67; local77++) {
					this.aShortArray4[local77] = (short) arg0.method208();
					this.aShortArray1[local77] = (short) arg0.method208();
				}
			} else if (arg1 == 41) {
				local67 = arg0.method191();
				this.aShortArray2 = new short[local67];
				this.aShortArray3 = new short[local67];
				for (local77 = 0; local77 < local67; local77++) {
					this.aShortArray2[local77] = (short) arg0.method208();
					this.aShortArray3[local77] = (short) arg0.method208();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method936(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method191();
			if (local9 == 0) {
				return;
			}
			this.method935(arg0, local9);
		}
	}
}

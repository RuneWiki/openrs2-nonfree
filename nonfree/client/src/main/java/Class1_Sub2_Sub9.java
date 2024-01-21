import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	private int anInt1261;

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt1260 = 128;

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
	private int anInt1265 = 128;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
	private int anInt1262 = 0;

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "I")
	public int anInt1270 = -1;

	@OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
	private int anInt1269 = 0;

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
	private int anInt1268 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!wa;I)V")
	private void method821(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt1261 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt1270 = arg1.method1753();
		} else if (arg0 == 4) {
			this.anInt1260 = arg1.method1753();
		} else if (arg0 == 5) {
			this.anInt1265 = arg1.method1753();
		} else if (arg0 == 6) {
			this.anInt1262 = arg1.method1753();
		} else if (arg0 == 7) {
			this.anInt1269 = arg1.method1738();
		} else if (arg0 == 8) {
			this.anInt1268 = arg1.method1738();
		} else if (arg0 == 9) {
			this.aBoolean52 = true;
		} else {
			@Pc(75) int local75;
			@Pc(85) int local85;
			if (arg0 == 40) {
				local75 = arg1.method1738();
				this.aShortArray22 = new short[local75];
				this.aShortArray23 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray23[local85] = (short) arg1.method1753();
					this.aShortArray22[local85] = (short) arg1.method1753();
				}
				return;
			}
			if (arg0 == 41) {
				local75 = arg1.method1738();
				this.aShortArray21 = new short[local75];
				this.aShortArray24 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray21[local85] = (short) arg1.method1753();
					this.aShortArray24[local85] = (short) arg1.method1753();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)Lclient!bf;")
	public Class6_Sub3 method823(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub3 local9 = (Class6_Sub3) Static63.aClass67_2.method2570((long) this.anInt1267);
		if (local9 == null) {
			@Pc(21) Class6_Sub1 local21 = Static10.method193(Static158.aClass60_31, this.anInt1261);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray23 != null) {
				for (local30 = 0; local30 < this.aShortArray23.length; local30++) {
					local21.method199(this.aShortArray23[local30], this.aShortArray22[local30]);
				}
			}
			if (this.aShortArray21 != null) {
				for (local30 = 0; local30 < this.aShortArray21.length; local30++) {
					local21.method192(this.aShortArray21[local30], this.aShortArray24[local30]);
				}
			}
			local9 = local21.method184(this.anInt1269 + 64, this.anInt1268 + 850, -30, -50, -30);
			Static63.aClass67_2.method2567(local9, (long) this.anInt1267);
		}
		@Pc(103) Class6_Sub3 local103;
		if (this.anInt1270 == -1 || arg0 == -1) {
			local103 = local9.method1169(true);
		} else {
			local103 = Static173.method2924(this.anInt1270).method1882(arg0, local9);
		}
		if (this.anInt1260 != 128 || this.anInt1265 != 128) {
			local103.method1185(this.anInt1260, this.anInt1265, this.anInt1260);
		}
		if (this.anInt1262 != 0) {
			if (this.anInt1262 == 90) {
				local103.method1177();
			}
			if (this.anInt1262 == 180) {
				local103.method1174();
			}
			if (this.anInt1262 == 270) {
				local103.method1178();
			}
		}
		return local103;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wa;I)V")
	public void method825(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1738();
			if (local13 == 0) {
				return;
			}
			this.method821(local13, arg0);
		}
	}
}

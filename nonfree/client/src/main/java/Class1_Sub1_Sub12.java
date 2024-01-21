import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
	public int anInt2336;

	@OriginalMember(owner = "client!qa", name = "ib", descriptor = "I")
	private int anInt2341;

	@OriginalMember(owner = "client!qa", name = "ob", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!qa", name = "qb", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
	private int anInt2339 = 128;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
	private int anInt2338 = 0;

	@OriginalMember(owner = "client!qa", name = "gb", descriptor = "I")
	private int anInt2340 = 0;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
	private int anInt2346 = 128;

	@OriginalMember(owner = "client!qa", name = "Eb", descriptor = "I")
	public int anInt2351 = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1643(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub1_Sub1_Sub6 local9 = (Class1_Sub1_Sub1_Sub6) Static38.aClass60_88.method1745((long) this.anInt2336);
		if (local9 == null) {
			@Pc(26) Class1_Sub1_Sub1_Sub7 local26 = Static113.method1911(Static36.aClass5_29, this.anInt2341);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray72 != null) {
				for (local35 = 0; local35 < this.aShortArray72.length; local35++) {
					local26.method1914(this.aShortArray72[local35], this.aShortArray71[local35]);
				}
			}
			if (this.aShortArray73 != null) {
				for (local35 = 0; local35 < this.aShortArray73.length; local35++) {
					local26.method1915(this.aShortArray73[local35], this.aShortArray74[local35]);
				}
			}
			local9 = local26.method1899(this.anInt2347 + 64, 850 - -this.anInt2338, -30, -50, -30);
			Static38.aClass60_88.method1741((long) this.anInt2336, local9);
		}
		@Pc(114) Class1_Sub1_Sub1_Sub6 local114;
		if (this.anInt2351 == -1 || arg0 == -1) {
			local114 = local9.method1333(true);
		} else {
			local114 = Static56.method1247(this.anInt2351).method1874(local9, arg0);
		}
		if (this.anInt2346 != 128 || this.anInt2339 != 128) {
			local114.method1329(this.anInt2346, this.anInt2339, this.anInt2346);
		}
		if (this.anInt2340 != 0) {
			if (this.anInt2340 == 90) {
				local114.method1340();
			}
			if (this.anInt2340 == 180) {
				local114.method1340();
				local114.method1340();
			}
			if (this.anInt2340 == 270) {
				local114.method1340();
				local114.method1340();
				local114.method1340();
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!mc;)V")
	public void method1644(@OriginalArg(1) Class1_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1190();
			if (local5 == 0) {
				return;
			}
			this.method1647(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2341 = arg1.method1176();
		} else if (arg0 == 2) {
			this.anInt2351 = arg1.method1176();
		} else if (arg0 == 4) {
			this.anInt2346 = arg1.method1176();
		} else if (arg0 == 5) {
			this.anInt2339 = arg1.method1176();
		} else if (arg0 == 6) {
			this.anInt2340 = arg1.method1176();
		} else if (arg0 == 7) {
			this.anInt2347 = arg1.method1190();
		} else if (arg0 == 8) {
			this.anInt2338 = arg1.method1190();
		} else {
			@Pc(75) int local75;
			@Pc(85) int local85;
			if (arg0 == 40) {
				local75 = arg1.method1190();
				this.aShortArray72 = new short[local75];
				this.aShortArray71 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray72[local85] = (short) arg1.method1176();
					this.aShortArray71[local85] = (short) arg1.method1176();
				}
			} else if (arg0 == 41) {
				local75 = arg1.method1190();
				this.aShortArray73 = new short[local75];
				this.aShortArray74 = new short[local75];
				for (local85 = 0; local85 < local75; local85++) {
					this.aShortArray73[local85] = (short) arg1.method1176();
					this.aShortArray74[local85] = (short) arg1.method1176();
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public int anInt1860;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	private int anInt1861 = 0;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt1858 = 128;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	private int anInt1857 = 0;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	private int anInt1865 = 128;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
	private int anInt1867 = 0;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
	public int anInt1862 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!oa;)V")
	public void method1340(@OriginalArg(1) Class2_Sub18 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2387();
			if (local13 == 0) {
				return;
			}
			this.method1341(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILclient!oa;)V")
	private void method1341(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt1869 = arg1.method2353();
		} else if (arg0 == 2) {
			this.anInt1862 = arg1.method2353();
		} else if (arg0 == 4) {
			this.anInt1858 = arg1.method2353();
		} else if (arg0 == 5) {
			this.anInt1865 = arg1.method2353();
		} else if (arg0 == 6) {
			this.anInt1867 = arg1.method2353();
		} else if (arg0 == 7) {
			this.anInt1857 = arg1.method2387();
		} else if (arg0 == 8) {
			this.anInt1861 = arg1.method2387();
		} else {
			@Pc(59) int local59;
			@Pc(69) int local69;
			if (arg0 == 40) {
				local59 = arg1.method2387();
				this.aShortArray63 = new short[local59];
				this.aShortArray66 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray63[local69] = (short) arg1.method2353();
					this.aShortArray66[local69] = (short) arg1.method2353();
				}
			} else if (arg0 == 41) {
				local59 = arg1.method2387();
				this.aShortArray65 = new short[local59];
				this.aShortArray64 = new short[local59];
				for (local69 = 0; local69 < local59; local69++) {
					this.aShortArray64[local69] = (short) arg1.method2353();
					this.aShortArray65[local69] = (short) arg1.method2353();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method1342(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub1_Sub2 local16 = (Class2_Sub2_Sub1_Sub2) Static80.aClass82_33.method2699((long) this.anInt1860);
		if (local16 == null) {
			@Pc(24) Class2_Sub2_Sub1_Sub3 local24 = Static47.method877(Static80.aClass43_22, this.anInt1869);
			if (local24 == null) {
				return null;
			}
			@Pc(33) int local33;
			if (this.aShortArray63 != null) {
				for (local33 = 0; local33 < this.aShortArray63.length; local33++) {
					local24.method864(this.aShortArray63[local33], this.aShortArray66[local33]);
				}
			}
			if (this.aShortArray64 != null) {
				for (local33 = 0; local33 < this.aShortArray64.length; local33++) {
					local24.method880(this.aShortArray64[local33], this.aShortArray65[local33]);
				}
			}
			local16 = local24.method865(this.anInt1857 + 64, this.anInt1861 + 850, -30, -50, -30, true);
			Static80.aClass82_33.method2701((long) this.anInt1860, local16);
		}
		@Pc(116) Class2_Sub2_Sub1_Sub2 local116;
		if (this.anInt1862 == -1 || arg0 == -1) {
			local116 = local16.method587(true);
		} else {
			local116 = Static140.method2333(this.anInt1862).method2588(local16, arg0);
		}
		if (this.anInt1858 != 128 || this.anInt1865 != 128) {
			local116.method597(this.anInt1858, this.anInt1865, this.anInt1858);
		}
		if (this.anInt1867 != 0) {
			if (this.anInt1867 == 90) {
				local116.method586();
			}
			if (this.anInt1867 == 180) {
				local116.method586();
				local116.method586();
			}
			if (this.anInt1867 == 270) {
				local116.method586();
				local116.method586();
				local116.method586();
			}
		}
		return local116;
	}
}

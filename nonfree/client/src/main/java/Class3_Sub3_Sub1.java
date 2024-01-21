import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public int anInt112;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	private int anInt103 = 128;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public int anInt106 = -1;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
	private int anInt100 = 0;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	private int anInt109 = 0;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
	private int anInt114 = 128;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	private int anInt113 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Lclient!wa;")
	public Class26_Sub6 method89(@OriginalArg(1) int arg0) {
		@Pc(15) Class26_Sub6 local15 = (Class26_Sub6) Static42.aClass94_2.method3153((long) this.anInt112);
		if (local15 == null) {
			@Pc(23) Class26_Sub5 local23 = Static128.method1788(Static153.aClass52_34, this.anInt107);
			if (local23 == null) {
				return null;
			}
			@Pc(32) int local32;
			if (this.aShortArray3 != null) {
				for (local32 = 0; local32 < this.aShortArray3.length; local32++) {
					local23.method1779(this.aShortArray3[local32], this.aShortArray4[local32]);
				}
			}
			if (this.aShortArray2 != null) {
				for (local32 = 0; local32 < this.aShortArray2.length; local32++) {
					local23.method1793(this.aShortArray2[local32], this.aShortArray1[local32]);
				}
			}
			local15 = local23.method1798(this.anInt100 + 64, 850 - -this.anInt113, -30, -50, -30);
			Static42.aClass94_2.method3154((long) this.anInt112, local15);
		}
		@Pc(112) Class26_Sub6 local112;
		if (this.anInt106 == -1 || arg0 == -1) {
			local112 = local15.method2524(true);
		} else {
			local112 = Static11.method254(this.anInt106).method1920(arg0, local15);
		}
		if (this.anInt114 != 128 || this.anInt103 != 128) {
			local112.method2536(this.anInt114, this.anInt103, this.anInt114);
		}
		if (this.anInt109 != 0) {
			if (this.anInt109 == 90) {
				local112.method2531();
			}
			if (this.anInt109 == 180) {
				local112.method2528();
			}
			if (this.anInt109 == 270) {
				local112.method2526();
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ce;BI)V")
	private void method90(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt107 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt106 = arg0.method1270();
		} else if (arg1 == 4) {
			this.anInt114 = arg0.method1270();
		} else if (arg1 == 5) {
			this.anInt103 = arg0.method1270();
		} else if (arg1 == 6) {
			this.anInt109 = arg0.method1270();
		} else if (arg1 == 7) {
			this.anInt100 = arg0.method1278();
		} else if (arg1 == 8) {
			this.anInt113 = arg0.method1278();
		} else if (arg1 == 9) {
			this.aBoolean8 = true;
		} else {
			@Pc(72) int local72;
			@Pc(82) int local82;
			if (arg1 == 40) {
				local72 = arg0.method1278();
				this.aShortArray3 = new short[local72];
				this.aShortArray4 = new short[local72];
				for (local82 = 0; local82 < local72; local82++) {
					this.aShortArray3[local82] = (short) arg0.method1270();
					this.aShortArray4[local82] = (short) arg0.method1270();
				}
			} else if (arg1 == 41) {
				local72 = arg0.method1278();
				this.aShortArray2 = new short[local72];
				this.aShortArray1 = new short[local72];
				for (local82 = 0; local82 < local72; local82++) {
					this.aShortArray2[local82] = (short) arg0.method1270();
					this.aShortArray1[local82] = (short) arg0.method1270();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!ce;)V")
	public void method91(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1278();
			if (local7 == 0) {
				return;
			}
			this.method90(arg0, local7);
		}
	}
}

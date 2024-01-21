import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	public int anInt2838 = -1;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
	private int anInt2842 = 128;

	@OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
	private int anInt2843 = 0;

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	private int anInt2844 = 0;

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
	private int anInt2849 = 0;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
	private int anInt2851 = 128;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!og;)V")
	public void method2260(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method218();
			if (local14 == 0) {
				return;
			}
			this.method2266(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method2261(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub1_Sub1_Sub4 local18 = (Class2_Sub1_Sub1_Sub4) Static47.aClass89_38.method3437((long) this.anInt2847);
		if (local18 == null) {
			@Pc(26) Class2_Sub1_Sub1_Sub1 local26 = Static23.method578(Static147.aClass13_33, this.anInt2846);
			if (local26 == null) {
				return null;
			}
			@Pc(35) int local35;
			if (this.aShortArray50 != null) {
				for (local35 = 0; local35 < this.aShortArray50.length; local35++) {
					local26.method588(this.aShortArray50[local35], this.aShortArray52[local35]);
				}
			}
			if (this.aShortArray49 != null) {
				for (local35 = 0; local35 < this.aShortArray49.length; local35++) {
					local26.method576(this.aShortArray49[local35], this.aShortArray51[local35]);
				}
			}
			local18 = local26.method595(this.anInt2844 + 64, this.anInt2849 + 850, -30, -50, -30);
			Static47.aClass89_38.method3432(local18, (long) this.anInt2847);
		}
		@Pc(115) Class2_Sub1_Sub1_Sub4 local115;
		if (this.anInt2838 == -1 || arg0 == -1) {
			local115 = local18.method1619(true);
		} else {
			local115 = Static103.method2357(this.anInt2838).method643(local18, arg0);
		}
		if (this.anInt2842 != 128 || this.anInt2851 != 128) {
			local115.method1611(this.anInt2842, this.anInt2851, this.anInt2842);
		}
		if (this.anInt2843 != 0) {
			if (this.anInt2843 == 90) {
				local115.method1617();
			}
			if (this.anInt2843 == 180) {
				local115.method1620();
			}
			if (this.anInt2843 == 270) {
				local115.method1612();
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!og;I)V")
	private void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt2846 = arg1.method234();
		} else if (arg0 == 2) {
			this.anInt2838 = arg1.method234();
		} else if (arg0 == 4) {
			this.anInt2842 = arg1.method234();
		} else if (arg0 == 5) {
			this.anInt2851 = arg1.method234();
		} else if (arg0 == 6) {
			this.anInt2843 = arg1.method234();
		} else if (arg0 == 7) {
			this.anInt2844 = arg1.method218();
		} else if (arg0 == 8) {
			this.anInt2849 = arg1.method218();
		} else if (arg0 == 9) {
			this.aBoolean110 = true;
		} else {
			@Pc(65) int local65;
			@Pc(75) int local75;
			if (arg0 == 40) {
				local65 = arg1.method218();
				this.aShortArray50 = new short[local65];
				this.aShortArray52 = new short[local65];
				for (local75 = 0; local75 < local65; local75++) {
					this.aShortArray50[local75] = (short) arg1.method234();
					this.aShortArray52[local75] = (short) arg1.method234();
				}
			} else if (arg0 == 41) {
				local65 = arg1.method218();
				this.aShortArray49 = new short[local65];
				this.aShortArray51 = new short[local65];
				for (local75 = 0; local75 < local65; local75++) {
					this.aShortArray49[local75] = (short) arg1.method234();
					this.aShortArray51[local75] = (short) arg1.method234();
				}
				return;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class96 {

	@OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
	public int anInt2942;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!hp;")
	private final Class125 aClass125_23 = new Class125(64);

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!hp;")
	public final Class125 aClass125_25 = new Class125(50);

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Lclient!jda;")
	public final Class146 aClass146_1 = new Class146(250);

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Lclient!ok;")
	private final Class218 aClass218_1 = new Class218();

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "Lclient!hg;")
	private final Class121 aClass121_2;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!kea;")
	private final Class161 aClass161_32;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!kea;")
	public final Class161 aClass161_31;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
	public final int anInt2936;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
	public final int anInt2928;

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!cda;IZLclient!hg;Lclient!kea;Lclient!kea;)V")
	public Class96(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) Class161 arg5) {
		this.aClass121_2 = arg3;
		this.aClass161_32 = arg4;
		this.aClass161_31 = arg5;
		this.anInt2936 = arg1;
		this.aBoolean214 = arg2;
		if (this.aClass161_32 == null) {
			this.anInt2928 = 0;
		} else {
			@Pc(49) int local49 = this.aClass161_32.method4239() - 1;
			this.anInt2928 = local49 * 256 + this.aClass161_32.method4266(local49);
		}
		this.aStringArray19 = new String[] { null, null, Static301.aClass67_93.method1934(this.anInt2936), null, null };
		this.aStringArray20 = new String[] { null, null, null, null, Static435.aClass67_129.method1934(this.anInt2936) };
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
	public void method2497(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean214) {
			this.aBoolean214 = arg0;
			this.method2501();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)V")
	public void method2498(@OriginalArg(1) int arg0) {
		this.anInt2942 = arg0;
		@Pc(13) Class125 local13 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3521();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public void method2499() {
		@Pc(6) Class146 local6 = this.aClass146_1;
		synchronized (this.aClass146_1) {
			this.aClass146_1.method4008();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	public void method2500() {
		@Pc(12) Class125 local12 = this.aClass125_23;
		synchronized (this.aClass125_23) {
			this.aClass125_23.method3516();
		}
		local12 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3516();
		}
		@Pc(42) Class146 local42 = this.aClass146_1;
		synchronized (this.aClass146_1) {
			this.aClass146_1.method3999();
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	public void method2501() {
		@Pc(6) Class125 local6 = this.aClass125_23;
		synchronized (this.aClass125_23) {
			this.aClass125_23.method3521();
		}
		local6 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3521();
		}
		@Pc(42) Class146 local42 = this.aClass146_1;
		synchronized (this.aClass146_1) {
			this.aClass146_1.method4008();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!oa;Lclient!vv;Lclient!oa;ZIIIZBIILclient!ta;)Lclient!xa;")
	public Class119 method2502(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class59 arg10) {
		@Pc(16) Class119 local16 = this.method2506(arg1, arg5, arg8, arg6, arg9, arg4, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class27 local25 = this.method2508(arg4);
		if (arg5 > 1 && local25.anIntArray133 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray131[local37] <= arg5 && local25.anIntArray131[local37] != 0) {
					local35 = local25.anIntArray133[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method2508(local35);
			}
		}
		@Pc(93) int[] local93 = local25.method814(arg0, arg9, arg5, arg6, arg1, arg2, arg8, arg10, arg3);
		if (local93 == null) {
			return null;
		}
		@Pc(107) Class119 local107;
		if (arg7) {
			local107 = arg0.method7483(local93, 36, 36, 32);
		} else {
			local107 = arg2.method7483(local93, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(123) Class218 local123 = new Class218();
			local123.anInt6645 = arg4;
			local123.anInt6643 = arg6;
			local123.anInt6636 = arg8;
			local123.anInt6640 = arg9;
			local123.aBoolean422 = arg1 != null;
			local123.anInt6639 = arg2.anInt9037;
			local123.anInt6638 = arg5;
			this.aClass146_1.method4004(local123, local107);
		}
		return local107;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	public void method2504() {
		@Pc(2) Class125 local2 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3521();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!vv;IIIIIILclient!oa;)Lclient!xa;")
	public Class119 method2506(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5 arg6) {
		this.aClass218_1.anInt6645 = arg5;
		this.aClass218_1.anInt6643 = arg3;
		this.aClass218_1.anInt6638 = arg1;
		this.aClass218_1.anInt6636 = arg2;
		this.aClass218_1.aBoolean422 = arg0 != null;
		this.aClass218_1.anInt6640 = arg4;
		this.aClass218_1.anInt6639 = arg6.anInt9037;
		return (Class119) this.aClass146_1.method4002(this.aClass218_1);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
	public void method2507() {
		@Pc(6) Class125 local6 = this.aClass125_23;
		synchronized (this.aClass125_23) {
			this.aClass125_23.method3522(5);
		}
		local6 = this.aClass125_25;
		synchronized (this.aClass125_25) {
			this.aClass125_25.method3522(5);
		}
		@Pc(46) Class146 local46 = this.aClass146_1;
		synchronized (this.aClass146_1) {
			this.aClass146_1.method4003();
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)Lclient!bea;")
	public Class27 method2508(@OriginalArg(0) int arg0) {
		@Pc(8) Class125 local8 = this.aClass125_23;
		@Pc(18) Class27 local18;
		synchronized (this.aClass125_23) {
			local18 = (Class27) this.aClass125_23.method3512((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class161 local31 = this.aClass161_32;
		@Pc(44) byte[] local44;
		synchronized (this.aClass161_32) {
			local44 = this.aClass161_32.method4243(Static407.method6162(arg0), Static469.method7006(arg0));
		}
		local18 = new Class27();
		local18.aClass96_1 = this;
		local18.anInt834 = arg0;
		local18.aStringArray6 = new String[] { null, null, Static301.aClass67_93.method1934(this.anInt2936), null, null };
		local18.aStringArray5 = new String[] { null, null, null, null, Static435.aClass67_129.method1934(this.anInt2936) };
		if (local44 != null) {
			local18.method827(new Class3_Sub27(local44));
		}
		local18.method819();
		if (local18.anInt847 != -1) {
			local18.method816(this.method2508(local18.anInt847), this.method2508(local18.anInt844));
		}
		if (local18.anInt868 != -1) {
			local18.method823(this.method2508(local18.anInt841), this.method2508(local18.anInt868));
		}
		if (!this.aBoolean214 && local18.aBoolean67) {
			local18.aString8 = Static24.aClass67_10.method1934(this.anInt2936);
			local18.anIntArray132 = null;
			local18.aStringArray5 = this.aStringArray20;
			local18.aStringArray6 = this.aStringArray19;
			local18.anInt809 = 0;
			local18.aBoolean68 = false;
			if (local18.aClass267_2 != null) {
				@Pc(203) boolean local203 = false;
				for (@Pc(208) Class3 local208 = local18.aClass267_2.method6643(); local208 != null; local208 = local18.aClass267_2.method6650()) {
					@Pc(218) Class244 local218 = this.aClass121_2.method3431((int) local208.aLong285);
					if (local218.aBoolean494) {
						local208.method7820();
					} else {
						local203 = true;
					}
				}
				if (!local203) {
					local18.aClass267_2 = null;
				}
			}
		}
		@Pc(243) Class125 local243 = this.aClass125_23;
		synchronized (this.aClass125_23) {
			this.aClass125_23.method3519((long) arg0, local18);
			return local18;
		}
	}
}

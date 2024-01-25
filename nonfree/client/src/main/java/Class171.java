import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class171 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!cn;")
	private final Class44 aClass44_6 = new Class44();

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	private int anInt4881;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	private final int anInt4882;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "Lclient!mn;")
	private final Class163 aClass163_32;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V")
	public Class171(@OriginalArg(0) int arg0) {
		this.anInt4881 = arg0;
		this.anInt4882 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass163_32 = new Class163(local14);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BJ)V")
	private void method3928(@OriginalArg(1) long arg0) {
		@Pc(15) Class2_Sub5_Sub2 local15 = (Class2_Sub5_Sub2) this.aClass163_32.method3769(arg0);
		this.method3942(local15);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method3929() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class2_Sub5_Sub2 local18 = (Class2_Sub5_Sub2) this.aClass44_6.method802(); local18 != null; local18 = (Class2_Sub5_Sub2) this.aClass44_6.method803()) {
			if (!local18.method1871()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3931() {
		@Pc(11) Class2_Sub5_Sub2 local11 = (Class2_Sub5_Sub2) this.aClass163_32.method3770();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method1877();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class2_Sub5_Sub2 local31 = local11;
			local11 = (Class2_Sub5_Sub2) this.aClass163_32.method3770();
			local31.method5866();
			local31.method5534();
			this.anInt4881 += local11.anInt2395;
		}
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I")
	public int method3932() {
		return this.anInt4882;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)V")
	public void method3933(@OriginalArg(1) int arg0) {
		if (Static30.aClass211_1 == null) {
			return;
		}
		for (@Pc(17) Class2_Sub5_Sub2 local17 = (Class2_Sub5_Sub2) this.aClass44_6.method802(); local17 != null; local17 = (Class2_Sub5_Sub2) this.aClass44_6.method803()) {
			if (local17.method1871()) {
				if (local17.method1877() == null) {
					local17.method5866();
					local17.method5534();
					this.anInt4881++;
				}
			} else if (++local17.aLong211 > (long) arg0) {
				@Pc(43) Class2_Sub5_Sub2 local43 = Static30.aClass211_1.method5041(local17);
				this.aClass163_32.method3764(local17.aLong227, local43);
				Static377.method5066(local43, local17);
				local17.method5866();
				local17.method5534();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public void method3934() {
		for (@Pc(7) Class2_Sub5_Sub2 local7 = (Class2_Sub5_Sub2) this.aClass44_6.method802(); local7 != null; local7 = (Class2_Sub5_Sub2) this.aClass44_6.method803()) {
			if (local7.method1871()) {
				local7.method5866();
				local7.method5534();
				this.anInt4881 += local7.anInt2395;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	private void method3935(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt4882 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3928(arg0);
		this.anInt4881--;
		while (this.anInt4881 < 0) {
			@Pc(38) Class2_Sub5_Sub2 local38 = (Class2_Sub5_Sub2) this.aClass44_6.method800();
			this.method3942(local38);
		}
		@Pc(51) Class2_Sub5_Sub2_Sub2 local51 = new Class2_Sub5_Sub2_Sub2(arg1, 1);
		this.aClass163_32.method3764(arg0, local51);
		this.aClass44_6.method799(local51);
		local51.aLong211 = 0;
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V")
	public void method3936() {
		this.aClass44_6.method807();
		this.aClass163_32.method3767();
		this.anInt4881 = this.anInt4882;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)I")
	public int method3937() {
		return this.anInt4881;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3939() {
		@Pc(11) Class2_Sub5_Sub2 local11 = (Class2_Sub5_Sub2) this.aClass163_32.method3771();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method1877();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class2_Sub5_Sub2 local21 = local11;
			local11 = (Class2_Sub5_Sub2) this.aClass163_32.method3770();
			local21.method5866();
			local21.method5534();
			this.anInt4881 += local11.anInt2395;
		}
		return null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLjava/lang/Object;Z)V")
	public void method3940(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method3935(arg0, arg1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(JZ)Ljava/lang/Object;")
	public Object method3941(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub5_Sub2 local10 = (Class2_Sub5_Sub2) this.aClass163_32.method3769(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method1877();
		if (local23 == null) {
			local10.method5866();
			local10.method5534();
			this.anInt4881 += local10.anInt2395;
			return null;
		}
		if (local10.method1871()) {
			@Pc(61) Class2_Sub5_Sub2_Sub2 local61 = new Class2_Sub5_Sub2_Sub2(local23, local10.anInt2395);
			this.aClass163_32.method3764(local10.aLong227, local61);
			this.aClass44_6.method799(local61);
			local61.aLong211 = 0L;
			local10.method5866();
			local10.method5534();
		} else {
			this.aClass44_6.method799(local10);
			local10.aLong211 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!ce;)V")
	private void method3942(@OriginalArg(1) Class2_Sub5_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method5866();
			arg0.method5534();
			this.anInt4881 += arg0.anInt2395;
		}
	}
}

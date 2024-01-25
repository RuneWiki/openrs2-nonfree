import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class77 {

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!mq;")
	private final Class163 aClass163_2 = new Class163();

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	private int anInt1686;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	private final int anInt1696;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!qi;")
	private final Class208 aClass208_8;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.anInt1686 = arg0;
		this.anInt1696 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass208_8 = new Class208(local14);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)V")
	private void method1384(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub3_Sub5 local17 = (Class1_Sub3_Sub5) this.aClass208_8.method4405(arg0);
		this.method1391(local17);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1385() {
		@Pc(17) Class1_Sub3_Sub5 local17 = (Class1_Sub3_Sub5) this.aClass208_8.method4410();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5070();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class1_Sub3_Sub5 local29 = local17;
			local17 = (Class1_Sub3_Sub5) this.aClass208_8.method4410();
			local29.method5953();
			local29.method5941();
			this.anInt1686 += local17.anInt6283;
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method1386(@OriginalArg(1) int arg0) {
		if (Static377.aClass184_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub3_Sub5 local13 = (Class1_Sub3_Sub5) this.aClass163_2.method3658(); local13 != null; local13 = (Class1_Sub3_Sub5) this.aClass163_2.method3655()) {
			if (local13.method5072()) {
				if (local13.method5070() == null) {
					local13.method5953();
					local13.method5941();
					this.anInt1686++;
				}
			} else if ((long) arg0 < ++local13.aLong235) {
				@Pc(55) Class1_Sub3_Sub5 local55 = Static377.aClass184_1.method3993(local13);
				this.aClass208_8.method4413(local13.aLong236, local55);
				Static191.method2762(local55, local13);
				local13.method5953();
				local13.method5941();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(JB)Ljava/lang/Object;")
	public Object method1387(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub3_Sub5 local10 = (Class1_Sub3_Sub5) this.aClass208_8.method4405(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method5070();
		if (local18 == null) {
			local10.method5953();
			local10.method5941();
			this.anInt1686 += local10.anInt6283;
			return null;
		}
		if (local10.method5072()) {
			@Pc(46) Class1_Sub3_Sub5_Sub1 local46 = new Class1_Sub3_Sub5_Sub1(local18, local10.anInt6283);
			this.aClass208_8.method4413(local10.aLong236, local46);
			this.aClass163_2.method3657(local46);
			local46.aLong235 = 0L;
			local10.method5953();
			local10.method5941();
		} else {
			this.aClass163_2.method3657(local10);
			local10.aLong235 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	public int method1388() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class1_Sub3_Sub5 local18 = (Class1_Sub3_Sub5) this.aClass163_2.method3658(); local18 != null; local18 = (Class1_Sub3_Sub5) this.aClass163_2.method3655()) {
			if (!local18.method5072()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	public int method1389() {
		return this.anInt1686;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!dw;)V")
	private void method1391(@OriginalArg(1) Class1_Sub3_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method5953();
			arg0.method5941();
			this.anInt1686 += arg0.anInt6283;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)I")
	public int method1392() {
		return this.anInt1696;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method1393() {
		@Pc(11) Class1_Sub3_Sub5 local11 = (Class1_Sub3_Sub5) this.aClass208_8.method4414();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5070();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class1_Sub3_Sub5 local21 = local11;
			local11 = (Class1_Sub3_Sub5) this.aClass208_8.method4410();
			local21.method5953();
			local21.method5941();
			this.anInt1686 += local11.anInt6283;
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public void method1394() {
		for (@Pc(7) Class1_Sub3_Sub5 local7 = (Class1_Sub3_Sub5) this.aClass163_2.method3658(); local7 != null; local7 = (Class1_Sub3_Sub5) this.aClass163_2.method3655()) {
			if (local7.method5072()) {
				local7.method5953();
				local7.method5941();
				this.anInt1686 += local7.anInt6283;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
	public void method1395() {
		this.aClass163_2.method3659();
		this.aClass208_8.method4408();
		this.anInt1686 = this.anInt1696;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method1396(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method1397(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V")
	private void method1397(@OriginalArg(0) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt1696 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1384(arg1);
		this.anInt1686--;
		while (this.anInt1686 < 0) {
			@Pc(32) Class1_Sub3_Sub5 local32 = (Class1_Sub3_Sub5) this.aClass163_2.method3654();
			this.method1391(local32);
		}
		@Pc(48) Class1_Sub3_Sub5_Sub1 local48 = new Class1_Sub3_Sub5_Sub1(arg0, 1);
		this.aClass208_8.method4413(arg1, local48);
		this.aClass163_2.method3657(local48);
		local48.aLong235 = 0L;
	}
}

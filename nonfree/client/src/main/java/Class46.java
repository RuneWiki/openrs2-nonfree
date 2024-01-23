import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class46 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!qi;")
	private Class144 aClass144_3 = new Class144();

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	private int anInt1252;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private int anInt1253;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!ii;")
	private Class79 aClass79_5;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class46(@OriginalArg(0) int arg0) {
		this.anInt1252 = arg0;
		this.anInt1253 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass79_5 = new Class79(local14);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public void method1068(@OriginalArg(0) int arg0) {
		if (Static145.aClass49_1 == null) {
			return;
		}
		for (@Pc(16) Class2_Sub3_Sub20 local16 = (Class2_Sub3_Sub20) this.aClass144_3.method3663(); local16 != null; local16 = (Class2_Sub3_Sub20) this.aClass144_3.method3659()) {
			if (local16.method4414()) {
				if (local16.method4413() == null) {
					local16.method4926();
					local16.method4613();
					this.anInt1253++;
				}
			} else if ((long) arg0 < ++local16.aLong295) {
				@Pc(38) Class2_Sub3_Sub20 local38 = Static145.aClass49_1.method1690(local16);
				this.aClass79_5.method1994(local16.aLong315, local38);
				Static115.method2114(local38, local16);
				local16.method4926();
				local16.method4613();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method1071(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method1076(arg1);
		if (this.anInt1253 == 0) {
			@Pc(27) Class2_Sub3_Sub20 local27 = (Class2_Sub3_Sub20) this.aClass144_3.method3665();
			local27.method4926();
			local27.method4613();
		} else {
			this.anInt1253--;
		}
		@Pc(42) Class2_Sub3_Sub20_Sub2 local42 = new Class2_Sub3_Sub20_Sub2(arg0);
		this.aClass79_5.method1994(arg1, local42);
		this.aClass144_3.method3662(local42);
		local42.aLong295 = 0L;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method1074(@OriginalArg(0) long arg0) {
		@Pc(12) Class2_Sub3_Sub20 local12 = (Class2_Sub3_Sub20) this.aClass79_5.method2002(arg0);
		if (local12 == null) {
			return null;
		}
		@Pc(25) Object local25 = local12.method4413();
		if (local25 == null) {
			local12.method4926();
			local12.method4613();
			this.anInt1253++;
			return null;
		}
		if (local12.method4414()) {
			@Pc(51) Class2_Sub3_Sub20_Sub2 local51 = new Class2_Sub3_Sub20_Sub2(local25);
			this.aClass79_5.method1994(local12.aLong315, local51);
			this.aClass144_3.method3662(local51);
			local51.aLong295 = 0L;
			local12.method4926();
			local12.method4613();
		} else {
			this.aClass144_3.method3662(local12);
			local12.aLong295 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V")
	public void method1076(@OriginalArg(1) long arg0) {
		@Pc(11) Class2_Sub3_Sub20 local11 = (Class2_Sub3_Sub20) this.aClass79_5.method2002(arg0);
		if (local11 != null) {
			local11.method4926();
			local11.method4613();
			this.anInt1253++;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public void method1077() {
		this.aClass144_3.method3668();
		this.aClass79_5.method1999();
		this.anInt1253 = this.anInt1252;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public void method1079() {
		for (@Pc(7) Class2_Sub3_Sub20 local7 = (Class2_Sub3_Sub20) this.aClass144_3.method3663(); local7 != null; local7 = (Class2_Sub3_Sub20) this.aClass144_3.method3659()) {
			if (local7.method4414()) {
				local7.method4926();
				local7.method4613();
				this.anInt1253++;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
	public int method1080() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub3_Sub20 local13 = (Class2_Sub3_Sub20) this.aClass144_3.method3663(); local13 != null; local13 = (Class2_Sub3_Sub20) this.aClass144_3.method3659()) {
			if (!local13.method4414()) {
				local7++;
			}
		}
		return local7;
	}
}

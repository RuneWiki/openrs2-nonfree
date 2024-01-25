import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class103 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Lclient!bo;")
	private final Class30 aClass30_3 = new Class30();

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	private final int anInt2908;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "Lclient!aj;")
	private final Class10 aClass10_22;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt2908 = arg0;
		this.anInt2906 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass10_22 = new Class10(local14);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	public int method2677() {
		return this.anInt2908;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method2678() {
		this.aClass30_3.method509();
		this.aClass10_22.method156();
		this.anInt2906 = this.anInt2908;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public void method2679(@OriginalArg(1) int arg0) {
		if (Static153.aClass45_1 == null) {
			return;
		}
		for (@Pc(7) Class7_Sub1_Sub3 local7 = (Class7_Sub1_Sub3) this.aClass30_3.method505(); local7 != null; local7 = (Class7_Sub1_Sub3) this.aClass30_3.method508()) {
			if (local7.method1189()) {
				if (local7.method1191() == null) {
					local7.method5648();
					local7.method5509();
					this.anInt2906++;
				}
			} else if (++local7.aLong222 > (long) arg0) {
				@Pc(47) Class7_Sub1_Sub3 local47 = Static153.aClass45_1.method1110(local7);
				this.aClass10_22.method161(local7.aLong232, local47);
				Static200.method3577(local47, local7);
				local7.method5648();
				local7.method5509();
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method2680() {
		@Pc(16) Class7_Sub1_Sub3 local16 = (Class7_Sub1_Sub3) this.aClass10_22.method155();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method1191();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class7_Sub1_Sub3 local28 = local16;
			local16 = (Class7_Sub1_Sub3) this.aClass10_22.method155();
			local28.method5648();
			local28.method5509();
			this.anInt2906++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	public int method2681() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class7_Sub1_Sub3 local11 = (Class7_Sub1_Sub3) this.aClass30_3.method505(); local11 != null; local11 = (Class7_Sub1_Sub3) this.aClass30_3.method508()) {
			if (!local11.method1189()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2682(@OriginalArg(1) long arg0) {
		@Pc(10) Class7_Sub1_Sub3 local10 = (Class7_Sub1_Sub3) this.aClass10_22.method163(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method1191();
		if (local18 == null) {
			local10.method5648();
			local10.method5509();
			this.anInt2906++;
			return null;
		}
		if (local10.method1189()) {
			@Pc(49) Class7_Sub1_Sub3_Sub2 local49 = new Class7_Sub1_Sub3_Sub2(local18);
			this.aClass10_22.method161(local10.aLong232, local49);
			this.aClass30_3.method515(local49);
			local49.aLong222 = 0L;
			local10.method5648();
			local10.method5509();
		} else {
			this.aClass30_3.method515(local10);
			local10.aLong222 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public void method2684() {
		for (@Pc(5) Class7_Sub1_Sub3 local5 = (Class7_Sub1_Sub3) this.aClass30_3.method505(); local5 != null; local5 = (Class7_Sub1_Sub3) this.aClass30_3.method508()) {
			if (local5.method1189()) {
				local5.method5648();
				local5.method5509();
				this.anInt2906++;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method2685() {
		@Pc(17) Class7_Sub1_Sub3 local17 = (Class7_Sub1_Sub3) this.aClass10_22.method157();
		while (local17 != null) {
			@Pc(22) Object local22 = local17.method1191();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class7_Sub1_Sub3 local26 = local17;
			local17 = (Class7_Sub1_Sub3) this.aClass10_22.method155();
			local26.method5648();
			local26.method5509();
			this.anInt2906++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Object;BJ)V")
	public void method2687(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2688(arg1);
		if (this.anInt2906 == 0) {
			@Pc(32) Class7_Sub1_Sub3 local32 = (Class7_Sub1_Sub3) this.aClass30_3.method514();
			local32.method5648();
			local32.method5509();
		} else {
			this.anInt2906--;
		}
		@Pc(43) Class7_Sub1_Sub3_Sub2 local43 = new Class7_Sub1_Sub3_Sub2(arg0);
		this.aClass10_22.method161(arg1, local43);
		this.aClass30_3.method515(local43);
		local43.aLong222 = 0L;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JB)V")
	private void method2688(@OriginalArg(0) long arg0) {
		@Pc(10) Class7_Sub1_Sub3 local10 = (Class7_Sub1_Sub3) this.aClass10_22.method163(arg0);
		if (local10 != null) {
			local10.method5648();
			local10.method5509();
			this.anInt2906++;
		}
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I")
	public int method2689() {
		return this.anInt2906;
	}
}

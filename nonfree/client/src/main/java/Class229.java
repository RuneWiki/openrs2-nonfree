import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class229 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!vt;")
	private final Class262 aClass262_9 = new Class262();

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	private int anInt6689;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
	private final int anInt6698;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Lclient!bu;")
	private final Class38 aClass38_34;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
	public Class229(@OriginalArg(0) int arg0) {
		this.anInt6689 = arg0;
		this.anInt6698 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass38_34 = new Class38(local16);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/Object;Lclient!mb;II)V")
	private void method5101(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface8 arg1) {
		if (this.anInt6698 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5102(arg1);
		this.anInt6689--;
		while (this.anInt6689 < 0) {
			@Pc(29) Class1_Sub1_Sub3 local29 = (Class1_Sub1_Sub3) this.aClass262_9.method5880();
			this.method5107(local29);
		}
		@Pc(46) Class1_Sub1_Sub3_Sub1 local46 = new Class1_Sub1_Sub3_Sub1(arg1, arg0, 1);
		this.aClass38_34.method766(local46, arg1.method3512());
		this.aClass262_9.method5876(local46);
		local46.aLong227 = 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!mb;I)V")
	private void method5102(@OriginalArg(0) Interface8 arg0) {
		@Pc(15) long local15 = arg0.method3512();
		for (@Pc(22) Class1_Sub1_Sub3 local22 = (Class1_Sub1_Sub3) this.aClass38_34.method765(local15); local22 != null; local22 = (Class1_Sub1_Sub3) this.aClass38_34.method775()) {
			if (local22.anInterface8_3.method3511(arg0)) {
				this.method5107(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method5105() {
		this.aClass262_9.method5875();
		this.aClass38_34.method774();
		this.anInt6689 = this.anInt6698;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)I")
	public int method5106() {
		return this.anInt6689;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!uh;)V")
	private void method5107(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method6178();
			arg0.method6125();
			this.anInt6689 += arg0.anInt2771;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
	public int method5110() {
		return this.anInt6698;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!mb;)Ljava/lang/Object;")
	public Object method5111(@OriginalArg(1) Interface8 arg0) {
		@Pc(7) long local7 = arg0.method3512();
		for (@Pc(14) Class1_Sub1_Sub3 local14 = (Class1_Sub1_Sub3) this.aClass38_34.method765(local7); local14 != null; local14 = (Class1_Sub1_Sub3) this.aClass38_34.method775()) {
			if (local14.anInterface8_3.method3511(arg0)) {
				@Pc(25) Object local25 = local14.method2045();
				if (local25 != null) {
					if (local14.method2044()) {
						@Pc(53) Class1_Sub1_Sub3_Sub1 local53 = new Class1_Sub1_Sub3_Sub1(arg0, local25, local14.anInt2771);
						this.aClass38_34.method766(local53, local14.aLong228);
						this.aClass262_9.method5876(local53);
						local53.aLong227 = 0L;
						local14.method6178();
						local14.method6125();
					} else {
						this.aClass262_9.method5876(local14);
						local14.aLong227 = 0L;
					}
					return local25;
				}
				local14.method6178();
				local14.method6125();
				this.anInt6689 += local14.anInt2771;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public void method5112() {
		for (@Pc(15) Class1_Sub1_Sub3 local15 = (Class1_Sub1_Sub3) this.aClass262_9.method5882(); local15 != null; local15 = (Class1_Sub1_Sub3) this.aClass262_9.method5879()) {
			if (local15.method2044()) {
				local15.method6178();
				local15.method6125();
				this.anInt6689 += local15.anInt2771;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!mb;Ljava/lang/Object;)V")
	public void method5113(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Object arg1) {
		this.method5101(arg1, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public void method5114() {
		if (Static152.aClass82_1 == null) {
			return;
		}
		for (@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) this.aClass262_9.method5882(); local10 != null; local10 = (Class1_Sub1_Sub3) this.aClass262_9.method5879()) {
			if (local10.method2044()) {
				if (local10.method2045() == null) {
					local10.method6178();
					local10.method6125();
					this.anInt6689 += local10.anInt2771;
				}
			} else if ((long) 5 < ++local10.aLong227) {
				@Pc(35) Class1_Sub1_Sub3 local35 = Static152.aClass82_1.method3567(local10);
				this.aClass38_34.method766(local35, local10.aLong228);
				Static446.method6045(local10, local35);
				local10.method6178();
				local10.method6125();
			}
		}
	}
}

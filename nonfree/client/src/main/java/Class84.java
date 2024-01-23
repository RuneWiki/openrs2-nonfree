import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class84 {

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!vb;")
	private Class121 aClass121_3 = new Class121();

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	private int anInt3216;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	private int anInt3203;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!qc;")
	private Class90 aClass90_17;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.anInt3216 = arg0;
		this.anInt3203 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass90_17 = new Class90(local14);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public void method2576() {
		for (@Pc(20) Class1_Sub1_Sub5 local20 = (Class1_Sub1_Sub5) this.aClass121_3.method3380(); local20 != null; local20 = (Class1_Sub1_Sub5) this.aClass121_3.method3373()) {
			if (local20.method1277()) {
				local20.method3525();
				local20.method3531();
				this.anInt3203++;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
	public void method2577(@OriginalArg(0) int arg0) {
		if (Static134.aClass47_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub1_Sub5 local13 = (Class1_Sub1_Sub5) this.aClass121_3.method3380(); local13 != null; local13 = (Class1_Sub1_Sub5) this.aClass121_3.method3373()) {
			if (local13.method1277()) {
				if (local13.method1271() == null) {
					local13.method3525();
					local13.method3531();
					this.anInt3203++;
				}
			} else if ((long) arg0 < ++local13.aLong174) {
				@Pc(39) Class1_Sub1_Sub5 local39 = Static134.aClass47_1.method2550(local13);
				this.aClass90_17.method2817(local39, local13.aLong173);
				Static17.method254(local13, local39);
				local13.method3525();
				local13.method3531();
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method2579(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) this.aClass90_17.method2819(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method1271();
		if (local18 == null) {
			local10.method3525();
			local10.method3531();
			this.anInt3203++;
			return null;
		}
		if (local10.method1277()) {
			@Pc(53) Class1_Sub1_Sub5_Sub2 local53 = new Class1_Sub1_Sub5_Sub2(local18);
			this.aClass90_17.method2817(local53, local10.aLong173);
			this.aClass121_3.method3383(local53);
			local53.aLong174 = 0L;
			local10.method3525();
			local10.method3531();
		} else {
			this.aClass121_3.method3383(local10);
			local10.aLong174 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)V")
	public void method2581(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) this.aClass90_17.method2819(arg0);
		if (local10 != null) {
			local10.method3525();
			local10.method3531();
			this.anInt3203++;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/Object;ZJ)V")
	public void method2582(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2581(arg1);
		if (this.anInt3203 == 0) {
			@Pc(16) Class1_Sub1_Sub5 local16 = (Class1_Sub1_Sub5) this.aClass121_3.method3374();
			local16.method3525();
			local16.method3531();
		} else {
			this.anInt3203--;
		}
		@Pc(35) Class1_Sub1_Sub5_Sub2 local35 = new Class1_Sub1_Sub5_Sub2(arg0);
		this.aClass90_17.method2817(local35, arg1);
		this.aClass121_3.method3383(local35);
		local35.aLong174 = 0L;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V")
	public void method2585() {
		this.aClass121_3.method3376();
		this.aClass90_17.method2818();
		this.anInt3203 = this.anInt3216;
	}
}

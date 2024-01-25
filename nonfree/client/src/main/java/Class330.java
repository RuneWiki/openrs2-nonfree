import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class330 {

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	private int anInt9600;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!oj;")
	private final Class234 aClass234_47;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "Lclient!pw;")
	private final Class256 aClass256_10;

	@OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
	private final int anInt9611;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
	public Class330(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	private Class330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass256_10 = new Class256();
		this.anInt9611 = arg0;
		this.anInt9600 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass234_47 = new Class234(local14);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	public int method7674() {
		return this.anInt9611;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)V")
	private void method7675(@OriginalArg(0) long arg0) {
		@Pc(13) Class6_Sub5_Sub11 local13 = (Class6_Sub5_Sub11) this.aClass234_47.method5464(arg0);
		this.method7686(local13);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
	public void method7676(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method7690(arg1, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method7677(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub5_Sub11 local10 = (Class6_Sub5_Sub11) this.aClass234_47.method5464(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method7818();
		if (local18 == null) {
			local10.method7948();
			local10.method7814();
			this.anInt9600 += local10.anInt9811;
			return null;
		}
		if (local10.method7819()) {
			@Pc(51) Class6_Sub5_Sub11_Sub2 local51 = new Class6_Sub5_Sub11_Sub2(local18, local10.anInt9811);
			this.aClass234_47.method5466(local10.aLong245, local51);
			this.aClass256_10.method5906(local51);
			local51.aLong242 = 0L;
			local10.method7948();
			local10.method7814();
		} else {
			this.aClass256_10.method5906(local10);
			local10.aLong242 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public void method7678() {
		for (@Pc(12) Class6_Sub5_Sub11 local12 = (Class6_Sub5_Sub11) this.aClass256_10.method5902(); local12 != null; local12 = (Class6_Sub5_Sub11) this.aClass256_10.method5901()) {
			if (local12.method7819()) {
				local12.method7948();
				local12.method7814();
				this.anInt9600 += local12.anInt9811;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)I")
	public int method7679() {
		return this.anInt9600;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V")
	public void method7680(@OriginalArg(0) int arg0) {
		if (Static291.aClass74_1 == null) {
			return;
		}
		for (@Pc(17) Class6_Sub5_Sub11 local17 = (Class6_Sub5_Sub11) this.aClass256_10.method5902(); local17 != null; local17 = (Class6_Sub5_Sub11) this.aClass256_10.method5901()) {
			if (local17.method7819()) {
				if (local17.method7818() == null) {
					local17.method7948();
					local17.method7814();
					this.anInt9600++;
				}
			} else if (++local17.aLong242 > (long) arg0) {
				@Pc(57) Class6_Sub5_Sub11 local57 = Static291.aClass74_1.method2474(local17);
				this.aClass234_47.method5466(local17.aLong245, local57);
				Static449.method6332(local57, local17);
				local17.method7948();
				local17.method7814();
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method7681() {
		@Pc(17) Class6_Sub5_Sub11 local17 = (Class6_Sub5_Sub11) this.aClass234_47.method5469();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method7818();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class6_Sub5_Sub11 local29 = local17;
			local17 = (Class6_Sub5_Sub11) this.aClass234_47.method5465();
			local29.method7948();
			local29.method7814();
			this.anInt9600 += local29.anInt9811;
		}
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)I")
	public int method7683() {
		@Pc(7) int local7 = 0;
		for (@Pc(18) Class6_Sub5_Sub11 local18 = (Class6_Sub5_Sub11) this.aClass256_10.method5902(); local18 != null; local18 = (Class6_Sub5_Sub11) this.aClass256_10.method5901()) {
			if (!local18.method7819()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!um;)V")
	private void method7686(@OriginalArg(1) Class6_Sub5_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method7948();
			arg0.method7814();
			this.anInt9600 += arg0.anInt9811;
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	public void method7688() {
		this.aClass256_10.method5907();
		this.aClass234_47.method5463();
		this.anInt9600 = this.anInt9611;
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public Object method7689() {
		@Pc(11) Class6_Sub5_Sub11 local11 = (Class6_Sub5_Sub11) this.aClass234_47.method5465();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7818();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class6_Sub5_Sub11 local21 = local11;
			local11 = (Class6_Sub5_Sub11) this.aClass234_47.method5465();
			local21.method7948();
			local21.method7814();
			this.anInt9600 += local21.anInt9811;
		}
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
	public void method7690(@OriginalArg(2) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt9611 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7675(arg0);
		this.anInt9600--;
		while (this.anInt9600 < 0) {
			@Pc(32) Class6_Sub5_Sub11 local32 = (Class6_Sub5_Sub11) this.aClass256_10.method5904();
			this.method7686(local32);
		}
		@Pc(56) Class6_Sub5_Sub11_Sub2 local56 = new Class6_Sub5_Sub11_Sub2(arg1, 1);
		this.aClass234_47.method5466(arg0, local56);
		this.aClass256_10.method5906(local56);
		local56.aLong242 = 0L;
	}
}

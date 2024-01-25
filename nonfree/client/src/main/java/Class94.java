import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class94 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private final int anInt3478;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!wr;")
	private final Class380 aClass380_11;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	private int anInt3492;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!ns;")
	private final Class231 aClass231_3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class94(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass231_3 = new Class231();
		this.anInt3478 = arg0;
		this.anInt3492 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass380_11 = new Class380(local14);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	public int method2951() {
		return this.anInt3478;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public void method2952() {
		this.aClass231_3.method6049();
		this.aClass380_11.method8751();
		this.anInt3492 = this.anInt3478;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!bda;I)V")
	private void method2954(@OriginalArg(0) Class6_Sub5_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method8792();
			arg0.method7748();
			this.anInt3492 += arg0.anInt3508;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
	public int method2955() {
		@Pc(7) int local7 = 0;
		for (@Pc(20) Class6_Sub5_Sub3 local20 = (Class6_Sub5_Sub3) this.aClass231_3.method6055(); local20 != null; local20 = (Class6_Sub5_Sub3) this.aClass231_3.method6050()) {
			if (!local20.method2980()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
	public int method2957() {
		return this.anInt3492;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
	public void method2958(@OriginalArg(1) int arg0) {
		if (Static275.aClass222_3 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub5_Sub3 local9 = (Class6_Sub5_Sub3) this.aClass231_3.method6055(); local9 != null; local9 = (Class6_Sub5_Sub3) this.aClass231_3.method6050()) {
			if (local9.method2980()) {
				if (local9.method2977() == null) {
					local9.method8792();
					local9.method7748();
					this.anInt3492 += local9.anInt3508;
				}
			} else if ((long) arg0 < ++local9.aLong254) {
				@Pc(31) Class6_Sub5_Sub3 local31 = Static275.aClass222_3.method7976(local9);
				this.aClass380_11.method8753(local31, local9.aLong278);
				Static181.method3392(local9, local31);
				local9.method8792();
				local9.method7748();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2960(@OriginalArg(1) long arg0) {
		@Pc(16) Class6_Sub5_Sub3 local16 = (Class6_Sub5_Sub3) this.aClass380_11.method8747(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method2977();
		if (local24 == null) {
			local16.method8792();
			local16.method7748();
			this.anInt3492 += local16.anInt3508;
			return null;
		}
		if (local16.method2980()) {
			@Pc(52) Class6_Sub5_Sub3_Sub2 local52 = new Class6_Sub5_Sub3_Sub2(local24, local16.anInt3508);
			this.aClass380_11.method8753(local52, local16.aLong278);
			this.aClass231_3.method6048(local52);
			local52.aLong254 = 0L;
			local16.method8792();
			local16.method7748();
		} else {
			this.aClass231_3.method6048(local16);
			local16.aLong254 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2961() {
		@Pc(17) Class6_Sub5_Sub3 local17 = (Class6_Sub5_Sub3) this.aClass380_11.method8755();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method2977();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class6_Sub5_Sub3 local27 = local17;
			local17 = (Class6_Sub5_Sub3) this.aClass380_11.method8752();
			local27.method8792();
			local27.method7748();
			this.anInt3492 += local27.anInt3508;
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public Object method2962() {
		@Pc(9) Class6_Sub5_Sub3 local9 = (Class6_Sub5_Sub3) this.aClass380_11.method8752();
		while (local9 != null) {
			@Pc(18) Object local18 = local9.method2977();
			if (local18 != null) {
				return local18;
			}
			@Pc(24) Class6_Sub5_Sub3 local24 = local9;
			local9 = (Class6_Sub5_Sub3) this.aClass380_11.method8752();
			local24.method8792();
			local24.method7748();
			this.anInt3492 += local24.anInt3508;
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JLjava/lang/Object;B)V")
	public void method2963(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method2965(arg0, 1, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public void method2964() {
		for (@Pc(15) Class6_Sub5_Sub3 local15 = (Class6_Sub5_Sub3) this.aClass231_3.method6055(); local15 != null; local15 = (Class6_Sub5_Sub3) this.aClass231_3.method6050()) {
			if (local15.method2980()) {
				local15.method8792();
				local15.method7748();
				this.anInt3492 += local15.anInt3508;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJILjava/lang/Object;)V")
	public void method2965(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object arg2) {
		if (arg1 > this.anInt3478) {
			throw new IllegalStateException("s>cs");
		}
		this.method2966(arg0);
		this.anInt3492 -= arg1;
		while (this.anInt3492 < 0) {
			@Pc(40) Class6_Sub5_Sub3 local40 = (Class6_Sub5_Sub3) this.aClass231_3.method6052();
			this.method2954(local40);
		}
		@Pc(55) Class6_Sub5_Sub3_Sub2 local55 = new Class6_Sub5_Sub3_Sub2(arg2, arg1);
		this.aClass380_11.method8753(local55, arg0);
		this.aClass231_3.method6048(local55);
		local55.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
	private void method2966(@OriginalArg(0) long arg0) {
		@Pc(16) Class6_Sub5_Sub3 local16 = (Class6_Sub5_Sub3) this.aClass380_11.method8747(arg0);
		this.method2954(local16);
	}
}

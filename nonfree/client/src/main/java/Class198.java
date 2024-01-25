import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class198 {

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!tr;")
	private final Class195 aClass195_10 = new Class195();

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	private final int anInt6191;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt6179;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!bo;")
	private final Class24 aClass24_31;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class198(@OriginalArg(0) int arg0) {
		this.anInt6191 = arg0;
		this.anInt6179 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass24_31 = new Class24(local14);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public void method5230() {
		for (@Pc(7) Class3_Sub7_Sub1 local7 = (Class3_Sub7_Sub1) this.aClass195_10.method5216(); local7 != null; local7 = (Class3_Sub7_Sub1) this.aClass195_10.method5210()) {
			if (local7.method4909()) {
				local7.method5717();
				local7.method5385();
				this.anInt6179++;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JLjava/lang/Object;Z)V")
	public void method5231(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method5239(arg0);
		if (this.anInt6179 == 0) {
			@Pc(30) Class3_Sub7_Sub1 local30 = (Class3_Sub7_Sub1) this.aClass195_10.method5208();
			local30.method5717();
			local30.method5385();
		} else {
			this.anInt6179--;
		}
		@Pc(41) Class3_Sub7_Sub1_Sub1 local41 = new Class3_Sub7_Sub1_Sub1(arg1);
		this.aClass24_31.method598(arg0, local41);
		this.aClass195_10.method5213(local41);
		local41.aLong198 = 0L;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public int method5234() {
		return this.anInt6179;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I")
	public int method5235() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub7_Sub1 local13 = (Class3_Sub7_Sub1) this.aClass195_10.method5216(); local13 != null; local13 = (Class3_Sub7_Sub1) this.aClass195_10.method5210()) {
			if (!local13.method4909()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public void method5236() {
		this.aClass195_10.method5215();
		this.aClass24_31.method608();
		this.anInt6179 = this.anInt6191;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method5237() {
		@Pc(19) Class3_Sub7_Sub1 local19 = (Class3_Sub7_Sub1) this.aClass24_31.method595();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method4905();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class3_Sub7_Sub1 local31 = local19;
			local19 = (Class3_Sub7_Sub1) this.aClass24_31.method602();
			local31.method5717();
			local31.method5385();
			this.anInt6179++;
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method5238() {
		@Pc(11) Class3_Sub7_Sub1 local11 = (Class3_Sub7_Sub1) this.aClass24_31.method602();
		while (local11 != null) {
			@Pc(20) Object local20 = local11.method4905();
			if (local20 != null) {
				return local20;
			}
			@Pc(24) Class3_Sub7_Sub1 local24 = local11;
			local11 = (Class3_Sub7_Sub1) this.aClass24_31.method602();
			local24.method5717();
			local24.method5385();
			this.anInt6179++;
		}
		return null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)V")
	private void method5239(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub7_Sub1 local15 = (Class3_Sub7_Sub1) this.aClass24_31.method609(arg0);
		if (local15 != null) {
			local15.method5717();
			local15.method5385();
			this.anInt6179++;
		}
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I")
	public int method5241() {
		return this.anInt6191;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method5242(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub7_Sub1 local10 = (Class3_Sub7_Sub1) this.aClass24_31.method609(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method4905();
		if (local23 == null) {
			local10.method5717();
			local10.method5385();
			this.anInt6179++;
			return null;
		}
		if (local10.method4909()) {
			@Pc(48) Class3_Sub7_Sub1_Sub1 local48 = new Class3_Sub7_Sub1_Sub1(local23);
			this.aClass24_31.method598(local10.aLong211, local48);
			this.aClass195_10.method5213(local48);
			local48.aLong198 = 0L;
			local10.method5717();
			local10.method5385();
		} else {
			this.aClass195_10.method5213(local10);
			local10.aLong198 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public void method5243(@OriginalArg(0) int arg0) {
		if (Static298.aClass187_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub7_Sub1 local9 = (Class3_Sub7_Sub1) this.aClass195_10.method5216(); local9 != null; local9 = (Class3_Sub7_Sub1) this.aClass195_10.method5210()) {
			if (local9.method4909()) {
				if (local9.method4905() == null) {
					local9.method5717();
					local9.method5385();
					this.anInt6179++;
				}
			} else if (++local9.aLong198 > (long) arg0) {
				@Pc(31) Class3_Sub7_Sub1 local31 = Static298.aClass187_1.method5299(local9);
				this.aClass24_31.method598(local9.aLong211, local31);
				Static132.method2233(local9, local31);
				local9.method5717();
				local9.method5385();
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class220 {

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "Lclient!po;")
	private final Class202 aClass202_10 = new Class202();

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	private final int anInt5965;

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "Lclient!ke;")
	private final Class137 aClass137_30;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(I)V")
	public Class220(@OriginalArg(0) int arg0) {
		this.anInt5965 = arg0;
		this.anInt5974 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass137_30 = new Class137(local14);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I")
	public int method4986() {
		return this.anInt5965;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)V")
	public void method4987() {
		for (@Pc(19) Class6_Sub1_Sub14 local19 = (Class6_Sub1_Sub14) this.aClass202_10.method4476(); local19 != null; local19 = (Class6_Sub1_Sub14) this.aClass202_10.method4474()) {
			if (local19.method5222()) {
				local19.method5977();
				local19.method5984();
				this.anInt5974 += local19.anInt6250;
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	public int method4988() {
		return this.anInt5974;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method4989() {
		@Pc(9) Class6_Sub1_Sub14 local9 = (Class6_Sub1_Sub14) this.aClass137_30.method3181();
		while (local9 != null) {
			@Pc(18) Object local18 = local9.method5221();
			if (local18 != null) {
				return local18;
			}
			@Pc(24) Class6_Sub1_Sub14 local24 = local9;
			local9 = (Class6_Sub1_Sub14) this.aClass137_30.method3182();
			local24.method5977();
			local24.method5984();
			this.anInt5974 += local9.anInt6250;
		}
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method4990(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub1_Sub14 local10 = (Class6_Sub1_Sub14) this.aClass137_30.method3175(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(22) Object local22 = local10.method5221();
		if (local22 == null) {
			local10.method5977();
			local10.method5984();
			this.anInt5974 += local10.anInt6250;
			return null;
		}
		if (local10.method5222()) {
			@Pc(62) Class6_Sub1_Sub14_Sub1 local62 = new Class6_Sub1_Sub14_Sub1(local22, local10.anInt6250);
			this.aClass137_30.method3179(local10.aLong217, local62);
			this.aClass202_10.method4472(local62);
			local62.aLong218 = 0L;
			local10.method5977();
			local10.method5984();
		} else {
			this.aClass202_10.method4472(local10);
			local10.aLong218 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!wu;B)V")
	private void method4991(@OriginalArg(0) Class6_Sub1_Sub14 arg0) {
		if (arg0 != null) {
			arg0.method5977();
			arg0.method5984();
			this.anInt5974 += arg0.anInt6250;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/Object;IJ)V")
	private void method4993(@OriginalArg(1) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt5965 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4995(arg1);
		this.anInt5974--;
		while (this.anInt5974 < 0) {
			@Pc(32) Class6_Sub1_Sub14 local32 = (Class6_Sub1_Sub14) this.aClass202_10.method4470();
			this.method4991(local32);
		}
		@Pc(48) Class6_Sub1_Sub14_Sub1 local48 = new Class6_Sub1_Sub14_Sub1(arg0, 1);
		this.aClass137_30.method3179(arg1, local48);
		this.aClass202_10.method4472(local48);
		local48.aLong218 = 0L;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method4994() {
		@Pc(16) Class6_Sub1_Sub14 local16 = (Class6_Sub1_Sub14) this.aClass137_30.method3182();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5221();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class6_Sub1_Sub14 local26 = local16;
			local16 = (Class6_Sub1_Sub14) this.aClass137_30.method3182();
			local26.method5977();
			local26.method5984();
			this.anInt5974 += local16.anInt6250;
		}
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)V")
	private void method4995(@OriginalArg(0) long arg0) {
		@Pc(19) Class6_Sub1_Sub14 local19 = (Class6_Sub1_Sub14) this.aClass137_30.method3175(arg0);
		this.method4991(local19);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method4996(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method4993(arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public void method4998(@OriginalArg(0) int arg0) {
		if (Static223.aClass76_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub1_Sub14 local9 = (Class6_Sub1_Sub14) this.aClass202_10.method4476(); local9 != null; local9 = (Class6_Sub1_Sub14) this.aClass202_10.method4474()) {
			if (local9.method5222()) {
				if (local9.method5221() == null) {
					local9.method5977();
					local9.method5984();
					this.anInt5974++;
				}
			} else if (++local9.aLong218 > (long) arg0) {
				@Pc(49) Class6_Sub1_Sub14 local49 = Static223.aClass76_1.method4408(local9);
				this.aClass137_30.method3179(local9.aLong217, local49);
				Static436.method5891(local49, local9);
				local9.method5977();
				local9.method5984();
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V")
	public void method4999() {
		this.aClass202_10.method4473();
		this.aClass137_30.method3178();
		this.anInt5974 = this.anInt5965;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)I")
	public int method5000() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class6_Sub1_Sub14 local13 = (Class6_Sub1_Sub14) this.aClass202_10.method4476(); local13 != null; local13 = (Class6_Sub1_Sub14) this.aClass202_10.method4474()) {
			if (!local13.method5222()) {
				local7++;
			}
		}
		return local7;
	}
}

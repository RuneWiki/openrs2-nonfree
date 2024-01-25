import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class44 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!nf;")
	private final Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	private final int anInt1729;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	private int anInt1718;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Lclient!fe;")
	private final Class74 aClass74_7;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class44(@OriginalArg(0) int arg0) {
		this.anInt1729 = arg0;
		this.anInt1718 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass74_7 = new Class74(local14);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1345() {
		@Pc(11) Class6_Sub2_Sub1 local11 = (Class6_Sub2_Sub1) this.aClass74_7.method1889();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method302();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class6_Sub2_Sub1 local21 = local11;
			local11 = (Class6_Sub2_Sub1) this.aClass74_7.method1881();
			local21.method6525();
			local21.method6373();
			this.anInt1718 += local11.anInt348;
		}
		return null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
	public int method1346() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class6_Sub2_Sub1 local13 = (Class6_Sub2_Sub1) this.aClass170_1.method4006(); local13 != null; local13 = (Class6_Sub2_Sub1) this.aClass170_1.method4000()) {
			if (!local13.method300()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!or;)V")
	private void method1347(@OriginalArg(1) Class6_Sub2_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method6525();
			arg0.method6373();
			this.anInt1718 += arg0.anInt348;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public void method1348() {
		for (@Pc(7) Class6_Sub2_Sub1 local7 = (Class6_Sub2_Sub1) this.aClass170_1.method4006(); local7 != null; local7 = (Class6_Sub2_Sub1) this.aClass170_1.method4000()) {
			if (local7.method300()) {
				local7.method6525();
				local7.method6373();
				this.anInt1718 += local7.anInt348;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method1349(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method1355(arg0, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method1350() {
		@Pc(19) Class6_Sub2_Sub1 local19 = (Class6_Sub2_Sub1) this.aClass74_7.method1881();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method302();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class6_Sub2_Sub1 local31 = local19;
			local19 = (Class6_Sub2_Sub1) this.aClass74_7.method1881();
			local31.method6525();
			local31.method6373();
			this.anInt1718 += local19.anInt348;
		}
		return null;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	public void method1351() {
		this.aClass170_1.method4007();
		this.aClass74_7.method1888();
		this.anInt1718 = this.anInt1729;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	public void method1352(@OriginalArg(1) int arg0) {
		if (Static437.aClass154_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub2_Sub1 local9 = (Class6_Sub2_Sub1) this.aClass170_1.method4006(); local9 != null; local9 = (Class6_Sub2_Sub1) this.aClass170_1.method4000()) {
			if (local9.method300()) {
				if (local9.method302() == null) {
					local9.method6525();
					local9.method6373();
					this.anInt1718++;
				}
			} else if ((long) arg0 < ++local9.aLong225) {
				@Pc(35) Class6_Sub2_Sub1 local35 = Static437.aClass154_1.method3574(local9);
				this.aClass74_7.method1890(local9.aLong229, local35);
				Static15.method393(local35, local9);
				local9.method6525();
				local9.method6373();
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method1353(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2_Sub1 local10 = (Class6_Sub2_Sub1) this.aClass74_7.method1883(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method302();
		if (local18 == null) {
			local10.method6525();
			local10.method6373();
			this.anInt1718 += local10.anInt348;
			return null;
		}
		if (local10.method300()) {
			@Pc(46) Class6_Sub2_Sub1_Sub1 local46 = new Class6_Sub2_Sub1_Sub1(local18, local10.anInt348);
			this.aClass74_7.method1890(local10.aLong229, local46);
			this.aClass170_1.method4001(local46);
			local46.aLong225 = 0L;
			local10.method6525();
			local10.method6373();
		} else {
			this.aClass170_1.method4001(local10);
			local10.aLong225 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public int method1354() {
		return this.anInt1729;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/Object;IBJ)V")
	private void method1355(@OriginalArg(0) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt1729 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1357(arg1);
		this.anInt1718--;
		while (this.anInt1718 < 0) {
			@Pc(32) Class6_Sub2_Sub1 local32 = (Class6_Sub2_Sub1) this.aClass170_1.method4003();
			this.method1347(local32);
		}
		@Pc(53) Class6_Sub2_Sub1_Sub1 local53 = new Class6_Sub2_Sub1_Sub1(arg0, 1);
		this.aClass74_7.method1890(arg1, local53);
		this.aClass170_1.method4001(local53);
		local53.aLong225 = 0L;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IJ)V")
	private void method1357(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2_Sub1 local10 = (Class6_Sub2_Sub1) this.aClass74_7.method1883(arg0);
		this.method1347(local10);
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)I")
	public int method1358() {
		return this.anInt1718;
	}
}

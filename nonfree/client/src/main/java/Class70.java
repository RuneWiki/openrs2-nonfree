import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class70 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "Lclient!nk;")
	private final Class143 aClass143_5 = new Class143();

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	private int anInt1533;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	private final int anInt1524;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!jj;")
	private final Class108 aClass108_15;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
	public Class70(@OriginalArg(0) int arg0) {
		this.anInt1533 = arg0;
		this.anInt1524 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass108_15 = new Class108(local14);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method1395() {
		@Pc(16) Class6_Sub2_Sub14 local16 = (Class6_Sub2_Sub14) this.aClass108_15.method2903();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method3870();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class6_Sub2_Sub14 local28 = local16;
			local16 = (Class6_Sub2_Sub14) this.aClass108_15.method2905();
			local28.method5756();
			local28.method5761();
			this.anInt1533++;
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method1396(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2_Sub14 local10 = (Class6_Sub2_Sub14) this.aClass108_15.method2900(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3870();
		if (local18 == null) {
			local10.method5756();
			local10.method5761();
			this.anInt1533++;
			return null;
		}
		if (local10.method3875()) {
			@Pc(57) Class6_Sub2_Sub14_Sub2 local57 = new Class6_Sub2_Sub14_Sub2(local18);
			this.aClass108_15.method2898(local10.aLong218, local57);
			this.aClass143_5.method3765(local57);
			local57.aLong219 = 0L;
			local10.method5756();
			local10.method5761();
		} else {
			this.aClass143_5.method3765(local10);
			local10.aLong219 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	public void method1397(@OriginalArg(0) int arg0) {
		if (Static120.aClass127_1 == null) {
			return;
		}
		for (@Pc(16) Class6_Sub2_Sub14 local16 = (Class6_Sub2_Sub14) this.aClass143_5.method3766(); local16 != null; local16 = (Class6_Sub2_Sub14) this.aClass143_5.method3763()) {
			if (local16.method3875()) {
				if (local16.method3870() == null) {
					local16.method5756();
					local16.method5761();
					this.anInt1533++;
				}
			} else if ((long) arg0 < ++local16.aLong219) {
				@Pc(42) Class6_Sub2_Sub14 local42 = Static120.aClass127_1.method3741(local16);
				this.aClass108_15.method2898(local16.aLong218, local42);
				Static211.method3757(local16, local42);
				local16.method5756();
				local16.method5761();
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
	public int method1398() {
		return this.anInt1524;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public void method1399() {
		this.aClass143_5.method3758();
		this.aClass108_15.method2909();
		this.anInt1533 = this.anInt1524;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(JI)V")
	private void method1403(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub2_Sub14 local10 = (Class6_Sub2_Sub14) this.aClass108_15.method2900(arg0);
		if (local10 != null) {
			local10.method5756();
			local10.method5761();
			this.anInt1533++;
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method1404() {
		@Pc(11) Class6_Sub2_Sub14 local11 = (Class6_Sub2_Sub14) this.aClass108_15.method2905();
		while (local11 != null) {
			@Pc(22) Object local22 = local11.method3870();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class6_Sub2_Sub14 local26 = local11;
			local11 = (Class6_Sub2_Sub14) this.aClass108_15.method2905();
			local26.method5756();
			local26.method5761();
			this.anInt1533++;
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public void method1405() {
		for (@Pc(7) Class6_Sub2_Sub14 local7 = (Class6_Sub2_Sub14) this.aClass143_5.method3766(); local7 != null; local7 = (Class6_Sub2_Sub14) this.aClass143_5.method3763()) {
			if (local7.method3875()) {
				local7.method5756();
				local7.method5761();
				this.anInt1533++;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void method1406(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method1403(arg1);
		if (this.anInt1533 == 0) {
			@Pc(24) Class6_Sub2_Sub14 local24 = (Class6_Sub2_Sub14) this.aClass143_5.method3759();
			local24.method5756();
			local24.method5761();
		} else {
			this.anInt1533--;
		}
		@Pc(37) Class6_Sub2_Sub14_Sub2 local37 = new Class6_Sub2_Sub14_Sub2(arg0);
		this.aClass108_15.method2898(arg1, local37);
		this.aClass143_5.method3765(local37);
		local37.aLong219 = 0L;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I")
	public int method1407() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class6_Sub2_Sub14 local13 = (Class6_Sub2_Sub14) this.aClass143_5.method3766(); local13 != null; local13 = (Class6_Sub2_Sub14) this.aClass143_5.method3763()) {
			if (!local13.method3875()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)I")
	public int method1408() {
		return this.anInt1533;
	}
}

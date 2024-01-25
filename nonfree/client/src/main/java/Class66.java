import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class66 {

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!ro;")
	private final Class176 aClass176_6 = new Class176();

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	private final int anInt2108;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	private int anInt2100;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Lclient!cs;")
	private final Class42 aClass42_17;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2108 = arg0;
		this.anInt2100 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass42_17 = new Class42(local14);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	public int method1931() {
		return this.anInt2100;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1932() {
		@Pc(16) Class5_Sub9_Sub9 local16 = (Class5_Sub9_Sub9) this.aClass42_17.method1055();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4684();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class5_Sub9_Sub9 local26 = local16;
			local16 = (Class5_Sub9_Sub9) this.aClass42_17.method1055();
			local26.method5803();
			local26.method5494();
			this.anInt2100++;
		}
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public void method1933() {
		this.aClass176_6.method4767();
		this.aClass42_17.method1054();
		this.anInt2100 = this.anInt2108;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BJ)V")
	private void method1934(@OriginalArg(1) long arg0) {
		@Pc(17) Class5_Sub9_Sub9 local17 = (Class5_Sub9_Sub9) this.aClass42_17.method1052(arg0);
		if (local17 != null) {
			local17.method5803();
			local17.method5494();
			this.anInt2100++;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method1936(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method1934(arg0);
		if (this.anInt2100 == 0) {
			@Pc(17) Class5_Sub9_Sub9 local17 = (Class5_Sub9_Sub9) this.aClass176_6.method4775();
			local17.method5803();
			local17.method5494();
		} else {
			this.anInt2100--;
		}
		@Pc(35) Class5_Sub9_Sub9_Sub2 local35 = new Class5_Sub9_Sub9_Sub2(arg1);
		this.aClass42_17.method1050(arg0, local35);
		this.aClass176_6.method4772(local35);
		local35.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)I")
	public int method1937() {
		return this.anInt2108;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method1939(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub9_Sub9 local10 = (Class5_Sub9_Sub9) this.aClass42_17.method1052(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4684();
		if (local18 == null) {
			local10.method5803();
			local10.method5494();
			this.anInt2100++;
			return null;
		}
		if (local10.method4683()) {
			@Pc(48) Class5_Sub9_Sub9_Sub2 local48 = new Class5_Sub9_Sub9_Sub2(local18);
			this.aClass42_17.method1050(local10.aLong218, local48);
			this.aClass176_6.method4772(local48);
			local48.aLong208 = 0L;
			local10.method5803();
			local10.method5494();
		} else {
			this.aClass176_6.method4772(local10);
			local10.aLong208 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method1941() {
		@Pc(11) Class5_Sub9_Sub9 local11 = (Class5_Sub9_Sub9) this.aClass42_17.method1060();
		while (local11 != null) {
			@Pc(22) Object local22 = local11.method4684();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class5_Sub9_Sub9 local26 = local11;
			local11 = (Class5_Sub9_Sub9) this.aClass42_17.method1055();
			local26.method5803();
			local26.method5494();
			this.anInt2100++;
		}
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public void method1942() {
		for (@Pc(9) Class5_Sub9_Sub9 local9 = (Class5_Sub9_Sub9) this.aClass176_6.method4768(); local9 != null; local9 = (Class5_Sub9_Sub9) this.aClass176_6.method4776()) {
			if (local9.method4683()) {
				local9.method5803();
				local9.method5494();
				this.anInt2100++;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
	public int method1943() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) Class5_Sub9_Sub9 local15 = (Class5_Sub9_Sub9) this.aClass176_6.method4768(); local15 != null; local15 = (Class5_Sub9_Sub9) this.aClass176_6.method4776()) {
			if (!local15.method4683()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	public void method1944(@OriginalArg(1) int arg0) {
		if (Static175.aClass139_1 == null) {
			return;
		}
		for (@Pc(15) Class5_Sub9_Sub9 local15 = (Class5_Sub9_Sub9) this.aClass176_6.method4768(); local15 != null; local15 = (Class5_Sub9_Sub9) this.aClass176_6.method4776()) {
			if (local15.method4683()) {
				if (local15.method4684() == null) {
					local15.method5803();
					local15.method5494();
					this.anInt2100++;
				}
			} else if (++local15.aLong208 > (long) arg0) {
				@Pc(36) Class5_Sub9_Sub9 local36 = Static175.aClass139_1.method4978(local15);
				this.aClass42_17.method1050(local15.aLong218, local36);
				Static136.method2581(local15, local36);
				local15.method5803();
				local15.method5494();
			}
		}
	}
}

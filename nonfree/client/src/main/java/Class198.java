import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class198 {

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!se;")
	private final Class180 aClass180_9 = new Class180();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
	private final int anInt6115;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private int anInt6128;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Lclient!dj;")
	private final Class43 aClass43_32;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class198(@OriginalArg(0) int arg0) {
		this.anInt6115 = arg0;
		this.anInt6128 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass43_32 = new Class43(local14);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZJ)V")
	private void method5200(@OriginalArg(1) long arg0) {
		@Pc(16) Class4_Sub4_Sub20 local16 = (Class4_Sub4_Sub20) this.aClass43_32.method1273(arg0);
		if (local16 != null) {
			local16.method5687();
			local16.method5678();
			this.anInt6128++;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method5201(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method5200(arg1);
		if (this.anInt6128 == 0) {
			@Pc(17) Class4_Sub4_Sub20 local17 = (Class4_Sub4_Sub20) this.aClass180_9.method4839();
			local17.method5687();
			local17.method5678();
		} else {
			this.anInt6128--;
		}
		@Pc(36) Class4_Sub4_Sub20_Sub1 local36 = new Class4_Sub4_Sub20_Sub1(arg0);
		this.aClass43_32.method1276(local36, arg1);
		this.aClass180_9.method4840(local36);
		local36.aLong222 = 0L;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public void method5202(@OriginalArg(1) int arg0) {
		if (Static159.aClass59_1 == null) {
			return;
		}
		for (@Pc(15) Class4_Sub4_Sub20 local15 = (Class4_Sub4_Sub20) this.aClass180_9.method4838(); local15 != null; local15 = (Class4_Sub4_Sub20) this.aClass180_9.method4843()) {
			if (local15.method5679()) {
				if (local15.method5681() == null) {
					local15.method5687();
					local15.method5678();
					this.anInt6128++;
				}
			} else if ((long) arg0 < ++local15.aLong222) {
				@Pc(37) Class4_Sub4_Sub20 local37 = Static159.aClass59_1.method1865(local15);
				this.aClass43_32.method1276(local37, local15.aLong223);
				Static293.method3940(local37, local15);
				local15.method5687();
				local15.method5678();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	public int method5203() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class4_Sub4_Sub20 local13 = (Class4_Sub4_Sub20) this.aClass180_9.method4838(); local13 != null; local13 = (Class4_Sub4_Sub20) this.aClass180_9.method4843()) {
			if (!local13.method5679()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method5204() {
		@Pc(18) Class4_Sub4_Sub20 local18 = (Class4_Sub4_Sub20) this.aClass43_32.method1278();
		while (local18 != null) {
			@Pc(26) Object local26 = local18.method5681();
			if (local26 != null) {
				return local26;
			}
			@Pc(32) Class4_Sub4_Sub20 local32 = local18;
			local18 = (Class4_Sub4_Sub20) this.aClass43_32.method1278();
			local32.method5687();
			local32.method5678();
			this.anInt6128++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method5207() {
		@Pc(17) Class4_Sub4_Sub20 local17 = (Class4_Sub4_Sub20) this.aClass43_32.method1283();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method5681();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class4_Sub4_Sub20 local27 = local17;
			local17 = (Class4_Sub4_Sub20) this.aClass43_32.method1278();
			local27.method5687();
			local27.method5678();
			this.anInt6128++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	public int method5208() {
		return this.anInt6115;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public void method5209() {
		for (@Pc(9) Class4_Sub4_Sub20 local9 = (Class4_Sub4_Sub20) this.aClass180_9.method4838(); local9 != null; local9 = (Class4_Sub4_Sub20) this.aClass180_9.method4843()) {
			if (local9.method5679()) {
				local9.method5687();
				local9.method5678();
				this.anInt6128++;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZJ)Ljava/lang/Object;")
	public Object method5210(@OriginalArg(1) long arg0) {
		@Pc(15) Class4_Sub4_Sub20 local15 = (Class4_Sub4_Sub20) this.aClass43_32.method1273(arg0);
		if (local15 == null) {
			return null;
		}
		@Pc(23) Object local23 = local15.method5681();
		if (local23 == null) {
			local15.method5687();
			local15.method5678();
			this.anInt6128++;
			return null;
		}
		if (local15.method5679()) {
			@Pc(58) Class4_Sub4_Sub20_Sub1 local58 = new Class4_Sub4_Sub20_Sub1(local23);
			this.aClass43_32.method1276(local58, local15.aLong223);
			this.aClass180_9.method4840(local58);
			local58.aLong222 = 0L;
			local15.method5687();
			local15.method5678();
		} else {
			this.aClass180_9.method4840(local15);
			local15.aLong222 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
	public int method5211() {
		return this.anInt6128;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	public void method5213() {
		this.aClass180_9.method4841();
		this.aClass43_32.method1282();
		this.anInt6128 = this.anInt6115;
	}
}

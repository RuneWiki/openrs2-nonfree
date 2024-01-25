import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class119 {

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!ek;")
	private final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private final int anInt3612;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	private int anInt3606;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!va;")
	private final Class199 aClass199_19;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
	public Class119(@OriginalArg(0) int arg0) {
		this.anInt3612 = arg0;
		this.anInt3606 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass199_19 = new Class199(local14);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3304() {
		this.aClass54_1.method1660();
		this.aClass199_19.method5750();
		this.anInt3606 = this.anInt3612;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public Object method3305() {
		@Pc(19) Class2_Sub11_Sub12 local19 = (Class2_Sub11_Sub12) this.aClass199_19.method5753();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method5152();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class2_Sub11_Sub12 local31 = local19;
			local19 = (Class2_Sub11_Sub12) this.aClass199_19.method5753();
			local31.method5945();
			local31.method5914();
			this.anInt3606++;
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I")
	public int method3306() {
		return this.anInt3612;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method3307() {
		@Pc(16) Class2_Sub11_Sub12 local16 = (Class2_Sub11_Sub12) this.aClass199_19.method5747();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method5152();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class2_Sub11_Sub12 local28 = local16;
			local16 = (Class2_Sub11_Sub12) this.aClass199_19.method5753();
			local28.method5945();
			local28.method5914();
			this.anInt3606++;
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLjava/lang/Object;J)V")
	public void method3308(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method3317(arg1);
		if (this.anInt3606 == 0) {
			@Pc(29) Class2_Sub11_Sub12 local29 = (Class2_Sub11_Sub12) this.aClass54_1.method1658();
			local29.method5945();
			local29.method5914();
		} else {
			this.anInt3606--;
		}
		@Pc(40) Class2_Sub11_Sub12_Sub1 local40 = new Class2_Sub11_Sub12_Sub1(arg0);
		this.aClass199_19.method5749(local40, arg1);
		this.aClass54_1.method1662(local40);
		local40.aLong212 = 0L;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)I")
	public int method3310() {
		return this.anInt3606;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3311(@OriginalArg(0) long arg0) {
		@Pc(14) Class2_Sub11_Sub12 local14 = (Class2_Sub11_Sub12) this.aClass199_19.method5751(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Object local22 = local14.method5152();
		if (local22 == null) {
			local14.method5945();
			local14.method5914();
			this.anInt3606++;
			return null;
		}
		if (local14.method5151()) {
			@Pc(57) Class2_Sub11_Sub12_Sub1 local57 = new Class2_Sub11_Sub12_Sub1(local22);
			this.aClass199_19.method5749(local57, local14.aLong213);
			this.aClass54_1.method1662(local57);
			local57.aLong212 = 0L;
			local14.method5945();
			local14.method5914();
		} else {
			this.aClass54_1.method1662(local14);
			local14.aLong212 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
	public void method3312() {
		for (@Pc(19) Class2_Sub11_Sub12 local19 = (Class2_Sub11_Sub12) this.aClass54_1.method1661(); local19 != null; local19 = (Class2_Sub11_Sub12) this.aClass54_1.method1657()) {
			if (local19.method5151()) {
				local19.method5945();
				local19.method5914();
				this.anInt3606++;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)I")
	public int method3314() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class2_Sub11_Sub12 local19 = (Class2_Sub11_Sub12) this.aClass54_1.method1661(); local19 != null; local19 = (Class2_Sub11_Sub12) this.aClass54_1.method1657()) {
			if (!local19.method5151()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public void method3315(@OriginalArg(0) int arg0) {
		if (Static182.aClass117_1 == null) {
			return;
		}
		for (@Pc(17) Class2_Sub11_Sub12 local17 = (Class2_Sub11_Sub12) this.aClass54_1.method1661(); local17 != null; local17 = (Class2_Sub11_Sub12) this.aClass54_1.method1657()) {
			if (local17.method5151()) {
				if (local17.method5152() == null) {
					local17.method5945();
					local17.method5914();
					this.anInt3606++;
				}
			} else if ((long) arg0 < ++local17.aLong212) {
				@Pc(61) Class2_Sub11_Sub12 local61 = Static182.aClass117_1.method3478(local17);
				this.aClass199_19.method5749(local61, local17.aLong213);
				Static188.method3703(local61, local17);
				local17.method5945();
				local17.method5914();
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(JB)V")
	private void method3317(@OriginalArg(0) long arg0) {
		@Pc(15) Class2_Sub11_Sub12 local15 = (Class2_Sub11_Sub12) this.aClass199_19.method5751(arg0);
		if (local15 != null) {
			local15.method5945();
			local15.method5914();
			this.anInt3606++;
		}
	}
}

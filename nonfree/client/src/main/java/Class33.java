import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class33 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!vm;")
	private Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!lb;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt1020 = arg0;
		this.anInt1018 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass97_2 = new Class97(local14);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public void method838(@OriginalArg(1) int arg0) {
		if (Static176.aClass27_2 == null) {
			return;
		}
		for (@Pc(15) Class4_Sub2_Sub8 local15 = (Class4_Sub2_Sub8) this.aClass177_2.method4278(); local15 != null; local15 = (Class4_Sub2_Sub8) this.aClass177_2.method4280()) {
			if (local15.method1915()) {
				if (local15.method1916() == null) {
					local15.method4391();
					local15.method4396();
					this.anInt1020++;
				}
			} else if (++local15.aLong201 > (long) arg0) {
				@Pc(44) Class4_Sub2_Sub8 local44 = Static176.aClass27_2.method4119(local15);
				this.aClass97_2.method2364(local44, local15.aLong200);
				Static191.method3994(local44, local15);
				local15.method4391();
				local15.method4396();
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method839() {
		this.aClass177_2.method4270();
		this.aClass97_2.method2356();
		this.anInt1020 = this.anInt1018;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method841(@OriginalArg(1) long arg0) {
		@Pc(6) Class4_Sub2_Sub8 local6 = (Class4_Sub2_Sub8) this.aClass97_2.method2360(arg0);
		if (local6 == null) {
			return null;
		}
		@Pc(18) Object local18 = local6.method1916();
		if (local18 == null) {
			local6.method4391();
			local6.method4396();
			this.anInt1020++;
			return null;
		}
		if (local6.method1915()) {
			@Pc(54) Class4_Sub2_Sub8_Sub2 local54 = new Class4_Sub2_Sub8_Sub2(local18);
			this.aClass97_2.method2364(local54, local6.aLong200);
			this.aClass177_2.method4274(local54);
			local54.aLong201 = 0L;
			local6.method4391();
			local6.method4396();
		} else {
			this.aClass177_2.method4274(local6);
			local6.aLong201 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)I")
	public int method842() {
		@Pc(13) int local13 = 0;
		for (@Pc(19) Class4_Sub2_Sub8 local19 = (Class4_Sub2_Sub8) this.aClass177_2.method4278(); local19 != null; local19 = (Class4_Sub2_Sub8) this.aClass177_2.method4280()) {
			if (!local19.method1915()) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	public void method843() {
		for (@Pc(11) Class4_Sub2_Sub8 local11 = (Class4_Sub2_Sub8) this.aClass177_2.method4278(); local11 != null; local11 = (Class4_Sub2_Sub8) this.aClass177_2.method4280()) {
			if (local11.method1915()) {
				local11.method4391();
				local11.method4396();
				this.anInt1020++;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IJ)V")
	public void method844(@OriginalArg(1) long arg0) {
		@Pc(18) Class4_Sub2_Sub8 local18 = (Class4_Sub2_Sub8) this.aClass97_2.method2360(arg0);
		if (local18 != null) {
			local18.method4391();
			local18.method4396();
			this.anInt1020++;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method845(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method844(arg1);
		if (this.anInt1020 == 0) {
			@Pc(19) Class4_Sub2_Sub8 local19 = (Class4_Sub2_Sub8) this.aClass177_2.method4273();
			local19.method4391();
			local19.method4396();
		} else {
			this.anInt1020--;
		}
		@Pc(40) Class4_Sub2_Sub8_Sub2 local40 = new Class4_Sub2_Sub8_Sub2(arg0);
		this.aClass97_2.method2364(local40, arg1);
		this.aClass177_2.method4274(local40);
		local40.aLong201 = 0L;
	}
}

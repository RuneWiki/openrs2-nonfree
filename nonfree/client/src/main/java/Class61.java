import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class61 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!nk;")
	private Class85 aClass85_4 = new Class85();

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	private int anInt2181;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	private int anInt2178;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!hd;")
	private Class50 aClass50_15;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
	public Class61(@OriginalArg(0) int arg0) {
		this.anInt2181 = arg0;
		@Pc(11) int local11;
		for (local11 = 1; local11 + local11 < arg0; local11 += local11) {
		}
		this.anInt2178 = arg0;
		this.aClass50_15 = new Class50(local11);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method1689() {
		this.aClass85_4.method2427();
		this.aClass50_15.method1360();
		this.anInt2178 = this.anInt2181;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method1693(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) this.aClass50_15.method1364(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3208();
		if (local18 == null) {
			local10.method3735();
			local10.method3682();
			this.anInt2178++;
			return null;
		}
		if (local10.method3207()) {
			@Pc(52) Class1_Sub2_Sub13_Sub1 local52 = new Class1_Sub2_Sub13_Sub1(local18);
			this.aClass50_15.method1362(local10.aLong177, local52);
			this.aClass85_4.method2432(local52);
			local52.aLong174 = 0L;
			local10.method3735();
			local10.method3682();
		} else {
			this.aClass85_4.method2432(local10);
			local10.aLong174 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method1694(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method1696(arg0);
		if (this.anInt2178 == 0) {
			@Pc(33) Class1_Sub2_Sub13 local33 = (Class1_Sub2_Sub13) this.aClass85_4.method2429();
			local33.method3735();
			local33.method3682();
		} else {
			this.anInt2178--;
		}
		@Pc(44) Class1_Sub2_Sub13_Sub1 local44 = new Class1_Sub2_Sub13_Sub1(arg1);
		this.aClass50_15.method1362(arg0, local44);
		this.aClass85_4.method2432(local44);
		local44.aLong174 = 0L;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public void method1695(@OriginalArg(1) int arg0) {
		if (Static132.aClass114_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub2_Sub13 local9 = (Class1_Sub2_Sub13) this.aClass85_4.method2425(); local9 != null; local9 = (Class1_Sub2_Sub13) this.aClass85_4.method2428()) {
			if (local9.method3207()) {
				if (local9.method3208() == null) {
					local9.method3735();
					local9.method3682();
					this.anInt2178++;
				}
			} else if (++local9.aLong174 > (long) arg0) {
				@Pc(31) Class1_Sub2_Sub13 local31 = Static132.aClass114_1.method3233(local9);
				this.aClass50_15.method1362(local9.aLong177, local31);
				Static111.method1946(local9, local31);
				local9.method3735();
				local9.method3682();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(JI)V")
	public void method1696(@OriginalArg(0) long arg0) {
		@Pc(14) Class1_Sub2_Sub13 local14 = (Class1_Sub2_Sub13) this.aClass50_15.method1364(arg0);
		if (local14 != null) {
			local14.method3735();
			local14.method3682();
			this.anInt2178++;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public void method1697() {
		for (@Pc(16) Class1_Sub2_Sub13 local16 = (Class1_Sub2_Sub13) this.aClass85_4.method2425(); local16 != null; local16 = (Class1_Sub2_Sub13) this.aClass85_4.method2428()) {
			if (local16.method3207()) {
				local16.method3735();
				local16.method3682();
				this.anInt2178++;
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class92 {

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "Lclient!ot;")
	private final Class174 aClass174_10 = new Class174();

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	private int anInt2353;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	private final int anInt2356;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "Lclient!sq;")
	private final Class214 aClass214_13;

	static {
		new Class221(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V")
	public Class92(@OriginalArg(0) int arg0) {
		this.anInt2353 = arg0;
		this.anInt2356 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass214_13 = new Class214(local16);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!oh;I)V")
	private void method2236(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method5745();
			arg0.method5748();
			this.anInt2353 += arg0.anInt1791;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public void method2237() {
		this.aClass174_10.method4101();
		this.aClass214_13.method5068();
		this.anInt2353 = this.anInt2356;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public void method2238() {
		for (@Pc(11) Class2_Sub1_Sub4 local11 = (Class2_Sub1_Sub4) this.aClass174_10.method4102(); local11 != null; local11 = (Class2_Sub1_Sub4) this.aClass174_10.method4098()) {
			if (local11.method1616()) {
				local11.method5745();
				local11.method5748();
				this.anInt2353 += local11.anInt1791;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I")
	public int method2239() {
		return this.anInt2356;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I")
	public int method2240() {
		return this.anInt2353;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ig;I)V")
	private void method2241(@OriginalArg(0) Interface4 arg0) {
		@Pc(9) long local9 = arg0.method1526();
		for (@Pc(16) Class2_Sub1_Sub4 local16 = (Class2_Sub1_Sub4) this.aClass214_13.method5059(local9); local16 != null; local16 = (Class2_Sub1_Sub4) this.aClass214_13.method5061()) {
			if (local16.anInterface4_3.method1527(arg0)) {
				this.method2236(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!ig;ILjava/lang/Object;)V")
	public void method2242(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Object arg1) {
		this.method2245(arg1, arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
	public void method2243() {
		if (Static328.aClass38_1 == null) {
			return;
		}
		for (@Pc(18) Class2_Sub1_Sub4 local18 = (Class2_Sub1_Sub4) this.aClass174_10.method4102(); local18 != null; local18 = (Class2_Sub1_Sub4) this.aClass174_10.method4098()) {
			if (local18.method1616()) {
				if (local18.method1618() == null) {
					local18.method5745();
					local18.method5748();
					this.anInt2353 += local18.anInt1791;
				}
			} else if ((long) 5 < ++local18.aLong209) {
				@Pc(44) Class2_Sub1_Sub4 local44 = Static328.aClass38_1.method2428(local18);
				this.aClass214_13.method5065(local18.aLong208, local44);
				Static38.method830(local44, local18);
				local18.method5745();
				local18.method5748();
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Object;IILclient!ig;)V")
	private void method2245(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface4 arg1) {
		if (this.anInt2356 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2241(arg1);
		this.anInt2353--;
		while (this.anInt2353 < 0) {
			@Pc(34) Class2_Sub1_Sub4 local34 = (Class2_Sub1_Sub4) this.aClass174_10.method4104();
			this.method2236(local34);
		}
		@Pc(51) Class2_Sub1_Sub4_Sub1 local51 = new Class2_Sub1_Sub4_Sub1(arg1, arg0, 1);
		this.aClass214_13.method5065(arg1.method1526(), local51);
		this.aClass174_10.method4099(local51);
		local51.aLong209 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ig;)Ljava/lang/Object;")
	public Object method2246(@OriginalArg(1) Interface4 arg0) {
		@Pc(13) long local13 = arg0.method1526();
		for (@Pc(22) Class2_Sub1_Sub4 local22 = (Class2_Sub1_Sub4) this.aClass214_13.method5059(local13); local22 != null; local22 = (Class2_Sub1_Sub4) this.aClass214_13.method5061()) {
			if (local22.anInterface4_3.method1527(arg0)) {
				@Pc(36) Object local36 = local22.method1618();
				if (local36 != null) {
					if (local22.method1616()) {
						@Pc(67) Class2_Sub1_Sub4_Sub1 local67 = new Class2_Sub1_Sub4_Sub1(arg0, local36, local22.anInt1791);
						this.aClass214_13.method5065(local22.aLong208, local67);
						this.aClass174_10.method4099(local67);
						local67.aLong209 = 0L;
						local22.method5745();
						local22.method5748();
					} else {
						this.aClass174_10.method4099(local22);
						local22.aLong209 = 0L;
					}
					return local36;
				}
				local22.method5745();
				local22.method5748();
				this.anInt2353 += local22.anInt1791;
			}
		}
		return null;
	}
}

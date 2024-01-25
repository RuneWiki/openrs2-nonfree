import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class120 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!we;")
	private final Class212 aClass212_4 = new Class212();

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt3487;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	private final int anInt3493;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!tn;")
	private final Class190 aClass190_18;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class120(@OriginalArg(0) int arg0) {
		this.anInt3487 = arg0;
		this.anInt3493 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass190_18 = new Class190(local14);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!m;)Ljava/lang/Object;")
	public Object method3163(@OriginalArg(1) Interface7 arg0) {
		@Pc(7) long local7 = arg0.method4158();
		for (@Pc(22) Class5_Sub1_Sub11 local22 = (Class5_Sub1_Sub11) this.aClass190_18.method5466(local7); local22 != null; local22 = (Class5_Sub1_Sub11) this.aClass190_18.method5467()) {
			if (local22.anInterface7_3.method4157(arg0)) {
				@Pc(35) Object local35 = local22.method5569();
				if (local35 != null) {
					if (local22.method5571()) {
						@Pc(69) Class5_Sub1_Sub11_Sub1 local69 = new Class5_Sub1_Sub11_Sub1(arg0, local35);
						this.aClass190_18.method5464(local69, local22.aLong235);
						this.aClass212_4.method5936(local69);
						local69.aLong234 = 0L;
						local22.method6005();
						local22.method5970();
					} else {
						this.aClass212_4.method5936(local22);
						local22.aLong234 = 0L;
					}
					return local35;
				}
				local22.method6005();
				local22.method5970();
				this.anInt3487++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/Object;Lclient!m;)V")
	public void method3165(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface7 arg1) {
		this.method3169(arg1);
		if (this.anInt3487 == 0) {
			@Pc(19) Class5_Sub1_Sub11 local19 = (Class5_Sub1_Sub11) this.aClass212_4.method5937();
			local19.method6005();
			local19.method5970();
		} else {
			this.anInt3487--;
		}
		@Pc(38) Class5_Sub1_Sub11_Sub1 local38 = new Class5_Sub1_Sub11_Sub1(arg1, arg0);
		this.aClass190_18.method5464(local38, arg1.method4158());
		this.aClass212_4.method5936(local38);
		local38.aLong234 = 0L;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
	public int method3166() {
		return this.anInt3493;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public void method3168() {
		if (Static27.aClass90_1 == null) {
			return;
		}
		for (@Pc(9) Class5_Sub1_Sub11 local9 = (Class5_Sub1_Sub11) this.aClass212_4.method5943(); local9 != null; local9 = (Class5_Sub1_Sub11) this.aClass212_4.method5939()) {
			if (local9.method5571()) {
				if (local9.method5569() == null) {
					local9.method6005();
					local9.method5970();
					this.anInt3487++;
				}
			} else if ((long) 5 < ++local9.aLong234) {
				@Pc(35) Class5_Sub1_Sub11 local35 = Static27.aClass90_1.method4915(local9);
				this.aClass190_18.method5464(local35, local9.aLong235);
				Static102.method1827(local9, local35);
				local9.method6005();
				local9.method5970();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!m;)V")
	private void method3169(@OriginalArg(1) Interface7 arg0) {
		@Pc(7) long local7 = arg0.method4158();
		for (@Pc(28) Class5_Sub1_Sub11 local28 = (Class5_Sub1_Sub11) this.aClass190_18.method5466(local7); local28 != null; local28 = (Class5_Sub1_Sub11) this.aClass190_18.method5467()) {
			if (local28.anInterface7_3.method4157(arg0)) {
				local28.method6005();
				local28.method5970();
				this.anInt3487++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public void method3170() {
		this.aClass212_4.method5942();
		this.aClass190_18.method5472();
		this.anInt3487 = this.anInt3493;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public void method3171() {
		for (@Pc(5) Class5_Sub1_Sub11 local5 = (Class5_Sub1_Sub11) this.aClass212_4.method5943(); local5 != null; local5 = (Class5_Sub1_Sub11) this.aClass212_4.method5939()) {
			if (local5.method5571()) {
				local5.method6005();
				local5.method5970();
				this.anInt3487++;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)I")
	public int method3172() {
		return this.anInt3487;
	}
}

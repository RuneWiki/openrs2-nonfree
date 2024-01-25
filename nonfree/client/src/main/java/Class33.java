import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class33 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!ad;")
	private final Class4 aClass4_1 = new Class4();

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
	private final int anInt1177;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
	private int anInt1173;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Lclient!br;")
	private final Class26 aClass26_3;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt1177 = arg0;
		this.anInt1173 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass26_3 = new Class26(local14);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I")
	public int method1151() {
		return this.anInt1177;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public void method1152() {
		for (@Pc(7) Class1_Sub1_Sub10 local7 = (Class1_Sub1_Sub10) this.aClass4_1.method177(); local7 != null; local7 = (Class1_Sub1_Sub10) this.aClass4_1.method182()) {
			if (local7.method5109()) {
				local7.method5710();
				local7.method5564();
				this.anInt1173++;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!c;ILjava/lang/Object;)V")
	public void method1154(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method1160(arg0);
		if (this.anInt1173 == 0) {
			@Pc(27) Class1_Sub1_Sub10 local27 = (Class1_Sub1_Sub10) this.aClass4_1.method183();
			local27.method5710();
			local27.method5564();
		} else {
			this.anInt1173--;
		}
		@Pc(39) Class1_Sub1_Sub10_Sub2 local39 = new Class1_Sub1_Sub10_Sub2(arg0, arg1);
		this.aClass26_3.method877(arg0.method2745(), local39);
		this.aClass4_1.method180(local39);
		local39.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1155() {
		this.aClass4_1.method179();
		this.aClass26_3.method876();
		this.anInt1173 = this.anInt1177;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	public void method1157() {
		if (Static285.aClass111_1 == null) {
			return;
		}
		for (@Pc(15) Class1_Sub1_Sub10 local15 = (Class1_Sub1_Sub10) this.aClass4_1.method177(); local15 != null; local15 = (Class1_Sub1_Sub10) this.aClass4_1.method182()) {
			if (local15.method5109()) {
				if (local15.method5108() == null) {
					local15.method5710();
					local15.method5564();
					this.anInt1173++;
				}
			} else if ((long) 5 < ++local15.aLong208) {
				@Pc(55) Class1_Sub1_Sub10 local55 = Static285.aClass111_1.method4151(local15);
				this.aClass26_3.method877(local15.aLong215, local55);
				Static79.method3437(local55, local15);
				local15.method5710();
				local15.method5564();
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLclient!c;)Ljava/lang/Object;")
	public Object method1158(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method2745();
		for (@Pc(21) Class1_Sub1_Sub10 local21 = (Class1_Sub1_Sub10) this.aClass26_3.method870(local9); local21 != null; local21 = (Class1_Sub1_Sub10) this.aClass26_3.method879()) {
			if (local21.anInterface1_3.method2746(arg0)) {
				@Pc(33) Object local33 = local21.method5108();
				if (local33 != null) {
					if (local21.method5109()) {
						@Pc(59) Class1_Sub1_Sub10_Sub2 local59 = new Class1_Sub1_Sub10_Sub2(arg0, local33);
						this.aClass26_3.method877(local21.aLong215, local59);
						this.aClass4_1.method180(local59);
						local59.aLong208 = 0L;
						local21.method5710();
						local21.method5564();
					} else {
						this.aClass4_1.method180(local21);
						local21.aLong208 = 0L;
					}
					return local33;
				}
				local21.method5710();
				local21.method5564();
				this.anInt1173++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!c;)V")
	private void method1160(@OriginalArg(1) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method2745();
		for (@Pc(22) Class1_Sub1_Sub10 local22 = (Class1_Sub1_Sub10) this.aClass26_3.method870(local9); local22 != null; local22 = (Class1_Sub1_Sub10) this.aClass26_3.method879()) {
			if (local22.anInterface1_3.method2746(arg0)) {
				local22.method5710();
				local22.method5564();
				this.anInt1173++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I")
	public int method1161() {
		return this.anInt1173;
	}
}

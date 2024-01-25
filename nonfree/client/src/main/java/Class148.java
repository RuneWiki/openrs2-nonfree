import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class148 {

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!ek;")
	private final Class54 aClass54_4 = new Class54();

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	private int anInt4505;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	private final int anInt4508;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Lclient!va;")
	private final Class199 aClass199_23;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class148(@OriginalArg(0) int arg0) {
		this.anInt4505 = arg0;
		this.anInt4508 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass199_23 = new Class199(local14);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public void method4059() {
		for (@Pc(10) Class2_Sub11_Sub7 local10 = (Class2_Sub11_Sub7) this.aClass54_4.method1661(); local10 != null; local10 = (Class2_Sub11_Sub7) this.aClass54_4.method1657()) {
			if (local10.method3992()) {
				local10.method5945();
				local10.method5914();
				this.anInt4505++;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!mn;B)V")
	private void method4061(@OriginalArg(0) Interface4 arg0) {
		@Pc(9) long local9 = arg0.method5954();
		for (@Pc(16) Class2_Sub11_Sub7 local16 = (Class2_Sub11_Sub7) this.aClass199_23.method5751(local9); local16 != null; local16 = (Class2_Sub11_Sub7) this.aClass199_23.method5746()) {
			if (local16.anInterface4_3.method5955(arg0)) {
				local16.method5945();
				local16.method5914();
				this.anInt4505++;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!mn;BLjava/lang/Object;)V")
	public void method4062(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Object arg1) {
		this.method4061(arg0);
		if (this.anInt4505 == 0) {
			@Pc(24) Class2_Sub11_Sub7 local24 = (Class2_Sub11_Sub7) this.aClass54_4.method1658();
			local24.method5945();
			local24.method5914();
		} else {
			this.anInt4505--;
		}
		@Pc(44) Class2_Sub11_Sub7_Sub1 local44 = new Class2_Sub11_Sub7_Sub1(arg0, arg1);
		this.aClass199_23.method5749(local44, arg0.method5954());
		this.aClass54_4.method1662(local44);
		local44.aLong212 = 0L;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method4063() {
		this.aClass54_4.method1660();
		this.aClass199_23.method5750();
		this.anInt4505 = this.anInt4508;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)I")
	public int method4064() {
		return this.anInt4505;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)I")
	public int method4065() {
		return this.anInt4508;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
	public void method4069() {
		if (Static279.aClass104_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub11_Sub7 local13 = (Class2_Sub11_Sub7) this.aClass54_4.method1661(); local13 != null; local13 = (Class2_Sub11_Sub7) this.aClass54_4.method1657()) {
			if (local13.method3992()) {
				if (local13.method3998() == null) {
					local13.method5945();
					local13.method5914();
					this.anInt4505++;
				}
			} else if (++local13.aLong212 > (long) 5) {
				@Pc(37) Class2_Sub11_Sub7 local37 = Static279.aClass104_1.method3030(local13);
				this.aClass199_23.method5749(local37, local13.aLong213);
				Static188.method3703(local37, local13);
				local13.method5945();
				local13.method5914();
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!mn;I)Ljava/lang/Object;")
	public Object method4070(@OriginalArg(0) Interface4 arg0) {
		@Pc(18) long local18 = arg0.method5954();
		for (@Pc(25) Class2_Sub11_Sub7 local25 = (Class2_Sub11_Sub7) this.aClass199_23.method5751(local18); local25 != null; local25 = (Class2_Sub11_Sub7) this.aClass199_23.method5746()) {
			if (local25.anInterface4_3.method5955(arg0)) {
				@Pc(37) Object local37 = local25.method3998();
				if (local37 != null) {
					if (local25.method3992()) {
						@Pc(77) Class2_Sub11_Sub7_Sub1 local77 = new Class2_Sub11_Sub7_Sub1(arg0, local37);
						this.aClass199_23.method5749(local77, local25.aLong213);
						this.aClass54_4.method1662(local77);
						local77.aLong212 = 0L;
						local25.method5945();
						local25.method5914();
					} else {
						this.aClass54_4.method1662(local25);
						local25.aLong212 = 0L;
					}
					return local37;
				}
				local25.method5945();
				local25.method5914();
				this.anInt4505++;
			}
		}
		return null;
	}
}

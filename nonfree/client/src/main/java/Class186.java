import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class186 {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_40 = new Class288(256);

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Lclient!n;")
	private final Interface8 anInterface8_91;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_13;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!nd;Lclient!n;)V")
	public Class186(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_91 = arg1;
		this.aClass62_Sub1_13 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public void method4798() {
		this.aClass288_40.method6735(5);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public void method4799() {
		this.aClass288_40.method6744();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lclient!dea;")
	public Interface3 method4800(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass288_40.method6745((long) arg0);
		if (local10 != null) {
			return (Interface3) local10;
		} else if (this.anInterface8_91.method7236(arg0)) {
			@Pc(29) Class271 local29 = this.anInterface8_91.method7237(arg0);
			@Pc(38) int local38 = local29.aBoolean558 ? 64 : this.aClass62_Sub1_13.anInt5681;
			@Pc(82) Interface3 local82;
			if (local29.aBoolean565 && this.aClass62_Sub1_13.method7031()) {
				@Pc(96) float[] local96 = this.anInterface8_91.method7233(0.7F, local38, arg0, local38);
				local82 = this.aClass62_Sub1_13.method4699(local29.aByte77 != 0, local38, Static189.aClass174_6, local38, local96);
			} else {
				@Pc(68) int[] local68 = local29.aBoolean562 ? this.anInterface8_91.method7232(0.7F, local38, arg0, local38) : this.anInterface8_91.method7234(local38, local38, true, arg0, 0.7F);
				local82 = this.aClass62_Sub1_13.method4692(local29.aByte77 != 0, local38, local68, local38);
			}
			local82.method7454(local29.aBoolean559, local29.aBoolean563);
			this.aClass288_40.method6746(local82, (long) arg0);
			return local82;
		} else {
			return null;
		}
	}
}

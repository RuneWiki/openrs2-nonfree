import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class84 {

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!jt;")
	private final Class166 aClass166_15 = new Class166(256);

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_8;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!wu;Lclient!d;)V")
	public Class84(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass100_Sub1_8 = arg0;
		this.anInterface4_2 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method2187() {
		this.aClass166_15.method4811();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method2188() {
		this.aClass166_15.method4809(5);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Lclient!ch;")
	public Interface3 method2190(@OriginalArg(1) int arg0) {
		@Pc(17) Object local17 = this.aClass166_15.method4805((long) arg0);
		if (local17 != null) {
			return (Interface3) local17;
		} else if (this.anInterface4_2.method892(arg0)) {
			@Pc(36) Class325 local36 = this.anInterface4_2.method895(arg0);
			@Pc(45) int local45 = local36.aBoolean633 ? 64 : this.aClass100_Sub1_8.anInt7131;
			@Pc(102) Interface3 local102;
			if (local36.aBoolean635 && this.aClass100_Sub1_8.method8784()) {
				@Pc(114) float[] local114 = this.anInterface4_2.method893(arg0, local45, local45, 0.7F);
				local102 = this.aClass100_Sub1_8.method6124(local45, local114, local36.aByte114 != 0, local45, Static203.aClass250_7);
			} else {
				@Pc(73) int[] local73;
				if (local36.anInt9371 != 2 && Static167.method3083(local36.aByte115)) {
					local73 = this.anInterface4_2.method894(0.7F, true, arg0, local45, local45);
				} else {
					local73 = this.anInterface4_2.method897(arg0, 0.7F, local45, local45);
				}
				local102 = this.aClass100_Sub1_8.method6097(local36.aByte114 != 0, local45, local73, local45);
			}
			local102.method7839(local36.aBoolean637, local36.aBoolean639);
			this.aClass166_15.method4803(local102, (long) arg0);
			return local102;
		} else {
			return null;
		}
	}
}

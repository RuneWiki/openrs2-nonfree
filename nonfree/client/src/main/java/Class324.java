import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class324 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!lga;")
	private final Class207 aClass207_54 = new Class207(256);

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!fa;")
	private final Interface9 anInterface9_14;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_19;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!nv;Lclient!fa;)V")
	public Class324(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_14 = arg1;
		this.aClass78_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lclient!cm;")
	public Interface5 method7159(@OriginalArg(1) int arg0) {
		@Pc(15) Object local15 = this.aClass207_54.method4390((long) arg0);
		if (local15 != null) {
			return (Interface5) local15;
		} else if (this.anInterface9_14.method949(arg0)) {
			@Pc(34) Class17 local34 = this.anInterface9_14.method947(arg0);
			@Pc(43) int local43 = local34.aBoolean33 ? 64 : this.aClass78_Sub1_19.anInt8595;
			@Pc(75) Interface5 local75;
			if (local34.aBoolean28 && this.aClass78_Sub1_19.method6802()) {
				@Pc(60) float[] local60 = this.anInterface9_14.method951(0.7F, local43, arg0, local43);
				local75 = this.aClass78_Sub1_19.method6863(Static429.aClass271_12, local43, local34.aByte16 != 0, local43, local60);
			} else {
				@Pc(105) int[] local105 = !local34.aBoolean27 && Static159.method2597(local34.aByte22) ? this.anInterface9_14.method948(true, arg0, local43, 0.7F, local43) : this.anInterface9_14.method952(0.7F, local43, local43, arg0);
				local75 = this.aClass78_Sub1_19.method6874(local34.aByte16 != 0, local105, local43, local43);
			}
			local75.method7314(local34.aBoolean26, local34.aBoolean30);
			this.aClass207_54.method4391((long) arg0, local75);
			return local75;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method7160() {
		this.aClass207_54.method4397(5);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public void method7161() {
		this.aClass207_54.method4392();
	}
}

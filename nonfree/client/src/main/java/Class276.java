import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class276 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!lga;")
	private final Class207 aClass207_45 = new Class207(256);

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "Lclient!fa;")
	private final Interface9 anInterface9_11;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_33;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!lj;Lclient!fa;)V")
	public Class276(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_11 = arg1;
		this.aClass78_Sub3_33 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	public void method5857() {
		this.aClass207_45.method4397(5);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
	public void method5858() {
		this.aClass207_45.method4392();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)Lclient!cw;")
	public Class46_Sub2 method5859(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass207_45.method4390((long) arg0);
		if (local12 != null) {
			return (Class46_Sub2) local12;
		} else if (this.anInterface9_11.method949(arg0)) {
			@Pc(36) Class17 local36 = this.anInterface9_11.method947(arg0);
			@Pc(45) int local45 = local36.aBoolean33 ? 64 : this.aClass78_Sub3_33.anInt5549;
			@Pc(102) Class46_Sub2 local102;
			if (local36.aBoolean28 && this.aClass78_Sub3_33.method6802()) {
				@Pc(114) float[] local114 = this.anInterface9_11.method951(0.7F, local45, arg0, local45);
				local102 = new Class46_Sub2(this.aClass78_Sub3_33, 3553, 34842, local45, local45, local36.aByte16 != 0, local114, 6408);
			} else {
				@Pc(70) int[] local70;
				if (!local36.aBoolean27 && Static159.method2597(local36.aByte22)) {
					local70 = this.anInterface9_11.method948(true, arg0, local45, 0.7F, local45);
				} else {
					local70 = this.anInterface9_11.method952(0.7F, local45, local45, arg0);
				}
				local102 = new Class46_Sub2(this.aClass78_Sub3_33, 3553, 6408, local45, local45, local36.aByte16 != 0, local70, 0, 0, false);
			}
			local102.method5150(local36.aBoolean30, local36.aBoolean26);
			this.aClass207_45.method4391((long) arg0, local102);
			return local102;
		} else {
			return null;
		}
	}
}

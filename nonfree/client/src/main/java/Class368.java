import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class368 {

	@OriginalMember(owner = "client!vw", name = "i", descriptor = "Lclient!fc;")
	private final Class94 aClass94_66 = new Class94(256);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_12;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_41;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!ac;Lclient!d;)V")
	public Class368(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_12 = arg1;
		this.aClass5_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Lclient!aaa;")
	public Class2_Sub1 method8473(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass94_66.method2960((long) arg0);
		if (local12 != null) {
			return (Class2_Sub1) local12;
		} else if (this.anInterface7_12.method6928(arg0)) {
			@Pc(36) Class254 local36 = this.anInterface7_12.method6931(arg0);
			@Pc(45) int local45 = local36.aBoolean616 ? 64 : this.aClass5_Sub1_41.anInt357;
			@Pc(83) Class2_Sub1 local83;
			if (local36.aBoolean614 && this.aClass5_Sub1_41.method6131()) {
				@Pc(62) float[] local62 = this.anInterface7_12.method6930(arg0, local45, 0.7F, local45);
				local83 = new Class2_Sub1(this.aClass5_Sub1_41, 3553, 34842, local45, local45, local36.aByte99 != 0, local62, 6408);
			} else {
				@Pc(106) int[] local106;
				if (local36.anInt7796 != 2 && Static108.method2479(local36.aByte95)) {
					local106 = this.anInterface7_12.method6929(arg0, local45, 0.7F, true, local45);
				} else {
					local106 = this.anInterface7_12.method6933(local45, arg0, 0.7F, local45);
				}
				local83 = new Class2_Sub1(this.aClass5_Sub1_41, 3553, 6408, local45, local45, local36.aByte99 != 0, local106, 0, 0, false);
			}
			local83.method4205(local36.aBoolean615, local36.aBoolean619);
			this.aClass94_66.method2963((long) arg0, local83);
			return local83;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public void method8475() {
		this.aClass94_66.method2958(5);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
	public void method8476() {
		this.aClass94_66.method2952();
	}
}

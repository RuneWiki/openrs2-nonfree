import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class325 {

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lclient!au;")
	private final Class21 aClass21_80 = new Class21(256);

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_39;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "Lclient!fa;")
	private final Interface9 anInterface9_9;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!uca;Lclient!fa;)V")
	public Class325(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Interface9 arg1) {
		this.aClass162_Sub3_39 = arg0;
		this.anInterface9_9 = arg1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Z)V")
	public void method6613() {
		this.aClass21_80.method313();
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Z)V")
	public void method6615() {
		this.aClass21_80.method323(5);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lclient!aaa;")
	public Class3_Sub1 method6617(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass21_80.method324((long) arg0);
		if (local12 != null) {
			return (Class3_Sub1) local12;
		} else if (this.anInterface9_9.method1073(arg0)) {
			@Pc(36) Class291 local36 = this.anInterface9_9.method1074(arg0);
			@Pc(45) int local45 = local36.aBoolean602 ? 64 : this.aClass162_Sub3_39.anInt8684;
			@Pc(83) Class3_Sub1 local83;
			if (local36.aBoolean596 && this.aClass162_Sub3_39.method6880()) {
				@Pc(62) float[] local62 = this.anInterface9_9.method1072(local45, 0.7F, arg0, local45);
				local83 = new Class3_Sub1(this.aClass162_Sub3_39, 3553, 34842, local45, local45, local36.aByte99 != 0, local62, 6408);
			} else {
				@Pc(107) int[] local107;
				if (!local36.aBoolean599 && Static134.method1812(local36.aByte96)) {
					local107 = this.anInterface9_9.method1076(0.7F, local45, true, local45, arg0);
				} else {
					local107 = this.anInterface9_9.method1075(local45, local45, 0.7F, arg0);
				}
				local83 = new Class3_Sub1(this.aClass162_Sub3_39, 3553, 6408, local45, local45, local36.aByte99 != 0, local107, 0, 0, false);
			}
			local83.method1720(local36.aBoolean597, local36.aBoolean600);
			this.aClass21_80.method317(local83, (long) arg0);
			return local83;
		} else {
			return null;
		}
	}
}

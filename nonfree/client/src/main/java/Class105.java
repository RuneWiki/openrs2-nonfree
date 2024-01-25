import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class105 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!ka;")
	private final Class132 aClass132_19 = new Class132(256);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_19;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!l;")
	private final Interface9 anInterface9_8;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!pg;Lclient!l;)V")
	public Class105(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Interface9 arg1) {
		this.aClass163_Sub2_19 = arg0;
		this.anInterface9_8 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method2195() {
		this.aClass132_19.method2698();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Lclient!bd;")
	public Class20_Sub1 method2196(@OriginalArg(1) int arg0) {
		@Pc(17) Object local17 = this.aClass132_19.method2701((long) arg0);
		if (local17 != null) {
			return (Class20_Sub1) local17;
		} else if (this.anInterface9_8.method1773(arg0)) {
			@Pc(36) Class158 local36 = this.anInterface9_8.method1769(arg0);
			@Pc(45) int local45 = local36.aBoolean283 ? 64 : this.aClass163_Sub2_19.anInt5217;
			@Pc(80) Class20_Sub1 local80;
			if (local36.aBoolean277 && this.aClass163_Sub2_19.method5555()) {
				@Pc(62) float[] local62 = this.anInterface9_8.method1771(local45, local45, arg0, 0.7F);
				local80 = new Class20_Sub1(this.aClass163_Sub2_19, 3553, 34842, local45, local45, local36.aByte46 != 0, local62, 6408);
			} else {
				@Pc(102) short local102;
				@Pc(100) int[] local100;
				if (local36.aBoolean280 && Static53.method743(local36.aByte43)) {
					local100 = this.anInterface9_8.method1770(local45, arg0, 0.7F, false, local45);
					local102 = 6407;
				} else {
					local102 = 6408;
					local100 = this.anInterface9_8.method1772(local45, 0.7F, arg0, local45);
				}
				local80 = new Class20_Sub1(this.aClass163_Sub2_19, 3553, local102, local45, local45, local36.aByte46 != 0, local100, false);
			}
			local80.method2040(local36.aBoolean278, local36.aBoolean285);
			this.aClass132_19.method2711(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	public void method2197() {
		this.aClass132_19.method2713(5);
	}
}

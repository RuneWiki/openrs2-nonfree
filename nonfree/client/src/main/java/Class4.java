import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!de;")
	private final Class69 aClass69_1 = new Class69(256);

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_1;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_1;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!ij;Lclient!d;)V")
	public Class4(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_1 = arg1;
		this.aClass13_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Lclient!wk;")
	public Interface27 method70(@OriginalArg(0) int arg0) {
		@Pc(14) Object local14 = this.aClass69_1.method1919((long) arg0);
		if (local14 != null) {
			return (Interface27) local14;
		} else if (this.anInterface2_1.method6026(arg0)) {
			@Pc(33) Class271 local33 = this.anInterface2_1.method6027(arg0);
			@Pc(42) int local42 = local33.aBoolean516 ? 64 : this.aClass13_Sub3_1.anInt9744;
			@Pc(74) Interface27 local74;
			if (local33.aBoolean511 && this.aClass13_Sub3_1.method8093()) {
				@Pc(59) float[] local59 = this.anInterface2_1.method6022(0.7F, arg0, local42, local42);
				local74 = this.aClass13_Sub3_1.method8239(local59, local42, local42, Static78.aClass104_3, local33.aByte96 != 0);
			} else {
				@Pc(97) int[] local97;
				if (local33.anInt7162 != 2 && Static265.method4367(local33.aByte94)) {
					local97 = this.anInterface2_1.method6024(local42, arg0, true, local42, 0.7F);
				} else {
					local97 = this.anInterface2_1.method6023(local42, 0.7F, arg0, local42);
				}
				local74 = this.aClass13_Sub3_1.method8257(local33.aByte96 != 0, local97, local42, local42);
			}
			local74.method7134(local33.aBoolean510, local33.aBoolean513);
			this.aClass69_1.method1917((long) arg0, local74);
			return local74;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	public void method72() {
		this.aClass69_1.method1905();
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	public void method73() {
		this.aClass69_1.method1910(5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class91 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!fba;")
	private final Class102 aClass102_19 = new Class102(256);

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "Lclient!d;")
	private final Interface7 anInterface7_7;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ch;Lclient!d;)V")
	public Class91(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_7 = arg1;
		this.aClass5_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public void method2519() {
		this.aClass102_19.method2681();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public void method2520() {
		this.aClass102_19.method2668(5);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lclient!ug;")
	public Interface24 method2522(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass102_19.method2677((long) arg0);
		if (local12 != null) {
			return (Interface24) local12;
		} else if (this.anInterface7_7.method8115(arg0)) {
			@Pc(33) Class195 local33 = this.anInterface7_7.method8118(arg0);
			@Pc(42) int local42 = local33.aBoolean364 ? 64 : this.aClass5_Sub1_7.anInt6517;
			@Pc(101) Interface24 local101;
			if (local33.aBoolean367 && this.aClass5_Sub1_7.method7516()) {
				@Pc(113) float[] local113 = this.anInterface7_7.method8114(arg0, 0.7F, local42, local42);
				local101 = this.aClass5_Sub1_7.method5672(local33.aByte78 != 0, Static502.aClass182_14, local42, local42, local113);
			} else {
				@Pc(70) int[] local70;
				if (local33.anInt5424 != 2 && Static433.method6773(local33.aByte83)) {
					local70 = this.anInterface7_7.method8116(true, local42, arg0, local42, 0.7F);
				} else {
					local70 = this.anInterface7_7.method8117(local42, 0.7F, local42, arg0);
				}
				local101 = this.aClass5_Sub1_7.method5633(local33.aByte78 != 0, local42, local42, local70);
			}
			local101.method7475(local33.aBoolean366, local33.aBoolean363);
			this.aClass102_19.method2674((long) arg0, local101);
			return local101;
		} else {
			return null;
		}
	}
}

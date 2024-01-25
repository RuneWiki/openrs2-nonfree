import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class166 {

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!dka;")
	private final Class85 aClass85_28 = new Class85(256);

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_10;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!lb;Lclient!d;)V")
	public Class166(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_3 = arg1;
		this.aClass145_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public void method3566() {
		this.aClass85_28.method1742(5);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public void method3568() {
		this.aClass85_28.method1748();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lclient!de;")
	public Interface4 method3570(@OriginalArg(1) int arg0) {
		@Pc(20) Object local20 = this.aClass85_28.method1737((long) arg0);
		if (local20 != null) {
			return (Interface4) local20;
		} else if (this.anInterface3_3.method2852(arg0)) {
			@Pc(41) Class8 local41 = this.anInterface3_3.method2857(arg0);
			@Pc(51) int local51 = local41.aBoolean28 ? 64 : this.aClass145_Sub1_10.anInt11266;
			@Pc(86) Interface4 local86;
			if (local41.aBoolean29 && this.aClass145_Sub1_10.method9632()) {
				@Pc(70) float[] local70 = this.anInterface3_3.method2855(0.7F, local51, local51, arg0);
				local86 = this.aClass145_Sub1_10.method9723(local41.aByte10 != 0, local70, local51, Static165.aClass295_6, local51);
			} else {
				@Pc(113) int[] local113;
				if (local41.anInt186 != 2 && Static183.method2653(local41.aByte15)) {
					local113 = this.anInterface3_3.method2853(arg0, 0.7F, local51, local51, true);
				} else {
					local113 = this.anInterface3_3.method2854(local51, arg0, local51, 0.7F);
				}
				local86 = this.aClass145_Sub1_10.method9753(local113, local41.aByte10 != 0, local51, local51);
			}
			local86.method6853(local41.aBoolean31, local41.aBoolean33);
			this.aClass85_28.method1745((long) arg0, 16383, local86);
			return local86;
		} else {
			return null;
		}
	}
}

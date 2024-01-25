import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class262 {

	@OriginalMember(owner = "client!oha", name = "k", descriptor = "Lclient!aq;")
	private final Class22 aClass22_37 = new Class22(256);

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_25;

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_11;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!lea;Lclient!d;)V")
	public Class262(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass101_Sub2_25 = arg0;
		this.anInterface3_11 = arg1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public void method7038() {
		this.aClass22_37.method461();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
	public void method7041() {
		this.aClass22_37.method468(5);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)Lclient!wi;")
	public Class50_Sub4 method7044(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass22_37.method462((long) arg0);
		if (local12 != null) {
			return (Class50_Sub4) local12;
		} else if (this.anInterface3_11.method1940(arg0)) {
			@Pc(39) Class136 local39 = this.anInterface3_11.method1941(arg0);
			@Pc(48) int local48 = local39.aBoolean333 ? 64 : this.aClass101_Sub2_25.anInt6307;
			@Pc(106) Class50_Sub4 local106;
			if (local39.aBoolean336 && this.aClass101_Sub2_25.method8101()) {
				@Pc(118) float[] local118 = this.anInterface3_11.method1942(local48, local48, 0.7F, arg0);
				local106 = new Class50_Sub4(this.aClass101_Sub2_25, 3553, 34842, local48, local48, local39.aByte63 != 0, local118, 6408);
			} else {
				@Pc(74) int[] local74;
				if (local39.anInt4370 != 2 && Static155.method3183(local39.aByte62)) {
					local74 = this.anInterface3_11.method1938(true, 0.7F, local48, arg0, local48);
				} else {
					local74 = this.anInterface3_11.method1939(0.7F, arg0, local48, local48);
				}
				local106 = new Class50_Sub4(this.aClass101_Sub2_25, 3553, 6408, local48, local48, local39.aByte63 != 0, local74, 0, 0, false);
			}
			local106.method9152(local39.aBoolean331, local39.aBoolean335);
			this.aClass22_37.method470((long) arg0, local106);
			return local106;
		} else {
			return null;
		}
	}
}

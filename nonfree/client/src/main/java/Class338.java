import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class338 {

	@OriginalMember(owner = "client!sja", name = "g", descriptor = "Lclient!dka;")
	private final Class85 aClass85_58 = new Class85(256);

	@OriginalMember(owner = "client!sja", name = "f", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_9;

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_40;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(Lclient!uja;Lclient!d;)V")
	public Class338(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_9 = arg1;
		this.aClass145_Sub3_40 = arg0;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(II)Lclient!ng;")
	public Class64_Sub4 method8121(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass85_58.method1737((long) arg0);
		if (local12 != null) {
			return (Class64_Sub4) local12;
		} else if (this.anInterface3_9.method2852(arg0)) {
			@Pc(41) Class8 local41 = this.anInterface3_9.method2857(arg0);
			@Pc(51) int local51 = local41.aBoolean28 ? 64 : this.aClass145_Sub3_40.anInt10128;
			@Pc(121) Class64_Sub4 local121;
			if (local41.aBoolean29 && this.aClass145_Sub3_40.method9632()) {
				@Pc(133) float[] local133 = this.anInterface3_9.method2855(0.7F, local51, local51, arg0);
				local121 = new Class64_Sub4(this.aClass145_Sub3_40, 3553, 34842, local51, local51, local41.aByte10 != 0, local133, 6408);
			} else {
				@Pc(85) int[] local85;
				if (local41.anInt186 != 2 && Static183.method2653(local41.aByte15)) {
					local85 = this.anInterface3_9.method2853(arg0, 0.7F, local51, local51, true);
				} else {
					local85 = this.anInterface3_9.method2854(local51, arg0, local51, 0.7F);
				}
				local121 = new Class64_Sub4(this.aClass145_Sub3_40, 3553, 6408, local51, local51, local41.aByte10 != 0, local85, 0, 0, false);
			}
			local121.method4548(local41.aBoolean31, local41.aBoolean33);
			this.aClass85_58.method1745((long) arg0, 16383, local121);
			return local121;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)V")
	public void method8122() {
		this.aClass85_58.method1748();
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
	public void method8125() {
		this.aClass85_58.method1742(5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class219 {

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!bh;")
	private final Class32 aClass32_55 = new Class32(256);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_13;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_18;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!pga;Lclient!d;)V")
	public Class219(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Interface6 arg1) {
		this.aClass95_Sub3_13 = arg0;
		this.anInterface6_18 = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Lclient!oia;")
	public Interface19 method4622(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass32_55.method630((long) arg0);
		if (local12 != null) {
			return (Interface19) local12;
		} else if (this.anInterface6_18.method1493(arg0)) {
			@Pc(36) Class175 local36 = this.anInterface6_18.method1492(arg0);
			@Pc(45) int local45 = local36.aBoolean309 ? 64 : this.aClass95_Sub3_13.anInt8361;
			@Pc(80) Interface19 local80;
			if (local36.aBoolean303 && this.aClass95_Sub3_13.method6951()) {
				@Pc(62) float[] local62 = this.anInterface6_18.method1490(local45, arg0, 0.7F, local45);
				local80 = this.aClass95_Sub3_13.method7042(local36.aByte55 != 0, local45, local45, local62, Static393.aClass188_12);
			} else {
				@Pc(101) int[] local101;
				if (local36.anInt4384 != 2 && Static207.method2926(local36.aByte52)) {
					local101 = this.anInterface6_18.method1489(true, local45, 0.7F, local45, arg0);
				} else {
					local101 = this.anInterface6_18.method1488(0.7F, local45, arg0, local45);
				}
				local80 = this.aClass95_Sub3_13.method7116(local36.aByte55 != 0, local45, local45, local101);
			}
			local80.method3138(local36.aBoolean307, local36.aBoolean304);
			this.aClass32_55.method629(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public void method4626() {
		this.aClass32_55.method634(5);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method4627() {
		this.aClass32_55.method640();
	}
}

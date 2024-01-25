import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15 {

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!pja;")
	private final Class279 aClass279_1 = new Class279(256);

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!sf;Lclient!d;)V")
	public Class15(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass16_Sub1_1 = arg0;
		this.anInterface5_1 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public void method138() {
		this.aClass279_1.method6638();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	public void method141() {
		this.aClass279_1.method6630(5);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lclient!gl;")
	public Interface11 method143(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass279_1.method6631((long) arg0);
		if (local12 != null) {
			return (Interface11) local12;
		} else if (this.anInterface5_1.method5197(arg0)) {
			@Pc(38) Class342 local38 = this.anInterface5_1.method5193(arg0);
			@Pc(47) int local47 = local38.aBoolean695 ? 64 : this.aClass16_Sub1_1.anInt7437;
			@Pc(99) Interface11 local99;
			if (local38.aBoolean689 && this.aClass16_Sub1_1.method8186()) {
				@Pc(111) float[] local111 = this.anInterface5_1.method5196(arg0, local47, 0.7F, local47);
				local99 = this.aClass16_Sub1_1.method6314(local38.aByte125 != 0, local47, Static264.aClass361_8, local47, local111);
			} else {
				@Pc(73) int[] local73;
				if (local38.anInt9280 != 2 && Static402.method5742(local38.aByte129)) {
					local73 = this.anInterface5_1.method5192(0.7F, local47, true, arg0, local47);
				} else {
					local73 = this.anInterface5_1.method5195(local47, arg0, 0.7F, local47);
				}
				local99 = this.aClass16_Sub1_1.method6276(local47, local38.aByte125 != 0, local47, local73);
			}
			local99.method8761(local38.aBoolean696, local38.aBoolean692);
			this.aClass279_1.method6635(local99, (long) arg0);
			return local99;
		} else {
			return null;
		}
	}
}

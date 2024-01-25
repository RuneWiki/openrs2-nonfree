import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class56 {

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "Lclient!af;")
	private final Class10 aClass10_4 = new Class10(256);

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_6;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!lba;Lclient!d;)V")
	public Class56(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Interface6 arg1) {
		this.anInterface6_1 = arg1;
		this.aClass132_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public void method1467() {
		this.aClass10_4.method375();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public void method1468() {
		this.aClass10_4.method369(5);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Lclient!bw;")
	public Interface2 method1471(@OriginalArg(0) int arg0) {
		@Pc(17) Object local17 = this.aClass10_4.method373((long) arg0);
		if (local17 != null) {
			return (Interface2) local17;
		} else if (this.anInterface6_1.method7090(arg0)) {
			@Pc(36) Class294 local36 = this.anInterface6_1.method7088(arg0);
			@Pc(45) int local45 = local36.aBoolean574 ? 64 : this.aClass132_Sub1_6.anInt8997;
			@Pc(97) Interface2 local97;
			if (local36.aBoolean568 && this.aClass132_Sub1_6.method7466()) {
				@Pc(109) float[] local109 = this.anInterface6_1.method7086(0.7F, local45, local45, arg0);
				local97 = this.aClass132_Sub1_6.method7545(local109, local45, local45, local36.aByte119 != 0, Static169.aClass265_9);
			} else {
				@Pc(71) int[] local71;
				if (local36.anInt8333 != 2 && Static588.method8145(local36.aByte120)) {
					local71 = this.anInterface6_1.method7085(local45, true, arg0, 0.7F, local45);
				} else {
					local71 = this.anInterface6_1.method7089(arg0, 0.7F, local45, local45);
				}
				local97 = this.aClass132_Sub1_6.method7590(local45, local45, local36.aByte119 != 0, local71);
			}
			local97.method8901(local36.aBoolean569, local36.aBoolean570);
			this.aClass10_4.method366(local97, (long) arg0);
			return local97;
		} else {
			return null;
		}
	}
}

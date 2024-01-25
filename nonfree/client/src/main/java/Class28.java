import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class28 {

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_5 = new Class307(256);

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_2;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!aq;Lclient!d;)V")
	public Class28(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass22_Sub1_2 = arg0;
		this.anInterface4_3 = arg1;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method1032() {
		this.aClass307_5.method7006();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lclient!fu;")
	public Class125_Sub1 method1035(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass307_5.method7002((long) arg0);
		if (local12 != null) {
			return (Class125_Sub1) local12;
		} else if (this.anInterface4_3.method5758(arg0)) {
			@Pc(33) Class406 local33 = this.anInterface4_3.method5761(arg0);
			@Pc(43) int local43 = local33.aBoolean762 ? 64 : this.aClass22_Sub1_2.anInt988;
			@Pc(113) Class125_Sub1 local113;
			if (local33.aBoolean763 && this.aClass22_Sub1_2.method9332()) {
				@Pc(125) float[] local125 = this.anInterface4_3.method5762(local43, 0.7F, local43, arg0);
				local113 = new Class125_Sub1(this.aClass22_Sub1_2, 3553, 34842, local43, local43, local33.aByte148 != 0, local125, 6408);
			} else {
				@Pc(77) int[] local77;
				if (local33.anInt11143 != 2 && Static263.method3737(local33.aByte149)) {
					local77 = this.anInterface4_3.method5760(local43, local43, true, 0.7F, arg0);
				} else {
					local77 = this.anInterface4_3.method5757(local43, local43, arg0, 0.7F);
				}
				local113 = new Class125_Sub1(this.aClass22_Sub1_2, 3553, 6408, local43, local43, local33.aByte148 != 0, local77, 0, 0, false);
			}
			local113.method9224(local33.aBoolean759, local33.aBoolean766);
			this.aClass307_5.method7000(local113, (long) arg0);
			return local113;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
	public void method1037() {
		this.aClass307_5.method6995(5);
	}
}

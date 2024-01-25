import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class217 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!fg;")
	private final Class70 aClass70_108 = new Class70(256);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!cj;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_41;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ge;Lclient!cj;)V")
	public Class217(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_6 = arg1;
		this.aClass81_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method5731() {
		this.aClass70_108.method1399();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)Lclient!lb;")
	public Class28_Sub3 method5732(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass70_108.method1396((long) arg0);
		if (local6 != null) {
			return (Class28_Sub3) local6;
		} else if (this.anInterface2_6.method349(arg0)) {
			@Pc(32) Class82 local32 = this.anInterface2_6.method346(arg0);
			@Pc(39) int local39 = local32.aBoolean165 ? 64 : 128;
			@Pc(79) Class28_Sub3 local79;
			if (local32.aBoolean164 && this.aClass81_Sub1_41.method3024()) {
				@Pc(90) float[] local90 = this.anInterface2_6.method348(arg0, local39, 0.7F, local39);
				local79 = new Class28_Sub3(this.aClass81_Sub1_41, 3553, 34842, local39, local39, local32.aByte25 != 0, local90, 6408);
			} else {
				@Pc(58) int[] local58 = this.anInterface2_6.method345(arg0, local39, 0.7F, local39);
				local79 = new Class28_Sub3(this.aClass81_Sub1_41, 3553, 6408, local39, local39, local32.aByte25 != 0, local58, false);
			}
			local79.method1257(local32.aBoolean159, local32.aBoolean163);
			this.aClass70_108.method1406(local79, (long) arg0);
			return local79;
		} else {
			return null;
		}
	}
}

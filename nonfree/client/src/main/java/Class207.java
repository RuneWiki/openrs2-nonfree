import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class207 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!bj;")
	private final Class26 aClass26_58 = new Class26(256);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!ja;")
	private final Interface2 anInterface2_8;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_40;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!tb;Lclient!ja;)V")
	public Class207(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_8 = arg1;
		this.aClass129_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method5500() {
		this.aClass26_58.method333();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)Lclient!im;")
	public Class56_Sub4 method5501(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass26_58.method332((long) arg0);
		if (local12 != null) {
			return (Class56_Sub4) local12;
		} else if (this.anInterface2_8.method2246(arg0)) {
			@Pc(33) Class134 local33 = this.anInterface2_8.method2244(arg0);
			@Pc(40) int local40 = local33.aBoolean259 ? 64 : 128;
			@Pc(78) Class56_Sub4 local78;
			if (local33.aBoolean257 && this.aClass129_Sub2_40.method5020()) {
				@Pc(89) float[] local89 = this.anInterface2_8.method2245(local40, arg0, local40, 0.7F);
				local78 = new Class56_Sub4(this.aClass129_Sub2_40, 3553, 34842, local40, local40, local33.aByte47 != 0, local89, 6408);
			} else {
				@Pc(57) int[] local57 = this.anInterface2_8.method2247(local40, 0.7F, local40, arg0);
				local78 = new Class56_Sub4(this.aClass129_Sub2_40, 3553, 6408, local40, local40, local33.aByte47 != 0, local57, false);
			}
			local78.method2553(local33.aBoolean252, local33.aBoolean260);
			this.aClass26_58.method330((long) arg0, local78);
			return local78;
		} else {
			return null;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class59 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!ad;")
	private final Class5 aClass5_10 = new Class5(64);

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!dn;")
	private final Class56 aClass56_18;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!dn;")
	private final Class56 aClass56_19;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(ILclient!dn;Lclient!dn;)V")
	public Class59(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_18 = arg2;
		this.aClass56_19 = arg1;
		if (this.aClass56_19 != null) {
			this.aClass56_19.method1373(0);
		}
		if (this.aClass56_18 != null) {
			this.aClass56_18.method1373(0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)Lclient!nk;")
	public Class3_Sub3_Sub15 method1410(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub3_Sub15 local19 = (Class3_Sub3_Sub15) this.aClass5_10.method104((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass56_19.method1384(0, arg0);
		} else {
			local33 = this.aClass56_18.method1384(0, arg0 & 0x7FFF);
		}
		local19 = new Class3_Sub3_Sub15();
		if (local33 != null) {
			local19.method4025(new Class3_Sub2(local33));
		}
		if (arg0 >= 32768) {
			local19.method4024();
		}
		this.aClass5_10.method114((long) arg0, local19);
		return local19;
	}
}

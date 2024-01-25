import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jma")
public final class Class191 {

	@OriginalMember(owner = "client!jma", name = "f", descriptor = "Lclient!si;")
	private final Class338 aClass338_28 = new Class338(128);

	@OriginalMember(owner = "client!jma", name = "c", descriptor = "Lclient!lb;")
	private final Class221 aClass221_90;

	@OriginalMember(owner = "client!jma", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class191(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_90 = arg2;
		if (this.aClass221_90 != null) {
			@Pc(20) int local20 = this.aClass221_90.method5080() - 1;
			this.aClass221_90.method5065(local20);
		}
	}

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "(II)Lclient!cu;")
	public Class59 method4685(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_28;
		@Pc(16) Class59 local16;
		synchronized (this.aClass338_28) {
			local16 = (Class59) this.aClass338_28.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass221_90.method5089(Static396.method5958(arg0), Static270.method4124(arg0));
		local16 = new Class59();
		if (local38 != null) {
			local16.method1291(new Class3_Sub28(local38));
		}
		@Pc(64) Class338 local64 = this.aClass338_28;
		synchronized (this.aClass338_28) {
			this.aClass338_28.method8044((long) arg0, local16);
			return local16;
		}
	}
}

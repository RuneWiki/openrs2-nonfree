import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class191 {

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!fr;")
	private final Class91 aClass91_76 = new Class91(128);

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Lclient!qs;")
	private final Class211 aClass211_71;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class191(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_71 = arg2;
		this.aClass211_71.method4772(1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)Lclient!rl;")
	public Class217 method4336(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_76;
		@Pc(16) Class217 local16;
		synchronized (this.aClass91_76) {
			local16 = (Class217) this.aClass91_76.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class211 local35 = this.aClass211_71;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_71) {
			local44 = this.aClass211_71.method4758(arg0, 1);
		}
		local16 = new Class217();
		if (local44 != null) {
			local16.method4974(new Class1_Sub3(local44));
		}
		@Pc(66) Class91 local66 = this.aClass91_76;
		synchronized (this.aClass91_76) {
			this.aClass91_76.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public void method4337() {
		@Pc(6) Class91 local6 = this.aClass91_76;
		synchronized (this.aClass91_76) {
			this.aClass91_76.method1993();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	public void method4338() {
		@Pc(2) Class91 local2 = this.aClass91_76;
		synchronized (this.aClass91_76) {
			this.aClass91_76.method1999();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
	public void method4339() {
		@Pc(6) Class91 local6 = this.aClass91_76;
		synchronized (this.aClass91_76) {
			this.aClass91_76.method1998(5);
		}
	}
}

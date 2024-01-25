import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class143 {

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!fr;")
	private final Class91 aClass91_58 = new Class91(64);

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!qs;")
	private final Class211 aClass211_54;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!qs;")
	public final Class211 aClass211_53;

	static {
		new Class158("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;)V")
	public Class143(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_54 = arg2;
		this.aClass211_53 = arg3;
		this.aClass211_54.method4772(3);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public void method3314() {
		@Pc(6) Class91 local6 = this.aClass91_58;
		synchronized (this.aClass91_58) {
			this.aClass91_58.method1998(5);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method3316() {
		@Pc(2) Class91 local2 = this.aClass91_58;
		synchronized (this.aClass91_58) {
			this.aClass91_58.method1999();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Lclient!dp;")
	public Class59 method3319(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_58;
		@Pc(25) Class59 local25;
		synchronized (this.aClass91_58) {
			local25 = (Class59) this.aClass91_58.method1988((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class211 local38 = this.aClass211_54;
		@Pc(47) byte[] local47;
		synchronized (this.aClass211_54) {
			local47 = this.aClass211_54.method4758(arg0, 3);
		}
		local25 = new Class59();
		local25.aClass143_2 = this;
		if (local47 != null) {
			local25.method1503(new Class1_Sub3(local47));
		}
		local6 = this.aClass91_58;
		synchronized (this.aClass91_58) {
			this.aClass91_58.method1990(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public void method3320() {
		@Pc(2) Class91 local2 = this.aClass91_58;
		synchronized (this.aClass91_58) {
			this.aClass91_58.method1993();
		}
	}
}

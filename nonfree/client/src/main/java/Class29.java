import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class29 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!si;")
	private final Class338 aClass338_2 = new Class338(64);

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Lclient!lb;")
	public final Class221 aClass221_9;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!lb;")
	private final Class221 aClass221_10;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class29(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_9 = arg3;
		this.aClass221_10 = arg2;
		this.aClass221_10.method5065(3);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public void method642() {
		@Pc(9) Class338 local9 = this.aClass338_2;
		synchronized (this.aClass338_2) {
			this.aClass338_2.method8047();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public void method643() {
		@Pc(9) Class338 local9 = this.aClass338_2;
		synchronized (this.aClass338_2) {
			this.aClass338_2.method8051();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Lclient!fn;")
	public Class120 method644(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_2;
		@Pc(16) Class120 local16;
		synchronized (this.aClass338_2) {
			local16 = (Class120) this.aClass338_2.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_10;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_10) {
			local39 = this.aClass221_10.method5089(arg0, 3);
		}
		local16 = new Class120();
		local16.aClass29_1 = this;
		if (local39 != null) {
			local16.method2838(new Class3_Sub28(local39));
		}
		@Pc(66) Class338 local66 = this.aClass338_2;
		synchronized (this.aClass338_2) {
			this.aClass338_2.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public void method645() {
		@Pc(12) Class338 local12 = this.aClass338_2;
		synchronized (this.aClass338_2) {
			this.aClass338_2.method8052(5);
		}
	}
}

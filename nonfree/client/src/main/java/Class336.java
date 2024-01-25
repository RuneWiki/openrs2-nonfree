import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class336 {

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "Lclient!si;")
	private final Class338 aClass338_54 = new Class338(64);

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lclient!si;")
	public final Class338 aClass338_55 = new Class338(2);

	@OriginalMember(owner = "client!sfa", name = "p", descriptor = "Lclient!lb;")
	private final Class221 aClass221_145;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lclient!lb;")
	public final Class221 aClass221_146;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class336(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_145 = arg2;
		this.aClass221_146 = arg3;
		this.aClass221_145.method5065(33);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BI)Lclient!bk;")
	public Class31 method7995(@OriginalArg(1) int arg0) {
		@Pc(12) Class338 local12 = this.aClass338_54;
		@Pc(22) Class31 local22;
		synchronized (this.aClass338_54) {
			local22 = (Class31) this.aClass338_54.method8049((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class221 local36 = this.aClass221_145;
		@Pc(45) byte[] local45;
		synchronized (this.aClass221_145) {
			local45 = this.aClass221_145.method5089(arg0, 33);
		}
		local22 = new Class31();
		local22.aClass336_1 = this;
		if (local45 != null) {
			local22.method675(new Class3_Sub28(local45));
		}
		@Pc(72) Class338 local72 = this.aClass338_54;
		synchronized (this.aClass338_54) {
			this.aClass338_54.method8044((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
	public void method7999() {
		@Pc(2) Class338 local2 = this.aClass338_54;
		synchronized (this.aClass338_54) {
			this.aClass338_54.method8047();
		}
		@Pc(29) Class338 local29 = this.aClass338_55;
		synchronized (this.aClass338_55) {
			this.aClass338_55.method8047();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IB)V")
	public void method8000() {
		@Pc(2) Class338 local2 = this.aClass338_54;
		synchronized (this.aClass338_54) {
			this.aClass338_54.method8052(5);
		}
		local2 = this.aClass338_55;
		synchronized (this.aClass338_55) {
			this.aClass338_55.method8052(5);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)V")
	public void method8001() {
		@Pc(9) Class338 local9 = this.aClass338_54;
		synchronized (this.aClass338_54) {
			this.aClass338_54.method8051();
		}
		local9 = this.aClass338_55;
		synchronized (this.aClass338_55) {
			this.aClass338_55.method8051();
		}
	}
}

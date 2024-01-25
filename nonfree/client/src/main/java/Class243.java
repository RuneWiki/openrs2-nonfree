import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class243 {

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "J")
	private long aLong208 = -1L;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "Lclient!sja;")
	private final Class342 aClass342_47 = new Class342();

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class243(@OriginalArg(0) Class3_Sub2 arg0) {
		this.method5361(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!ika;)V")
	private void method5361(@OriginalArg(1) Class3_Sub2 arg0) {
		this.aLong209 = arg0.method2063();
		this.aLong208 = arg0.method2063();
		for (@Pc(33) int local33 = arg0.method2048(255); local33 != 0; local33 = arg0.method2048(255)) {
			@Pc(63) Class3_Sub4 local63;
			if (local33 == 1) {
				local63 = new Class3_Sub4_Sub3();
			} else if (local33 == 4) {
				local63 = new Class3_Sub4_Sub4();
			} else if (local33 == 3) {
				local63 = new Class3_Sub4_Sub1();
			} else if (local33 == 2) {
				local63 = new Class3_Sub4_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local63.method4957(arg0);
			this.aClass342_47.method7654(local63);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!cg;I)V")
	public void method5362(@OriginalArg(0) Class3_Sub14 arg0) {
		if (this.aLong209 != arg0.aLong345 || arg0.aLong58 != this.aLong208) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong345 + " updateNum:" + arg0.aLong58 + " delta.clanHash:" + this.aLong209 + " updateNum:" + this.aLong208);
		}
		for (@Pc(63) Class3_Sub4 local63 = (Class3_Sub4) this.aClass342_47.method7644(); local63 != null; local63 = (Class3_Sub4) this.aClass342_47.method7650()) {
			local63.method4954(arg0);
		}
		if (5890 == 5890) {
			arg0.aLong58++;
		}
	}
}

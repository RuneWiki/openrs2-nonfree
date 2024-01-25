import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class230 {

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "J")
	private long aLong183;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "J")
	private long aLong184 = -1L;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Lclient!ow;")
	private final Class271 aClass271_41 = new Class271();

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class230(@OriginalArg(0) Class2_Sub8 arg0) {
		this.method6215(arg0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ol;B)V")
	private void method6215(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aLong183 = arg0.method5213();
		this.aLong184 = arg0.method5213();
		for (@Pc(26) int local26 = arg0.method5203(); local26 != 0; local26 = arg0.method5203()) {
			@Pc(37) Class2_Sub28 local37;
			if (local26 == 1) {
				local37 = new Class2_Sub28_Sub2();
			} else if (local26 == 4) {
				local37 = new Class2_Sub28_Sub1();
			} else if (local26 == 3) {
				local37 = new Class2_Sub28_Sub3();
			} else if (local26 == 2) {
				local37 = new Class2_Sub28_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local37.method9519(arg0);
			this.aClass271_41.method7174(local37);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLclient!hi;)V")
	public void method6217(@OriginalArg(1) Class2_Sub30 arg0) {
		if (arg0.aLong313 != this.aLong183 || this.aLong184 != arg0.aLong121) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong313 + " updateNum:" + arg0.aLong121 + " delta.clanHash:" + this.aLong183 + " updateNum:" + this.aLong184);
		}
		for (@Pc(54) Class2_Sub28 local54 = (Class2_Sub28) this.aClass271_41.method7177(); local54 != null; local54 = (Class2_Sub28) this.aClass271_41.method7175()) {
			local54.method9518(arg0);
		}
		arg0.aLong121++;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class386 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "J")
	private long aLong302;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "J")
	private long aLong303 = -1L;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Lclient!v;")
	private final Class362 aClass362_64 = new Class362();

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class386(@OriginalArg(0) Class6_Sub23 arg0) {
		this.method8946(arg0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!gga;I)V")
	private void method8946(@OriginalArg(0) Class6_Sub23 arg0) {
		this.aLong302 = arg0.method8381();
		this.aLong303 = arg0.method8381();
		for (@Pc(19) int local19 = arg0.method8374(); local19 != 0; local19 = arg0.method8374()) {
			@Pc(33) Class6_Sub7 local33;
			if (local19 == 1) {
				local33 = new Class6_Sub7_Sub3();
			} else if (local19 == 4) {
				local33 = new Class6_Sub7_Sub2();
			} else if (local19 == 3) {
				local33 = new Class6_Sub7_Sub1();
			} else if (local19 == 2) {
				local33 = new Class6_Sub7_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local33.method6993(arg0);
			this.aClass362_64.method8536(local33);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ag;B)V")
	public void method8947(@OriginalArg(0) Class6_Sub2 arg0) {
		if (arg0.aLong314 != this.aLong302 || this.aLong303 != arg0.aLong9) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong314 + " updateNum:" + arg0.aLong9 + " delta.clanHash:" + this.aLong302 + " updateNum:" + this.aLong303);
		}
		for (@Pc(54) Class6_Sub7 local54 = (Class6_Sub7) this.aClass362_64.method8538(); local54 != null; local54 = (Class6_Sub7) this.aClass362_64.method8530()) {
			local54.method6990(arg0);
		}
		arg0.aLong9++;
	}
}

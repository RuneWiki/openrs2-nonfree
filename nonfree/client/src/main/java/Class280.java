import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class280 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "J")
	private long aLong215;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "J")
	private long aLong214 = -1L;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!at;")
	private final Class20 aClass20_39 = new Class20();

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!wq;)V")
	public Class280(@OriginalArg(0) Class5_Sub36 arg0) {
		this.method6380(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!wq;I)V")
	private void method6380(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aLong215 = arg0.method7304();
		this.aLong214 = arg0.method7304();
		for (@Pc(27) int local27 = arg0.method7291(); local27 != 0; local27 = arg0.method7291()) {
			@Pc(50) Class5_Sub6 local50;
			if (local27 == 1) {
				local50 = new Class5_Sub6_Sub4();
			} else if (local27 == 4) {
				local50 = new Class5_Sub6_Sub3();
			} else if (local27 == 3) {
				local50 = new Class5_Sub6_Sub2();
			} else if (local27 == 2) {
				local50 = new Class5_Sub6_Sub1();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local50.method9154(arg0);
			this.aClass20_39.method370(local50);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!wt;)V")
	public void method6381(@OriginalArg(1) Class5_Sub55 arg0) {
		if (this.aLong215 != arg0.aLong312 || this.aLong214 != arg0.aLong310) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong312 + " updateNum:" + arg0.aLong310 + " delta.clanHash:" + this.aLong215 + " updateNum:" + this.aLong214);
		}
		for (@Pc(65) Class5_Sub6 local65 = (Class5_Sub6) this.aClass20_39.method378(); local65 != null; local65 = (Class5_Sub6) this.aClass20_39.method366()) {
			local65.method9152(arg0);
		}
		if (86 != 86) {
			Static447.method6382(-2);
		}
		arg0.aLong310++;
	}
}

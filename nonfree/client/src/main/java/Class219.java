import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class219 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "J")
	private long aLong174 = -1L;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!ok;")
	private final Class262 aClass262_37 = new Class262();

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!so;)V")
	public Class219(@OriginalArg(0) Class14_Sub29 arg0) {
		this.method5283(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!so;B)V")
	private void method5283(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aLong175 = arg0.method5907();
		this.aLong174 = arg0.method5907();
		for (@Pc(27) int local27 = arg0.method5866(); local27 != 0; local27 = arg0.method5866()) {
			@Pc(39) Class14_Sub8 local39;
			if (local27 == 1) {
				local39 = new Class14_Sub8_Sub1();
			} else if (local27 == 4) {
				local39 = new Class14_Sub8_Sub4();
			} else if (local27 == 3) {
				local39 = new Class14_Sub8_Sub3();
			} else if (local27 == 2) {
				local39 = new Class14_Sub8_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local39.method8405(arg0);
			this.aClass262_37.method6314(local39);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!hs;)V")
	public void method5285(@OriginalArg(1) Class14_Sub25 arg0) {
		if (this.aLong175 != arg0.aLong305 || this.aLong174 != arg0.aLong120) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong305 + " updateNum:" + arg0.aLong120 + " delta.clanHash:" + this.aLong175 + " updateNum:" + this.aLong174);
		}
		for (@Pc(58) Class14_Sub8 local58 = (Class14_Sub8) this.aClass262_37.method6318(); local58 != null; local58 = (Class14_Sub8) this.aClass262_37.method6311()) {
			local58.method8406(arg0);
		}
		arg0.aLong120++;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class344 {

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "J")
	private long aLong270 = -1L;

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "Lclient!fca;")
	private final Class114 aClass114_65 = new Class114();

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class344(@OriginalArg(0) Class5_Sub41 arg0) {
		this.method8028(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!mc;)V")
	private void method8028(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aLong271 = arg0.method7823();
		this.aLong270 = arg0.method7823();
		for (@Pc(27) int local27 = arg0.method7816(); local27 != 0; local27 = arg0.method7816()) {
			@Pc(36) Class5_Sub10 local36;
			if (local27 == 1) {
				local36 = new Class5_Sub10_Sub4();
			} else if (local27 == 4) {
				local36 = new Class5_Sub10_Sub1();
			} else if (local27 == 3) {
				local36 = new Class5_Sub10_Sub2();
			} else if (local27 == 2) {
				local36 = new Class5_Sub10_Sub3();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local36.method6633(arg0);
			this.aClass114_65.method2807(local36);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLclient!qc;)V")
	public void method8029(@OriginalArg(1) Class5_Sub45 arg0) {
		if (this.aLong271 != arg0.aLong307 || this.aLong270 != arg0.aLong219) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong307 + " updateNum:" + arg0.aLong219 + " delta.clanHash:" + this.aLong271 + " updateNum:" + this.aLong270);
		}
		for (@Pc(52) Class5_Sub10 local52 = (Class5_Sub10) this.aClass114_65.method2805(); local52 != null; local52 = (Class5_Sub10) this.aClass114_65.method2814()) {
			local52.method6635(arg0);
		}
		arg0.aLong219++;
	}
}

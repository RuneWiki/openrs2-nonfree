import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class56 {

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "J")
	private long aLong29 = -1L;

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "Lclient!ef;")
	private final Class102 aClass102_6 = new Class102();

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class56(@OriginalArg(0) Class5_Sub23 arg0) {
		this.method871(arg0);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!ib;)V")
	private void method871(@OriginalArg(1) Class5_Sub23 arg0) {
		this.aLong30 = arg0.method8509();
		this.aLong29 = arg0.method8509();
		for (@Pc(27) int local27 = arg0.method8529(); local27 != 0; local27 = arg0.method8529()) {
			@Pc(50) Class5_Sub11 local50;
			if (local27 == 1) {
				local50 = new Class5_Sub11_Sub2();
			} else if (local27 == 4) {
				local50 = new Class5_Sub11_Sub1();
			} else if (local27 == 3) {
				local50 = new Class5_Sub11_Sub3();
			} else if (local27 == 2) {
				local50 = new Class5_Sub11_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local50.method7461(arg0);
			this.aClass102_6.method1921(local50);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!wca;)V")
	public void method874(@OriginalArg(1) Class5_Sub53 arg0) {
		if (arg0.aLong314 != this.aLong30 || arg0.aLong306 != this.aLong29) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong314 + " updateNum:" + arg0.aLong306 + " delta.clanHash:" + this.aLong30 + " updateNum:" + this.aLong29);
		}
		for (@Pc(65) Class5_Sub11 local65 = (Class5_Sub11) this.aClass102_6.method1916(); local65 != null; local65 = (Class5_Sub11) this.aClass102_6.method1915()) {
			local65.method7459(arg0);
		}
		arg0.aLong306++;
	}
}

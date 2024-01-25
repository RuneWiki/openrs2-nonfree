import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class205 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "J")
	private long aLong157 = -1L;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_31 = new Class163();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!es;)V")
	public Class205(@OriginalArg(0) Class4_Sub11 arg0) {
		this.method4559(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!es;B)V")
	private void method4559(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aLong158 = arg0.method8830();
		this.aLong157 = arg0.method8830();
		for (@Pc(27) int local27 = arg0.method8865(); local27 != 0; local27 = arg0.method8865()) {
			@Pc(49) Class4_Sub9 local49;
			if (local27 == 1) {
				local49 = new Class4_Sub9_Sub1();
			} else if (local27 == 4) {
				local49 = new Class4_Sub9_Sub4();
			} else if (local27 == 3) {
				local49 = new Class4_Sub9_Sub3();
			} else if (local27 == 2) {
				local49 = new Class4_Sub9_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local49.method7843(arg0);
			this.aClass163_31.method3646(local49);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!wt;B)V")
	public void method4563(@OriginalArg(0) Class4_Sub55 arg0) {
		if (this.aLong158 != arg0.aLong307 || this.aLong157 != arg0.aLong304) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong307 + " updateNum:" + arg0.aLong304 + " delta.clanHash:" + this.aLong158 + " updateNum:" + this.aLong157);
		}
		for (@Pc(58) Class4_Sub9 local58 = (Class4_Sub9) this.aClass163_31.method3639(); local58 != null; local58 = (Class4_Sub9) this.aClass163_31.method3640()) {
			local58.method7845(arg0);
		}
		arg0.aLong304++;
	}
}

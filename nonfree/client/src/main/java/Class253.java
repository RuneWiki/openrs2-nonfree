import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class253 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "J")
	private long aLong195 = -1L;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Lclient!jia;")
	private final Class193 aClass193_35 = new Class193();

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class253(@OriginalArg(0) Class3_Sub17 arg0) {
		this.method5783(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!fca;I)V")
	private void method5783(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aLong196 = arg0.method4865();
		this.aLong195 = arg0.method4865();
		for (@Pc(23) int local23 = arg0.method4888(); local23 != 0; local23 = arg0.method4888()) {
			@Pc(32) Class3_Sub3 local32;
			if (local23 == 1) {
				local32 = new Class3_Sub3_Sub4();
			} else if (local23 == 4) {
				local32 = new Class3_Sub3_Sub3();
			} else if (local23 == 3) {
				local32 = new Class3_Sub3_Sub2();
			} else if (local23 == 2) {
				local32 = new Class3_Sub3_Sub1();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local32.method5404(arg0);
			this.aClass193_35.method4462(local32);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gca;I)V")
	public void method5784(@OriginalArg(0) Class3_Sub20 arg0) {
		if (this.aLong196 != arg0.aLong309 || this.aLong195 != arg0.aLong95) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong309 + " updateNum:" + arg0.aLong95 + " delta.clanHash:" + this.aLong196 + " updateNum:" + this.aLong195);
		}
		for (@Pc(67) Class3_Sub3 local67 = (Class3_Sub3) this.aClass193_35.method4457(); local67 != null; local67 = (Class3_Sub3) this.aClass193_35.method4459()) {
			local67.method5405(arg0);
		}
		arg0.aLong95++;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class223 {

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "J")
	private long aLong204 = -1L;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "Lclient!tj;")
	private final Class357 aClass357_31 = new Class357();

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class223(@OriginalArg(0) Class3_Sub28 arg0) {
		this.method5128(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!wr;I)V")
	public void method5124(@OriginalArg(0) Class3_Sub56 arg0) {
		if (arg0.aLong382 != this.aLong205 || arg0.aLong381 != this.aLong204) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong382 + " updateNum:" + arg0.aLong381 + " delta.clanHash:" + this.aLong205 + " updateNum:" + this.aLong204);
		}
		for (@Pc(61) Class3_Sub3 local61 = (Class3_Sub3) this.aClass357_31.method8391(); local61 != null; local61 = (Class3_Sub3) this.aClass357_31.method8392()) {
			local61.method5915(arg0);
		}
		if (-27416 != -27416) {
			Static354.method5126();
		}
		arg0.aLong381++;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!rba;I)V")
	private void method5128(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aLong205 = arg0.method5287();
		this.aLong204 = arg0.method5287();
		for (@Pc(24) int local24 = arg0.method5322(-16); local24 != 0; local24 = arg0.method5322(-82)) {
			@Pc(60) Class3_Sub3 local60;
			if (local24 == 1) {
				local60 = new Class3_Sub3_Sub1();
			} else if (local24 == 4) {
				local60 = new Class3_Sub3_Sub4();
			} else if (local24 == 3) {
				local60 = new Class3_Sub3_Sub3();
			} else if (local24 == 2) {
				local60 = new Class3_Sub3_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local60.method5916(arg0);
			this.aClass357_31.method8401(local60);
		}
	}
}

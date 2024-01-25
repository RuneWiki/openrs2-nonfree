import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class175 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
	private long aLong152 = -1L;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "Lclient!tm;")
	private final Class338 aClass338_127 = new Class338();

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class175(@OriginalArg(0) Class3_Sub25 arg0) {
		this.method4533(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!jp;I)V")
	private void method4533(@OriginalArg(0) Class3_Sub25 arg0) {
		this.aLong151 = arg0.method8600();
		this.aLong152 = arg0.method8600();
		for (@Pc(24) int local24 = arg0.method8632(); local24 != 0; local24 = arg0.method8632()) {
			@Pc(38) Class3_Sub31 local38;
			if (local24 == 1) {
				local38 = new Class3_Sub31_Sub3();
			} else if (local24 == 4) {
				local38 = new Class3_Sub31_Sub1();
			} else if (local24 == 3) {
				local38 = new Class3_Sub31_Sub2();
			} else if (local24 == 2) {
				local38 = new Class3_Sub31_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local38.method8254(arg0);
			this.aClass338_127.method8171(local38);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!hka;)V")
	public void method4537(@OriginalArg(1) Class3_Sub30 arg0) {
		if (this.aLong151 != arg0.aLong311 || arg0.aLong131 != this.aLong152) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong311 + " updateNum:" + arg0.aLong131 + " delta.clanHash:" + this.aLong151 + " updateNum:" + this.aLong152);
		}
		for (@Pc(62) Class3_Sub31 local62 = (Class3_Sub31) this.aClass338_127.method8177(); local62 != null; local62 = (Class3_Sub31) this.aClass338_127.method8168()) {
			local62.method8255(arg0);
		}
		arg0.aLong131++;
	}
}

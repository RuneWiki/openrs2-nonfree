import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class145 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "J")
	private long aLong123 = -1L;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!bd;")
	private final Class32 aClass32_16 = new Class32();

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class145(@OriginalArg(0) Class14_Sub21 arg0) {
		this.method3206(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!uq;)V")
	public void method3205(@OriginalArg(1) Class14_Sub48 arg0) {
		if (arg0.aLong324 != this.aLong122 || this.aLong123 != arg0.aLong292) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong324 + " updateNum:" + arg0.aLong292 + " delta.clanHash:" + this.aLong122 + " updateNum:" + this.aLong123);
		}
		for (@Pc(69) Class14_Sub9 local69 = (Class14_Sub9) this.aClass32_16.method584(); local69 != null; local69 = (Class14_Sub9) this.aClass32_16.method577()) {
			local69.method8845(arg0);
		}
		if (false) {
			Static210.anInt3677 = 125;
		}
		arg0.aLong292++;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!jc;)V")
	private void method3206(@OriginalArg(1) Class14_Sub21 arg0) {
		this.aLong122 = arg0.method7729();
		this.aLong123 = arg0.method7729();
		for (@Pc(19) int local19 = arg0.method7695(124); local19 != 0; local19 = arg0.method7695(108)) {
			@Pc(32) Class14_Sub9 local32;
			if (local19 == 1) {
				local32 = new Class14_Sub9_Sub1();
			} else if (local19 == 4) {
				local32 = new Class14_Sub9_Sub4();
			} else if (local19 == 3) {
				local32 = new Class14_Sub9_Sub2();
			} else if (local19 == 2) {
				local32 = new Class14_Sub9_Sub3();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local32.method8846(arg0);
			this.aClass32_16.method582(local32);
		}
		if (104 <= 95) {
			Static210.method3209((byte) 83);
		}
	}
}

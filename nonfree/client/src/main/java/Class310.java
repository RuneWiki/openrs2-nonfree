import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class310 {

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "J")
	private long aLong258;

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "J")
	private long aLong257 = -1L;

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "Lclient!cga;")
	private final Class60 aClass60_166 = new Class60();

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class310(@OriginalArg(0) Class2_Sub20 arg0) {
		this.method7352(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!nw;Z)V")
	public void method7351(@OriginalArg(0) Class2_Sub43 arg0) {
		if (this.aLong258 != arg0.aLong352 || arg0.aLong220 != this.aLong257) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong352 + " updateNum:" + arg0.aLong220 + " delta.clanHash:" + this.aLong258 + " updateNum:" + this.aLong257);
		}
		for (@Pc(73) Class2_Sub34 local73 = (Class2_Sub34) this.aClass60_166.method1226(7); local73 != null; local73 = (Class2_Sub34) this.aClass60_166.method1228()) {
			local73.method8955(arg0);
		}
		arg0.aLong220++;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!et;)V")
	private void method7352(@OriginalArg(1) Class2_Sub20 arg0) {
		this.aLong258 = arg0.method8590();
		this.aLong257 = arg0.method8590();
		for (@Pc(29) int local29 = arg0.method8581(-17416); local29 != 0; local29 = arg0.method8581(-17416)) {
			@Pc(49) Class2_Sub34 local49;
			if (local29 == 1) {
				local49 = new Class2_Sub34_Sub3();
			} else if (local29 == 4) {
				local49 = new Class2_Sub34_Sub2();
			} else if (local29 == 3) {
				local49 = new Class2_Sub34_Sub1();
			} else if (local29 == 2) {
				local49 = new Class2_Sub34_Sub4();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local49.method8952(arg0);
			this.aClass60_166.method1233(local49);
		}
	}
}

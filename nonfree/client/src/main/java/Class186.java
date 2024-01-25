import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class186 {

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "J")
	private long aLong134 = -1L;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!qw;")
	private final Class302 aClass302_26 = new Class302();

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class186(@OriginalArg(0) Class3_Sub4 arg0) {
		this.method4157(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!hr;I)V")
	public void method4155(@OriginalArg(0) Class3_Sub26 arg0) {
		if (arg0.aLong313 != this.aLong135 || arg0.aLong113 != this.aLong134) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong313 + " updateNum:" + arg0.aLong113 + " delta.clanHash:" + this.aLong135 + " updateNum:" + this.aLong134);
		}
		for (@Pc(50) Class3_Sub18 local50 = (Class3_Sub18) this.aClass302_26.method6603(); local50 != null; local50 = (Class3_Sub18) this.aClass302_26.method6605()) {
			local50.method7415(arg0);
		}
		arg0.aLong113++;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!dt;)V")
	private void method4157(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aLong135 = arg0.method7946();
		this.aLong134 = arg0.method7946();
		for (@Pc(28) int local28 = arg0.method7954(); local28 != 0; local28 = arg0.method7954()) {
			@Pc(55) Class3_Sub18 local55;
			if (local28 == 1) {
				local55 = new Class3_Sub18_Sub3();
			} else if (local28 == 4) {
				local55 = new Class3_Sub18_Sub2();
			} else if (local28 == 3) {
				local55 = new Class3_Sub18_Sub4();
			} else if (local28 == 2) {
				local55 = new Class3_Sub18_Sub1();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local55.method7416(arg0);
			this.aClass302_26.method6613(local55);
		}
	}
}

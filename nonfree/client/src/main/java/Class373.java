import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class373 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "J")
	private long aLong312;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "J")
	private long aLong311 = -1L;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!ga;")
	private final Class124 aClass124_102 = new Class124();

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class373(@OriginalArg(0) Class5_Sub15 arg0) {
		this.method8382(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ua;B)V")
	public void method8379(@OriginalArg(0) Class5_Sub49 arg0) {
		if (this.aLong312 != arg0.aLong329 || this.aLong311 != arg0.aLong291) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong329 + " updateNum:" + arg0.aLong291 + " delta.clanHash:" + this.aLong312 + " updateNum:" + this.aLong311);
		}
		for (@Pc(58) Class5_Sub10 local58 = (Class5_Sub10) this.aClass124_102.method2572(); local58 != null; local58 = (Class5_Sub10) this.aClass124_102.method2569()) {
			local58.method7530(arg0);
		}
		arg0.aLong291++;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!rv;)V")
	private void method8382(@OriginalArg(1) Class5_Sub15 arg0) {
		this.aLong312 = arg0.method3634();
		this.aLong311 = arg0.method3634();
		for (@Pc(17) int local17 = arg0.method3642(); local17 != 0; local17 = arg0.method3642()) {
			@Pc(46) Class5_Sub10 local46;
			if (local17 == 1) {
				local46 = new Class5_Sub10_Sub3();
			} else if (local17 == 4) {
				local46 = new Class5_Sub10_Sub2();
			} else if (local17 == 3) {
				local46 = new Class5_Sub10_Sub4();
			} else if (local17 == 2) {
				local46 = new Class5_Sub10_Sub1();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local46.method7528(arg0);
			this.aClass124_102.method2574(local46);
		}
	}
}

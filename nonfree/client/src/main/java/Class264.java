import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class264 {

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "Lclient!sw;")
	private final Class277 aClass277_59 = new Class277(128);

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "Lclient!dn;")
	private final Class69 aClass69_83;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class264(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_83 = arg2;
		this.aClass69_83.method1884(1);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Lclient!hca;")
	public Class123 method6825(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_59;
		@Pc(18) Class123 local18;
		synchronized (this.aClass277_59) {
			local18 = (Class123) this.aClass277_59.method7014((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class69 local31 = this.aClass69_83;
		@Pc(40) byte[] local40;
		synchronized (this.aClass69_83) {
			local40 = this.aClass69_83.method1888(arg0, 1);
		}
		local18 = new Class123();
		if (local40 != null) {
			local18.method3201(new Class1_Sub17(local40));
		}
		@Pc(62) Class277 local62 = this.aClass277_59;
		synchronized (this.aClass277_59) {
			this.aClass277_59.method7016(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(II)V")
	public void method6827() {
		@Pc(10) Class277 local10 = this.aClass277_59;
		synchronized (this.aClass277_59) {
			this.aClass277_59.method7018(5);
		}
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V")
	public void method6828() {
		@Pc(6) Class277 local6 = this.aClass277_59;
		synchronized (this.aClass277_59) {
			this.aClass277_59.method7026();
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
	public void method6829() {
		@Pc(2) Class277 local2 = this.aClass277_59;
		synchronized (this.aClass277_59) {
			this.aClass277_59.method7019();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class179 {

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!sw;")
	private final Class277 aClass277_40 = new Class277(64);

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_56;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "Lclient!dn;")
	public final Class69 aClass69_57;

	static {
		new Class45("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;)V")
	public Class179(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3) {
		this.aClass69_56 = arg2;
		this.aClass69_57 = arg3;
		this.aClass69_56.method1884(3);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method4889() {
		@Pc(2) Class277 local2 = this.aClass277_40;
		synchronized (this.aClass277_40) {
			this.aClass277_40.method7026();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Lclient!qp;")
	public Class242 method4890(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_40;
		@Pc(16) Class242 local16;
		synchronized (this.aClass277_40) {
			local16 = (Class242) this.aClass277_40.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class69 local34 = this.aClass69_56;
		@Pc(43) byte[] local43;
		synchronized (this.aClass69_56) {
			local43 = this.aClass69_56.method1888(arg0, 3);
		}
		local16 = new Class242();
		local16.aClass179_2 = this;
		if (local43 != null) {
			local16.method6386(new Class1_Sub17(local43));
		}
		@Pc(68) Class277 local68 = this.aClass277_40;
		synchronized (this.aClass277_40) {
			this.aClass277_40.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public void method4892() {
		@Pc(12) Class277 local12 = this.aClass277_40;
		synchronized (this.aClass277_40) {
			this.aClass277_40.method7018(5);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
	public void method4893() {
		@Pc(2) Class277 local2 = this.aClass277_40;
		synchronized (this.aClass277_40) {
			this.aClass277_40.method7019();
		}
	}
}

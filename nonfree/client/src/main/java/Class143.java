import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class143 {

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Lclient!sw;")
	private final Class277 aClass277_32 = new Class277(64);

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public int anInt4239 = 0;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "Lclient!dn;")
	private final Class69 aClass69_40;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public final int anInt4233;

	static {
		new Class45("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class143(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_40 = arg2;
		this.anInt4233 = this.aClass69_40.method1884(4);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public void method3938() {
		@Pc(6) Class277 local6 = this.aClass277_32;
		synchronized (this.aClass277_32) {
			this.aClass277_32.method7026();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V")
	public void method3939() {
		@Pc(2) Class277 local2 = this.aClass277_32;
		synchronized (this.aClass277_32) {
			this.aClass277_32.method7018(5);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Lclient!vn;")
	public Class307 method3941(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_32;
		@Pc(16) Class307 local16;
		synchronized (this.aClass277_32) {
			local16 = (Class307) this.aClass277_32.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_40;
		@Pc(46) byte[] local46;
		synchronized (this.aClass69_40) {
			local46 = this.aClass69_40.method1888(arg0, 4);
		}
		local16 = new Class307();
		local16.aClass143_6 = this;
		local16.anInt9147 = arg0;
		if (local46 != null) {
			local16.method7897(new Class1_Sub17(local46));
		}
		local16.method7899();
		@Pc(77) Class277 local77 = this.aClass277_32;
		synchronized (this.aClass277_32) {
			this.aClass277_32.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public void method3942() {
		@Pc(6) Class277 local6 = this.aClass277_32;
		synchronized (this.aClass277_32) {
			this.aClass277_32.method7019();
		}
	}
}

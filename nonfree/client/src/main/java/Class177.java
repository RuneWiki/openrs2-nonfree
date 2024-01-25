import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class177 {

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!de;")
	private final Class69 aClass69_26 = new Class69(64);

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!nd;")
	public final Class238 aClass238_120;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!nd;")
	private final Class238 aClass238_121;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class177(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_120 = arg3;
		this.aClass238_121 = arg2;
		this.aClass238_121.method5592(3);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method4311() {
		@Pc(6) Class69 local6 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1904();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!tca;")
	public Class325 method4312(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_26;
		@Pc(16) Class325 local16;
		synchronized (this.aClass69_26) {
			local16 = (Class325) this.aClass69_26.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class238 local34 = this.aClass238_121;
		@Pc(43) byte[] local43;
		synchronized (this.aClass238_121) {
			local43 = this.aClass238_121.method5567(arg0, 3);
		}
		local16 = new Class325();
		local16.aClass177_1 = this;
		if (local43 != null) {
			local16.method7487(new Class2_Sub17(local43));
		}
		@Pc(68) Class69 local68 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method4314() {
		@Pc(2) Class69 local2 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1905();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V")
	public void method4315() {
		@Pc(2) Class69 local2 = this.aClass69_26;
		synchronized (this.aClass69_26) {
			this.aClass69_26.method1910(5);
		}
	}
}

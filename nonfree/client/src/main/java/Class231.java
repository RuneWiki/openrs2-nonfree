import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class231 {

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "Lclient!de;")
	private final Class69 aClass69_34 = new Class69(16);

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_168;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class231(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_168 = arg2;
		this.aClass238_168.method5592(30);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	public void method5410() {
		@Pc(6) Class69 local6 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1905();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)Lclient!ro;")
	public Class306 method5412(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_34;
		@Pc(16) Class306 local16;
		synchronized (this.aClass69_34) {
			local16 = (Class306) this.aClass69_34.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_168;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_168) {
			local38 = this.aClass238_168.method5567(arg0, 30);
		}
		local16 = new Class306();
		if (local38 != null) {
			local16.method7045(new Class2_Sub17(local38));
		}
		@Pc(68) Class69 local68 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V")
	public void method5413() {
		@Pc(2) Class69 local2 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1910(5);
		}
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
	public void method5414() {
		@Pc(6) Class69 local6 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1904();
		}
	}
}

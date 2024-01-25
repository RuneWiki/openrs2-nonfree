import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class79 {

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Lclient!de;")
	private Class69 aClass69_11 = new Class69(64);

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!de;")
	public Class69 aClass69_12 = new Class69(64);

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!nd;")
	public final Class238 aClass238_52;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_51;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class79(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_52 = arg3;
		this.aClass238_51 = arg2;
		this.aClass238_51.method5592(34);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
	public void method1967() {
		@Pc(6) Class69 local6 = this.aClass69_11;
		synchronized (this.aClass69_11) {
			this.aClass69_11.method1910(5);
		}
		local6 = this.aClass69_12;
		synchronized (this.aClass69_12) {
			this.aClass69_12.method1910(5);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public void method1968() {
		@Pc(6) Class69 local6 = this.aClass69_11;
		synchronized (this.aClass69_11) {
			this.aClass69_11.method1904();
		}
		local6 = this.aClass69_12;
		synchronized (this.aClass69_12) {
			this.aClass69_12.method1904();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)V")
	public void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass69_11 = new Class69(arg1);
		this.aClass69_12 = new Class69(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
	public void method1972() {
		@Pc(2) Class69 local2 = this.aClass69_11;
		synchronized (this.aClass69_11) {
			this.aClass69_11.method1905();
		}
		local2 = this.aClass69_12;
		synchronized (this.aClass69_12) {
			this.aClass69_12.method1905();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lclient!ma;")
	public Class220 method1974(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_11;
		@Pc(16) Class220 local16;
		synchronized (this.aClass69_11) {
			local16 = (Class220) this.aClass69_11.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_51;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_51) {
			local38 = this.aClass238_51.method5567(arg0, 34);
		}
		local16 = new Class220();
		local16.aClass79_2 = this;
		if (local38 != null) {
			local16.method5168(new Class2_Sub17(local38));
		}
		@Pc(68) Class69 local68 = this.aClass69_11;
		synchronized (this.aClass69_11) {
			this.aClass69_11.method1917((long) arg0, local16);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class81 {

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Lclient!de;")
	private final Class69 aClass69_13 = new Class69(64);

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "Lclient!de;")
	public final Class69 aClass69_14 = new Class69(2);

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!nd;")
	public final Class238 aClass238_53;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!nd;")
	private final Class238 aClass238_54;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class81(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_53 = arg3;
		this.aClass238_54 = arg2;
		this.aClass238_54.method5592(33);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)Lclient!jda;")
	public Class174 method1997(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_13;
		@Pc(16) Class174 local16;
		synchronized (this.aClass69_13) {
			local16 = (Class174) this.aClass69_13.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_54;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_54) {
			local38 = this.aClass238_54.method5567(arg0, 33);
		}
		local16 = new Class174();
		local16.aClass81_1 = this;
		if (local38 != null) {
			local16.method4280(new Class2_Sub17(local38));
		}
		@Pc(68) Class69 local68 = this.aClass69_13;
		synchronized (this.aClass69_13) {
			this.aClass69_13.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)V")
	public void method2000() {
		@Pc(10) Class69 local10 = this.aClass69_13;
		synchronized (this.aClass69_13) {
			this.aClass69_13.method1910(5);
		}
		local10 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1910(5);
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	public void method2002() {
		@Pc(2) Class69 local2 = this.aClass69_13;
		synchronized (this.aClass69_13) {
			this.aClass69_13.method1905();
		}
		local2 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1905();
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
	public void method2003() {
		@Pc(10) Class69 local10 = this.aClass69_13;
		synchronized (this.aClass69_13) {
			this.aClass69_13.method1904();
		}
		local10 = this.aClass69_14;
		synchronized (this.aClass69_14) {
			this.aClass69_14.method1904();
		}
	}
}

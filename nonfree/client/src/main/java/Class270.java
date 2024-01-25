import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class270 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!de;")
	private final Class69 aClass69_44 = new Class69(128);

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_200;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class270(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_200 = arg2;
		this.aClass238_200.method5592(1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public void method6273() {
		@Pc(2) Class69 local2 = this.aClass69_44;
		synchronized (this.aClass69_44) {
			this.aClass69_44.method1910(5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public void method6274() {
		@Pc(6) Class69 local6 = this.aClass69_44;
		synchronized (this.aClass69_44) {
			this.aClass69_44.method1904();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)Lclient!ao;")
	public Class20 method6276(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_44;
		@Pc(16) Class20 local16;
		synchronized (this.aClass69_44) {
			local16 = (Class20) this.aClass69_44.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_200;
		@Pc(38) byte[] local38;
		synchronized (this.aClass238_200) {
			local38 = this.aClass238_200.method5567(arg0, 1);
		}
		local16 = new Class20();
		if (local38 != null) {
			local16.method570(new Class2_Sub17(local38));
		}
		@Pc(60) Class69 local60 = this.aClass69_44;
		synchronized (this.aClass69_44) {
			this.aClass69_44.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public void method6278() {
		@Pc(10) Class69 local10 = this.aClass69_44;
		synchronized (this.aClass69_44) {
			this.aClass69_44.method1905();
		}
	}
}

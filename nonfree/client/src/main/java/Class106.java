import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class106 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!de;")
	private final Class69 aClass69_16 = new Class69(64);

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_72;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!nd;")
	private final Class238 aClass238_73;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILclient!nd;Lclient!nd;)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_72 = arg2;
		this.aClass238_73 = arg1;
		if (this.aClass238_73 != null) {
			this.aClass238_73.method5592(0);
		}
		if (this.aClass238_72 != null) {
			this.aClass238_72.method5592(0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!fb;")
	public Class2_Sub7_Sub4 method2607(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub7_Sub4 local17 = (Class2_Sub7_Sub4) this.aClass69_16.method1919((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(35) byte[] local35;
		if (arg0 >= 32768) {
			local35 = this.aClass238_72.method5567(arg0 & 0x7FFF, 0);
		} else {
			local35 = this.aClass238_73.method5567(arg0, 0);
		}
		local17 = new Class2_Sub7_Sub4();
		if (local35 != null) {
			local17.method2628(new Class2_Sub17(local35));
		}
		if (arg0 >= 32768) {
			local17.method2631();
		}
		this.aClass69_16.method1917((long) arg0, local17);
		return local17;
	}
}

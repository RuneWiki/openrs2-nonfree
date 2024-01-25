import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class331 {

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "Lclient!de;")
	private final Class69 aClass69_56 = new Class69(64);

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "Lclient!nd;")
	private final Class238 aClass238_247;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class331(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_247 = arg2;
		this.aClass238_247.method5592(5);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)Lclient!oda;")
	public Class2_Sub7_Sub12 method7574(@OriginalArg(0) int arg0) {
		@Pc(11) Class69 local11 = this.aClass69_56;
		@Pc(21) Class2_Sub7_Sub12 local21;
		synchronized (this.aClass69_56) {
			local21 = (Class2_Sub7_Sub12) this.aClass69_56.method1919((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class238 local34 = this.aClass238_247;
		@Pc(43) byte[] local43;
		synchronized (this.aClass238_247) {
			local43 = this.aClass238_247.method5567(arg0, 5);
		}
		local21 = new Class2_Sub7_Sub12();
		if (local43 != null) {
			local21.method6004(new Class2_Sub17(local43));
		}
		@Pc(65) Class69 local65 = this.aClass69_56;
		synchronized (this.aClass69_56) {
			this.aClass69_56.method1917((long) arg0, local21);
			return local21;
		}
	}
}

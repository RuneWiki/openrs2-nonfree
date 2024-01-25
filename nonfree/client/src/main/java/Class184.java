import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class184 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!de;")
	private final Class69 aClass69_28 = new Class69(128);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_126;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class184(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_126 = arg2;
		if (this.aClass238_126 != null) {
			@Pc(20) int local20 = this.aClass238_126.method5569() - 1;
			this.aClass238_126.method5592(local20);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lclient!ra;")
	public Class295 method4465(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_28;
		@Pc(16) Class295 local16;
		synchronized (this.aClass69_28) {
			local16 = (Class295) this.aClass69_28.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass238_126.method5567(Static452.method6426(arg0), Static107.method1971(arg0));
		local16 = new Class295();
		if (local42 != null) {
			local16.method6822(new Class2_Sub17(local42));
		}
		@Pc(58) Class69 local58 = this.aClass69_28;
		synchronized (this.aClass69_28) {
			this.aClass69_28.method1917((long) arg0, local16);
			return local16;
		}
	}
}

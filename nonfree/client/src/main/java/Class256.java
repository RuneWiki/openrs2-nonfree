import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class256 {

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "Lclient!de;")
	private final Class69 aClass69_40 = new Class69(64);

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "Lclient!nd;")
	private final Class238 aClass238_187;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
	public final int anInt6922;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class256(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_187 = arg2;
		this.anInt6922 = this.aClass238_187.method5592(19);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IZ)Lclient!is;")
	public Class166 method6036(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_40;
		@Pc(16) Class166 local16;
		synchronized (this.aClass69_40) {
			local16 = (Class166) this.aClass69_40.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class238 local35 = this.aClass238_187;
		@Pc(44) byte[] local44;
		synchronized (this.aClass238_187) {
			local44 = this.aClass238_187.method5567(arg0, 19);
		}
		local16 = new Class166();
		if (local44 != null) {
			local16.method4179(new Class2_Sub17(local44));
		}
		@Pc(66) Class69 local66 = this.aClass69_40;
		synchronized (this.aClass69_40) {
			this.aClass69_40.method1917((long) arg0, local16);
			return local16;
		}
	}
}

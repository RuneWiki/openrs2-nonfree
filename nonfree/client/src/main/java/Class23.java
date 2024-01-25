import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class23 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!ka;")
	private final Class132 aClass132_3 = new Class132(64);

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Lclient!dk;")
	private final Class54 aClass54_10;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public final int anInt582;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class23(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_10 = arg2;
		this.anInt582 = this.aClass54_10.method1123(19);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)Lclient!gt;")
	public Class94 method459(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_3;
		@Pc(16) Class94 local16;
		synchronized (this.aClass132_3) {
			local16 = (Class94) this.aClass132_3.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class54 local35 = this.aClass54_10;
		@Pc(44) byte[] local44;
		synchronized (this.aClass54_10) {
			local44 = this.aClass54_10.method1126(19, arg0);
		}
		local16 = new Class94();
		if (local44 != null) {
			local16.method2084(new Class2_Sub13(local44));
		}
		@Pc(66) Class132 local66 = this.aClass132_3;
		synchronized (this.aClass132_3) {
			this.aClass132_3.method2711(local16, (long) arg0);
			return local16;
		}
	}
}

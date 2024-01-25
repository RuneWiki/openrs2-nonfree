import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class362 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!dka;")
	private final Class85 aClass85_64 = new Class85(64);

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!nca;")
	private final Class254 aClass254_157;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	public final int anInt9771;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class362(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_157 = arg2;
		this.anInt9771 = this.aClass254_157.method6101(19);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!dh;")
	public Class82 method8628(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_64;
		@Pc(16) Class82 local16;
		synchronized (this.aClass85_64) {
			local16 = (Class82) this.aClass85_64.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_157;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_157) {
			local39 = this.aClass254_157.method6087(arg0, 19);
		}
		local16 = new Class82();
		if (local39 != null) {
			local16.method1643(new Class2_Sub20(local39));
		}
		@Pc(63) Class85 local63 = this.aClass85_64;
		synchronized (this.aClass85_64) {
			this.aClass85_64.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}
}

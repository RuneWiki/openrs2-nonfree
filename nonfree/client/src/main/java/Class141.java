import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gla")
public final class Class141 {

	@OriginalMember(owner = "client!gla", name = "b", descriptor = "Lclient!dka;")
	private final Class85 aClass85_22 = new Class85(64);

	@OriginalMember(owner = "client!gla", name = "e", descriptor = "Lclient!nca;")
	private final Class254 aClass254_76;

	@OriginalMember(owner = "client!gla", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class141(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_76 = arg2;
		this.aClass254_76.method6101(5);
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(ZI)Lclient!oaa;")
	public Class2_Sub6_Sub13 method2993(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_22;
		@Pc(16) Class2_Sub6_Sub13 local16;
		synchronized (this.aClass85_22) {
			local16 = (Class2_Sub6_Sub13) this.aClass85_22.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_76;
		@Pc(39) byte[] local39;
		synchronized (this.aClass254_76) {
			local39 = this.aClass254_76.method6087(arg0, 5);
		}
		local16 = new Class2_Sub6_Sub13();
		if (local39 != null) {
			local16.method6505(new Class2_Sub20(local39));
		}
		@Pc(63) Class85 local63 = this.aClass85_22;
		synchronized (this.aClass85_22) {
			this.aClass85_22.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}
}

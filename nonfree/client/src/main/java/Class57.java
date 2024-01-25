import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class57 {

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "Lclient!dka;")
	private final Class85 aClass85_11 = new Class85(128);

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "Lclient!nca;")
	private final Class254 aClass254_36;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class57(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_36 = arg2;
		if (this.aClass254_36 != null) {
			@Pc(20) int local20 = this.aClass254_36.method6094() - 1;
			this.aClass254_36.method6101(local20);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)Lclient!cba;")
	public Class54 method1192(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_11;
		@Pc(16) Class54 local16;
		synchronized (this.aClass85_11) {
			local16 = (Class54) this.aClass85_11.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass254_36.method6087(Static639.method8675(arg0), Static480.method6887(arg0));
		local16 = new Class54();
		if (local38 != null) {
			local16.method1108(new Class2_Sub20(local38));
		}
		@Pc(61) Class85 local61 = this.aClass85_11;
		synchronized (this.aClass85_11) {
			this.aClass85_11.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}
}

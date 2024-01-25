import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class232 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!bh;")
	private final Class32 aClass32_62 = new Class32(128);

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_92;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class232(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_92 = arg2;
		if (this.aClass380_92 != null) {
			@Pc(20) int local20 = this.aClass380_92.method8639() - 1;
			this.aClass380_92.method8631(local20);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Lclient!iu;")
	public Class159 method5002(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_62;
		@Pc(16) Class159 local16;
		synchronized (this.aClass32_62) {
			local16 = (Class159) this.aClass32_62.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass380_92.method8620(Static238.method3335(arg0), Static417.method5574(arg0));
		local16 = new Class159();
		if (local37 != null) {
			local16.method3421(new Class2_Sub22(local37));
		}
		@Pc(58) Class32 local58 = this.aClass32_62;
		synchronized (this.aClass32_62) {
			this.aClass32_62.method629(local16, (long) arg0);
			return local16;
		}
	}
}

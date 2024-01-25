import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class338 {

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "Lclient!jr;")
	private final Class169 aClass169_62 = new Class169(64);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "Lclient!in;")
	private final Class157 aClass157_279;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
	public final int anInt10155;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class338(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_279 = arg2;
		this.anInt10155 = this.aClass157_279.method4561(19);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Lclient!pa;")
	public Class254 method8462(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_62;
		@Pc(16) Class254 local16;
		synchronized (this.aClass169_62) {
			local16 = (Class254) this.aClass169_62.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class157 local37 = this.aClass157_279;
		@Pc(46) byte[] local46;
		synchronized (this.aClass157_279) {
			local46 = this.aClass157_279.method4564(19, arg0);
		}
		local16 = new Class254();
		if (local46 != null) {
			local16.method6669(new Class2_Sub11(local46));
		}
		@Pc(68) Class169 local68 = this.aClass169_62;
		synchronized (this.aClass169_62) {
			this.aClass169_62.method5001(local16, (long) arg0);
			return local16;
		}
	}
}

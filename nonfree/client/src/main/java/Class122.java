import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class122 {

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "Lclient!wq;")
	private final Class391 aClass391_14 = new Class391(64);

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "Lclient!la;")
	private final Class208 aClass208_39;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class122(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_39 = arg2;
		this.aClass208_39.method5005(5);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Lclient!cea;")
	public Class5_Sub5_Sub2 method2209(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_14;
		@Pc(16) Class5_Sub5_Sub2 local16;
		synchronized (this.aClass391_14) {
			local16 = (Class5_Sub5_Sub2) this.aClass391_14.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_39;
		@Pc(41) byte[] local41;
		synchronized (this.aClass208_39) {
			local41 = this.aClass208_39.method4991(5, arg0, 68);
		}
		local16 = new Class5_Sub5_Sub2();
		if (local41 != null) {
			local16.method1105(new Class5_Sub23(local41));
		}
		@Pc(67) Class391 local67 = this.aClass391_14;
		synchronized (this.aClass391_14) {
			this.aClass391_14.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}

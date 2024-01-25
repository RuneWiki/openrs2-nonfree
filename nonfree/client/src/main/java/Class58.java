import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class58 {

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!iha;")
	private final Class168 aClass168_13 = new Class168(64);

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_45;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public final int anInt1084;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class58(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_45 = arg2;
		this.anInt1084 = this.aClass126_45.method3062(19);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lclient!uu;")
	public Class368 method1084(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_13;
		@Pc(16) Class368 local16;
		synchronized (this.aClass168_13) {
			local16 = (Class368) this.aClass168_13.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class126 local38 = this.aClass126_45;
		@Pc(47) byte[] local47;
		synchronized (this.aClass126_45) {
			local47 = this.aClass126_45.method3086(arg0, 19);
		}
		local16 = new Class368();
		if (local47 != null) {
			local16.method8459(new Class5_Sub36(local47));
		}
		@Pc(71) Class168 local71 = this.aClass168_13;
		synchronized (this.aClass168_13) {
			this.aClass168_13.method3853((long) arg0, local16);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class96 {

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!mga;")
	private final Class223 aClass223_19 = new Class223(64);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_26;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public final int anInt3004;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class96(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_26 = arg2;
		this.anInt3004 = this.aClass31_26.method657(19);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Lclient!tj;")
	public Class317 method2741(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_19;
		@Pc(16) Class317 local16;
		synchronized (this.aClass223_19) {
			local16 = (Class317) this.aClass223_19.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class31 local37 = this.aClass31_26;
		@Pc(46) byte[] local46;
		synchronized (this.aClass31_26) {
			local46 = this.aClass31_26.method667(19, arg0);
		}
		local16 = new Class317();
		if (local46 != null) {
			local16.method7206(new Class4_Sub9(local46));
		}
		@Pc(68) Class223 local68 = this.aClass223_19;
		synchronized (this.aClass223_19) {
			this.aClass223_19.method4938((long) arg0, local16);
			return local16;
		}
	}
}

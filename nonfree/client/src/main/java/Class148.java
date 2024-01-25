import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class148 {

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Lclient!fc;")
	private final Class94 aClass94_22 = new Class94(64);

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_60;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public final int anInt5481;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class148(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_60 = arg2;
		this.anInt5481 = this.aClass223_60.method5970(19);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lclient!fn;")
	public Class106 method4489(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_22;
		@Pc(16) Class106 local16;
		synchronized (this.aClass94_22) {
			local16 = (Class106) this.aClass94_22.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class223 local37 = this.aClass223_60;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_60) {
			local46 = this.aClass223_60.method5954(arg0, 19);
		}
		local16 = new Class106();
		if (local46 != null) {
			local16.method3153(new Class6_Sub8(local46));
		}
		@Pc(68) Class94 local68 = this.aClass94_22;
		synchronized (this.aClass94_22) {
			this.aClass94_22.method2963((long) arg0, local16);
			return local16;
		}
	}
}

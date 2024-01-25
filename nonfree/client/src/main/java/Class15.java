import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!fc;")
	private final Class94 aClass94_1 = new Class94(64);

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!ni;")
	private final Class223 aClass223_5;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class15(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_5 = arg2;
		this.aClass223_5.method5970(5);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lclient!lm;")
	public Class6_Sub5_Sub20 method548(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_1;
		@Pc(18) Class6_Sub5_Sub20 local18;
		synchronized (this.aClass94_1) {
			local18 = (Class6_Sub5_Sub20) this.aClass94_1.method2960((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class223 local31 = this.aClass223_5;
		@Pc(40) byte[] local40;
		synchronized (this.aClass223_5) {
			local40 = this.aClass223_5.method5954(arg0, 5);
		}
		local18 = new Class6_Sub5_Sub20();
		if (local40 != null) {
			local18.method5407(new Class6_Sub8(local40));
		}
		@Pc(62) Class94 local62 = this.aClass94_1;
		synchronized (this.aClass94_1) {
			this.aClass94_1.method2963((long) arg0, local18);
			return local18;
		}
	}
}

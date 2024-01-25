import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class228 {

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Lclient!fc;")
	private final Class94 aClass94_35 = new Class94(64);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Lclient!ni;")
	private final Class223 aClass223_81;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_82;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILclient!ni;Lclient!ni;)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_81 = arg1;
		this.aClass223_82 = arg2;
		if (this.aClass223_81 != null) {
			this.aClass223_81.method5970(0);
		}
		if (this.aClass223_82 != null) {
			this.aClass223_82.method5970(0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lclient!aw;")
	public Class6_Sub5_Sub2 method6040(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub5_Sub2 local11 = (Class6_Sub5_Sub2) this.aClass94_35.method2960((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass223_82.method5954(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass223_81.method5954(arg0, 0);
		}
		local11 = new Class6_Sub5_Sub2();
		if (local27 != null) {
			local11.method734(new Class6_Sub8(local27));
		}
		if (arg0 >= 32768) {
			local11.method733();
		}
		this.aClass94_35.method2963((long) arg0, local11);
		return local11;
	}
}

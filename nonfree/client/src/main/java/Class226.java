import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class226 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "Lclient!fba;")
	private final Class102 aClass102_38 = new Class102(64);

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!la;")
	private final Class196 aClass196_71;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "Lclient!la;")
	private final Class196 aClass196_72;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(ILclient!la;Lclient!la;)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_71 = arg1;
		this.aClass196_72 = arg2;
		if (this.aClass196_71 != null) {
			this.aClass196_71.method5118(0);
		}
		if (this.aClass196_72 != null) {
			this.aClass196_72.method5118(0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lclient!sba;")
	public Class3_Sub4_Sub20 method5962(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub20 local11 = (Class3_Sub4_Sub20) this.aClass102_38.method2677((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = this.aClass196_71.method5102(0, arg0);
		} else {
			local35 = this.aClass196_72.method5102(0, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub4_Sub20();
		if (local35 != null) {
			local11.method7623(new Class3_Sub3(local35));
		}
		if (arg0 >= 32768) {
			local11.method7621();
		}
		this.aClass102_38.method2674((long) arg0, local11);
		return local11;
	}
}

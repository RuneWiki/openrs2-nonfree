import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class303 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!mq;")
	private final Class223 aClass223_62 = new Class223(64);

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!jn;")
	private final Class176 aClass176_118;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!jn;")
	private final Class176 aClass176_117;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILclient!jn;Lclient!jn;)V")
	public Class303(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_118 = arg2;
		this.aClass176_117 = arg1;
		if (this.aClass176_117 != null) {
			this.aClass176_117.method3999(0);
		}
		if (this.aClass176_118 != null) {
			this.aClass176_118.method3999(0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)Lclient!nd;")
	public Class4_Sub5_Sub12 method7206(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub5_Sub12 local11 = (Class4_Sub5_Sub12) this.aClass223_62.method5388((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(37) byte[] local37;
		if (arg0 >= 32768) {
			local37 = this.aClass176_118.method3994(arg0 & 0x7FFF, 0);
		} else {
			local37 = this.aClass176_117.method3994(arg0, 0);
		}
		local11 = new Class4_Sub5_Sub12();
		if (local37 != null) {
			local11.method5574(new Class4_Sub11(local37));
		}
		if (arg0 >= 32768) {
			local11.method5567();
		}
		this.aClass223_62.method5394(local11, (long) arg0);
		return local11;
	}
}

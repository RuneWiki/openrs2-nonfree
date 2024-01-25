import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class150 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!jn;")
	private final Class167 aClass167_15 = new Class167(64);

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Lclient!vo;")
	private final Class348 aClass348_51;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class150(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_51 = arg2;
		this.aClass348_51.method7981(5);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lclient!jq;")
	public Class4_Sub6_Sub10 method3527(@OriginalArg(1) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_15;
		@Pc(21) Class4_Sub6_Sub10 local21;
		synchronized (this.aClass167_15) {
			local21 = (Class4_Sub6_Sub10) this.aClass167_15.method3966((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class348 local34 = this.aClass348_51;
		@Pc(45) byte[] local45;
		synchronized (this.aClass348_51) {
			local45 = this.aClass348_51.method7964(arg0, 5);
		}
		local21 = new Class4_Sub6_Sub10();
		if (local45 != null) {
			local21.method4001(new Class4_Sub13(local45));
		}
		@Pc(67) Class167 local67 = this.aClass167_15;
		synchronized (this.aClass167_15) {
			this.aClass167_15.method3974((long) arg0, local21);
			return local21;
		}
	}
}

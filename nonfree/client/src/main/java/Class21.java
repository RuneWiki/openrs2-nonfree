import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class21 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!vh;")
	private final Class330 aClass330_6 = new Class330(64);

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Lclient!pj;")
	private final Class248 aClass248_5;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class21(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_5 = arg2;
		this.aClass248_5.method5793(5);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)Lclient!lr;")
	public Class6_Sub5_Sub12 method354(@OriginalArg(0) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_6;
		@Pc(16) Class6_Sub5_Sub12 local16;
		synchronized (this.aClass330_6) {
			local16 = (Class6_Sub5_Sub12) this.aClass330_6.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class248 local34 = this.aClass248_5;
		@Pc(43) byte[] local43;
		synchronized (this.aClass248_5) {
			local43 = this.aClass248_5.method5797(5, arg0);
		}
		local16 = new Class6_Sub5_Sub12();
		if (local43 != null) {
			local16.method4566(new Class6_Sub12(local43));
		}
		@Pc(65) Class330 local65 = this.aClass330_6;
		synchronized (this.aClass330_6) {
			this.aClass330_6.method7676(local16, (long) arg0);
			return local16;
		}
	}
}

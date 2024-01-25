import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class161 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!mq;")
	private final Class223 aClass223_29 = new Class223(64);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!jn;")
	private final Class176 aClass176_62;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class161(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_62 = arg2;
		this.aClass176_62.method3999(5);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Lclient!dj;")
	public Class4_Sub5_Sub4 method3717(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_29;
		@Pc(16) Class4_Sub5_Sub4 local16;
		synchronized (this.aClass223_29) {
			local16 = (Class4_Sub5_Sub4) this.aClass223_29.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class176 local35 = this.aClass176_62;
		@Pc(44) byte[] local44;
		synchronized (this.aClass176_62) {
			local44 = this.aClass176_62.method3994(arg0, 5);
		}
		local16 = new Class4_Sub5_Sub4();
		if (local44 != null) {
			local16.method2099(new Class4_Sub11(local44));
		}
		@Pc(66) Class223 local66 = this.aClass223_29;
		synchronized (this.aClass223_29) {
			this.aClass223_29.method5394(local16, (long) arg0);
			return local16;
		}
	}
}

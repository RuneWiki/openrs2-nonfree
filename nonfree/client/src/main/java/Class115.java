import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class115 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "Lclient!vi;")
	private final Class332 aClass332_71 = new Class332(64);

	@OriginalMember(owner = "client!gba", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_51;

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
	public final int anInt2769;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class115(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_51 = arg2;
		this.anInt2769 = this.aClass251_51.method5849(19);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Lclient!pv;")
	public Class254 method2293(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_71;
		@Pc(16) Class254 local16;
		synchronized (this.aClass332_71) {
			local16 = (Class254) this.aClass332_71.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class251 local35 = this.aClass251_51;
		@Pc(44) byte[] local44;
		synchronized (this.aClass251_51) {
			local44 = this.aClass251_51.method5860(19, arg0);
		}
		local16 = new Class254();
		if (local44 != null) {
			local16.method5878(new Class6_Sub14(local44));
		}
		@Pc(66) Class332 local66 = this.aClass332_71;
		synchronized (this.aClass332_71) {
			this.aClass332_71.method7498((long) arg0, local16);
			return local16;
		}
	}
}

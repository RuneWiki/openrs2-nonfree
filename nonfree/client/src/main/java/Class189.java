import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class189 {

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Lclient!er;")
	private final Class69 aClass69_51 = new Class69(64);

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "Lclient!ns;")
	private final Class166 aClass166_221;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
	public final int anInt5626;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class189(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_221 = arg2;
		this.anInt5626 = this.aClass166_221.method3691(19);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)Lclient!jg;")
	public Class128 method4328(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_51;
		@Pc(16) Class128 local16;
		synchronized (this.aClass69_51) {
			local16 = (Class128) this.aClass69_51.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_221.method3696(arg0, 19);
		local16 = new Class128();
		if (local33 != null) {
			local16.method2748(new Class4_Sub30(local33));
		}
		@Pc(57) Class69 local57 = this.aClass69_51;
		synchronized (this.aClass69_51) {
			this.aClass69_51.method1590((long) arg0, local16);
			return local16;
		}
	}
}

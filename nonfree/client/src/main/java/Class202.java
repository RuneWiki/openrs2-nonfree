import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class202 {

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!wm;")
	private final Class267 aClass267_56 = new Class267(64);

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_100;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	public final int anInt5669;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class202(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_100 = arg2;
		this.anInt5669 = this.aClass187_100.method4306(19);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)Lclient!jh;")
	public Class129 method4516(@OriginalArg(1) int arg0) {
		@Pc(11) Class267 local11 = this.aClass267_56;
		@Pc(21) Class129 local21;
		synchronized (this.aClass267_56) {
			local21 = (Class129) this.aClass267_56.method6014((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class187 local34 = this.aClass187_100;
		@Pc(43) byte[] local43;
		synchronized (this.aClass187_100) {
			local43 = this.aClass187_100.method4300(19, arg0);
		}
		local21 = new Class129();
		if (local43 != null) {
			local21.method3062(new Class10_Sub8(local43));
		}
		@Pc(65) Class267 local65 = this.aClass267_56;
		synchronized (this.aClass267_56) {
			this.aClass267_56.method6008(local21, (long) arg0);
			return local21;
		}
	}
}

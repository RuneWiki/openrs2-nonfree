import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class74 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!fc;")
	private final Class77 aClass77_16 = new Class77(64);

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!oi;")
	private final Class185 aClass185_34;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class74(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_34 = arg2;
		this.aClass185_34.method4011(5);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lclient!de;")
	public Class1_Sub3_Sub3 method1236(@OriginalArg(0) int arg0) {
		@Pc(11) Class77 local11 = this.aClass77_16;
		@Pc(21) Class1_Sub3_Sub3 local21;
		synchronized (this.aClass77_16) {
			local21 = (Class1_Sub3_Sub3) this.aClass77_16.method1387((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class185 local34 = this.aClass185_34;
		@Pc(43) byte[] local43;
		synchronized (this.aClass185_34) {
			local43 = this.aClass185_34.method4002(5, arg0);
		}
		local21 = new Class1_Sub3_Sub3();
		if (local43 != null) {
			local21.method907(new Class1_Sub19(local43));
		}
		@Pc(65) Class77 local65 = this.aClass77_16;
		synchronized (this.aClass77_16) {
			this.aClass77_16.method1396(local21, (long) arg0);
			return local21;
		}
	}
}

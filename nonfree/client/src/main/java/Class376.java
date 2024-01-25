import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class376 {

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!tja;")
	private final Class352 aClass352_72 = new Class352(64);

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!bt;")
	private final Class34 aClass34_127;

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
	public final int anInt9899;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class376(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_127 = arg2;
		this.anInt9899 = this.aClass34_127.method1233(19);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lclient!bi;")
	public Class26 method8472(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_72;
		@Pc(16) Class26 local16;
		synchronized (this.aClass352_72) {
			local16 = (Class26) this.aClass352_72.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_127) {
			local38 = this.aClass34_127.method1239(19, arg0);
		}
		local16 = new Class26();
		if (local38 != null) {
			local16.method786(new Class4_Sub11(local38));
		}
		@Pc(67) Class352 local67 = this.aClass352_72;
		synchronized (this.aClass352_72) {
			this.aClass352_72.method7655((long) arg0, local16);
			return local16;
		}
	}
}

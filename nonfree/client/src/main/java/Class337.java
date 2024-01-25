import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class337 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!tja;")
	private final Class352 aClass352_60 = new Class352(64);

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!bt;")
	private final Class34 aClass34_110;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!bt;")
	private final Class34 aClass34_109;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILclient!bt;Lclient!bt;)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_110 = arg1;
		this.aClass34_109 = arg2;
		if (this.aClass34_110 != null) {
			this.aClass34_110.method1233(0);
		}
		if (this.aClass34_109 != null) {
			this.aClass34_109.method1233(0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Lclient!rga;")
	public Class4_Sub5_Sub18 method7426(@OriginalArg(0) int arg0) {
		@Pc(23) Class4_Sub5_Sub18 local23 = (Class4_Sub5_Sub18) this.aClass352_60.method7653((long) arg0);
		if (local23 != null) {
			return local23;
		}
		@Pc(37) byte[] local37;
		if (arg0 < 32768) {
			local37 = this.aClass34_110.method1239(0, arg0);
		} else {
			local37 = this.aClass34_109.method1239(0, arg0 & 0x7FFF);
		}
		local23 = new Class4_Sub5_Sub18();
		if (local37 != null) {
			local23.method6997(new Class4_Sub11(local37));
		}
		if (arg0 >= 32768) {
			local23.method6998();
		}
		this.aClass352_60.method7655((long) arg0, local23);
		return local23;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class337 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!aq;")
	private final Class22 aClass22_55 = new Class22(64);

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!gga;")
	private final Class124 aClass124_117;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!gga;")
	private final Class124 aClass124_116;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(ILclient!gga;Lclient!gga;)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_117 = arg1;
		this.aClass124_116 = arg2;
		if (this.aClass124_117 != null) {
			this.aClass124_117.method3629(0);
		}
		if (this.aClass124_116 != null) {
			this.aClass124_116.method3629(0);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!ak;")
	public Class2_Sub1_Sub2 method8463(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub1_Sub2 local11 = (Class2_Sub1_Sub2) this.aClass22_55.method462((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass124_116.method3641(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass124_117.method3641(0, arg0);
		}
		local11 = new Class2_Sub1_Sub2();
		if (local27 != null) {
			local11.method401(new Class2_Sub8(local27));
		}
		if (arg0 >= 32768) {
			local11.method403();
		}
		this.aClass22_55.method470((long) arg0, local11);
		return local11;
	}
}

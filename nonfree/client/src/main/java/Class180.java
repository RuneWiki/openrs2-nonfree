import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class180 {

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_39 = new Class288(64);

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_124;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Lclient!gp;")
	private final Class117 aClass117_125;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(ILclient!gp;Lclient!gp;)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_124 = arg2;
		this.aClass117_125 = arg1;
		if (this.aClass117_125 != null) {
			this.aClass117_125.method2951(0);
		}
		if (this.aClass117_124 != null) {
			this.aClass117_124.method2951(0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI)Lclient!dj;")
	public Class5_Sub2_Sub9 method4495(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub9 local11 = (Class5_Sub2_Sub9) this.aClass288_39.method6745((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass117_124.method2962(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass117_125.method2962(arg0, 0);
		}
		local11 = new Class5_Sub2_Sub9();
		if (local27 != null) {
			local11.method1974(new Class5_Sub3(local27));
		}
		if (arg0 >= 32768) {
			local11.method1972();
		}
		this.aClass288_39.method6746(local11, (long) arg0);
		return local11;
	}
}

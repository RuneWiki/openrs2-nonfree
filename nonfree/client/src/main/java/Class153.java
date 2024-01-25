import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class153 {

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Lclient!lh;")
	private final Class151 aClass151_104 = new Class151(64);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Lclient!hh;")
	private final Class109 aClass109_58;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
	public final int anInt4054;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class153(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_58 = arg2;
		this.anInt4054 = this.aClass109_58.method2322(19);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lclient!ln;")
	public Class154 method3380(@OriginalArg(1) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_104;
		@Pc(16) Class154 local16;
		synchronized (this.aClass151_104) {
			local16 = (Class154) this.aClass151_104.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass109_58.method2349(19, arg0);
		local16 = new Class154();
		if (local39 != null) {
			local16.method3382(new Class1_Sub14(local39));
		}
		@Pc(55) Class151 local55 = this.aClass151_104;
		synchronized (this.aClass151_104) {
			this.aClass151_104.method3291((long) arg0, local16);
			return local16;
		}
	}
}

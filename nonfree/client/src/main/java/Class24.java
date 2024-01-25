import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class24 {

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!lh;")
	private final Class151 aClass151_16 = new Class151(64);

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!hh;")
	private final Class109 aClass109_13;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!hh;")
	private final Class109 aClass109_15;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILclient!hh;Lclient!hh;)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_13 = arg1;
		this.aClass109_15 = arg2;
		if (this.aClass109_13 != null) {
			this.aClass109_13.method2322(0);
		}
		if (this.aClass109_15 != null) {
			this.aClass109_15.method2322(0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Lclient!vd;")
	public Class1_Sub1_Sub17 method425(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub17 local11 = (Class1_Sub1_Sub17) this.aClass151_16.method3288((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass109_13.method2349(0, arg0);
		} else {
			local27 = this.aClass109_15.method2349(0, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub1_Sub17();
		if (local27 != null) {
			local11.method5690(new Class1_Sub14(local27));
		}
		if (arg0 >= 32768) {
			local11.method5689();
		}
		this.aClass151_16.method3291((long) arg0, local11);
		return local11;
	}
}

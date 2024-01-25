import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class204 {

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!gw;")
	private final Class136 aClass136_37 = new Class136(64);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!uu;")
	private final Class343 aClass343_157;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_158;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ILclient!uu;Lclient!uu;)V")
	public Class204(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_157 = arg2;
		this.aClass343_158 = arg1;
		if (this.aClass343_158 != null) {
			this.aClass343_158.method8157(0);
		}
		if (this.aClass343_157 != null) {
			this.aClass343_157.method8157(0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lclient!fg;")
	public Class3_Sub7_Sub9 method5306(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub9 local11 = (Class3_Sub7_Sub9) this.aClass136_37.method3134((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass343_158.method8132(0, arg0);
		} else {
			local32 = this.aClass343_157.method8132(0, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub7_Sub9();
		if (local32 != null) {
			local11.method2599(new Class3_Sub9(local32));
		}
		if (arg0 >= 32768) {
			local11.method2595();
		}
		this.aClass136_37.method3135(local11, (long) arg0);
		return local11;
	}
}

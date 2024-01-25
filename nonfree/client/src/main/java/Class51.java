import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class51 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!mga;")
	private final Class223 aClass223_8 = new Class223(64);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_14;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!bi;")
	private final Class31 aClass31_15;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILclient!bi;Lclient!bi;)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_14 = arg1;
		this.aClass31_15 = arg2;
		if (this.aClass31_14 != null) {
			this.aClass31_14.method657(0);
		}
		if (this.aClass31_15 != null) {
			this.aClass31_15.method657(0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lclient!bda;")
	public Class4_Sub7_Sub1 method888(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub7_Sub1 local11 = (Class4_Sub7_Sub1) this.aClass223_8.method4943((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass31_14.method667(0, arg0);
		} else {
			local25 = this.aClass31_15.method667(0, arg0 & 0x7FFF);
		}
		local11 = new Class4_Sub7_Sub1();
		if (local25 != null) {
			local11.method598(new Class4_Sub9(local25));
		}
		if (arg0 >= 32768) {
			local11.method599();
		}
		this.aClass223_8.method4938((long) arg0, local11);
		return local11;
	}
}

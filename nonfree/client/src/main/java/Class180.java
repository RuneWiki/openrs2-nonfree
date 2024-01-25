import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class180 {

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!nga;")
	private final Class233 aClass233_27 = new Class233(64);

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_68;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!eq;")
	private final Class97 aClass97_67;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILclient!eq;Lclient!eq;)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_68 = arg2;
		this.aClass97_67 = arg1;
		if (this.aClass97_67 != null) {
			this.aClass97_67.method2569(0);
		}
		if (this.aClass97_68 != null) {
			this.aClass97_68.method2569(0);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!js;")
	public Class2_Sub5_Sub11 method4394(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub5_Sub11 local11 = (Class2_Sub5_Sub11) this.aClass233_27.method5669((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass97_68.method2545(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass97_67.method2545(arg0, 0);
		}
		local11 = new Class2_Sub5_Sub11();
		if (local27 != null) {
			local11.method4411(new Class2_Sub34(local27));
		}
		if (arg0 >= 32768) {
			local11.method4416();
		}
		this.aClass233_27.method5662(local11, (long) arg0);
		return local11;
	}
}

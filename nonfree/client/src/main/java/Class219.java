import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class219 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!qc;")
	private final Class231 aClass231_54 = new Class231(64);

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!dda;")
	private final Class53 aClass53_102;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!dda;")
	private final Class53 aClass53_103;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILclient!dda;Lclient!dda;)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_102 = arg1;
		this.aClass53_103 = arg2;
		if (this.aClass53_102 != null) {
			this.aClass53_102.method1592(0);
		}
		if (this.aClass53_103 != null) {
			this.aClass53_103.method1592(0);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Lclient!ce;")
	public Class2_Sub13_Sub1 method5798(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub13_Sub1 local11 = (Class2_Sub13_Sub1) this.aClass231_54.method6228((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass53_103.method1616(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass53_102.method1616(arg0, 0);
		}
		local11 = new Class2_Sub13_Sub1();
		if (local27 != null) {
			local11.method1100(new Class2_Sub29(local27));
		}
		if (arg0 >= 32768) {
			local11.method1103();
		}
		this.aClass231_54.method6232(local11, (long) arg0);
		return local11;
	}
}

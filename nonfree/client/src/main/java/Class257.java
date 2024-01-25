import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class257 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!nj;")
	private final Class171 aClass171_57 = new Class171(64);

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!mg;")
	private final Class160 aClass160_85;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!mg;")
	private final Class160 aClass160_86;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ILclient!mg;Lclient!mg;)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_85 = arg2;
		this.aClass160_86 = arg1;
		if (this.aClass160_86 != null) {
			this.aClass160_86.method3722(0);
		}
		if (this.aClass160_85 != null) {
			this.aClass160_85.method3722(0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Lclient!fo;")
	public Class2_Sub5_Sub7 method5672(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub5_Sub7 local11 = (Class2_Sub5_Sub7) this.aClass171_57.method3941((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass160_86.method3696(arg0, 0);
		} else {
			local27 = this.aClass160_85.method3696(arg0 & 0x7FFF, 0);
		}
		local11 = new Class2_Sub5_Sub7();
		if (local27 != null) {
			local11.method2028(new Class2_Sub23(local27));
		}
		if (arg0 >= 32768) {
			local11.method2025();
		}
		this.aClass171_57.method3940((long) arg0, local11);
		return local11;
	}
}

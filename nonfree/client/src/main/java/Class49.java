import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class49 {

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Lclient!h;")
	private final Class125 aClass125_8 = new Class125(64);

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "Lclient!an;")
	private final Class16 aClass16_12;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Lclient!an;")
	private final Class16 aClass16_13;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(ILclient!an;Lclient!an;)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_12 = arg2;
		this.aClass16_13 = arg1;
		if (this.aClass16_13 != null) {
			this.aClass16_13.method399(0);
		}
		if (this.aClass16_12 != null) {
			this.aClass16_12.method399(0);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BI)Lclient!wq;")
	public Class12_Sub4_Sub18 method1435(@OriginalArg(1) int arg0) {
		@Pc(11) Class12_Sub4_Sub18 local11 = (Class12_Sub4_Sub18) this.aClass125_8.method3446((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass16_12.method408(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass16_13.method408(0, arg0);
		}
		local11 = new Class12_Sub4_Sub18();
		if (local27 != null) {
			local11.method7963(new Class12_Sub8(local27));
		}
		if (arg0 >= 32768) {
			local11.method7960();
		}
		this.aClass125_8.method3437(local11, (long) arg0);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class198 {

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!ka;")
	private final Class132 aClass132_49 = new Class132(64);

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!dk;")
	private final Class54 aClass54_88;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!dk;")
	private final Class54 aClass54_87;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILclient!dk;Lclient!dk;)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_88 = arg1;
		this.aClass54_87 = arg2;
		if (this.aClass54_88 != null) {
			this.aClass54_88.method1123(0);
		}
		if (this.aClass54_87 != null) {
			this.aClass54_87.method1123(0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lclient!dd;")
	public Class2_Sub5_Sub3 method4343(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub5_Sub3 local11 = (Class2_Sub5_Sub3) this.aClass132_49.method2701((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass54_87.method1126(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass54_88.method1126(0, arg0);
		}
		local11 = new Class2_Sub5_Sub3();
		if (local27 != null) {
			local11.method1058(new Class2_Sub13(local27));
		}
		if (arg0 >= 32768) {
			local11.method1051();
		}
		this.aClass132_49.method2711(local11, (long) arg0);
		return local11;
	}
}

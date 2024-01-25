import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class72 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!of;")
	private final Class188 aClass188_18 = new Class188(64);

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!mn;")
	private final Class171 aClass171_25;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!mn;")
	private final Class171 aClass171_24;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(ILclient!mn;Lclient!mn;)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_25 = arg2;
		this.aClass171_24 = arg1;
		if (this.aClass171_24 != null) {
			this.aClass171_24.method3662(0);
		}
		if (this.aClass171_25 != null) {
			this.aClass171_25.method3662(0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lclient!qm;")
	public Class2_Sub1_Sub16 method1445(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub1_Sub16 local11 = (Class2_Sub1_Sub16) this.aClass188_18.method4158((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass171_24.method3658(0, arg0);
		} else {
			local33 = this.aClass171_25.method3658(0, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub1_Sub16();
		if (local33 != null) {
			local11.method4779(new Class2_Sub17(local33));
		}
		if (arg0 >= 32768) {
			local11.method4781();
		}
		this.aClass188_18.method4155((long) arg0, local11);
		return local11;
	}
}

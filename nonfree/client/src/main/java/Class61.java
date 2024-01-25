import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class61 {

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!gg;")
	private final Class112 aClass112_11 = new Class112(64);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!kha;")
	private final Class181 aClass181_20;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_19;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(ILclient!kha;Lclient!kha;)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_20 = arg1;
		this.aClass181_19 = arg2;
		if (this.aClass181_20 != null) {
			this.aClass181_20.method5025(0);
		}
		if (this.aClass181_19 != null) {
			this.aClass181_19.method5025(0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lclient!cw;")
	public Class3_Sub1_Sub2 method2284(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub1_Sub2 local16 = (Class3_Sub1_Sub2) this.aClass112_11.method3640((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = this.aClass181_20.method5023(0, arg0);
		} else {
			local34 = this.aClass181_19.method5023(0, arg0 & 0x7FFF);
		}
		local16 = new Class3_Sub1_Sub2();
		if (local34 != null) {
			local16.method2189(new Class3_Sub15(local34));
		}
		if (arg0 >= 32768) {
			local16.method2187();
		}
		this.aClass112_11.method3636((long) arg0, local16);
		return local16;
	}
}

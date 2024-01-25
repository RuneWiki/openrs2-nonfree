import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class12 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "Lclient!qr;")
	private final Class293 aClass293_4 = new Class293(64);

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_7;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "Lclient!wu;")
	private final Class384 aClass384_8;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILclient!wu;Lclient!wu;)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_7 = arg2;
		this.aClass384_8 = arg1;
		if (this.aClass384_8 != null) {
			this.aClass384_8.method8862(0);
		}
		if (this.aClass384_7 != null) {
			this.aClass384_7.method8862(0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Lclient!fba;")
	public Class5_Sub4_Sub7 method193(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub4_Sub7 local11 = (Class5_Sub4_Sub7) this.aClass293_4.method6921((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass384_8.method8885(0, arg0);
		} else {
			local25 = this.aClass384_7.method8885(0, arg0 & 0x7FFF);
		}
		local11 = new Class5_Sub4_Sub7();
		if (local25 != null) {
			local11.method2156(new Class5_Sub12(local25));
		}
		if (arg0 >= 32768) {
			local11.method2153();
		}
		this.aClass293_4.method6925((long) arg0, local11);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class276 {

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Lclient!wg;")
	private final Class313 aClass313_59 = new Class313(64);

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Lclient!kr;")
	private final Class171 aClass171_140;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "Lclient!kr;")
	private final Class171 aClass171_141;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(ILclient!kr;Lclient!kr;)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_140 = arg2;
		this.aClass171_141 = arg1;
		if (this.aClass171_141 != null) {
			this.aClass171_141.method4349(0);
		}
		if (this.aClass171_140 != null) {
			this.aClass171_140.method4349(0);
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)Lclient!nq;")
	public Class1_Sub1_Sub13 method6448(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub13 local11 = (Class1_Sub1_Sub13) this.aClass313_59.method7406((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass171_141.method4339(0, arg0);
		} else {
			local27 = this.aClass171_140.method4339(0, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub1_Sub13();
		if (local27 != null) {
			local11.method5059(new Class1_Sub6(local27));
		}
		if (arg0 >= 32768) {
			local11.method5058();
		}
		this.aClass313_59.method7399((long) arg0, local11);
		return local11;
	}
}

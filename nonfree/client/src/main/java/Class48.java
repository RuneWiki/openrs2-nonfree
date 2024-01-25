import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class48 {

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!ui;")
	private final Class359 aClass359_7 = new Class359(64);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!lga;")
	private final Class223 aClass223_14;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!lga;")
	private final Class223 aClass223_13;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(ILclient!lga;Lclient!lga;)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_14 = arg2;
		this.aClass223_13 = arg1;
		if (this.aClass223_13 != null) {
			this.aClass223_13.method5264(0);
		}
		if (this.aClass223_14 != null) {
			this.aClass223_14.method5264(0);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Lclient!qga;")
	public Class6_Sub2_Sub17 method685(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub17 local11 = (Class6_Sub2_Sub17) this.aClass359_7.method8517((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aClass223_13.method5267(arg0, 0);
		} else {
			local28 = this.aClass223_14.method5267(arg0 & 0x7FFF, 0);
		}
		local11 = new Class6_Sub2_Sub17();
		if (local28 != null) {
			local11.method7247(new Class6_Sub15(local28), 4);
		}
		if (arg0 >= 32768) {
			local11.method7243();
		}
		this.aClass359_7.method8515((long) arg0, local11);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class276 {

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt7771 = 0;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt7772 = 0;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!ui;")
	private final Class359 aClass359_52 = new Class359(64);

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!lp;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!lga;")
	private final Class223 aClass223_91;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!lga;")
	private final Class223 aClass223_92;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILclient!lga;Lclient!lga;Lclient!lp;)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Interface16 arg3) {
		this.aClass223_91 = arg1;
		this.aClass223_92 = arg2;
		this.anInterface16_1 = arg3;
		if (this.aClass223_91 != null) {
			this.anInt7771 = this.aClass223_91.method5264(1);
		}
		if (this.aClass223_92 != null) {
			this.anInt7772 = this.aClass223_92.method5264(1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lclient!ud;")
	public Class6_Sub2_Sub20 method6929(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub2_Sub20 local11 = (Class6_Sub2_Sub20) this.aClass359_52.method8517((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26;
		if (arg0 < 32768) {
			local26 = this.aClass223_91.method5267(arg0, 1);
		} else {
			local26 = this.aClass223_92.method5267(arg0 & 0x7FFF, 1);
		}
		local11 = new Class6_Sub2_Sub20();
		local11.aClass276_2 = this;
		if (local26 != null) {
			local11.method8379(new Class6_Sub15(local26));
		}
		if (arg0 >= 32768) {
			local11.method8370();
		}
		this.aClass359_52.method8515((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZJ[ILclient!hj;)Ljava/lang/String;")
	public String method6932(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class158 arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(14) String local14 = this.anInterface16_1.method3725(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}
}

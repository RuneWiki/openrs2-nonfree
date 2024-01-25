import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class156 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public int anInt4335 = 0;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public int anInt4337 = 0;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!kh;")
	private final Class134 aClass134_36 = new Class134(64);

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!om;")
	private Interface7 anInterface7_1 = null;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!ul;")
	private final Class246 aClass246_129;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_128;

	static {
		new Class7("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
		new Class7("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(ILclient!ul;Lclient!ul;Lclient!om;)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Interface7 arg3) {
		this.anInterface7_1 = arg3;
		this.aClass246_129 = arg2;
		this.aClass246_128 = arg1;
		if (this.aClass246_128 != null) {
			this.anInt4335 = this.aClass246_128.method5492(1);
		}
		if (this.aClass246_129 != null) {
			this.anInt4337 = this.aClass246_129.method5492(1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!qu;[IJ)Ljava/lang/String;")
	public String method3581(@OriginalArg(1) Class204 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface7_1 != null) {
			@Pc(14) String local14 = this.anInterface7_1.method2553(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lclient!tb;")
	public Class1_Sub2_Sub17 method3582(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub17 local11 = (Class1_Sub2_Sub17) this.aClass134_36.method3266((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass246_128.method5477(1, arg0);
		} else {
			local33 = this.aClass246_129.method5477(1, arg0 & 0x7FFF);
		}
		local11 = new Class1_Sub2_Sub17();
		local11.aClass156_2 = this;
		if (local33 != null) {
			local11.method5144(new Class1_Sub5(local33));
		}
		if (arg0 >= 32768) {
			local11.method5147();
		}
		this.aClass134_36.method3263((long) arg0, local11);
		return local11;
	}
}

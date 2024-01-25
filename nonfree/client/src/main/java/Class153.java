import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class153 {

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!dg;")
	private Class2_Sub10 aClass2_Sub10_4;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "[Lclient!re;")
	private Class121_Sub1[] aClass121_Sub1Array2;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!qs;")
	private final Class165 aClass165_2;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!nh;")
	private final Class136 aClass136_2;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!qb;")
	private Class2_Sub11_Sub4_Sub2 aClass2_Sub11_Sub4_Sub2_1;

	static {
		new Class179(64);
		new Class93("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!qs;Lclient!nh;)V")
	public Class153(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class136 arg1) {
		this.aClass165_2 = arg0;
		this.aClass136_2 = arg1;
		if (!this.aClass165_2.method4810()) {
			this.aClass2_Sub11_Sub4_Sub2_1 = this.aClass165_2.method4809(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!gb;IBLclient!gb;)Lclient!re;")
	private Class121_Sub1 method4133(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class71 arg2) {
		if (this.aClass2_Sub10_4 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub10_4.anInt4807 = arg1 * 8 + 5;
		if (this.aClass2_Sub10_4.anInt4807 >= this.aClass2_Sub10_4.aByteArray57.length) {
			throw new RuntimeException();
		} else if (this.aClass121_Sub1Array2[arg1] == null) {
			@Pc(49) int local49 = this.aClass2_Sub10_4.method4444();
			@Pc(54) int local54 = this.aClass2_Sub10_4.method4444();
			@Pc(73) Class121_Sub1 local73 = new Class121_Sub1(arg1, arg0, arg2, this.aClass165_2, this.aClass136_2, local49, local54, true);
			this.aClass121_Sub1Array2[arg1] = local73;
			return local73;
		} else {
			return this.aClass121_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!gb;IILclient!gb;)Lclient!re;")
	public Class121_Sub1 method4137(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class71 arg2) {
		return this.method4133(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method4138() {
		if (this.aClass121_Sub1Array2 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass121_Sub1Array2.length; local19++) {
			if (this.aClass121_Sub1Array2[local19] != null) {
				this.aClass121_Sub1Array2[local19].method4872();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass121_Sub1Array2.length; local44++) {
			if (this.aClass121_Sub1Array2[local44] != null) {
				this.aClass121_Sub1Array2[local44].method4870();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z")
	public boolean method4139() {
		if (this.aClass2_Sub10_4 != null) {
			return true;
		}
		if (this.aClass2_Sub11_Sub4_Sub2_1 == null) {
			if (this.aClass165_2.method4810()) {
				return false;
			}
			this.aClass2_Sub11_Sub4_Sub2_1 = this.aClass165_2.method4809(255, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub11_Sub4_Sub2_1.aBoolean446) {
			return false;
		} else {
			this.aClass2_Sub10_4 = new Class2_Sub10(this.aClass2_Sub11_Sub4_Sub2_1.method4520());
			this.aClass121_Sub1Array2 = new Class121_Sub1[(this.aClass2_Sub10_4.aByteArray57.length - 5) / 8];
			return true;
		}
	}
}

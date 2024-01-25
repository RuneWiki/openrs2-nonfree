import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class62 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!hp;")
	private final Class125 aClass125_11 = new Class125(64);

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Lclient!kea;")
	private final Class161 aClass161_19;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!kea;")
	private final Class161 aClass161_18;

	static {
		new Class67("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(ILclient!kea;Lclient!kea;)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_19 = arg2;
		this.aClass161_18 = arg1;
		if (this.aClass161_18 != null) {
			this.aClass161_18.method4266(0);
		}
		if (this.aClass161_19 != null) {
			this.aClass161_19.method4266(0);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lclient!ca;")
	public Class3_Sub10_Sub2 method1816(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub10_Sub2 local11 = (Class3_Sub10_Sub2) this.aClass125_11.method3512((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass161_19.method4243(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass161_18.method4243(arg0, 0);
		}
		local11 = new Class3_Sub10_Sub2();
		if (local27 != null) {
			local11.method1035(new Class3_Sub27(local27));
		}
		if (arg0 >= 32768) {
			local11.method1036();
		}
		this.aClass125_11.method3519((long) arg0, local11);
		return local11;
	}
}

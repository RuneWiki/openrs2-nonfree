import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class120_Sub6 extends Class120 {

	static {
		new Class67("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class120_Sub6(@OriginalArg(0) Class5_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	@Override
	public void method7324() {
		super.aClass5_Sub3_20.method6331(false);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7326(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub3_20.method6331(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLclient!iu;)V")
	@Override
	public void method7328(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass5_Sub3_20.method6416(arg1);
		super.aClass5_Sub3_20.method6309(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7322() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7331(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	@Override
	public void method7329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class188 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "J")
	public final long aLong161;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_28;

	static {
		new Class119("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ur;JI)V")
	public Class188(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong161 = arg1;
		this.aClass34_Sub2_28 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass34_Sub2_28.method5515(this.aLong161);
		super.finalize();
	}
}

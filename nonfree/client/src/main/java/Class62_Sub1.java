import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public int anInt5288;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	public int anInt5291;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
	public final boolean aBoolean480;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public int anInt5289;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "B")
	public final byte aByte55;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "S")
	public short aShort86;

	static {
		new Class93("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort85 = (short) arg7;
		this.anInt5291 = (short) arg2;
		this.aByte56 = (byte) arg0;
		this.aBoolean480 = arg8;
		this.aShort83 = (short) arg6;
		this.anInt5289 = (short) arg1;
		this.aByte55 = arg9;
		this.anInt5280 = (short) arg3;
		this.aShort84 = (short) arg4;
		this.aShort86 = (short) arg5;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V")
	public void method4763() {
	}

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)I")
	public abstract int method4764();
}

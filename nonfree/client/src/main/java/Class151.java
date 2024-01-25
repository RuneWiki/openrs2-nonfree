import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class151 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
	public final int anInt4690;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public final int anInt4692;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
	public final int anInt4696;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Z")
	public final boolean aBoolean372;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	public final int anInt4694;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "S")
	public final short aShort66;

	static {
		new Class88("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte62 = (byte) arg8;
		this.anInt4690 = arg0;
		this.anInt4692 = arg1;
		this.anInt4696 = arg11;
		this.aShort67 = (short) arg5;
		this.aBoolean372 = arg10;
		this.anInt4695 = arg3;
		this.aShort65 = (short) arg4;
		this.aByte63 = (byte) arg7;
		this.anInt4694 = arg2;
		this.aShort66 = (short) arg6;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class381 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "B")
	public byte aByte166;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!fha;")
	public Interface9 anInterface9_7;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "B")
	public final byte aByte167;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!fha;III)V")
	public Class381(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte166 = (byte) arg3;
		this.anInterface9_7 = arg0;
		this.aShort117 = (short) arg1;
		this.aByte167 = (byte) arg2;
	}
}

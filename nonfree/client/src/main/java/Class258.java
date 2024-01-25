import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class258 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "B")
	public byte aByte85;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!qo;")
	public Interface15 anInterface15_6;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "S")
	public final short aShort100;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!qo;III)V")
	public Class258(@OriginalArg(0) Interface15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte85 = (byte) arg3;
		this.anInterface15_6 = arg0;
		this.aShort100 = (short) arg1;
		this.aByte86 = (byte) arg2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class156 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "B")
	public final byte aByte52;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!ti;")
	public Interface9 anInterface9_3;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!po;Lclient!ti;III)V")
	public Class156(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte51 = (byte) arg4;
		this.aByte52 = (byte) arg3;
		this.aShort55 = (short) arg2;
		this.anInterface9_3 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class313 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "[I")
	public static final int[] anIntArray559 = new int[128];

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "B")
	public byte aByte106;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!bia;")
	public Interface3 anInterface3_7;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray559.length; local4++) {
			anIntArray559[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray559[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray559[local33] = local33 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray559[local50] = local50 + 52 - 48;
		}
		anIntArray559[42] = anIntArray559[43] = 62;
		anIntArray559[45] = anIntArray559[47] = 63;
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!bia;III)V")
	public Class313(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte106 = (byte) arg3;
		this.aShort106 = (short) arg1;
		this.aByte105 = (byte) arg2;
		this.anInterface3_7 = arg0;
	}
}

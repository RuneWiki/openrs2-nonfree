import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "[B")
	public static final byte[] aByteArray8;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
	public final int anInt379;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
	public int anInt380;

	static {
		new Class93("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
		@Pc(9) int local9 = 0;
		aByteArray8 = new byte[32896];
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			for (@Pc(17) int local17 = 0; local17 <= local14; local17++) {
				aByteArray8[local9++] = (byte) (255.0D / Math.sqrt((double) ((float) (local17 * local17 + local14 * local14 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(II)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt379 = arg0;
		this.anInt380 = arg1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class100_Sub1_Sub1 extends Class100_Sub1 {

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "[I")
	public static final int[] anIntArray604 = new int[128];

	@OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
	public int anInt10755;

	static {
		for (@Pc(325) int local325 = 0; local325 < anIntArray604.length; local325++) {
			anIntArray604[local325] = -1;
		}
		for (@Pc(341) int local341 = 65; local341 <= 90; local341++) {
			anIntArray604[local341] = local341 - 65;
		}
		for (@Pc(356) int local356 = 97; local356 <= 122; local356++) {
			anIntArray604[local356] = local356 + 26 - 97;
		}
		for (@Pc(373) int local373 = 48; local373 <= 57; local373++) {
			anIntArray604[local373] = local373 + 4;
		}
		anIntArray604[42] = anIntArray604[43] = 62;
		anIntArray604[45] = anIntArray604[47] = 63;
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!bla;)V")
	public Class100_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0, false);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class80 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "[I")
	public static final int[] anIntArray115 = new int[256];

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "[I")
	public final int[] anIntArray118 = new int[3];

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "[I")
	public final int[] anIntArray117 = new int[3];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
	public final int[] anIntArray114 = new int[2];

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "[I")
	public final int[] anIntArray116 = new int[2];

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
	public short[] aShortArray48;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray115[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class80(@OriginalArg(0) Class351 arg0) {
		this.anIntArray117[1] = arg0.anInt10212;
		this.anIntArray117[2] = arg0.anInt10183;
		this.anIntArray117[0] = arg0.anInt10193;
		this.anIntArray118[2] = arg0.anInt10167;
		this.anIntArray118[0] = arg0.anInt10165;
		this.anIntArray118[1] = arg0.anInt10164;
		this.anIntArray116[1] = arg0.anInt10176;
		this.anIntArray116[0] = arg0.anInt10162;
		this.anIntArray114[1] = arg0.anInt10181;
		this.anIntArray114[0] = arg0.anInt10169;
		if (arg0.aShortArray154 != null) {
			this.aShortArray49 = new short[arg0.aShortArray154.length];
			Static679.method4132(arg0.aShortArray154, 0, this.aShortArray49, 0, this.aShortArray49.length);
		}
		if (arg0.aShortArray153 != null) {
			this.aShortArray48 = new short[arg0.aShortArray153.length];
			Static679.method4132(arg0.aShortArray153, 0, this.aShortArray48, 0, this.aShortArray48.length);
		}
	}
}

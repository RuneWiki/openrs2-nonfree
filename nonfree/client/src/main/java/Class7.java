import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class7 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
	public final int[] anIntArray13 = new int[2];

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
	public final int[] anIntArray15 = new int[2];

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
	public final int[] anIntArray14 = new int[3];

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
	public final int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!vw;)V")
	public Class7(@OriginalArg(0) Class374 arg0) {
		this.anIntArray14[0] = arg0.anInt10313;
		this.anIntArray14[2] = arg0.anInt10273;
		this.anIntArray14[1] = arg0.anInt10308;
		this.anIntArray16[0] = arg0.anInt10330;
		this.anIntArray16[1] = arg0.anInt10323;
		this.anIntArray16[2] = arg0.anInt10312;
		this.anIntArray13[0] = arg0.anInt10281;
		this.anIntArray13[1] = arg0.anInt10291;
		this.anIntArray15[0] = arg0.anInt10278;
		this.anIntArray15[1] = arg0.anInt10318;
		if (arg0.aShortArray153 != null) {
			this.aShortArray1 = new short[arg0.aShortArray153.length];
			Static684.method5328(arg0.aShortArray153, 0, this.aShortArray1, 0, this.aShortArray1.length);
		}
		if (arg0.aShortArray154 != null) {
			this.aShortArray2 = new short[arg0.aShortArray154.length];
			Static684.method5328(arg0.aShortArray154, 0, this.aShortArray2, 0, this.aShortArray2.length);
		}
	}
}

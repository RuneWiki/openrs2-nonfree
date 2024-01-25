import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class192 {

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "[I")
	public final int[] anIntArray270 = new int[3];

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
	public final int[] anIntArray268 = new int[2];

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "[I")
	public final int[] anIntArray267 = new int[3];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	public final int[] anIntArray269 = new int[2];

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!nda;)V")
	public Class192(@OriginalArg(0) Class246 arg0) {
		this.anIntArray267[0] = arg0.anInt6495;
		this.anIntArray267[1] = arg0.anInt6487;
		this.anIntArray267[2] = arg0.lb;
		this.anIntArray270[2] = arg0.anInt6519;
		this.anIntArray270[0] = arg0.anInt6469;
		this.anIntArray270[1] = arg0.anInt6505;
		this.anIntArray269[0] = arg0.anInt6454;
		this.anIntArray269[1] = arg0.anInt6503;
		this.anIntArray268[0] = arg0.anInt6499;
		this.anIntArray268[1] = arg0.anInt6482;
		if (arg0.aShortArray103 != null) {
			this.aShortArray61 = new short[arg0.aShortArray103.length];
			Static693.method8322(arg0.aShortArray103, 0, this.aShortArray61, 0, this.aShortArray61.length);
		}
		if (arg0.aShortArray101 != null) {
			this.aShortArray60 = new short[arg0.aShortArray101.length];
			Static693.method8322(arg0.aShortArray101, 0, this.aShortArray60, 0, this.aShortArray60.length);
		}
	}
}

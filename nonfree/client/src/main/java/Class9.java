import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class9 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "[I")
	public final int[] anIntArray22 = new int[3];

	@OriginalMember(owner = "client!af", name = "j", descriptor = "[I")
	public final int[] anIntArray21 = new int[2];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "[I")
	public final int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
	public final int[] anIntArray20 = new int[3];

	@OriginalMember(owner = "client!af", name = "i", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!lia;)V")
	public Class9(@OriginalArg(0) Class219 arg0) {
		this.anIntArray22[1] = arg0.anInt6119;
		this.anIntArray22[0] = arg0.anInt6107;
		this.anIntArray22[2] = arg0.anInt6153;
		this.anIntArray20[0] = arg0.anInt6110;
		this.anIntArray20[2] = arg0.anInt6169;
		this.anIntArray20[1] = arg0.anInt6122;
		this.anIntArray21[0] = arg0.anInt6108;
		this.anIntArray21[1] = arg0.anInt6154;
		this.anIntArray18[0] = arg0.anInt6164;
		this.anIntArray18[1] = arg0.anInt6135;
		if (arg0.aShortArray78 != null) {
			this.aShortArray2 = new short[arg0.aShortArray78.length];
			Static685.method8327(arg0.aShortArray78, 0, this.aShortArray2, 0, this.aShortArray2.length);
		}
		if (arg0.aShortArray76 != null) {
			this.aShortArray1 = new short[arg0.aShortArray76.length];
			Static685.method8327(arg0.aShortArray76, 0, this.aShortArray1, 0, this.aShortArray1.length);
		}
	}
}

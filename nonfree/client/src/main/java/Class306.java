import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public final class Class306 {

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "[I")
	public final int[] anIntArray502 = new int[3];

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "[I")
	public final int[] anIntArray501 = new int[2];

	@OriginalMember(owner = "client!rja", name = "j", descriptor = "[I")
	public final int[] anIntArray499 = new int[2];

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "[I")
	public final int[] anIntArray500 = new int[3];

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class306(@OriginalArg(0) Class204 arg0) {
		this.anIntArray500[1] = arg0.anInt5729;
		this.anIntArray500[2] = arg0.anInt5663;
		this.anIntArray500[0] = arg0.anInt5695;
		this.anIntArray502[2] = arg0.anInt5722;
		this.anIntArray502[1] = arg0.anInt5721;
		this.anIntArray502[0] = arg0.anInt5674;
		this.anIntArray499[1] = arg0.anInt5705;
		this.anIntArray499[0] = arg0.anInt5718;
		this.anIntArray501[1] = arg0.anInt5666;
		this.anIntArray501[0] = arg0.anInt5706;
		if (arg0.aShortArray81 != null) {
			this.aShortArray113 = new short[arg0.aShortArray81.length];
			Static682.method795(arg0.aShortArray81, 0, this.aShortArray113, 0, this.aShortArray113.length);
		}
		if (arg0.aShortArray83 != null) {
			this.aShortArray112 = new short[arg0.aShortArray83.length];
			Static682.method795(arg0.aShortArray83, 0, this.aShortArray112, 0, this.aShortArray112.length);
		}
	}
}

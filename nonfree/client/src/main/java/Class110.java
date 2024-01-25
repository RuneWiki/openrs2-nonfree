import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class110 {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
	public final int[] anIntArray273 = new int[2];

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "[I")
	public final int[] anIntArray271 = new int[3];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
	public final int[] anIntArray269 = new int[3];

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "[I")
	public final int[] anIntArray270 = new int[2];

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!bca;)V")
	public Class110(@OriginalArg(0) Class27 arg0) {
		this.anIntArray269[0] = arg0.anInt934;
		this.anIntArray269[1] = arg0.anInt957;
		this.anIntArray269[2] = arg0.anInt962;
		this.anIntArray271[2] = arg0.anInt903;
		this.anIntArray271[1] = arg0.anInt925;
		this.anIntArray271[0] = arg0.anInt910;
		this.anIntArray270[1] = arg0.anInt960;
		this.anIntArray270[0] = arg0.anInt920;
		this.anIntArray273[1] = arg0.anInt929;
		this.anIntArray273[0] = arg0.anInt919;
		if (arg0.aShortArray8 != null) {
			this.aShortArray54 = new short[arg0.aShortArray8.length];
			Static681.method2475(arg0.aShortArray8, 0, this.aShortArray54, 0, this.aShortArray54.length);
		}
		if (arg0.aShortArray9 != null) {
			this.aShortArray55 = new short[arg0.aShortArray9.length];
			Static681.method2475(arg0.aShortArray9, 0, this.aShortArray55, 0, this.aShortArray55.length);
		}
	}
}

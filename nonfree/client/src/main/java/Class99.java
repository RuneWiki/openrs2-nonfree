import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class99 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[I")
	public final int[] anIntArray139 = new int[3];

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	public final int[] anIntArray140 = new int[2];

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[I")
	public final int[] anIntArray142 = new int[3];

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
	public final int[] anIntArray141 = new int[2];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ak;)V")
	public Class99(@OriginalArg(0) Class15 arg0) {
		this.anIntArray139[0] = arg0.anInt428;
		this.anIntArray139[1] = arg0.anInt418;
		this.anIntArray139[2] = arg0.anInt425;
		this.anIntArray142[0] = arg0.anInt416;
		this.anIntArray142[1] = arg0.anInt435;
		this.anIntArray142[2] = arg0.anInt466;
		this.anIntArray141[1] = arg0.anInt433;
		this.anIntArray141[0] = arg0.anInt438;
		this.anIntArray140[1] = arg0.anInt475;
		this.anIntArray140[0] = arg0.anInt474;
		if (arg0.aShortArray4 != null) {
			this.aShortArray29 = new short[arg0.aShortArray4.length];
			Static681.method4035(arg0.aShortArray4, 0, this.aShortArray29, 0, this.aShortArray29.length);
		}
		if (arg0.aShortArray1 != null) {
			this.aShortArray30 = new short[arg0.aShortArray1.length];
			Static681.method4035(arg0.aShortArray1, 0, this.aShortArray30, 0, this.aShortArray30.length);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class22 {

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "[I")
	public final int[] anIntArray44 = new int[3];

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "[I")
	public final int[] anIntArray42 = new int[3];

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "[I")
	public final int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "[I")
	public final int[] anIntArray43 = new int[2];

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!eh;)V")
	public Class22(@OriginalArg(0) Class91 arg0) {
		this.anIntArray42[1] = arg0.anInt2699;
		this.anIntArray42[2] = arg0.anInt2714;
		this.anIntArray42[0] = arg0.anInt2712;
		this.anIntArray44[0] = arg0.anInt2709;
		this.anIntArray44[1] = arg0.anInt2728;
		this.anIntArray44[2] = arg0.anInt2696;
		this.anIntArray41[1] = arg0.anInt2729;
		this.anIntArray41[0] = arg0.anInt2676;
		this.anIntArray43[0] = arg0.anInt2668;
		this.anIntArray43[1] = arg0.anInt2733;
		if (arg0.aShortArray42 != null) {
			this.aShortArray16 = new short[arg0.aShortArray42.length];
			Static735.method9189(arg0.aShortArray42, 0, this.aShortArray16, 0, this.aShortArray16.length);
		}
		if (arg0.aShortArray39 != null) {
			this.aShortArray15 = new short[arg0.aShortArray39.length];
			Static735.method9189(arg0.aShortArray39, 0, this.aShortArray15, 0, this.aShortArray15.length);
		}
	}
}

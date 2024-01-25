import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class383 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
	public final int[] anIntArray682 = new int[2];

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "[I")
	public final int[] anIntArray681 = new int[2];

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "[I")
	public final int[] anIntArray683 = new int[3];

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "[I")
	public final int[] anIntArray680 = new int[3];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "[S")
	public short[] aShortArray158;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "[S")
	public short[] aShortArray157;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class383(@OriginalArg(0) Class282 arg0) {
		this.anIntArray680[1] = arg0.anInt7932;
		this.anIntArray680[0] = arg0.anInt7905;
		this.anIntArray680[2] = arg0.anInt7918;
		this.anIntArray683[0] = arg0.anInt7914;
		this.anIntArray683[1] = arg0.anInt7893;
		this.anIntArray683[2] = arg0.anInt7889;
		this.anIntArray682[1] = arg0.anInt7926;
		this.anIntArray682[0] = arg0.anInt7891;
		this.anIntArray681[1] = arg0.anInt7885;
		this.anIntArray681[0] = arg0.anInt7927;
		if (arg0.aShortArray94 != null) {
			this.aShortArray158 = new short[arg0.aShortArray94.length];
			Static695.method5642(arg0.aShortArray94, 0, this.aShortArray158, 0, this.aShortArray158.length);
		}
		if (arg0.aShortArray97 != null) {
			this.aShortArray157 = new short[arg0.aShortArray97.length];
			Static695.method5642(arg0.aShortArray97, 0, this.aShortArray157, 0, this.aShortArray157.length);
		}
	}
}

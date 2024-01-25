import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class206 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[I")
	public final int[] anIntArray313 = new int[3];

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
	public final int[] anIntArray315 = new int[2];

	@OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
	public final int[] anIntArray316 = new int[2];

	@OriginalMember(owner = "client!km", name = "k", descriptor = "[I")
	public final int[] anIntArray314 = new int[3];

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class206(@OriginalArg(0) Class284 arg0) {
		this.anIntArray314[0] = arg0.anInt7765;
		this.anIntArray314[2] = arg0.anInt7789;
		this.anIntArray314[1] = arg0.anInt7742;
		this.anIntArray313[1] = arg0.anInt7768;
		this.anIntArray313[2] = arg0.anInt7778;
		this.anIntArray313[0] = arg0.anInt7785;
		this.anIntArray315[0] = arg0.anInt7776;
		this.anIntArray315[1] = arg0.anInt7749;
		this.anIntArray316[0] = arg0.anInt7773;
		this.anIntArray316[1] = arg0.anInt7772;
		if (arg0.aShortArray96 != null) {
			this.aShortArray71 = new short[arg0.aShortArray96.length];
			Static691.method85(arg0.aShortArray96, 0, this.aShortArray71, 0, this.aShortArray71.length);
		}
		if (arg0.aShortArray98 != null) {
			this.aShortArray72 = new short[arg0.aShortArray98.length];
			Static691.method85(arg0.aShortArray98, 0, this.aShortArray72, 0, this.aShortArray72.length);
		}
	}
}

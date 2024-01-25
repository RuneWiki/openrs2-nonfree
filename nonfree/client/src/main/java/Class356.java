import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public final class Class356 {

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "[I")
	public final int[] anIntArray619 = new int[2];

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "[I")
	public final int[] anIntArray617 = new int[3];

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "[I")
	public final int[] anIntArray618 = new int[3];

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "[I")
	public final int[] anIntArray616 = new int[2];

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "[S")
	public short[] aShortArray175;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "[S")
	public short[] aShortArray176;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class356(@OriginalArg(0) Class146 arg0) {
		this.anIntArray618[1] = arg0.anInt3719;
		this.anIntArray618[2] = arg0.anInt3721;
		this.anIntArray618[0] = arg0.anInt3671;
		this.anIntArray617[0] = arg0.anInt3674;
		this.anIntArray617[2] = arg0.anInt3716;
		this.anIntArray617[1] = arg0.anInt3672;
		this.anIntArray616[0] = arg0.anInt3718;
		this.anIntArray616[1] = arg0.anInt3678;
		this.anIntArray619[0] = arg0.anInt3688;
		this.anIntArray619[1] = arg0.anInt3679;
		if (arg0.aShortArray69 != null) {
			this.aShortArray175 = new short[arg0.aShortArray69.length];
			Static689.method8060(arg0.aShortArray69, 0, this.aShortArray175, 0, this.aShortArray175.length);
		}
		if (arg0.aShortArray71 != null) {
			this.aShortArray176 = new short[arg0.aShortArray71.length];
			Static689.method8060(arg0.aShortArray71, 0, this.aShortArray176, 0, this.aShortArray176.length);
		}
	}
}

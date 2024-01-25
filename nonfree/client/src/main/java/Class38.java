import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class38 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "[I")
	public final int[] anIntArray83 = new int[2];

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
	public final int[] anIntArray81 = new int[3];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
	public final int[] anIntArray80 = new int[2];

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
	public final int[] anIntArray82 = new int[3];

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!fda;)V")
	public Class38(@OriginalArg(0) Class110 arg0) {
		this.anIntArray82[1] = arg0.anInt2810;
		this.anIntArray82[2] = arg0.anInt2743;
		this.anIntArray82[0] = arg0.anInt2751;
		this.anIntArray81[0] = arg0.anInt2745;
		this.anIntArray81[2] = arg0.anInt2804;
		this.anIntArray81[1] = arg0.anInt2780;
		this.anIntArray80[0] = arg0.anInt2785;
		this.anIntArray80[1] = arg0.anInt2757;
		this.anIntArray83[0] = arg0.anInt2794;
		this.anIntArray83[1] = arg0.anInt2796;
		if (arg0.aShortArray36 != null) {
			this.aShortArray13 = new short[arg0.aShortArray36.length];
			Static685.method6468(arg0.aShortArray36, 0, this.aShortArray13, 0, this.aShortArray13.length);
		}
		if (arg0.aShortArray37 != null) {
			this.aShortArray14 = new short[arg0.aShortArray37.length];
			Static685.method6468(arg0.aShortArray37, 0, this.aShortArray14, 0, this.aShortArray14.length);
		}
	}
}

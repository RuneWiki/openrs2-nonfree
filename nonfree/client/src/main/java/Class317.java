import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class317 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	public final int[] anIntArray582 = new int[3];

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
	public final int[] anIntArray583 = new int[3];

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
	public final int[] anIntArray585 = new int[2];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
	public final int[] anIntArray584 = new int[2];

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!lv;)V")
	public Class317(@OriginalArg(0) Class216 arg0) {
		this.anIntArray582[0] = arg0.anInt6092;
		this.anIntArray582[1] = arg0.anInt6104;
		this.anIntArray582[2] = arg0.anInt6063;
		this.anIntArray583[2] = arg0.anInt6093;
		this.anIntArray583[1] = arg0.anInt6047;
		this.anIntArray583[0] = arg0.anInt6076;
		this.anIntArray585[0] = arg0.anInt6073;
		this.anIntArray585[1] = arg0.anInt6057;
		this.anIntArray584[1] = arg0.anInt6094;
		this.anIntArray584[0] = arg0.anInt6097;
		if (arg0.aShortArray79 != null) {
			this.aShortArray129 = new short[arg0.aShortArray79.length];
			Static679.method1564(arg0.aShortArray79, 0, this.aShortArray129, 0, this.aShortArray129.length);
		}
		if (arg0.aShortArray77 != null) {
			this.aShortArray130 = new short[arg0.aShortArray77.length];
			Static679.method1564(arg0.aShortArray77, 0, this.aShortArray130, 0, this.aShortArray130.length);
		}
	}
}

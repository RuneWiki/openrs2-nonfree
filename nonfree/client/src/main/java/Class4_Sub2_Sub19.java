import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class4_Sub2_Sub19 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	public int anInt4635;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public int anInt4636;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	public int anInt4637;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	public int anInt4638;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	public int anInt4639;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
	public int anInt4641;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
	public int anInt4642;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
	public int anInt4643;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!kd;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!kd;Lclient!il;)V")
	public Class4_Sub2_Sub19(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class21_Sub1 arg1) {
		this.aClass88_1 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IIII)V")
	public void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt4638 = arg1;
		this.anInt4643 = arg2;
		this.anInt4637 = arg0;
	}
}

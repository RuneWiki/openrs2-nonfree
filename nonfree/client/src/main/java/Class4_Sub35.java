import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class4_Sub35 extends Class4 {

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	public int anInt6494 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public int anInt6495 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public int anInt6497 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	public int anInt6502 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	public int anInt6500 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public int anInt6496 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public int anInt6499 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	public int anInt6503 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!ub;")
	public final Class4_Sub48 aClass4_Sub48_1;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class4_Sub35(@OriginalArg(0) Class4_Sub48 arg0) {
		this.aClass4_Sub48_1 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IBI)Z")
	public boolean method5442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt6503 && arg0 <= this.anInt6495 && arg1 >= this.anInt6497 && arg1 <= this.anInt6494) {
			return true;
		} else {
			return arg0 >= this.anInt6502 && arg0 <= this.anInt6499 && arg1 >= this.anInt6496 && this.anInt6500 >= arg1;
		}
	}
}

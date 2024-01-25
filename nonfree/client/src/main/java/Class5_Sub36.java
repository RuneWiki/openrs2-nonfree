import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class5_Sub36 extends Class5 {

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	public int anInt6867 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
	public int anInt6871 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
	public int anInt6868 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	public int anInt6870 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
	public int anInt6869 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
	public int anInt6872 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	public int anInt6875 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
	public int anInt6874 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Lclient!gb;")
	public final Class5_Sub18 aClass5_Sub18_1;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!gb;)V")
	public Class5_Sub36(@OriginalArg(0) Class5_Sub18 arg0) {
		this.aClass5_Sub18_1 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z")
	public boolean method5597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt6872 && arg1 <= this.anInt6871 && arg0 >= this.anInt6869 && arg0 <= this.anInt6875) {
			return true;
		} else {
			return this.anInt6870 <= arg1 && arg1 <= this.anInt6867 && arg0 >= this.anInt6868 && arg0 <= this.anInt6874;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public int anInt4670 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public int anInt4671 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	public int anInt4669 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	public int anInt4676 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
	public int anInt4673 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
	public int anInt4677 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
	public int anInt4679 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	public int anInt4675 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!sb;")
	public Class2_Sub8_Sub21 aClass2_Sub8_Sub21_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class2_Sub24(@OriginalArg(0) Class2_Sub8_Sub21 arg0) {
		this.aClass2_Sub8_Sub21_1 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z")
	public boolean method3770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt4670 && this.anInt4679 >= arg0 && arg1 >= this.anInt4671 && this.anInt4676 >= arg1) {
			return true;
		} else {
			return this.anInt4675 <= arg0 && arg0 <= this.anInt4669 && this.anInt4673 <= arg1 && arg1 <= this.anInt4677;
		}
	}
}

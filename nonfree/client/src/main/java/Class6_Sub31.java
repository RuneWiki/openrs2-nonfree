import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public int anInt5878 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public int anInt5882 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt5877 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt5881 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public int anInt5888 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	public int anInt5886 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public int anInt5889 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public int anInt5885 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!od;")
	public final Class6_Sub24 aClass6_Sub24_1;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class6_Sub31(@OriginalArg(0) Class6_Sub24 arg0) {
		this.aClass6_Sub24_1 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
	public boolean method4950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt5888 && arg1 <= this.anInt5886 && arg0 >= this.anInt5881 && this.anInt5878 >= arg0) {
			return true;
		} else {
			return this.anInt5882 <= arg1 && this.anInt5889 >= arg1 && arg0 >= this.anInt5885 && arg0 <= this.anInt5877;
		}
	}
}

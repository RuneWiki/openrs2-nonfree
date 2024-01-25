import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public int anInt2085 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public int anInt2087 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public int anInt2084 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	public int anInt2089 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	public int anInt2088 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	public int anInt2094 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
	public int anInt2093 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	public int anInt2091 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "Lclient!wl;")
	public final Class3_Sub51 aClass3_Sub51_1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!wl;)V")
	public Class3_Sub14(@OriginalArg(0) Class3_Sub51 arg0) {
		this.aClass3_Sub51_1 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z")
	public boolean method1877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt2093 && arg1 <= this.anInt2089 && arg0 >= this.anInt2084 && this.anInt2087 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt2085 && this.anInt2088 >= arg1 && this.anInt2091 <= arg0 && arg0 <= this.anInt2094;
		}
	}
}

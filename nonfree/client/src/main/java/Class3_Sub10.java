import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!bia", name = "m", descriptor = "I")
	public int anInt1309 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bia", name = "q", descriptor = "I")
	public int anInt1310 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
	public int anInt1313 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bia", name = "r", descriptor = "I")
	public int anInt1315 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
	public int anInt1312 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bia", name = "o", descriptor = "I")
	public int anInt1314 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bia", name = "n", descriptor = "I")
	public int anInt1317 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bia", name = "l", descriptor = "I")
	public int anInt1318 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bia", name = "p", descriptor = "Lclient!pm;")
	public final Class3_Sub48 aClass3_Sub48_1;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!pm;)V")
	public Class3_Sub10(@OriginalArg(0) Class3_Sub48 arg0) {
		this.aClass3_Sub48_1 = arg0;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)Z")
	public boolean method1238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1313 <= arg0 && arg0 <= this.anInt1315 && arg1 >= this.anInt1317 && arg1 <= this.anInt1318) {
			return true;
		} else {
			return arg0 >= this.anInt1312 && this.anInt1310 >= arg0 && arg1 >= this.anInt1309 && arg1 <= this.anInt1314;
		}
	}
}

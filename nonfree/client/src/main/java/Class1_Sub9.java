import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
	public int anInt1356 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
	public int anInt1358 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	public int anInt1361 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	public int anInt1357 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
	public int anInt1362 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
	public int anInt1365 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
	public int anInt1364 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public int anInt1359 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Lclient!lt;")
	public final Class1_Sub32 aClass1_Sub32_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!lt;)V")
	public Class1_Sub9(@OriginalArg(0) Class1_Sub32 arg0) {
		this.aClass1_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)Z")
	public boolean method1204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1358 <= arg1 && this.anInt1364 >= arg1 && this.anInt1362 <= arg0 && arg0 <= this.anInt1359) {
			return true;
		} else {
			return arg1 >= this.anInt1365 && this.anInt1357 >= arg1 && arg0 >= this.anInt1356 && this.anInt1361 >= arg0;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public int anInt1400 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public int anInt1403 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public int anInt1401 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
	public int anInt1405 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public int anInt1406 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public int anInt1407 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public int anInt1404 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public int anInt1408 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!wt;")
	public final Class1_Sub51 aClass1_Sub51_1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!wt;)V")
	public Class1_Sub6(@OriginalArg(0) Class1_Sub51 arg0) {
		this.aClass1_Sub51_1 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)Z")
	public boolean method1462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt1405 && arg0 <= this.anInt1400 && arg1 >= this.anInt1406 && this.anInt1403 >= arg1) {
			return true;
		} else {
			return this.anInt1407 <= arg0 && arg0 <= this.anInt1408 && arg1 >= this.anInt1404 && this.anInt1401 >= arg1;
		}
	}
}

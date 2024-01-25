import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public int anInt1448 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
	public int anInt1444 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
	public int anInt1449 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	public int anInt1442 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	public int anInt1445 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
	public int anInt1451 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt1447 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
	public int anInt1446 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "Lclient!lk;")
	public final Class1_Sub24 aClass1_Sub24_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class1_Sub10(@OriginalArg(0) Class1_Sub24 arg0) {
		this.aClass1_Sub24_1 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZ)Z")
	public boolean method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt1445 && this.anInt1446 >= arg1 && arg0 >= this.anInt1449 && arg0 <= this.anInt1448) {
			return true;
		} else {
			return arg1 >= this.anInt1442 && this.anInt1447 >= arg1 && this.anInt1444 <= arg0 && this.anInt1451 >= arg0;
		}
	}
}

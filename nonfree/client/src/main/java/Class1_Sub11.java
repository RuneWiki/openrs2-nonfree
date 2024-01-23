import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	public int anInt1105 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	public int anInt1110 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
	public int anInt1108 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public int anInt1107 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	public int anInt1109 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
	public int anInt1106 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	public int anInt1116 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	public int anInt1118 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!gi;")
	public Class1_Sub1_Sub10 aClass1_Sub1_Sub10_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class1_Sub11(@OriginalArg(0) Class1_Sub1_Sub10 arg0) {
		this.aClass1_Sub1_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public boolean method977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1110 <= arg0 && this.anInt1107 >= arg0 && arg1 >= this.anInt1105 && this.anInt1108 >= arg1) {
			return true;
		} else {
			return this.anInt1109 <= arg0 && this.anInt1116 >= arg0 && this.anInt1106 <= arg1 && this.anInt1118 >= arg1;
		}
	}
}

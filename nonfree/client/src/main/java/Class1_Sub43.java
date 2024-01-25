import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public int anInt7893 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public int anInt7891 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public int anInt7894 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public int anInt7892 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	public int anInt7890 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
	public int anInt7896 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public int anInt7898 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
	public int anInt7900 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!raa;")
	public final Class1_Sub39 aClass1_Sub39_1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!raa;)V")
	public Class1_Sub43(@OriginalArg(0) Class1_Sub39 arg0) {
		this.aClass1_Sub39_1 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
	public boolean method6564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7891 <= arg1 && arg1 <= this.anInt7894 && arg0 >= this.anInt7896 && arg0 <= this.anInt7893) {
			return true;
		} else {
			return arg1 >= this.anInt7890 && this.anInt7900 >= arg1 && arg0 >= this.anInt7898 && arg0 <= this.anInt7892;
		}
	}
}

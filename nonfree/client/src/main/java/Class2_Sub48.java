import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public int anInt9245 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public int anInt9247 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public int anInt9243 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public int anInt9249 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public int anInt9241 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public int anInt9248 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public int anInt9246 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public int anInt9251 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!ob;")
	public final Class2_Sub35 aClass2_Sub35_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class2_Sub48(@OriginalArg(0) Class2_Sub35 arg0) {
		this.aClass2_Sub35_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z")
	public boolean method7656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9245 <= arg1 && arg1 <= this.anInt9246 && this.anInt9251 <= arg0 && arg0 <= this.anInt9241) {
			return true;
		} else {
			return this.anInt9248 <= arg1 && this.anInt9243 >= arg1 && this.anInt9249 <= arg0 && arg0 <= this.anInt9247;
		}
	}
}

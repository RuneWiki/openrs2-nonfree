import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public int anInt7114 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	public int anInt7112 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public int anInt7113 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	public int anInt7119 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public int anInt7116 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	public int anInt7118 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	public int anInt7115 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	public int anInt7117 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "Lclient!ps;")
	public final Class4_Sub32 aClass4_Sub32_1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!ps;)V")
	public Class4_Sub42(@OriginalArg(0) Class4_Sub32 arg0) {
		this.aClass4_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)Z")
	public boolean method5490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7114 <= arg1 && arg1 <= this.anInt7112 && arg0 >= this.anInt7116 && this.anInt7115 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt7118 && this.anInt7117 >= arg1 && this.anInt7113 <= arg0 && arg0 <= this.anInt7119;
		}
	}
}

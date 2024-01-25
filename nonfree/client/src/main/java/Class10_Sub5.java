import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
	public int anInt563 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	public int anInt565 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	public int anInt562 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	public int anInt567 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	public int anInt566 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public int anInt561 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
	public int anInt569 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	public int anInt570 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Lclient!wk;")
	public final Class10_Sub46 aClass10_Sub46_1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class10_Sub5(@OriginalArg(0) Class10_Sub46 arg0) {
		this.aClass10_Sub46_1 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z")
	public boolean method474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt563 <= arg1 && arg1 <= this.anInt570 && this.anInt562 <= arg0 && this.anInt566 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt569 && this.anInt567 >= arg1 && arg0 >= this.anInt561 && this.anInt565 >= arg0;
		}
	}
}

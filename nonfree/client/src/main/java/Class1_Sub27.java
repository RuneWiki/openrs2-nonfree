import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public int anInt4705 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public int anInt4710 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
	public int anInt4709 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	public int anInt4713 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
	public int anInt4714 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
	public int anInt4708 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public int anInt4711 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public int anInt4715 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "Lclient!ng;")
	public Class1_Sub2_Sub12 aClass1_Sub2_Sub12_1;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ng;)V")
	public Class1_Sub27(@OriginalArg(0) Class1_Sub2_Sub12 arg0) {
		this.aClass1_Sub2_Sub12_1 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public boolean method4089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4714 <= arg0 && arg0 <= this.anInt4710 && this.anInt4709 <= arg1 && arg1 <= this.anInt4715) {
			return true;
		} else {
			return arg0 >= this.anInt4708 && this.anInt4705 >= arg0 && arg1 >= this.anInt4713 && this.anInt4711 >= arg1;
		}
	}
}

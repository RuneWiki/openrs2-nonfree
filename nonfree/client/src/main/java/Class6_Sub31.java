import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public int anInt5680 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public int anInt5681 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
	public int anInt5684 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	public int anInt5683 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
	public int anInt5685 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
	public int anInt5688 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
	public int anInt5690 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
	public int anInt5691 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "Lclient!qs;")
	public final Class6_Sub32 aClass6_Sub32_1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!qs;)V")
	public Class6_Sub31(@OriginalArg(0) Class6_Sub32 arg0) {
		this.aClass6_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)Z")
	public boolean method4766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5688 <= arg1 && this.anInt5691 >= arg1 && this.anInt5681 <= arg0 && this.anInt5690 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt5680 && arg1 <= this.anInt5684 && arg0 >= this.anInt5683 && arg0 <= this.anInt5685;
		}
	}
}

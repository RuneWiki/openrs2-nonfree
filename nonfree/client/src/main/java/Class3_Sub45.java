import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public int anInt8641 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public int anInt8642 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public int anInt8643 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	public int anInt8640 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public int anInt8638 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public int anInt8645 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	public int anInt8646 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public int anInt8647 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!bs;")
	public final Class3_Sub12 aClass3_Sub12_1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!bs;)V")
	public Class3_Sub45(@OriginalArg(0) Class3_Sub12 arg0) {
		this.aClass3_Sub12_1 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public boolean method7250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt8647 && arg0 <= this.anInt8643 && this.anInt8642 <= arg1 && arg1 <= this.anInt8640) {
			return true;
		} else {
			return this.anInt8645 <= arg0 && this.anInt8638 >= arg0 && arg1 >= this.anInt8641 && arg1 <= this.anInt8646;
		}
	}
}

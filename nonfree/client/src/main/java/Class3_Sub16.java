import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	public int anInt2489 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public int anInt2492 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	public int anInt2490 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public int anInt2488 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	public int anInt2494 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public int anInt2493 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
	public int anInt2496 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public int anInt2497 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "Lclient!jq;")
	public final Class3_Sub26 aClass3_Sub26_1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!jq;)V")
	public Class3_Sub16(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aClass3_Sub26_1 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Z")
	public boolean method1911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt2496 && arg1 <= this.anInt2492 && arg0 >= this.anInt2493 && this.anInt2489 >= arg0) {
			return true;
		} else {
			return this.anInt2494 <= arg1 && arg1 <= this.anInt2490 && this.anInt2497 <= arg0 && arg0 <= this.anInt2488;
		}
	}
}

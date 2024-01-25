import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	public int anInt9381 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public int anInt9387 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public int anInt9380 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public int anInt9383 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
	public int anInt9390 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
	public int anInt9392 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
	public int anInt9391 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
	public int anInt9389 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!qj;")
	public final Class3_Sub41 aClass3_Sub41_1;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class3_Sub50(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass3_Sub41_1 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
	public boolean method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9391 <= arg0 && arg0 <= this.anInt9390 && arg1 >= this.anInt9381 && this.anInt9392 >= arg1) {
			return true;
		} else {
			return this.anInt9383 <= arg0 && arg0 <= this.anInt9387 && arg1 >= this.anInt9380 && this.anInt9389 >= arg1;
		}
	}
}

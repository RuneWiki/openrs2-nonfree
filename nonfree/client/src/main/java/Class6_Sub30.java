import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
	public int anInt5416 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	public int anInt5415 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
	public int anInt5419 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	public int anInt5412 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
	public int anInt5417 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
	public int anInt5420 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	public int anInt5422 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public int anInt5421 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!fca;")
	public final Class6_Sub17 aClass6_Sub17_1;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class6_Sub30(@OriginalArg(0) Class6_Sub17 arg0) {
		this.aClass6_Sub17_1 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZII)Z")
	public boolean method4679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5421 <= arg0 && this.anInt5419 >= arg0 && this.anInt5412 <= arg1 && this.anInt5417 >= arg1) {
			return true;
		} else {
			return this.anInt5422 <= arg0 && this.anInt5415 >= arg0 && arg1 >= this.anInt5420 && this.anInt5416 >= arg1;
		}
	}
}

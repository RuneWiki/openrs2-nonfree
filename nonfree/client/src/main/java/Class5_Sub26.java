import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
	public int anInt4757 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
	public int anInt4758 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
	public int anInt4754 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
	public int anInt4755 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
	public int anInt4761 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
	public int anInt4762 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
	public int anInt4764 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jda", name = "x", descriptor = "I")
	public int anInt4760 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "Lclient!co;")
	public final Class5_Sub8 aClass5_Sub8_1;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!co;)V")
	public Class5_Sub26(@OriginalArg(0) Class5_Sub8 arg0) {
		this.aClass5_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z")
	public boolean method4040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4760 <= arg1 && arg1 <= this.anInt4761 && this.anInt4755 <= arg0 && arg0 <= this.anInt4754) {
			return true;
		} else {
			return this.anInt4758 <= arg1 && arg1 <= this.anInt4757 && arg0 >= this.anInt4764 && arg0 <= this.anInt4762;
		}
	}
}

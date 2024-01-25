import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public final class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
	public int anInt4721 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
	public int anInt4722 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kia", name = "p", descriptor = "I")
	public int anInt4727 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
	public int anInt4725 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
	public int anInt4723 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
	public int anInt4728 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
	public int anInt4729 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kia", name = "t", descriptor = "I")
	public int anInt4730 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "Lclient!pda;")
	public final Class5_Sub39 aClass5_Sub39_1;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!pda;)V")
	public Class5_Sub26(@OriginalArg(0) Class5_Sub39 arg0) {
		this.aClass5_Sub39_1 = arg0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
	public boolean method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4721 <= arg0 && arg0 <= this.anInt4725 && arg1 >= this.anInt4722 && this.anInt4727 >= arg1) {
			return true;
		} else {
			return this.anInt4729 <= arg0 && this.anInt4728 >= arg0 && arg1 >= this.anInt4723 && this.anInt4730 >= arg1;
		}
	}
}

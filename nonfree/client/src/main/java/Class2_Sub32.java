import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public int anInt5514 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public int anInt5516 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public int anInt5519 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public int anInt5518 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public int anInt5523 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public int anInt5520 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "I")
	public int anInt5522 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "I")
	public int anInt5524 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!ho;")
	public final Class2_Sub16 aClass2_Sub16_1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ho;)V")
	public Class2_Sub32(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aClass2_Sub16_1 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Z")
	public boolean method4378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5520 <= arg1 && this.anInt5519 >= arg1 && arg0 >= this.anInt5523 && arg0 <= this.anInt5514) {
			return true;
		} else {
			return this.anInt5524 <= arg1 && this.anInt5522 >= arg1 && this.anInt5516 <= arg0 && this.anInt5518 >= arg0;
		}
	}
}

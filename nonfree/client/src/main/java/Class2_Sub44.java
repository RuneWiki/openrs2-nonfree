import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public int anInt6548 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	public int anInt6546 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	public int anInt6550 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	public int anInt6549 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
	public int anInt6551 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
	public int anInt6558 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
	public int anInt6556 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public int anInt6553 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Lclient!id;")
	public final Class2_Sub23 aClass2_Sub23_1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class2_Sub44(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass2_Sub23_1 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z")
	public boolean method5620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt6556 && this.anInt6548 >= arg0 && arg1 >= this.anInt6553 && this.anInt6551 >= arg1) {
			return true;
		} else {
			return this.anInt6546 <= arg0 && this.anInt6550 >= arg0 && arg1 >= this.anInt6558 && arg1 <= this.anInt6549;
		}
	}
}

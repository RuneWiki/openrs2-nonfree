import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public int anInt1127 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	public int anInt1129 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
	public int anInt1132 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
	public int anInt1130 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
	public int anInt1131 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	public int anInt1128 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
	public int anInt1133 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
	public int anInt1134 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "Lclient!iba;")
	public final Class5_Sub26 aClass5_Sub26_1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!iba;)V")
	public Class5_Sub8(@OriginalArg(0) Class5_Sub26 arg0) {
		this.aClass5_Sub26_1 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
	public boolean method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt1132 && this.anInt1128 >= arg1 && arg0 >= this.anInt1134 && arg0 <= this.anInt1130) {
			return true;
		} else {
			return arg1 >= this.anInt1131 && this.anInt1133 >= arg1 && arg0 >= this.anInt1127 && arg0 <= this.anInt1129;
		}
	}
}

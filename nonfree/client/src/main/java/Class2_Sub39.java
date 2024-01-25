import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public int anInt6184 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public int anInt6185 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	public int anInt6190 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public int anInt6186 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public int anInt6188 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	public int anInt6189 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public int anInt6187 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	public int anInt6192 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!ji;")
	public final Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class2_Sub39(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass2_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z")
	public boolean method5346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6189 <= arg0 && arg0 <= this.anInt6187 && arg1 >= this.anInt6190 && arg1 <= this.anInt6188) {
			return true;
		} else {
			return arg0 >= this.anInt6184 && this.anInt6185 >= arg0 && arg1 >= this.anInt6186 && this.anInt6192 >= arg1;
		}
	}
}

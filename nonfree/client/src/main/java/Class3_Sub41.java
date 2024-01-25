import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public int anInt6763 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
	public int anInt6762 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
	public int anInt6770 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
	public int anInt6768 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
	public int anInt6771 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
	public int anInt6773 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
	public int anInt6775 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
	public int anInt6774 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "Lclient!cc;")
	public final Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class3_Sub41(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass3_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZ)Z")
	public boolean method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt6768 && this.anInt6762 >= arg1 && this.anInt6763 <= arg0 && this.anInt6770 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt6774 && arg1 <= this.anInt6773 && this.anInt6771 <= arg0 && this.anInt6775 >= arg0;
		}
	}
}

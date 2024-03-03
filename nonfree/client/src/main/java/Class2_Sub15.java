import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "[S")
	public static final short[] aShortArray45 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!h;")
	public static final Class89 aClass89_94 = new Class89(51, -1);

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
	public int anInt2332 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	public int anInt2335 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public int anInt2331 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	public int anInt2338 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
	public int anInt2340 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
	public int anInt2339 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	public int anInt2333 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
	public int anInt2337 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "Lclient!jg;")
	public final Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!jg;)V", line = 75)
	public Class2_Sub15(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass2_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z", line = 16)
	public boolean method2359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt2335 && arg0 <= this.anInt2337 && this.anInt2338 <= arg1 && arg1 <= this.anInt2333) {
			return true;
		} else {
			return this.anInt2332 <= arg0 && arg0 <= this.anInt2339 && this.anInt2331 <= arg1 && arg1 <= this.anInt2340;
		}
	}
}

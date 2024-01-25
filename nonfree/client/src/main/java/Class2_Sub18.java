import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	public int anInt2081 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	public int anInt2088 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	public int anInt2086 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public int anInt2090 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt2091 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	public int anInt2083 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
	public int anInt2092 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	public int anInt2093 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!ti;")
	public final Class2_Sub40 aClass2_Sub40_1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class2_Sub18(@OriginalArg(0) Class2_Sub40 arg0) {
		this.aClass2_Sub40_1 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	public boolean method1717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt2083 && arg0 <= this.anInt2092 && arg1 >= this.anInt2086 && arg1 <= this.anInt2093) {
			return true;
		} else {
			return this.anInt2091 <= arg0 && this.anInt2081 >= arg0 && arg1 >= this.anInt2090 && this.anInt2088 >= arg1;
		}
	}
}

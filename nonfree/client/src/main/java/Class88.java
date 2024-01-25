import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class88 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!c;")
	public Class35 aClass35_1;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!fs;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	public final int anInt2132;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public final int anInt2136;

	static {
		new Class43("", 73);
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2132 = arg1;
		this.anInt2136 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!fs;I)V")
	public Class88(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass88_1 = arg0;
		this.anInt2136 = this.aClass88_1.anInt2136;
		this.aClass35_1 = this.aClass88_1.aClass35_1;
		this.anInt2132 = this.aClass88_1.anInt2132 + arg1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Lclient!rh;")
	public Class218 method1696() {
		return Static326.method4300(this.anInt2136);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lclient!fs;")
	public Class88 method1699(@OriginalArg(0) int arg0) {
		return new Class88(this.anInt2136, arg0);
	}
}

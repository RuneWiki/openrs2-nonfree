import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class88 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!gp;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!bd;")
	public Class21 aClass21_5;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	public int anInt2642;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	public int anInt2643;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	public final int anInt2638;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public final int anInt2639;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2638 = arg0;
		this.anInt2639 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!gp;I)V")
	public Class88(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass88_1 = arg0;
		this.anInt2639 = arg1 + this.aClass88_1.anInt2639;
		this.aClass21_5 = this.aClass88_1.aClass21_5;
		this.anInt2638 = this.aClass88_1.anInt2638;
	}
}

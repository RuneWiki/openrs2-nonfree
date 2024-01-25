import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class105 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Lclient!eh;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!lu;")
	public Class2_Sub13_Sub2 aClass2_Sub13_Sub2_1;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!qv;")
	public Class2_Sub39 aClass2_Sub39_1;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "Lclient!aaa;")
	public Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public final int anInt2685;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
	public final int anInt2690;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "Lclient!ig;")
	public final Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public final int anInt2687;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
	public final int anInt2692;

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	public final int anInt2686;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(BIIIIIILclient!ig;)V")
	public Class105(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class13_Sub1 arg7) {
		this.anInt2685 = arg4;
		this.anInt2690 = arg2;
		this.aClass13_Sub1_1 = arg7;
		this.anInt2687 = arg6;
		this.anInt2692 = arg5;
		this.anInt2688 = arg3;
		this.anInt2686 = arg1;
		this.aByte34 = arg0;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Z")
	public boolean method2242() {
		return this.aByte34 == 2 || this.aByte34 == 3;
	}
}

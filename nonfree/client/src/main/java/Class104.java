import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class104 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!wj;")
	public Class1_Sub50 aClass1_Sub50_1;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!mm;")
	public Class1_Sub17_Sub1 aClass1_Sub17_Sub1_1;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!re;")
	public Class1_Sub7_Sub4 aClass1_Sub7_Sub4_1;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "Lclient!ek;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
	public final int anInt2636;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public final int anInt2638;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public final int anInt2642;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
	public final int anInt2644;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(BIIIII)V")
	public Class104(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2640 = arg3;
		this.anInt2636 = arg2;
		this.aByte59 = arg0;
		this.anInt2638 = arg5;
		this.anInt2642 = arg1;
		this.anInt2644 = arg4;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
	public boolean method2091() {
		return this.aByte59 == 2 || this.aByte59 == 3;
	}
}

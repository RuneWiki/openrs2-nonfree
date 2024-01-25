import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class97 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public int anInt2657;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt2656 = 128;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public int anInt2659 = 128;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2660 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIII)V")
	private Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2658 = arg4;
		this.anInt2656 = arg2;
		this.anInt2659 = arg1;
		this.anInt2661 = arg5;
		this.anInt2660 = arg0;
		this.anInt2657 = arg3;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lclient!gr;")
	public Class97 method1999() {
		return new Class97(this.anInt2660, this.anInt2659, this.anInt2656, this.anInt2657, this.anInt2658, this.anInt2661);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!gr;)V")
	public void method2002(@OriginalArg(1) Class97 arg0) {
		this.anInt2659 = arg0.anInt2659;
		this.anInt2658 = arg0.anInt2658;
		this.anInt2660 = arg0.anInt2660;
		this.anInt2656 = arg0.anInt2656;
		this.anInt2661 = arg0.anInt2661;
		this.anInt2657 = arg0.anInt2657;
	}
}

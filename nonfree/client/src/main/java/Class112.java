import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class112 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public int anInt2682;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public int anInt2686;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	private int anInt2687;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public int anInt2689;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "J")
	public long aLong71;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public int anInt2691;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
	public int anInt2696;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public int anInt2681 = 0;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public int anInt2688 = 0;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method2293(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5720();
			if (local5 == 0) {
				return;
			}
			this.method2296(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public void method2295() {
		this.anInt2680 = Class1_Sub5_Sub15.anIntArray333[this.anInt2687 << 3];
		this.anInt2691 = (int) Math.sqrt((double) (this.anInt2696 * this.anInt2696 + this.anInt2683 * this.anInt2683 + this.anInt2686 * this.anInt2686));
		if (this.anInt2690 == 0) {
			this.anInt2690 = 1;
		}
		if (this.anInt2679 == 0) {
			this.aLong71 = 2147483647L;
		} else if (this.anInt2679 == 1) {
			this.aLong71 = this.anInt2691 * 8 / this.anInt2690;
			this.aLong71 *= this.aLong71;
		} else if (this.anInt2679 == 2) {
			this.aLong71 = this.anInt2691 * 8 / this.anInt2690;
		}
		if (this.aBoolean213) {
			this.anInt2691 *= -1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!nj;IB)V")
	private void method2296(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2687 = arg0.method5715();
		} else if (arg1 == 2) {
			arg0.method5720();
		} else if (arg1 == 3) {
			this.anInt2696 = arg0.method5716();
			this.anInt2683 = arg0.method5716();
			this.anInt2686 = arg0.method5716();
		} else if (arg1 == 4) {
			this.anInt2679 = arg0.method5720();
			this.anInt2690 = arg0.method5716();
		} else if (arg1 == 6) {
			this.anInt2682 = arg0.method5720();
		} else if (arg1 == 8) {
			this.anInt2688 = 1;
			return;
		} else if (arg1 == 9) {
			this.anInt2681 = 1;
			return;
		} else if (arg1 == 10) {
			this.aBoolean213 = true;
			return;
		}
	}
}

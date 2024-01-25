import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class102 {

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "J")
	public long aLong88;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public int anInt2782;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public int anInt2784;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public int anInt2785;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	public int anInt2787;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2788;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	public int anInt2790;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	public int anInt2791;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	public int anInt2792;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	public int anInt2796;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	public int anInt2783 = 0;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public int anInt2794 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
	private boolean aBoolean167 = false;

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray1[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!hp;I)V")
	private void method2399(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2788 = arg1.method5362();
		} else if (arg0 == 2) {
			arg1.method5366();
		} else if (arg0 == 3) {
			this.anInt2790 = arg1.method5407();
			this.anInt2785 = arg1.method5407();
			this.anInt2792 = arg1.method5407();
		} else if (arg0 == 4) {
			this.anInt2795 = arg1.method5366();
			this.anInt2782 = arg1.method5407();
		} else if (arg0 == 6) {
			this.anInt2791 = arg1.method5366();
		} else if (arg0 == 8) {
			this.anInt2783 = 1;
		} else if (arg0 == 9) {
			this.anInt2794 = 1;
		} else if (arg0 == 10) {
			this.aBoolean167 = true;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!hp;)V")
	public void method2400(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5366();
			if (local15 == 0) {
				return;
			}
			this.method2399(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public void method2401() {
		this.anInt2787 = Class183.anIntArray434[this.anInt2788 << 3];
		this.anInt2784 = (int) Math.sqrt((double) (this.anInt2790 * this.anInt2790 + this.anInt2785 * this.anInt2785 + this.anInt2792 * this.anInt2792));
		if (this.anInt2782 == 0) {
			this.anInt2782 = 1;
		}
		if (this.anInt2795 == 0) {
			this.aLong88 = 2147483647L;
		} else if (this.anInt2795 == 1) {
			this.aLong88 = this.anInt2784 * 8 / this.anInt2782;
			this.aLong88 *= this.aLong88;
		} else if (this.anInt2795 == 2) {
			this.aLong88 = this.anInt2784 * 8 / this.anInt2782;
		}
		if (this.aBoolean167) {
			this.anInt2784 *= -1;
		}
	}
}

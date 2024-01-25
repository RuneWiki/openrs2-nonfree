import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class198 {

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	public int anInt4864;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	private int anInt4867;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public int anInt4868;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	public int anInt4871;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public int anInt4873;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
	public int anInt4876;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "J")
	public long aLong120;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public int anInt4877;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public int anInt4878;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	public int anInt4879;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	public int anInt4874 = 0;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public int anInt4870 = 0;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
	private boolean aBoolean373 = false;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray2[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILclient!gk;)V")
	private void method4077(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4867 = arg1.method4518();
		} else if (arg0 == 2) {
			arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt4876 = arg1.method4509();
			this.anInt4879 = arg1.method4509();
			this.anInt4868 = arg1.method4509();
		} else if (arg0 == 4) {
			this.anInt4864 = arg1.method4464();
			this.anInt4871 = arg1.method4509();
		} else if (arg0 == 6) {
			this.anInt4877 = arg1.method4464();
		} else if (arg0 == 8) {
			this.anInt4874 = 1;
		} else if (arg0 == 9) {
			this.anInt4870 = 1;
		} else if (arg0 == 10) {
			this.aBoolean373 = true;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
	public void method4078() {
		this.anInt4878 = Class285.anIntArray475[this.anInt4867 << 3];
		@Pc(17) long local17 = (long) this.anInt4876;
		@Pc(21) long local21 = (long) this.anInt4879;
		@Pc(25) long local25 = (long) this.anInt4868;
		this.anInt4873 = (int) Math.sqrt((double) (local17 * local17 + local21 * local21 + local25 * local25));
		if (this.anInt4871 == 0) {
			this.anInt4871 = 1;
		}
		if (this.anInt4864 == 0) {
			this.aLong120 = 2147483647L;
		} else if (this.anInt4864 == 1) {
			this.aLong120 = this.anInt4873 * 8 / this.anInt4871;
			this.aLong120 *= this.aLong120;
		} else if (this.anInt4864 == 2) {
			this.aLong120 = this.anInt4873 * 8 / this.anInt4871;
		}
		if (this.aBoolean373) {
			this.anInt4873 *= -1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BLclient!gk;)V")
	public void method4079(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4464();
			if (local12 == 0) {
				return;
			}
			this.method4077(local12, arg0);
		}
	}
}

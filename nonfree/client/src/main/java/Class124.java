import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class124 {

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public int anInt4575 = -1;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public int anInt4572 = -1;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt4573 = -1;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public int anInt4574 = -1;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public int anInt4578 = -1;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public int anInt4586 = 0;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	public int anInt4581 = 0;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
	public int anInt4591 = -1;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public int anInt4592 = -1;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public int anInt4571 = -1;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
	public int anInt4597 = -1;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
	public int anInt4595 = 0;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt4580 = -1;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	public int anInt4584 = -1;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public int anInt4569 = -1;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
	public int anInt4600 = -1;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	public int anInt4589 = 0;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
	public int anInt4602 = -1;

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
	public int anInt4604 = -1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt4576 = -1;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public int anInt4577 = 0;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
	public int anInt4594 = -1;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public int anInt4579 = 0;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
	public int anInt4593 = -1;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
	public int anInt4607 = 0;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public int anInt4583 = -1;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
	public int anInt4606 = -1;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
	public int anInt4603 = 0;

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
	public int anInt4609 = 0;

	@OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
	public int anInt4610 = -1;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
	public int anInt4598 = 0;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
	public int anInt4608 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method3657() {
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!im;I)V")
	public void method3658(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2655();
			if (local9 == 0) {
				return;
			}
			this.method3660(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!im;II)V")
	private void method3660(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4578 = arg0.method2652();
			this.anInt4569 = arg0.method2652();
			if (this.anInt4578 == 65535) {
				this.anInt4578 = -1;
			}
			if (this.anInt4569 == 65535) {
				this.anInt4569 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4602 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt4580 = arg0.method2652();
		} else if (arg1 == 4) {
			this.anInt4573 = arg0.method2652();
		} else if (arg1 == 5) {
			this.anInt4584 = arg0.method2652();
		} else if (arg1 == 6) {
			this.anInt4571 = arg0.method2652();
		} else if (arg1 == 7) {
			this.anInt4575 = arg0.method2652();
		} else if (arg1 == 8) {
			this.anInt4600 = arg0.method2652();
		} else if (arg1 == 9) {
			this.anInt4597 = arg0.method2652();
		} else if (arg1 == 26) {
			this.anInt4603 = (short) (arg0.method2655() * 4);
			this.anInt4579 = (short) (arg0.method2655() * 4);
		} else if (arg1 == 27) {
			if (this.anIntArrayArray36 == null) {
				this.anIntArrayArray36 = new int[12][];
			}
			@Pc(393) int local393 = arg0.method2655();
			this.anIntArrayArray36[local393] = new int[6];
			for (@Pc(401) int local401 = 0; local401 < 6; local401++) {
				this.anIntArrayArray36[local393][local401] = arg0.method2645();
			}
		} else if (arg1 == 29) {
			this.anInt4589 = arg0.method2655();
		} else if (arg1 == 30) {
			this.anInt4598 = arg0.method2652();
		} else if (arg1 == 31) {
			this.anInt4577 = arg0.method2655();
		} else if (arg1 == 32) {
			this.anInt4586 = arg0.method2652();
		} else if (arg1 == 33) {
			this.anInt4607 = arg0.method2645();
		} else if (arg1 == 34) {
			this.anInt4609 = arg0.method2655();
		} else if (arg1 == 35) {
			this.anInt4581 = arg0.method2652();
		} else if (arg1 == 36) {
			this.anInt4595 = arg0.method2645();
		} else if (arg1 == 37) {
			this.anInt4594 = arg0.method2655();
		} else if (arg1 == 38) {
			this.anInt4576 = arg0.method2652();
		} else if (arg1 == 39) {
			this.anInt4610 = arg0.method2652();
		} else if (arg1 == 40) {
			this.anInt4572 = arg0.method2652();
		} else if (arg1 == 41) {
			this.anInt4574 = arg0.method2652();
		} else if (arg1 == 42) {
			this.anInt4608 = arg0.method2652();
		} else if (arg1 == 43) {
			arg0.method2652();
		} else if (arg1 == 44) {
			arg0.method2652();
		} else if (arg1 == 45) {
			arg0.method2652();
		} else if (arg1 == 46) {
			this.anInt4591 = arg0.method2652();
		} else if (arg1 == 47) {
			this.anInt4604 = arg0.method2652();
		} else if (arg1 == 48) {
			this.anInt4593 = arg0.method2652();
		} else if (arg1 == 49) {
			this.anInt4606 = arg0.method2652();
		} else if (arg1 == 50) {
			this.anInt4583 = arg0.method2652();
		} else if (arg1 == 51) {
			this.anInt4592 = arg0.method2652();
		}
	}
}

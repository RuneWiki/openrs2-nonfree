import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VVKZWHMC")
public final class Class1_Sub2_Sub2_Sub5 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!VVKZWHMC", name = "s", descriptor = "I")
	private int anInt677;

	@OriginalMember(owner = "client!VVKZWHMC", name = "t", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!VVKZWHMC", name = "z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!VVKZWHMC", name = "B", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!VVKZWHMC", name = "C", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!VVKZWHMC", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!VVKZWHMC", name = "E", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!VVKZWHMC", name = "F", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!VVKZWHMC", name = "G", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!VVKZWHMC", name = "H", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!VVKZWHMC", name = "I", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!VVKZWHMC", name = "J", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!VVKZWHMC", name = "w", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!VVKZWHMC", name = "x", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!VVKZWHMC", name = "A", descriptor = "B")
	private byte aByte33 = -8;

	@OriginalMember(owner = "client!VVKZWHMC", name = "y", descriptor = "Lclient!OPHZBIVR;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!VVKZWHMC", name = "o", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!VVKZWHMC", name = "k", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!VVKZWHMC", name = "l", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!VVKZWHMC", name = "m", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!VVKZWHMC", name = "u", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!VVKZWHMC", name = "v", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!VVKZWHMC", name = "p", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!VVKZWHMC", name = "q", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!VVKZWHMC", name = "r", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!VVKZWHMC", name = "n", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!VVKZWHMC", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub2_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg11];
			this.anInt673 = arg0;
			this.anInt669 = arg3;
			this.anInt670 = arg7;
			this.anInt671 = arg2;
			this.anInt679 = arg8;
			this.anInt680 = arg1;
			this.anInt674 = arg5;
			this.anInt675 = arg4;
			this.anInt676 = arg10;
			this.anInt672 = arg6;
			this.aBoolean154 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("93463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(IIIII)V")
	public void method482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean154) {
				local8 = arg1 - this.anInt669;
				@Pc(14) double local14 = (double) (arg0 - this.anInt670);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt669 + local8 * (double) this.anInt675 / local23;
				this.aDouble7 = (double) this.anInt670 + local14 * (double) this.anInt675 / local23;
				this.aDouble8 = this.anInt671;
			}
			local8 = this.anInt680 + 1 - arg2;
			this.aDouble2 = ((double) arg1 - this.aDouble6) / local8;
			this.aDouble3 = ((double) arg0 - this.aDouble7) / local8;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean154) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt674 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg3 - this.aDouble8 - this.aDouble5 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("77212, " + -20299 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(II)V")
	public void method483(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean154 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt681 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt682 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			if (this.aClass33_2.aClass36_1 != null) {
				this.anInt678 += arg0;
				while (this.anInt678 > this.aClass33_2.aClass36_1.method371(this.anInt677)) {
					this.anInt678 -= this.aClass33_2.aClass36_1.method371(this.anInt677) + 1;
					this.anInt677++;
					if (this.anInt677 >= this.aClass33_2.aClass36_1.anInt532) {
						this.anInt677 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("14041, " + -590 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VVKZWHMC", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			@Pc(12) Class1_Sub2_Sub2_Sub3 local12 = this.aClass33_2.method355();
			if (local12 == null) {
				return null;
			}
			@Pc(18) int local18 = -1;
			if (this.aClass33_2.aClass36_1 != null) {
				local18 = this.aClass33_2.aClass36_1.anIntArray131[this.anInt677];
			}
			@Pc(41) Class1_Sub2_Sub2_Sub3 local41 = new Class1_Sub2_Sub2_Sub3(local12, false, 0, Class11.method123(local18), true);
			if (local18 != -1) {
				local41.method203();
				local41.method204(local18);
				local41.anIntArrayArray11 = null;
				local41.anIntArrayArray10 = null;
			}
			if (this.aClass33_2.anInt501 != 128 || this.aClass33_2.anInt502 != 128) {
				local41.method212(this.aClass33_2.anInt501, this.aByte33, this.aClass33_2.anInt502, this.aClass33_2.anInt501);
			}
			local41.method208(this.anInt682);
			local41.method213(this.aClass33_2.anInt504 + 64, this.aClass33_2.anInt505 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("23515, " + -840 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}

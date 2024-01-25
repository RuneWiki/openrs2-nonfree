import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class62_Sub1_Sub3 extends Class62_Sub1 {

	@OriginalMember(owner = "client!hp", name = "lb", descriptor = "Lclient!wq;")
	public static final Class216 lb = new Class216();

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
	private int anInt2685;

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!hp", name = "X", descriptor = "I")
	private int anInt2694;

	@OriginalMember(owner = "client!hp", name = "ib", descriptor = "Lclient!om;")
	private Class55_Sub7 aClass55_Sub7_3;

	@OriginalMember(owner = "client!hp", name = "ob", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!hp", name = "pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!hp", name = "ub", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!hp", name = "vb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!hp", name = "wb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
	private int anInt2693 = -1;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
	private int anInt2692 = -32768;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
	private int anInt2687 = 0;

	@OriginalMember(owner = "client!hp", name = "nb", descriptor = "I")
	private int anInt2707 = 0;

	@OriginalMember(owner = "client!hp", name = "ab", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
	private final int anInt2696;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	public final int anInt2681;

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "I")
	public final int anInt2691;

	@OriginalMember(owner = "client!hp", name = "tb", descriptor = "I")
	public final int anInt2709;

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
	private final int anInt2682;

	@OriginalMember(owner = "client!hp", name = "qb", descriptor = "Lclient!kb;")
	private final Class107 aClass107_2;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class62_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean235 = false;
		this.anInt2697 = arg9;
		this.anInt2696 = arg8;
		this.anInt2681 = arg10;
		this.anInt2691 = arg6;
		this.anInt2709 = arg5;
		this.anInt2690 = arg7;
		this.anInt2682 = arg0;
		@Pc(64) int local64 = Static44.method1076(this.anInt2682).anInt6968;
		if (local64 == -1) {
			this.aClass107_2 = null;
		} else {
			this.aClass107_2 = Static212.method3773(local64);
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(II)V")
	public void method2609(@OriginalArg(0) int arg0) {
		this.aDouble1 += this.aDouble5 * (double) arg0;
		this.aDouble4 += this.aDouble8 * (double) arg0;
		if (this.anInt2690 == -1) {
			this.aDouble6 += this.aDouble2 * (double) arg0;
		} else {
			this.aDouble6 += this.aDouble2 * (double) arg0 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble3;
			this.aDouble2 += this.aDouble3 * (double) arg0;
		}
		this.aBoolean235 = true;
		this.anInt2685 = (int) (Math.atan2(this.aDouble5, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2694 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass107_2 == null) {
			return;
		}
		this.anInt2687 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2687 <= this.aClass107_2.anIntArray279[this.anInt2707]) {
						return;
					}
					this.anInt2687 -= this.aClass107_2.anIntArray279[this.anInt2707];
					this.anInt2707++;
					if (this.anInt2707 >= this.aClass107_2.anIntArray280.length) {
						this.anInt2707 -= this.aClass107_2.anInt3276;
						if (this.anInt2707 < 0 || this.aClass107_2.anIntArray280.length <= this.anInt2707) {
							this.anInt2707 = 0;
						}
					}
					this.anInt2693 = this.anInt2707 + 1;
				} while (this.aClass107_2.anIntArray280.length > this.anInt2693);
				this.anInt2693 -= this.aClass107_2.anInt3276;
			} while (this.anInt2693 >= 0 && this.anInt2693 < this.aClass107_2.anIntArray280.length);
			this.anInt2693 = -1;
		}
	}

	@OriginalMember(owner = "client!hp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass55_Sub7_3 != null) {
			this.aClass55_Sub7_3.method4032();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ae;I)Lclient!bk;")
	private Class7 method2611(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(16) Class215 local16 = Static44.method1076(this.anInt2682);
		return local16.method5985(arg0, arg1, this.anInt2707, this.anInt2693, this.anInt2687);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ae;Lclient!bk;B)V")
	private void method2612(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class7 arg1) {
		@Pc(6) Class161[] local6 = arg1.method1424();
		@Pc(9) Class44[] local9 = arg1.method1399();
		if ((this.aClass55_Sub7_3 == null || this.aClass55_Sub7_3.aBoolean393) && (local6 != null || local9 != null)) {
			this.aClass55_Sub7_3 = new Class55_Sub7(Static212.anInt4090);
		}
		if (this.aClass55_Sub7_3 != null) {
			this.aClass55_Sub7_3.method4025(arg0, (long) Static212.anInt4090, local6, local9);
			this.aClass55_Sub7_3.method4035(super.aByte56, super.aShort84, super.aShort86, super.aShort83, super.aShort85);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(9) Class7 local9 = this.method2611(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class133 local16 = arg0.method4244();
		local16.method4336(this.anInt2694);
		local16.method4327(this.anInt2685);
		local16.method4333((int) this.aDouble1, (int) this.aDouble6, (int) this.aDouble4);
		if (this.aClass55_Sub7_3 == null) {
			local9.method1441(local16, null, 0);
		} else {
			@Pc(42) Class75 local42 = this.aClass55_Sub7_3.method4034();
			arg0.method4245(local9, local42, local16, null);
		}
		this.anInt2692 = local9.method1430();
		this.method2612(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		@Pc(9) Class7 local9 = this.method2611(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(22) Class133 local22 = arg0.method4244();
		local22.method4336(this.anInt2694);
		local22.method4327(this.anInt2685);
		local22.method4333((int) this.aDouble1, (int) this.aDouble6, (int) this.aDouble4);
		this.anInt2692 = local9.method1430();
		this.method2612(arg0, local9);
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return this.anInt2692;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIIII)V")
	public void method2614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean235) {
			local12 = arg3 - super.anInt5289;
			@Pc(19) double local19 = (double) (arg2 - super.anInt5280);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble6 = super.anInt5291;
			this.aDouble1 = (double) this.anInt2696 * local12 / local28 + (double) super.anInt5289;
			this.aDouble4 = (double) super.anInt5280 + (double) this.anInt2696 * local19 / local28;
		}
		local12 = this.anInt2691 + 1 - arg1;
		this.aDouble8 = ((double) arg2 - this.aDouble4) / local12;
		this.aDouble5 = ((double) arg3 - this.aDouble1) / local12;
		this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble8 * this.aDouble8);
		if (this.anInt2690 == -1) {
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local12;
		} else {
			if (!this.aBoolean235) {
				this.aDouble2 = -this.aDouble7 * Math.tan((double) this.anInt2690 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - local12 * this.aDouble2 - this.aDouble6) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method2615() {
		if (this.aClass55_Sub7_3 != null) {
			this.aClass55_Sub7_3.method4032();
		}
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)V")
	@Override
	public void method4763() {
		super.aShort83 = super.aShort85 = (short) (this.aDouble4 / 128.0D);
		super.aShort84 = super.aShort86 = (short) (this.aDouble1 / 128.0D);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}
}

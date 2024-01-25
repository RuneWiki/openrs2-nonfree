import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 {

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
	private int anInt2529;

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gt", name = "I", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gt", name = "V", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gt", name = "ab", descriptor = "Lclient!an;")
	private Class10_Sub1 aClass10_Sub1_4;

	@OriginalMember(owner = "client!gt", name = "bb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gt", name = "eb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gt", name = "fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gt", name = "hb", descriptor = "I")
	private int anInt2547;

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	private int anInt2530 = -1;

	@OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
	private int anInt2541 = 0;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
	private int anInt2521 = -32768;

	@OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
	private int anInt2544 = 0;

	@OriginalMember(owner = "client!gt", name = "jb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!gt", name = "ib", descriptor = "I")
	public final int anInt2548;

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
	public final int anInt2535;

	@OriginalMember(owner = "client!gt", name = "db", descriptor = "I")
	private final int anInt2545;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	private final int anInt2533;

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
	public final int anInt2526;

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
	private final int anInt2537;

	@OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
	public final int anInt2539;

	@OriginalMember(owner = "client!gt", name = "cb", descriptor = "Lclient!qp;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2548 = arg9;
		this.aBoolean201 = false;
		this.anInt2535 = arg10;
		this.anInt2545 = arg8;
		this.anInt2533 = arg0;
		this.anInt2526 = arg6;
		this.anInt2537 = arg7;
		this.anInt2539 = arg5;
		@Pc(65) int local65 = Static149.aClass173_5.method3800(this.anInt2533).anInt863;
		if (local65 == -1) {
			this.aClass202_2 = null;
		} else {
			this.aClass202_2 = Static36.aClass236_1.method5396(local65);
		}
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
	public void method2442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean201) {
			local13 = arg1 - super.anInt6390;
			@Pc(20) double local20 = (double) (arg0 - super.anInt6386);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble2 = (double) super.anInt6386 + local20 * (double) this.anInt2545 / local29;
			this.aDouble4 = (double) super.anInt6390 + (double) this.anInt2545 * local13 / local29;
			this.aDouble1 = super.anInt6387;
		}
		local13 = this.anInt2526 + 1 - arg3;
		this.aDouble8 = ((double) arg1 - this.aDouble4) / local13;
		this.aDouble7 = ((double) arg0 - this.aDouble2) / local13;
		this.aDouble3 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble7 * this.aDouble7);
		if (this.anInt2537 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble1) / local13;
		} else {
			if (!this.aBoolean201) {
				this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt2537 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg2 - this.aDouble1 - local13 * this.aDouble5) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)V")
	public void method2443(@OriginalArg(0) int arg0) {
		this.aDouble2 += this.aDouble7 * (double) arg0;
		if (this.anInt2537 == -1) {
			this.aDouble1 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble1 += (double) arg0 * this.aDouble6 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble5;
			this.aDouble5 += this.aDouble6 * (double) arg0;
		}
		this.aBoolean201 = true;
		this.aDouble4 += (double) arg0 * this.aDouble8;
		this.anInt2547 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2529 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass202_2 == null) {
			return;
		}
		this.anInt2544 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass202_2.anIntArray973[this.anInt2541] >= this.anInt2544) {
						return;
					}
					this.anInt2544 -= this.aClass202_2.anIntArray973[this.anInt2541];
					this.anInt2541++;
					if (this.anInt2541 >= this.aClass202_2.anIntArray974.length) {
						this.anInt2541 -= this.aClass202_2.anInt4942;
						if (this.anInt2541 < 0 || this.aClass202_2.anIntArray974.length <= this.anInt2541) {
							this.anInt2541 = 0;
						}
					}
					this.anInt2530 = this.anInt2541 + 1;
				} while (this.anInt2530 < this.aClass202_2.anIntArray974.length);
				this.anInt2530 -= this.aClass202_2.anInt4942;
			} while (this.anInt2530 >= 0 && this.anInt2530 < this.aClass202_2.anIntArray974.length);
			this.anInt2530 = -1;
		}
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class66 local9 = this.method2445(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class44 local15 = arg0.method2024();
		local15.method3537(this.anInt2529);
		local15.method3531(this.anInt2547);
		local15.method3527((int) this.aDouble4, (int) this.aDouble1, (int) this.aDouble2);
		this.anInt2521 = local9.method5140();
		this.method2446(arg0, local9);
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public void method2444() {
		if (this.aClass10_Sub1_4 != null) {
			this.aClass10_Sub1_4.method226();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!vc;II)Lclient!n;")
	private Class66 method2445(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class34 local14 = Static149.aClass173_5.method3800(this.anInt2533);
		return local14.method735(this.anInt2541, arg1, this.anInt2530, Static36.aClass236_1, arg0, this.anInt2544);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(9) Class66 local9 = this.method2445(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class44 local16 = arg0.method2024();
		local16.method3537(this.anInt2529);
		local16.method3531(this.anInt2547);
		local16.method3527((int) this.aDouble4, (int) this.aDouble1, (int) this.aDouble2);
		if (this.aClass10_Sub1_4 == null) {
			local9.method5126(local16, null, 0);
		} else {
			@Pc(47) Class186 local47 = this.aClass10_Sub1_4.method229();
			arg0.method2055(local9, local47, local16, null);
		}
		this.anInt2521 = local9.method5140();
		this.method2446(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!vc;Lclient!n;)V")
	private void method2446(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(6) Class176[] local6 = arg1.method5123();
		@Pc(9) Class145[] local9 = arg1.method5156();
		if ((this.aClass10_Sub1_4 == null || this.aClass10_Sub1_4.aBoolean27) && (local6 != null || local9 != null)) {
			this.aClass10_Sub1_4 = new Class10_Sub1(Static253.anInt4469);
		}
		if (this.aClass10_Sub1_4 != null) {
			this.aClass10_Sub1_4.method224(arg0, (long) Static253.anInt4469, local6, local9);
			this.aClass10_Sub1_4.method228(super.aByte69, super.aShort96, super.aShort94, super.aShort97, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5537() {
		super.aShort96 = super.aShort94 = (short) (this.aDouble4 / 128.0D);
		super.aShort97 = super.aShort95 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return this.anInt2521;
	}

	@OriginalMember(owner = "client!gt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub1_4 != null) {
			this.aClass10_Sub1_4.method226();
		}
	}
}

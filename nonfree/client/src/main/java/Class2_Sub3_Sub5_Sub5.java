import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub3_Sub5_Sub5 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	public int anInt3214;

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!qh", name = "R", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!qh", name = "Z", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!qh", name = "cb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!qh", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!qh", name = "qb", descriptor = "I")
	private int anInt3228;

	@OriginalMember(owner = "client!qh", name = "yb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!qh", name = "lb", descriptor = "I")
	private int anInt3224 = 0;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!qh", name = "vb", descriptor = "I")
	private int anInt3231 = 0;

	@OriginalMember(owner = "client!qh", name = "wb", descriptor = "I")
	private final int anInt3232;

	@OriginalMember(owner = "client!qh", name = "rb", descriptor = "I")
	private final int anInt3229;

	@OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
	public final int anInt3220;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
	public final int anInt3215;

	@OriginalMember(owner = "client!qh", name = "mb", descriptor = "I")
	public final int anInt3225;

	@OriginalMember(owner = "client!qh", name = "sb", descriptor = "I")
	private final int anInt3230;

	@OriginalMember(owner = "client!qh", name = "hb", descriptor = "I")
	public final int anInt3221;

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
	public final int anInt3216;

	@OriginalMember(owner = "client!qh", name = "pb", descriptor = "I")
	private final int anInt3227;

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
	private final int anInt3218;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	private final int anInt3212;

	@OriginalMember(owner = "client!qh", name = "tb", descriptor = "Lclient!ic;")
	private final Class2_Sub3_Sub8 aClass2_Sub3_Sub8_2;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub3_Sub5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3232 = arg3;
		this.anInt3229 = arg2;
		this.anInt3220 = arg5;
		this.aBoolean133 = false;
		this.anInt3215 = arg9;
		this.anInt3225 = arg10;
		this.anInt3230 = arg8;
		this.anInt3221 = arg6;
		this.anInt3216 = arg1;
		this.anInt3227 = arg0;
		this.anInt3218 = arg7;
		this.anInt3212 = arg4;
		@Pc(52) int local52 = Static122.method1901(this.anInt3227).anInt3259;
		if (local52 == -1) {
			this.aClass2_Sub3_Sub8_2 = null;
		} else {
			this.aClass2_Sub3_Sub8_2 = Static129.method2790(local52);
		}
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Lclient!sa;")
	@Override
	protected Class2_Sub3_Sub5_Sub7 method2298() {
		@Pc(16) Class2_Sub3_Sub15 local16 = Static122.method1901(this.anInt3227);
		@Pc(22) Class2_Sub3_Sub5_Sub7 local22 = local16.method2157(this.anInt3224);
		if (local22 == null) {
			return null;
		} else {
			local22.method2308(this.anInt3228);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean133) {
			local9 = arg1 - this.anInt3229;
			@Pc(15) double local15 = (double) (arg2 - this.anInt3232);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local9 * local9);
			this.aDouble3 = (double) this.anInt3232 + (double) this.anInt3230 * local15 / local24;
			this.aDouble4 = local9 * (double) this.anInt3230 / local24 + (double) this.anInt3229;
			this.aDouble8 = this.anInt3212;
		}
		local9 = this.anInt3221 + 1 - arg0;
		this.aDouble5 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble2 = ((double) arg2 - this.aDouble3) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean133) {
			this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt3218 * 0.02454369D);
		}
		this.aDouble1 = ((double) arg3 - this.aDouble8 - this.aDouble7 * local9) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public void method2140(@OriginalArg(1) int arg0) {
		this.aDouble8 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble1 + this.aDouble7 * (double) arg0;
		this.aBoolean133 = true;
		this.aDouble7 += (double) arg0 * this.aDouble1;
		this.aDouble4 += (double) arg0 * this.aDouble5;
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.anInt3214 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt3228 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub3_Sub8_2 == null) {
			return;
		}
		this.anInt3231 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub3_Sub8_2.anIntArray113[this.anInt3224] >= this.anInt3231) {
						return;
					}
					this.anInt3231 -= this.aClass2_Sub3_Sub8_2.anIntArray113[this.anInt3224];
					this.anInt3224++;
				} while (this.aClass2_Sub3_Sub8_2.anIntArray109.length > this.anInt3224);
				this.anInt3224 -= this.aClass2_Sub3_Sub8_2.anInt1694;
			} while (this.anInt3224 >= 0 && this.anInt3224 < this.aClass2_Sub3_Sub8_2.anIntArray109.length);
			this.anInt3224 = 0;
		}
	}
}

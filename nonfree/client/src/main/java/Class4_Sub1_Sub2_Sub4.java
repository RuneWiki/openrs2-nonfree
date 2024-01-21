import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QIFJGOLN")
public final class Class4_Sub1_Sub2_Sub4 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!QIFJGOLN", name = "l", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!QIFJGOLN", name = "m", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!QIFJGOLN", name = "n", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!QIFJGOLN", name = "o", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!QIFJGOLN", name = "s", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!QIFJGOLN", name = "v", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!QIFJGOLN", name = "w", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!QIFJGOLN", name = "E", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!QIFJGOLN", name = "F", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!QIFJGOLN", name = "G", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!QIFJGOLN", name = "H", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!QIFJGOLN", name = "I", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!QIFJGOLN", name = "t", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!QIFJGOLN", name = "u", descriptor = "Lclient!JXKRPXFX;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!QIFJGOLN", name = "D", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!QIFJGOLN", name = "x", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!QIFJGOLN", name = "y", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!QIFJGOLN", name = "z", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!QIFJGOLN", name = "B", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!QIFJGOLN", name = "C", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!QIFJGOLN", name = "p", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!QIFJGOLN", name = "q", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!QIFJGOLN", name = "r", descriptor = "I")
	public int anInt410;

	@OriginalMember(owner = "client!QIFJGOLN", name = "A", descriptor = "I")
	public int anInt416;

	@OriginalMember(owner = "client!QIFJGOLN", name = "<init>", descriptor = "(IIIIZIIIIIII)V")
	public Class4_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass16_1 = Class16.aClass16Array1[arg7];
			this.anInt419 = arg11;
			this.anInt413 = arg2;
			this.anInt414 = arg3;
			this.anInt415 = arg0;
			this.anInt417 = arg1;
			this.anInt418 = arg9;
			this.anInt408 = arg5;
			this.anInt409 = arg6;
			this.anInt410 = arg8;
			this.anInt416 = arg10;
			this.aBoolean141 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("48848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(IIIBI)V")
	public void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != -90) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			@Pc(18) double local18;
			if (!this.aBoolean141) {
				local18 = arg2 - this.anInt413;
				@Pc(24) double local24 = (double) (arg4 - this.anInt414);
				@Pc(33) double local33 = Math.sqrt(local18 * local18 + local24 * local24);
				this.aDouble6 = (double) this.anInt413 + local18 * (double) this.anInt409 / local33;
				this.aDouble7 = (double) this.anInt414 + local24 * (double) this.anInt409 / local33;
				this.aDouble8 = this.anInt415;
			}
			local18 = this.anInt418 + 1 - arg1;
			this.aDouble1 = ((double) arg2 - this.aDouble6) / local18;
			this.aDouble2 = ((double) arg4 - this.aDouble7) / local18;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean141) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt408 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble8 - this.aDouble4 * local18) * 2.0D / (local18 * local18);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("38755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(II)V")
	public void method356(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean141 = true;
			this.aDouble6 += this.aDouble1 * (double) arg0;
			this.aDouble7 += this.aDouble2 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble5 * (double) arg0;
			this.anInt411 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt412 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass16_1.aClass27_2 != null) {
				this.anInt421 += arg0;
				while (this.anInt421 > this.aClass16_1.aClass27_2.method330(this.anInt420)) {
					this.anInt421 -= this.aClass16_1.aClass27_2.method330(this.anInt420);
					this.anInt420++;
					if (this.anInt420 >= this.aClass16_1.aClass27_2.anInt366) {
						this.anInt420 = 0;
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("18436, " + arg0 + ", " + 0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			@Pc(5) Class4_Sub1_Sub2_Sub3 local5 = this.aClass16_1.method215();
			if (local5 == null) {
				return null;
			}
			@Pc(24) int local24 = -1;
			if (this.aClass16_1.aClass27_2 != null) {
				local24 = this.aClass16_1.aClass27_2.anIntArray95[this.anInt420];
			}
			@Pc(47) Class4_Sub1_Sub2_Sub3 local47 = new Class4_Sub1_Sub2_Sub3(local5, false, true, Class37.method388(local24), 584);
			if (local24 != -1) {
				local47.method262();
				local47.method263(local24);
				local47.anIntArrayArray3 = null;
				local47.anIntArrayArray2 = null;
			}
			if (this.aClass16_1.anInt184 != 128 || this.aClass16_1.anInt185 != 128) {
				local47.method271(this.aClass16_1.anInt184, this.aClass16_1.anInt184, this.aClass16_1.anInt185);
			}
			local47.method267(this.anInt412);
			local47.method272(this.aClass16_1.anInt187 + 64, this.aClass16_1.anInt188 + 850, -30, -50, -30, true);
			return local47;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("85225, " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}
}

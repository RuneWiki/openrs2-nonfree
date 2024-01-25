import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class47_Sub1_Sub1 extends Class47_Sub1 {

	@OriginalMember(owner = "client!co", name = "lb", descriptor = "Z")
	public static boolean lb = false;

	@OriginalMember(owner = "client!co", name = "z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!co", name = "M", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!co", name = "O", descriptor = "Lclient!rb;")
	private Class36_Sub7 aClass36_Sub7_1;

	@OriginalMember(owner = "client!co", name = "Q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!co", name = "R", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!co", name = "T", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!co", name = "Y", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!co", name = "hb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	private int anInt971 = 0;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!co", name = "V", descriptor = "I")
	private int anInt983 = -1;

	@OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
	private int anInt997 = -32768;

	@OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
	private int anInt989 = 0;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "Z")
	private final boolean aBoolean84;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	public final int anInt980;

	@OriginalMember(owner = "client!co", name = "bb", descriptor = "I")
	private final int anInt988;

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "I")
	public final int anInt992;

	@OriginalMember(owner = "client!co", name = "db", descriptor = "I")
	private final int anInt990;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	private final int anInt970;

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
	public final int anInt995;

	@OriginalMember(owner = "client!co", name = "ob", descriptor = "I")
	private final int anInt998;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	public final int anInt978;

	@OriginalMember(owner = "client!co", name = "nb", descriptor = "Lclient!dn;")
	private final Class58 aClass58_1;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class47_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static405.method5510(arg3, arg2, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean84 = arg11;
		this.anInt980 = arg10;
		this.anInt988 = arg8;
		this.anInt992 = arg6;
		this.anInt990 = arg4;
		this.anInt970 = arg0;
		this.anInt995 = arg9;
		this.anInt998 = arg7;
		this.anInt978 = arg5;
		this.aBoolean83 = false;
		@Pc(78) int local78 = Static294.aClass125_2.method2961(this.anInt970).anInt4334;
		if (local78 == -1) {
			this.aClass58_1 = null;
		} else {
			this.aClass58_1 = Static322.aClass45_5.method690(local78);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZI)V")
	public void method827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean83) {
			local13 = arg2 - super.anInt7060;
			@Pc(20) double local20 = (double) (arg3 - super.anInt7066);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble1 = (double) super.anInt7060 + local13 * (double) this.anInt988 / local29;
			this.aDouble6 = local20 * (double) this.anInt988 / local29 + (double) super.anInt7066;
			if (this.aBoolean84) {
				this.aDouble5 = Static405.method5510((int) this.aDouble6, (int) this.aDouble1, super.aByte97) - this.anInt990;
			} else {
				this.aDouble5 = super.anInt7064;
			}
		}
		local13 = this.anInt992 + 1 - arg1;
		this.aDouble3 = ((double) arg3 - this.aDouble6) / local13;
		this.aDouble2 = ((double) arg2 - this.aDouble1) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble2 * this.aDouble2);
		if (this.anInt998 == -1) {
			this.aDouble8 = ((double) arg0 - this.aDouble5) / local13;
		} else {
			if (!this.aBoolean83) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt998 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg0 - local13 * this.aDouble8 - this.aDouble5) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(9) Class37 local9 = this.method831(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class43 local15 = arg0.method4588();
		local15.YA(this.anInt991);
		local15.c(this.anInt981);
		local15.ZA((int) this.aDouble1, (int) this.aDouble5, (int) this.aDouble6);
		this.anInt997 = local9.b();
		this.method829(local9, arg0);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return this.anInt997;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!c;BLclient!qa;)V")
	private void method829(@OriginalArg(0) Class37 arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(10) Class203[] local10 = arg0.method4169();
		@Pc(13) Class265[] local13 = arg0.method4157();
		if ((this.aClass36_Sub7_1 == null || this.aClass36_Sub7_1.aBoolean500) && (local10 != null || local13 != null)) {
			this.aClass36_Sub7_1 = new Class36_Sub7(Static123.anInt2333);
		}
		if (this.aClass36_Sub7_1 != null) {
			this.aClass36_Sub7_1.method4873(arg1, (long) Static123.anInt2333, local10, local13);
			this.aClass36_Sub7_1.method4884(super.aByte97, super.aShort104, super.aShort107, super.aShort105, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(9) Class37 local9 = this.method831(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class43 local16 = arg0.method4588();
		local16.YA(this.anInt991);
		local16.c(this.anInt981);
		local16.ZA((int) this.aDouble1, (int) this.aDouble5, (int) this.aDouble6);
		if (this.aClass36_Sub7_1 == null) {
			local9.method4167(local16, null, 0);
		} else {
			@Pc(51) Class101 local51 = this.aClass36_Sub7_1.method4874();
			arg0.method4574(local9, local51, local16, null);
		}
		this.anInt997 = local9.b();
		this.method829(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class37 method831(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		@Pc(17) Class166 local17 = Static294.aClass125_2.method2961(this.anInt970);
		return local17.method3603(Static322.aClass45_5, arg1, this.anInt971, this.anInt983, this.anInt989, arg0);
	}

	@OriginalMember(owner = "client!co", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub7_1 != null) {
			this.aClass36_Sub7_1.method4883();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public void method832() {
		if (this.aClass36_Sub7_1 != null) {
			this.aClass36_Sub7_1.method4883();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public void method833(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble3 * (double) arg0;
		this.aBoolean83 = true;
		this.aDouble1 += (double) arg0 * this.aDouble2;
		if (this.aBoolean84) {
			this.aDouble5 = Static405.method5510((int) this.aDouble6, (int) this.aDouble1, super.aByte97) - this.anInt990;
		} else if (this.anInt998 == -1) {
			this.aDouble5 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble5 += this.aDouble4 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble8;
			this.aDouble8 += (double) arg0 * this.aDouble4;
		}
		this.anInt981 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt991 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass58_1 == null) {
			return;
		}
		this.anInt971 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt971 <= this.aClass58_1.anIntArray66[this.anInt989]) {
						return;
					}
					this.anInt971 -= this.aClass58_1.anIntArray66[this.anInt989];
					this.anInt989++;
					if (this.anInt989 >= this.aClass58_1.anIntArray65.length) {
						this.anInt989 -= this.aClass58_1.anInt1434;
						if (this.anInt989 < 0 || this.aClass58_1.anIntArray65.length <= this.anInt989) {
							this.anInt989 = 0;
						}
					}
					this.anInt983 = this.anInt989 + 1;
				} while (this.aClass58_1.anIntArray65.length > this.anInt983);
				this.anInt983 -= this.aClass58_1.anInt1434;
			} while (this.anInt983 >= 0 && this.aClass58_1.anIntArray65.length > this.anInt983);
			this.anInt983 = -1;
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	@Override
	public void method5446() {
		super.aShort105 = super.aShort106 = (short) (this.aDouble6 / 128.0D);
		super.aShort104 = super.aShort107 = (short) (this.aDouble1 / 128.0D);
	}
}

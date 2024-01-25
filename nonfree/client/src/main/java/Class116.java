import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class116 {

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public int anInt3290;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	private int anInt3291;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!ap;")
	private final Class7_Sub3 aClass7_Sub3_4 = new Class7_Sub3(null);

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class116() {
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([B)V")
	public Class116(@OriginalArg(0) byte[] arg0) {
		this.method3019(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(J)V")
	public void method3007(@OriginalArg(0) long arg0) {
		this.aLong113 = arg0;
		@Pc(6) int local6 = this.anIntArray434.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray431[local8] = 0;
			this.anIntArray432[local8] = 0;
			this.aClass7_Sub3_4.anInt3005 = this.anIntArray433[local8];
			this.method3010(local8);
			this.anIntArray434[local8] = this.aClass7_Sub3_4.anInt3005;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
	private int method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static158.aByteArray36[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass7_Sub3_4.method2772() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass7_Sub3_4.method2772() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass7_Sub3_4.method2772();
		local12 = this.aClass7_Sub3_4.method2761();
		if (local7 == 47) {
			this.aClass7_Sub3_4.anInt3005 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass7_Sub3_4.method2791();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray431[arg0];
			this.aLong113 += (long) local38 * (long) (this.anInt3291 - local32);
			this.anInt3291 = local32;
			this.aClass7_Sub3_4.anInt3005 += local12;
			return 2;
		} else {
			this.aClass7_Sub3_4.anInt3005 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
	public int method3009(@OriginalArg(0) int arg0) {
		return this.method3011(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public void method3010(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass7_Sub3_4.method2761();
		this.anIntArray431[arg0] += local4;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
	private int method3011(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass7_Sub3_4.aByteArray33[this.aClass7_Sub3_4.anInt3005];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray432[arg0] = local13;
			this.aClass7_Sub3_4.anInt3005++;
		} else {
			local13 = this.anIntArray432[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3008(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass7_Sub3_4.method2761();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass7_Sub3_4.aByteArray33[this.aClass7_Sub3_4.anInt3005] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass7_Sub3_4.anInt3005++;
				this.anIntArray432[arg0] = local57;
				return this.method3008(arg0, local57);
			}
		}
		this.aClass7_Sub3_4.anInt3005 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "()Z")
	public boolean method3012() {
		return this.aClass7_Sub3_4.aByteArray33 != null;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
	public void method3014() {
		this.aClass7_Sub3_4.anInt3005 = -1;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "()V")
	public void method3015() {
		this.aClass7_Sub3_4.aByteArray33 = null;
		this.anIntArray433 = null;
		this.anIntArray434 = null;
		this.anIntArray431 = null;
		this.anIntArray432 = null;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)J")
	public long method3016(@OriginalArg(0) int arg0) {
		return this.aLong113 + (long) arg0 * (long) this.anInt3291;
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
	public void method3017(@OriginalArg(0) int arg0) {
		this.anIntArray434[arg0] = this.aClass7_Sub3_4.anInt3005;
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "()I")
	public int method3018() {
		@Pc(3) int local3 = this.anIntArray434.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray434[local9] >= 0 && this.anIntArray431[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray431[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([B)V")
	public void method3019(@OriginalArg(0) byte[] arg0) {
		this.aClass7_Sub3_4.aByteArray33 = arg0;
		this.aClass7_Sub3_4.anInt3005 = 10;
		@Pc(12) int local12 = this.aClass7_Sub3_4.method2764();
		this.anInt3290 = this.aClass7_Sub3_4.method2764();
		this.anInt3291 = 500000;
		this.anIntArray433 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass7_Sub3_4.method2767();
			@Pc(38) int local38 = this.aClass7_Sub3_4.method2767();
			if (local33 == 1297379947) {
				this.anIntArray433[local27] = this.aClass7_Sub3_4.anInt3005;
				local27++;
			}
			this.aClass7_Sub3_4.anInt3005 += local38;
		}
		this.aLong113 = 0L;
		this.anIntArray434 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray434[local33] = this.anIntArray433[local33];
		}
		this.anIntArray431 = new int[local12];
		this.anIntArray432 = new int[local12];
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "()I")
	public int method3020() {
		return this.anIntArray434.length;
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V")
	public void method3021(@OriginalArg(0) int arg0) {
		this.aClass7_Sub3_4.anInt3005 = this.anIntArray434[arg0];
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "()Z")
	public boolean method3022() {
		@Pc(3) int local3 = this.anIntArray434.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray434[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}

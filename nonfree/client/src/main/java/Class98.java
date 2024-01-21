import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class98 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public int anInt3759;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	private int anInt3760;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!ce;")
	private final Class5_Sub6 aClass5_Sub6_5 = new Class5_Sub6(null);

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class98() {
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
	public Class98(@OriginalArg(0) byte[] arg0) {
		this.method2832(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method2827(@OriginalArg(0) int arg0) {
		this.aClass5_Sub6_5.anInt4050 = this.anIntArray399[arg0];
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public void method2829(@OriginalArg(0) int arg0) {
		this.anIntArray399[arg0] = this.aClass5_Sub6_5.anInt4050;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(J)V")
	public void method2830(@OriginalArg(0) long arg0) {
		this.aLong221 = arg0;
		@Pc(6) int local6 = this.anIntArray399.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray396[local8] = 0;
			this.anIntArray397[local8] = 0;
			this.aClass5_Sub6_5.anInt4050 = this.anIntArray398[local8];
			this.method2841(local8);
			this.anIntArray399[local8] = this.aClass5_Sub6_5.anInt4050;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "()I")
	public int method2831() {
		@Pc(3) int local3 = this.anIntArray399.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray399[local9] >= 0 && this.anIntArray396[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray396[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([B)V")
	public void method2832(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub6_5.aByteArray56 = arg0;
		this.aClass5_Sub6_5.anInt4050 = 10;
		@Pc(12) int local12 = this.aClass5_Sub6_5.method3077();
		this.anInt3759 = this.aClass5_Sub6_5.method3077();
		this.anInt3760 = 500000;
		this.anIntArray398 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub6_5.method3073();
			@Pc(38) int local38 = this.aClass5_Sub6_5.method3073();
			if (local33 == 1297379947) {
				this.anIntArray398[local27] = this.aClass5_Sub6_5.anInt4050;
				local27++;
			}
			this.aClass5_Sub6_5.anInt4050 += local38;
		}
		this.aLong221 = 0L;
		this.anIntArray399 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray399[local33] = this.anIntArray398[local33];
		}
		this.anIntArray396 = new int[local12];
		this.anIntArray397 = new int[local12];
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "()Z")
	public boolean method2833() {
		@Pc(3) int local3 = this.anIntArray399.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray399[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "()V")
	public void method2834() {
		this.aClass5_Sub6_5.anInt4050 = -1;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "()I")
	public int method2835() {
		return this.anIntArray399.length;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "()Z")
	public boolean method2836() {
		return this.aClass5_Sub6_5.aByteArray56 != null;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
	public int method2837(@OriginalArg(0) int arg0) {
		return this.method2838(arg0);
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I")
	private int method2838(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub6_5.aByteArray56[this.aClass5_Sub6_5.anInt4050];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray397[arg0] = local13;
			this.aClass5_Sub6_5.anInt4050++;
		} else {
			local13 = this.anIntArray397[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2840(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub6_5.method3038();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub6_5.aByteArray56[this.aClass5_Sub6_5.anInt4050] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub6_5.anInt4050++;
				this.anIntArray397[arg0] = local57;
				return this.method2840(arg0, local57);
			}
		}
		this.aClass5_Sub6_5.anInt4050 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "()V")
	public void method2839() {
		this.aClass5_Sub6_5.aByteArray56 = null;
		this.anIntArray398 = null;
		this.anIntArray399 = null;
		this.anIntArray396 = null;
		this.anIntArray397 = null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
	private int method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static190.aByteArray54[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub6_5.method3062() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub6_5.method3062() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub6_5.method3062();
		local12 = this.aClass5_Sub6_5.method3038();
		if (local7 == 47) {
			this.aClass5_Sub6_5.anInt4050 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub6_5.method3072();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray396[arg0];
			this.aLong221 += (long) local38 * (long) (this.anInt3760 - local32);
			this.anInt3760 = local32;
			this.aClass5_Sub6_5.anInt4050 += local12;
			return 2;
		} else {
			this.aClass5_Sub6_5.anInt4050 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	public void method2841(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub6_5.method3038();
		this.anIntArray396[arg0] += local4;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)J")
	public long method2842(@OriginalArg(0) int arg0) {
		return this.aLong221 + (long) arg0 * (long) this.anInt3760;
	}
}

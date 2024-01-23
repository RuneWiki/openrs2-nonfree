import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class29 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public int anInt969;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!k;")
	private Class1_Sub16 aClass1_Sub16_2 = new Class1_Sub16(null);

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		this.method707(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method703() {
		this.aClass1_Sub16_2.aByteArray62 = null;
		this.anIntArray59 = null;
		this.anIntArray57 = null;
		this.anIntArray58 = null;
		this.anIntArray60 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	private int method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static40.aByteArray9[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub16_2.method3793() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub16_2.method3793() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub16_2.method3793();
		local12 = this.aClass1_Sub16_2.method3773();
		if (local7 == 47) {
			this.aClass1_Sub16_2.anInt4860 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub16_2.method3806();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray58[arg0];
			this.aLong28 += (long) local38 * (long) (this.anInt970 - local32);
			this.anInt970 = local32;
			this.aClass1_Sub16_2.anInt4860 += local12;
			return 2;
		} else {
			this.aClass1_Sub16_2.anInt4860 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
	public int method705() {
		return this.anIntArray57.length;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()Z")
	public boolean method706() {
		@Pc(3) int local3 = this.anIntArray57.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray57[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
	public void method707(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub16_2.aByteArray62 = arg0;
		this.aClass1_Sub16_2.anInt4860 = 10;
		@Pc(12) int local12 = this.aClass1_Sub16_2.method3805();
		this.anInt969 = this.aClass1_Sub16_2.method3805();
		this.anInt970 = 500000;
		this.anIntArray59 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub16_2.method3784();
			@Pc(38) int local38 = this.aClass1_Sub16_2.method3784();
			if (local33 == 1297379947) {
				this.anIntArray59[local27] = this.aClass1_Sub16_2.anInt4860;
				local27++;
			}
			this.aClass1_Sub16_2.anInt4860 += local38;
		}
		this.aLong28 = 0L;
		this.anIntArray57 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray57[local33] = this.anIntArray59[local33];
		}
		this.anIntArray58 = new int[local12];
		this.anIntArray60 = new int[local12];
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public void method708() {
		this.aClass1_Sub16_2.anInt4860 = -1;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()Z")
	public boolean method709() {
		return this.aClass1_Sub16_2.aByteArray62 != null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method710(@OriginalArg(0) int arg0) {
		return this.method716(arg0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)J")
	public long method712(@OriginalArg(0) int arg0) {
		return this.aLong28 + (long) arg0 * (long) this.anInt970;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public void method713(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub16_2.method3773();
		this.anIntArray58[arg0] += local4;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public void method714(@OriginalArg(0) int arg0) {
		this.aClass1_Sub16_2.anInt4860 = this.anIntArray57[arg0];
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public void method715(@OriginalArg(0) int arg0) {
		this.anIntArray57[arg0] = this.aClass1_Sub16_2.anInt4860;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)I")
	private int method716(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub16_2.aByteArray62[this.aClass1_Sub16_2.anInt4860];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray60[arg0] = local13;
			this.aClass1_Sub16_2.anInt4860++;
		} else {
			local13 = this.anIntArray60[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method704(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub16_2.method3773();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub16_2.aByteArray62[this.aClass1_Sub16_2.anInt4860] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub16_2.anInt4860++;
				this.anIntArray60[arg0] = local57;
				return this.method704(arg0, local57);
			}
		}
		this.aClass1_Sub16_2.anInt4860 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(J)V")
	public void method717(@OriginalArg(0) long arg0) {
		this.aLong28 = arg0;
		@Pc(6) int local6 = this.anIntArray57.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray58[local8] = 0;
			this.anIntArray60[local8] = 0;
			this.aClass1_Sub16_2.anInt4860 = this.anIntArray59[local8];
			this.method713(local8);
			this.anIntArray57[local8] = this.aClass1_Sub16_2.anInt4860;
		}
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()I")
	public int method718() {
		@Pc(3) int local3 = this.anIntArray57.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray57[local9] >= 0 && this.anIntArray58[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray58[local9];
			}
		}
		return local5;
	}
}

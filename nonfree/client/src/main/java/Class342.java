import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class342 {

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "[I")
	private int[] anIntArray576;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
	private int anInt9123;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "J")
	private long aLong251;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
	public int anInt9124;

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Lclient!ac;")
	private final Class1_Sub3 aClass1_Sub3_7 = new Class1_Sub3(null);

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
	public Class342() {
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "([B)V")
	public Class342(@OriginalArg(0) byte[] arg0) {
		this.method7441(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(J)V")
	public void method7438(@OriginalArg(0) long arg0) {
		this.aLong251 = arg0;
		@Pc(6) int local6 = this.anIntArray576.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray574[local8] = 0;
			this.anIntArray577[local8] = 0;
			this.aClass1_Sub3_7.anInt9802 = this.anIntArray575[local8];
			this.method7443(local8);
			this.anIntArray576[local8] = this.aClass1_Sub3_7.anInt9802;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "()V")
	public void method7439() {
		this.aClass1_Sub3_7.anInt9802 = -1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	public int method7440(@OriginalArg(0) int arg0) {
		return this.method7453(arg0);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "([B)V")
	public void method7441(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub3_7.aByteArray104 = arg0;
		this.aClass1_Sub3_7.anInt9802 = 10;
		@Pc(12) int local12 = this.aClass1_Sub3_7.method7945();
		this.anInt9124 = this.aClass1_Sub3_7.method7945();
		this.anInt9123 = 500000;
		this.anIntArray575 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub3_7.method7940();
			@Pc(38) int local38 = this.aClass1_Sub3_7.method7940();
			if (local33 == 1297379947) {
				this.anIntArray575[local27] = this.aClass1_Sub3_7.anInt9802;
				local27++;
			}
			this.aClass1_Sub3_7.anInt9802 += local38;
		}
		this.aLong251 = 0L;
		this.anIntArray576 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray576[local33] = this.anIntArray575[local33];
		}
		this.anIntArray574 = new int[local12];
		this.anIntArray577 = new int[local12];
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "()I")
	public int method7442() {
		@Pc(3) int local3 = this.anIntArray576.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray576[local9] >= 0 && this.anIntArray574[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray574[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
	public void method7443(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub3_7.method7929();
		this.anIntArray574[arg0] += local4;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "()Z")
	public boolean method7444() {
		return this.aClass1_Sub3_7.aByteArray104 != null;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V")
	public void method7445(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_7.anInt9802 = this.anIntArray576[arg0];
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "()I")
	public int method7446() {
		return this.anIntArray576.length;
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "()V")
	public void method7447() {
		this.aClass1_Sub3_7.aByteArray104 = null;
		this.anIntArray575 = null;
		this.anIntArray576 = null;
		this.anIntArray574 = null;
		this.anIntArray577 = null;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
	private int method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static546.aByteArray91[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub3_7.method7974() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub3_7.method7974() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub3_7.method7974();
		local12 = this.aClass1_Sub3_7.method7929();
		if (local7 == 47) {
			this.aClass1_Sub3_7.anInt9802 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub3_7.method7919();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray574[arg0];
			this.aLong251 += (long) local38 * (long) (this.anInt9123 - local32);
			this.anInt9123 = local32;
			this.aClass1_Sub3_7.anInt9802 += local12;
			return 2;
		} else {
			this.aClass1_Sub3_7.anInt9802 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)V")
	public void method7450(@OriginalArg(0) int arg0) {
		this.anIntArray576[arg0] = this.aClass1_Sub3_7.anInt9802;
	}

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)J")
	public long method7451(@OriginalArg(0) int arg0) {
		return this.aLong251 + (long) arg0 * (long) this.anInt9123;
	}

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "()Z")
	public boolean method7452() {
		@Pc(3) int local3 = this.anIntArray576.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray576[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)I")
	private int method7453(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub3_7.aByteArray104[this.aClass1_Sub3_7.anInt9802];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray577[arg0] = local13;
			this.aClass1_Sub3_7.anInt9802++;
		} else {
			local13 = this.anIntArray577[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7448(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub3_7.method7929();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub3_7.aByteArray104[this.aClass1_Sub3_7.anInt9802] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub3_7.anInt9802++;
				this.anIntArray577[arg0] = local57;
				return this.method7448(arg0, local57);
			}
		}
		this.aClass1_Sub3_7.anInt9802 += local42;
		return 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class278 {

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
	private int anInt8095;

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
	public int anInt8096;

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!qha", name = "h", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!qha", name = "i", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "Lclient!sl;")
	private final Class3_Sub3 aClass3_Sub3_7 = new Class3_Sub3(null);

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	public Class278() {
	}

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "([B)V")
	public Class278(@OriginalArg(0) byte[] arg0) {
		this.method7027(arg0);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)I")
	private int method7017(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub3_7.aByteArray54[this.aClass3_Sub3_7.anInt4736];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray502[arg0] = local13;
			this.aClass3_Sub3_7.anInt4736++;
		} else {
			local13 = this.anIntArray502[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7023(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub3_7.method4219();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub3_7.aByteArray54[this.aClass3_Sub3_7.anInt4736] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub3_7.anInt4736++;
				this.anIntArray502[arg0] = local57;
				return this.method7023(arg0, local57);
			}
		}
		this.aClass3_Sub3_7.anInt4736 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "()V")
	public void method7018() {
		this.aClass3_Sub3_7.aByteArray54 = null;
		this.anIntArray503 = null;
		this.anIntArray504 = null;
		this.anIntArray505 = null;
		this.anIntArray502 = null;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	public void method7019(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub3_7.method4219();
		this.anIntArray505[arg0] += local4;
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
	public void method7020(@OriginalArg(0) int arg0) {
		this.anIntArray504[arg0] = this.aClass3_Sub3_7.anInt4736;
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "()I")
	public int method7022() {
		@Pc(3) int local3 = this.anIntArray504.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray504[local9] >= 0 && this.anIntArray505[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray505[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)I")
	private int method7023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static462.aByteArray88[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub3_7.method4225() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub3_7.method4225() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub3_7.method4225();
		local12 = this.aClass3_Sub3_7.method4219();
		if (local7 == 47) {
			this.aClass3_Sub3_7.anInt4736 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub3_7.method4204();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray505[arg0];
			this.aLong220 += (long) local38 * (long) (this.anInt8095 - local32);
			this.anInt8095 = local32;
			this.aClass3_Sub3_7.anInt4736 += local12;
			return 2;
		} else {
			this.aClass3_Sub3_7.anInt4736 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V")
	public void method7024(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3_7.anInt4736 = this.anIntArray504[arg0];
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "()V")
	public void method7025() {
		this.aClass3_Sub3_7.anInt4736 = -1;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(J)V")
	public void method7026(@OriginalArg(0) long arg0) {
		this.aLong220 = arg0;
		@Pc(6) int local6 = this.anIntArray504.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray505[local8] = 0;
			this.anIntArray502[local8] = 0;
			this.aClass3_Sub3_7.anInt4736 = this.anIntArray503[local8];
			this.method7019(local8);
			this.anIntArray504[local8] = this.aClass3_Sub3_7.anInt4736;
		}
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "([B)V")
	public void method7027(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub3_7.aByteArray54 = arg0;
		this.aClass3_Sub3_7.anInt4736 = 10;
		@Pc(12) int local12 = this.aClass3_Sub3_7.method4221();
		this.anInt8096 = this.aClass3_Sub3_7.method4221();
		this.anInt8095 = 500000;
		this.anIntArray503 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub3_7.method4207();
			@Pc(38) int local38 = this.aClass3_Sub3_7.method4207();
			if (local33 == 1297379947) {
				this.anIntArray503[local27] = this.aClass3_Sub3_7.anInt4736;
				local27++;
			}
			this.aClass3_Sub3_7.anInt4736 += local38;
		}
		this.aLong220 = 0L;
		this.anIntArray504 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray504[local33] = this.anIntArray503[local33];
		}
		this.anIntArray505 = new int[local12];
		this.anIntArray502 = new int[local12];
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "()I")
	public int method7028() {
		return this.anIntArray504.length;
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)I")
	public int method7029(@OriginalArg(0) int arg0) {
		return this.method7017(arg0);
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "()Z")
	public boolean method7030() {
		@Pc(3) int local3 = this.anIntArray504.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray504[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qha", name = "g", descriptor = "()Z")
	public boolean method7031() {
		return this.aClass3_Sub3_7.aByteArray54 != null;
	}

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)J")
	public long method7032(@OriginalArg(0) int arg0) {
		return this.aLong220 + (long) arg0 * (long) this.anInt8095;
	}
}

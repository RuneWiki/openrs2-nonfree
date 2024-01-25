import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class131 {

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
	private int anInt4817;

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
	public int anInt4818;

	@OriginalMember(owner = "client!hha", name = "g", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "Lclient!tn;")
	private final Class3_Sub15 aClass3_Sub15_3 = new Class3_Sub15(null);

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V")
	public Class131() {
	}

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "([B)V")
	public Class131(@OriginalArg(0) byte[] arg0) {
		this.method4094(arg0);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)I")
	private int method4084(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub15_3.aByteArray106[this.aClass3_Sub15_3.anInt10282];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray278[arg0] = local13;
			this.aClass3_Sub15_3.anInt10282++;
		} else {
			local13 = this.anIntArray278[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4093(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub15_3.method8427();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub15_3.aByteArray106[this.aClass3_Sub15_3.anInt10282] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub15_3.anInt10282++;
				this.anIntArray278[arg0] = local57;
				return this.method4093(arg0, local57);
			}
		}
		this.aClass3_Sub15_3.anInt10282 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)I")
	public int method4085(@OriginalArg(0) int arg0) {
		return this.method4084(arg0);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "()I")
	public int method4086() {
		@Pc(3) int local3 = this.anIntArray275.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray275[local9] >= 0 && this.anIntArray277[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray277[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)V")
	public void method4087(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub15_3.method8427();
		this.anIntArray277[arg0] += local4;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "()I")
	public int method4088() {
		return this.anIntArray275.length;
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "()Z")
	public boolean method4089() {
		@Pc(3) int local3 = this.anIntArray275.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray275[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "()V")
	public void method4090() {
		this.aClass3_Sub15_3.aByteArray106 = null;
		this.anIntArray276 = null;
		this.anIntArray275 = null;
		this.anIntArray277 = null;
		this.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "()Z")
	public boolean method4091() {
		return this.aClass3_Sub15_3.aByteArray106 != null;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(J)V")
	public void method4092(@OriginalArg(0) long arg0) {
		this.aLong104 = arg0;
		@Pc(6) int local6 = this.anIntArray275.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray277[local8] = 0;
			this.anIntArray278[local8] = 0;
			this.aClass3_Sub15_3.anInt10282 = this.anIntArray276[local8];
			this.method4087(local8);
			this.anIntArray275[local8] = this.aClass3_Sub15_3.anInt10282;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)I")
	private int method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static208.aByteArray45[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub15_3.method8401() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub15_3.method8401() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub15_3.method8401();
		local12 = this.aClass3_Sub15_3.method8427();
		if (local7 == 47) {
			this.aClass3_Sub15_3.anInt10282 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub15_3.method8421();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray277[arg0];
			this.aLong104 += (long) local38 * (long) (this.anInt4817 - local32);
			this.anInt4817 = local32;
			this.aClass3_Sub15_3.anInt10282 += local12;
			return 2;
		} else {
			this.aClass3_Sub15_3.anInt10282 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([B)V")
	public void method4094(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub15_3.aByteArray106 = arg0;
		this.aClass3_Sub15_3.anInt10282 = 10;
		@Pc(12) int local12 = this.aClass3_Sub15_3.method8414();
		this.anInt4818 = this.aClass3_Sub15_3.method8414();
		this.anInt4817 = 500000;
		this.anIntArray276 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub15_3.method8402();
			@Pc(38) int local38 = this.aClass3_Sub15_3.method8402();
			if (local33 == 1297379947) {
				this.anIntArray276[local27] = this.aClass3_Sub15_3.anInt10282;
				local27++;
			}
			this.aClass3_Sub15_3.anInt10282 += local38;
		}
		this.aLong104 = 0L;
		this.anIntArray275 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray275[local33] = this.anIntArray276[local33];
		}
		this.anIntArray277 = new int[local12];
		this.anIntArray278 = new int[local12];
	}

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "(I)V")
	public void method4095(@OriginalArg(0) int arg0) {
		this.anIntArray275[arg0] = this.aClass3_Sub15_3.anInt10282;
	}

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "(I)V")
	public void method4096(@OriginalArg(0) int arg0) {
		this.aClass3_Sub15_3.anInt10282 = this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "()V")
	public void method4097() {
		this.aClass3_Sub15_3.anInt10282 = -1;
	}

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "(I)J")
	public long method4099(@OriginalArg(0) int arg0) {
		return this.aLong104 + (long) arg0 * (long) this.anInt4817;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class25 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!ea;")
	private Class2_Sub3 aClass2_Sub3_1 = new Class2_Sub3(null);

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class25() {
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
	public Class25(@OriginalArg(0) byte[] arg0) {
		this.method709(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public void method698(@OriginalArg(0) int arg0) {
		this.anIntArray73[arg0] = this.aClass2_Sub3_1.anInt239;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()Z")
	public boolean method699() {
		@Pc(3) int local3 = this.anIntArray73.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray73[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method700(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3_1.anInt239 = this.anIntArray73[arg0];
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)J")
	public long method701(@OriginalArg(0) int arg0) {
		return this.aLong25 + (long) arg0 * (long) this.anInt955;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
	public boolean method702() {
		return this.aClass2_Sub3_1.aByteArray4 != null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(J)V")
	public void method703(@OriginalArg(0) long arg0) {
		this.aLong25 = arg0;
		@Pc(6) int local6 = this.anIntArray73.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray72[local8] = 0;
			this.anIntArray70[local8] = 0;
			this.aClass2_Sub3_1.anInt239 = this.anIntArray71[local8];
			this.method713(local8);
			this.anIntArray73[local8] = this.aClass2_Sub3_1.anInt239;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	public void method704() {
		this.aClass2_Sub3_1.aByteArray4 = null;
		this.anIntArray71 = null;
		this.anIntArray73 = null;
		this.anIntArray72 = null;
		this.anIntArray70 = null;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
	public int method705() {
		return this.anIntArray73.length;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	private int method706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static37.aByteArray7[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub3_1.method209() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub3_1.method209() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub3_1.method209();
		local12 = this.aClass2_Sub3_1.method179();
		if (local7 == 47) {
			this.aClass2_Sub3_1.anInt239 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub3_1.method166();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray72[arg0];
			this.aLong25 += (long) local38 * (long) (this.anInt955 - local32);
			this.anInt955 = local32;
			this.aClass2_Sub3_1.anInt239 += local12;
			return 2;
		} else {
			this.aClass2_Sub3_1.anInt239 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I")
	private int method708(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub3_1.aByteArray4[this.aClass2_Sub3_1.anInt239];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray70[arg0] = local13;
			this.aClass2_Sub3_1.anInt239++;
		} else {
			local13 = this.anIntArray70[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method706(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub3_1.method179();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub3_1.aByteArray4[this.aClass2_Sub3_1.anInt239] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub3_1.anInt239++;
				this.anIntArray70[arg0] = local57;
				return this.method706(arg0, local57);
			}
		}
		this.aClass2_Sub3_1.anInt239 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
	public void method709(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub3_1.aByteArray4 = arg0;
		this.aClass2_Sub3_1.anInt239 = 10;
		@Pc(12) int local12 = this.aClass2_Sub3_1.method163();
		this.anInt956 = this.aClass2_Sub3_1.method163();
		this.anInt955 = 500000;
		this.anIntArray71 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub3_1.method185();
			@Pc(38) int local38 = this.aClass2_Sub3_1.method185();
			if (local33 == 1297379947) {
				this.anIntArray71[local27] = this.aClass2_Sub3_1.anInt239;
				local27++;
			}
			this.aClass2_Sub3_1.anInt239 += local38;
		}
		this.aLong25 = 0L;
		this.anIntArray73 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray73[local33] = this.anIntArray71[local33];
		}
		this.anIntArray72 = new int[local12];
		this.anIntArray70 = new int[local12];
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
	public int method710(@OriginalArg(0) int arg0) {
		return this.method708(arg0);
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
	public int method711() {
		@Pc(3) int local3 = this.anIntArray73.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray73[local9] >= 0 && this.anIntArray72[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray72[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "()V")
	public void method712() {
		this.aClass2_Sub3_1.anInt239 = -1;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public void method713(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub3_1.method179();
		this.anIntArray72[arg0] += local4;
	}
}

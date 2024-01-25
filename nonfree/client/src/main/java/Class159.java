import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class159 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public int anInt4516;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!md;")
	private final Class2_Sub20 aClass2_Sub20_5 = new Class2_Sub20(null);

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class159() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V")
	public Class159(@OriginalArg(0) byte[] arg0) {
		this.method3640(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public int method3639(@OriginalArg(0) int arg0) {
		return this.method3641(arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([B)V")
	public void method3640(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub20_5.aByteArray136 = arg0;
		this.aClass2_Sub20_5.anInt4608 = 10;
		@Pc(12) int local12 = this.aClass2_Sub20_5.method3711();
		this.anInt4516 = this.aClass2_Sub20_5.method3711();
		this.anInt4515 = 500000;
		this.anIntArray317 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub20_5.method3731();
			@Pc(38) int local38 = this.aClass2_Sub20_5.method3731();
			if (local33 == 1297379947) {
				this.anIntArray317[local27] = this.aClass2_Sub20_5.anInt4608;
				local27++;
			}
			this.aClass2_Sub20_5.anInt4608 += local38;
		}
		this.aLong135 = 0L;
		this.anIntArray315 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray315[local33] = this.anIntArray317[local33];
		}
		this.anIntArray318 = new int[local12];
		this.anIntArray316 = new int[local12];
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
	private int method3641(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub20_5.aByteArray136[this.aClass2_Sub20_5.anInt4608];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray316[arg0] = local13;
			this.aClass2_Sub20_5.anInt4608++;
		} else {
			local13 = this.anIntArray316[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3642(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub20_5.method3691();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub20_5.aByteArray136[this.aClass2_Sub20_5.anInt4608] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub20_5.anInt4608++;
				this.anIntArray316[arg0] = local57;
				return this.method3642(arg0, local57);
			}
		}
		this.aClass2_Sub20_5.anInt4608 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	private int method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static241.aByteArray132[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub20_5.method3737() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub20_5.method3737() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub20_5.method3737();
		local12 = this.aClass2_Sub20_5.method3691();
		if (local7 == 47) {
			this.aClass2_Sub20_5.anInt4608 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub20_5.method3748();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray318[arg0];
			this.aLong135 += (long) local38 * (long) (this.anInt4515 - local32);
			this.anInt4515 = local32;
			this.aClass2_Sub20_5.anInt4608 += local12;
			return 2;
		} else {
			this.aClass2_Sub20_5.anInt4608 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()Z")
	public boolean method3643() {
		@Pc(3) int local3 = this.anIntArray315.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray315[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()V")
	public void method3644() {
		this.aClass2_Sub20_5.anInt4608 = -1;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
	public int method3645() {
		return this.anIntArray315.length;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()V")
	public void method3646() {
		this.aClass2_Sub20_5.aByteArray136 = null;
		this.anIntArray317 = null;
		this.anIntArray315 = null;
		this.anIntArray318 = null;
		this.anIntArray316 = null;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public void method3647(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub20_5.method3691();
		this.anIntArray318[arg0] += local4;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(J)V")
	public void method3648(@OriginalArg(0) long arg0) {
		this.aLong135 = arg0;
		@Pc(6) int local6 = this.anIntArray315.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray318[local8] = 0;
			this.anIntArray316[local8] = 0;
			this.aClass2_Sub20_5.anInt4608 = this.anIntArray317[local8];
			this.method3647(local8);
			this.anIntArray315[local8] = this.aClass2_Sub20_5.anInt4608;
		}
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "()I")
	public int method3649() {
		@Pc(3) int local3 = this.anIntArray315.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray315[local9] >= 0 && this.anIntArray318[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray318[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	public void method3650(@OriginalArg(0) int arg0) {
		this.aClass2_Sub20_5.anInt4608 = this.anIntArray315[arg0];
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "()Z")
	public boolean method3651() {
		return this.aClass2_Sub20_5.aByteArray136 != null;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)J")
	public long method3652(@OriginalArg(0) int arg0) {
		return this.aLong135 + (long) arg0 * (long) this.anInt4515;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	public void method3653(@OriginalArg(0) int arg0) {
		this.anIntArray315[arg0] = this.aClass2_Sub20_5.anInt4608;
	}
}

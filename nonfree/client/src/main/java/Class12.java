import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class12 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!ka;")
	private final Class1_Sub14 aClass1_Sub14_1 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class12() {
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
	public Class12(@OriginalArg(0) byte[] arg0) {
		this.method245(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	public int method233() {
		return this.anIntArray37.length;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method234(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_1.anInt4061 = this.anIntArray37[arg0];
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	public void method235() {
		this.aClass1_Sub14_1.anInt4061 = -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(J)V")
	public void method236(@OriginalArg(0) long arg0) {
		this.aLong14 = arg0;
		@Pc(6) int local6 = this.anIntArray37.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray36[local8] = 0;
			this.anIntArray38[local8] = 0;
			this.aClass1_Sub14_1.anInt4061 = this.anIntArray39[local8];
			this.method238(local8);
			this.anIntArray37[local8] = this.aClass1_Sub14_1.anInt4061;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
	private int method237(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_1.aByteArray49[this.aClass1_Sub14_1.anInt4061];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray38[arg0] = local13;
			this.aClass1_Sub14_1.anInt4061++;
		} else {
			local13 = this.anIntArray38[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method241(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_1.method3012();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_1.aByteArray49[this.aClass1_Sub14_1.anInt4061] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_1.anInt4061++;
				this.anIntArray38[arg0] = local57;
				return this.method241(arg0, local57);
			}
		}
		this.aClass1_Sub14_1.anInt4061 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public void method238(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_1.method3012();
		this.anIntArray36[arg0] += local4;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()I")
	public int method239() {
		@Pc(3) int local3 = this.anIntArray37.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray37[local9] >= 0 && this.anIntArray36[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray36[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)J")
	public long method240(@OriginalArg(0) int arg0) {
		return this.aLong14 + (long) arg0 * (long) this.anInt372;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	private int method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static13.aByteArray2[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_1.method3010() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_1.method3010() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_1.method3010();
		local12 = this.aClass1_Sub14_1.method3012();
		if (local7 == 47) {
			this.aClass1_Sub14_1.anInt4061 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_1.method3049();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray36[arg0];
			this.aLong14 += (long) local38 * (long) (this.anInt372 - local32);
			this.anInt372 = local32;
			this.aClass1_Sub14_1.anInt4061 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_1.anInt4061 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
	public void method242() {
		this.aClass1_Sub14_1.aByteArray49 = null;
		this.anIntArray39 = null;
		this.anIntArray37 = null;
		this.anIntArray36 = null;
		this.anIntArray38 = null;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()Z")
	public boolean method243() {
		return this.aClass1_Sub14_1.aByteArray49 != null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V")
	public void method245(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_1.aByteArray49 = arg0;
		this.aClass1_Sub14_1.anInt4061 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_1.method3023();
		this.anInt371 = this.aClass1_Sub14_1.method3023();
		this.anInt372 = 500000;
		this.anIntArray39 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub14_1.method3058();
			@Pc(38) int local38 = this.aClass1_Sub14_1.method3058();
			if (local33 == 1297379947) {
				this.anIntArray39[local27] = this.aClass1_Sub14_1.anInt4061;
				local27++;
			}
			this.aClass1_Sub14_1.anInt4061 += local38;
		}
		this.aLong14 = 0L;
		this.anIntArray37 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray37[local33] = this.anIntArray39[local33];
		}
		this.anIntArray36 = new int[local12];
		this.anIntArray38 = new int[local12];
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	public void method246(@OriginalArg(0) int arg0) {
		this.anIntArray37[arg0] = this.aClass1_Sub14_1.anInt4061;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
	public int method247(@OriginalArg(0) int arg0) {
		return this.method237(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "()Z")
	public boolean method248() {
		@Pc(3) int local3 = this.anIntArray37.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray37[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}

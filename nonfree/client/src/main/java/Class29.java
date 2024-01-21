import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class29 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!m;")
	private final Class3_Sub11 aClass3_Sub11_16 = new Class3_Sub11(null);

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
	public Class29(@OriginalArg(0) byte[] arg0) {
		this.method1044(arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public void method1043() {
		this.aClass3_Sub11_16.anInt1562 = -1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([B)V")
	public void method1044(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub11_16.aByteArray13 = arg0;
		this.aClass3_Sub11_16.anInt1562 = 10;
		@Pc(12) int local12 = this.aClass3_Sub11_16.method974();
		this.anInt1588 = this.aClass3_Sub11_16.method974();
		this.anInt1589 = 500000;
		this.anIntArray154 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub11_16.method984();
			@Pc(38) int local38 = this.aClass3_Sub11_16.method984();
			if (local33 == 1297379947) {
				this.anIntArray154[local27] = this.aClass3_Sub11_16.anInt1562;
				local27++;
			}
			this.aClass3_Sub11_16.anInt1562 += local38;
		}
		this.aLong48 = 0L;
		this.anIntArray155 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray155[local33] = this.anIntArray154[local33];
		}
		this.anIntArray153 = new int[local12];
		this.anIntArray152 = new int[local12];
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Z")
	public boolean method1045() {
		@Pc(3) int local3 = this.anIntArray155.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray155[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J")
	public long method1046(@OriginalArg(0) int arg0) {
		return this.aLong48 + (long) arg0 * (long) this.anInt1589;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method1047(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub11_16.method993();
		this.anIntArray153[arg0] += local4;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public void method1048(@OriginalArg(0) int arg0) {
		this.anIntArray155[arg0] = this.aClass3_Sub11_16.anInt1562;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(J)V")
	public void method1049(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
		@Pc(6) int local6 = this.anIntArray155.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray153[local8] = 0;
			this.anIntArray152[local8] = 0;
			this.aClass3_Sub11_16.anInt1562 = this.anIntArray154[local8];
			this.method1047(local8);
			this.anIntArray155[local8] = this.aClass3_Sub11_16.anInt1562;
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)I")
	private int method1050(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub11_16.aByteArray13[this.aClass3_Sub11_16.anInt1562];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray152[arg0] = local13;
			this.aClass3_Sub11_16.anInt1562++;
		} else {
			local13 = this.anIntArray152[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1055(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub11_16.method993();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub11_16.aByteArray13[this.aClass3_Sub11_16.anInt1562] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub11_16.anInt1562++;
				this.anIntArray152[arg0] = local57;
				return this.method1055(arg0, local57);
			}
		}
		this.aClass3_Sub11_16.anInt1562 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Z")
	public boolean method1052() {
		return this.aClass3_Sub11_16.aByteArray13 != null;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()I")
	public int method1053() {
		return this.anIntArray155.length;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "()I")
	public int method1054() {
		@Pc(3) int local3 = this.anIntArray155.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray155[local9] >= 0 && this.anIntArray153[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray153[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
	private int method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static50.aByteArray14[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub11_16.method981() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub11_16.method981() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub11_16.method981();
		local12 = this.aClass3_Sub11_16.method993();
		if (local7 == 47) {
			this.aClass3_Sub11_16.anInt1562 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub11_16.method1013();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray153[arg0];
			this.aLong48 += (long) local38 * (long) (this.anInt1589 - local32);
			this.anInt1589 = local32;
			this.aClass3_Sub11_16.anInt1562 += local12;
			return 2;
		} else {
			this.aClass3_Sub11_16.anInt1562 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "()V")
	public void method1056() {
		this.aClass3_Sub11_16.aByteArray13 = null;
		this.anIntArray154 = null;
		this.anIntArray155 = null;
		this.anIntArray153 = null;
		this.anIntArray152 = null;
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I")
	public int method1057(@OriginalArg(0) int arg0) {
		return this.method1050(arg0);
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
	public void method1058(@OriginalArg(0) int arg0) {
		this.aClass3_Sub11_16.anInt1562 = this.anIntArray155[arg0];
	}
}

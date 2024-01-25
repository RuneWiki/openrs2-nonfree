import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class68 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
	public int anInt1602;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
	private int anInt1603;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!nj;")
	private final Class1_Sub21 aClass1_Sub21_1 = new Class1_Sub21(null);

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class68() {
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B)V")
	public Class68(@OriginalArg(0) byte[] arg0) {
		this.method1335(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
	private int method1324(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub21_1.aByteArray82[this.aClass1_Sub21_1.anInt6611];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray122[arg0] = local13;
			this.aClass1_Sub21_1.anInt6611++;
		} else {
			local13 = this.anIntArray122[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1337(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub21_1.method5706();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub21_1.aByteArray82[this.aClass1_Sub21_1.anInt6611] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub21_1.anInt6611++;
				this.anIntArray122[arg0] = local57;
				return this.method1337(arg0, local57);
			}
		}
		this.aClass1_Sub21_1.anInt6611 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
	public int method1325(@OriginalArg(0) int arg0) {
		return this.method1324(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public void method1326(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub21_1.method5706();
		this.anIntArray123[arg0] += local4;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	public void method1327(@OriginalArg(0) int arg0) {
		this.anIntArray121[arg0] = this.aClass1_Sub21_1.anInt6611;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
	public int method1328() {
		@Pc(3) int local3 = this.anIntArray121.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray121[local9] >= 0 && this.anIntArray123[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray123[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	public void method1329(@OriginalArg(0) int arg0) {
		this.aClass1_Sub21_1.anInt6611 = this.anIntArray121[arg0];
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)J")
	public long method1330(@OriginalArg(0) int arg0) {
		return this.aLong36 + (long) arg0 * (long) this.anInt1603;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
	public void method1331() {
		this.aClass1_Sub21_1.aByteArray82 = null;
		this.anIntArray120 = null;
		this.anIntArray121 = null;
		this.anIntArray123 = null;
		this.anIntArray122 = null;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
	public int method1333() {
		return this.anIntArray121.length;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "()V")
	public void method1334() {
		this.aClass1_Sub21_1.anInt6611 = -1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([B)V")
	public void method1335(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub21_1.aByteArray82 = arg0;
		this.aClass1_Sub21_1.anInt6611 = 10;
		@Pc(12) int local12 = this.aClass1_Sub21_1.method5715();
		this.anInt1602 = this.aClass1_Sub21_1.method5715();
		this.anInt1603 = 500000;
		this.anIntArray120 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub21_1.method5716();
			@Pc(38) int local38 = this.aClass1_Sub21_1.method5716();
			if (local33 == 1297379947) {
				this.anIntArray120[local27] = this.aClass1_Sub21_1.anInt6611;
				local27++;
			}
			this.aClass1_Sub21_1.anInt6611 += local38;
		}
		this.aLong36 = 0L;
		this.anIntArray121 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray121[local33] = this.anIntArray120[local33];
		}
		this.anIntArray123 = new int[local12];
		this.anIntArray122 = new int[local12];
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "()Z")
	public boolean method1336() {
		return this.aClass1_Sub21_1.aByteArray82 != null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	private int method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static84.aByteArray11[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub21_1.method5720() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub21_1.method5720() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub21_1.method5720();
		local12 = this.aClass1_Sub21_1.method5706();
		if (local7 == 47) {
			this.aClass1_Sub21_1.anInt6611 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub21_1.method5705();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray123[arg0];
			this.aLong36 += (long) local38 * (long) (this.anInt1603 - local32);
			this.anInt1603 = local32;
			this.aClass1_Sub21_1.anInt6611 += local12;
			return 2;
		} else {
			this.aClass1_Sub21_1.anInt6611 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(J)V")
	public void method1338(@OriginalArg(0) long arg0) {
		this.aLong36 = arg0;
		@Pc(6) int local6 = this.anIntArray121.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray123[local8] = 0;
			this.anIntArray122[local8] = 0;
			this.aClass1_Sub21_1.anInt6611 = this.anIntArray120[local8];
			this.method1326(local8);
			this.anIntArray121[local8] = this.aClass1_Sub21_1.anInt6611;
		}
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "()Z")
	public boolean method1339() {
		@Pc(3) int local3 = this.anIntArray121.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray121[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}

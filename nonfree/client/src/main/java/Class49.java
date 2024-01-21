import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class49 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	private int anInt1937;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public int anInt1938;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!qc;")
	private final Class1_Sub18 aClass1_Sub18_2 = new Class1_Sub18(null);

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class49() {
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
	public Class49(@OriginalArg(0) byte[] arg0) {
		this.method1326(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	private int method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static78.aByteArray57[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub18_2.method2169() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub18_2.method2169() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub18_2.method2169();
		local12 = this.aClass1_Sub18_2.method2172();
		if (local7 == 47) {
			this.aClass1_Sub18_2.anInt3078 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub18_2.method2145();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray271[arg0];
			this.aLong54 += (long) local38 * (long) (this.anInt1937 - local32);
			this.anInt1937 = local32;
			this.aClass1_Sub18_2.anInt3078 += local12;
			return 2;
		} else {
			this.aClass1_Sub18_2.anInt3078 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()Z")
	public boolean method1323() {
		@Pc(3) int local3 = this.anIntArray273.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray273[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	public int method1324(@OriginalArg(0) int arg0) {
		return this.method1329(arg0);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public void method1325(@OriginalArg(0) int arg0) {
		this.anIntArray273[arg0] = this.aClass1_Sub18_2.anInt3078;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([B)V")
	public void method1326(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub18_2.aByteArray96 = arg0;
		this.aClass1_Sub18_2.anInt3078 = 10;
		@Pc(12) int local12 = this.aClass1_Sub18_2.method2156();
		this.anInt1938 = this.aClass1_Sub18_2.method2156();
		this.anInt1937 = 500000;
		this.anIntArray270 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub18_2.method2185();
			@Pc(38) int local38 = this.aClass1_Sub18_2.method2185();
			if (local33 == 1297379947) {
				this.anIntArray270[local27] = this.aClass1_Sub18_2.anInt3078;
				local27++;
			}
			this.aClass1_Sub18_2.anInt3078 += local38;
		}
		this.aLong54 = 0L;
		this.anIntArray273 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray273[local33] = this.anIntArray270[local33];
		}
		this.anIntArray271 = new int[local12];
		this.anIntArray272 = new int[local12];
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "()Z")
	public boolean method1328() {
		return this.aClass1_Sub18_2.aByteArray96 != null;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	private int method1329(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub18_2.aByteArray96[this.aClass1_Sub18_2.anInt3078];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray272[arg0] = local13;
			this.aClass1_Sub18_2.anInt3078++;
		} else {
			local13 = this.anIntArray272[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1322(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub18_2.method2172();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub18_2.aByteArray96[this.aClass1_Sub18_2.anInt3078] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub18_2.anInt3078++;
				this.anIntArray272[arg0] = local57;
				return this.method1322(arg0, local57);
			}
		}
		this.aClass1_Sub18_2.anInt3078 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
	public int method1330() {
		@Pc(3) int local3 = this.anIntArray273.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray273[local9] >= 0 && this.anIntArray271[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray271[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()V")
	public void method1331() {
		this.aClass1_Sub18_2.aByteArray96 = null;
		this.anIntArray270 = null;
		this.anIntArray273 = null;
		this.anIntArray271 = null;
		this.anIntArray272 = null;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "()V")
	public void method1332() {
		this.aClass1_Sub18_2.anInt3078 = -1;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public void method1333(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub18_2.method2172();
		this.anIntArray271[arg0] += local4;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public void method1334(@OriginalArg(0) int arg0) {
		this.aClass1_Sub18_2.anInt3078 = this.anIntArray273[arg0];
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)J")
	public long method1335(@OriginalArg(0) int arg0) {
		return this.aLong54 + (long) arg0 * (long) this.anInt1937;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(J)V")
	public void method1336(@OriginalArg(0) long arg0) {
		this.aLong54 = arg0;
		@Pc(6) int local6 = this.anIntArray273.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray271[local8] = 0;
			this.anIntArray272[local8] = 0;
			this.aClass1_Sub18_2.anInt3078 = this.anIntArray270[local8];
			this.method1333(local8);
			this.anIntArray273[local8] = this.aClass1_Sub18_2.anInt3078;
		}
	}

	@OriginalMember(owner = "client!me", name = "g", descriptor = "()I")
	public int method1337() {
		return this.anIntArray273.length;
	}
}

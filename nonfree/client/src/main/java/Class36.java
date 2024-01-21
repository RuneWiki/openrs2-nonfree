import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class36 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public int anInt1561;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	private int anInt1562;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!hd;")
	private final Class3_Sub8 aClass3_Sub8_3 = new Class3_Sub8(null);

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class36() {
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class36(@OriginalArg(0) byte[] arg0) {
		this.method1237(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public void method1229(@OriginalArg(0) int arg0) {
		this.anIntArray273[arg0] = this.aClass3_Sub8_3.anInt1948;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public boolean method1231() {
		@Pc(3) int local3 = this.anIntArray273.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray273[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	public void method1232() {
		this.aClass3_Sub8_3.anInt1948 = -1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(J)V")
	public void method1233(@OriginalArg(0) long arg0) {
		this.aLong52 = arg0;
		@Pc(6) int local6 = this.anIntArray273.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray275[local8] = 0;
			this.anIntArray276[local8] = 0;
			this.aClass3_Sub8_3.anInt1948 = this.anIntArray274[local8];
			this.method1240(local8);
			this.anIntArray273[local8] = this.aClass3_Sub8_3.anInt1948;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public boolean method1234() {
		return this.aClass3_Sub8_3.aByteArray19 != null;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
	public int method1235() {
		@Pc(3) int local3 = this.anIntArray273.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray273[local9] >= 0 && this.anIntArray275[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray275[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public void method1236() {
		this.aClass3_Sub8_3.aByteArray19 = null;
		this.anIntArray274 = null;
		this.anIntArray273 = null;
		this.anIntArray275 = null;
		this.anIntArray276 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([B)V")
	public void method1237(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub8_3.aByteArray19 = arg0;
		this.aClass3_Sub8_3.anInt1948 = 10;
		@Pc(12) int local12 = this.aClass3_Sub8_3.method1510();
		this.anInt1561 = this.aClass3_Sub8_3.method1510();
		this.anInt1562 = 500000;
		this.anIntArray274 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub8_3.method1540();
			@Pc(38) int local38 = this.aClass3_Sub8_3.method1540();
			if (local33 == 1297379947) {
				this.anIntArray274[local27] = this.aClass3_Sub8_3.anInt1948;
				local27++;
			}
			this.aClass3_Sub8_3.anInt1948 += local38;
		}
		this.aLong52 = 0L;
		this.anIntArray273 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray273[local33] = this.anIntArray274[local33];
		}
		this.anIntArray275 = new int[local12];
		this.anIntArray276 = new int[local12];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	private int method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static56.aByteArray16[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub8_3.method1545() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub8_3.method1545() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub8_3.method1545();
		local12 = this.aClass3_Sub8_3.method1519();
		if (local7 == 47) {
			this.aClass3_Sub8_3.anInt1948 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub8_3.method1554();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray275[arg0];
			this.aLong52 += (long) local38 * (long) (this.anInt1562 - local32);
			this.anInt1562 = local32;
			this.aClass3_Sub8_3.anInt1948 += local12;
			return 2;
		} else {
			this.aClass3_Sub8_3.anInt1948 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
	public int method1239(@OriginalArg(0) int arg0) {
		return this.method1243(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public void method1240(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub8_3.method1519();
		this.anIntArray275[arg0] += local4;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()I")
	public int method1241() {
		return this.anIntArray273.length;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)J")
	public long method1242(@OriginalArg(0) int arg0) {
		return this.aLong52 + (long) arg0 * (long) this.anInt1562;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)I")
	private int method1243(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub8_3.aByteArray19[this.aClass3_Sub8_3.anInt1948];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray276[arg0] = local13;
			this.aClass3_Sub8_3.anInt1948++;
		} else {
			local13 = this.anIntArray276[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1238(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub8_3.method1519();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub8_3.aByteArray19[this.aClass3_Sub8_3.anInt1948] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub8_3.anInt1948++;
				this.anIntArray276[arg0] = local57;
				return this.method1238(arg0, local57);
			}
		}
		this.aClass3_Sub8_3.anInt1948 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public void method1244(@OriginalArg(0) int arg0) {
		this.aClass3_Sub8_3.anInt1948 = this.anIntArray273[arg0];
	}
}

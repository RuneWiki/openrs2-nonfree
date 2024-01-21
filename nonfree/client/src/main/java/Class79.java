import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class79 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	private int anInt3264;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt3265;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!ce;")
	private final Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4(null);

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class79() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class79(@OriginalArg(0) byte[] arg0) {
		this.method2373(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method2367(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub4_5.method1256();
		this.anIntArray238[arg0] += local4;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	private int method2368(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub4_5.aByteArray12[this.aClass3_Sub4_5.anInt1758];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray240[arg0] = local13;
			this.aClass3_Sub4_5.anInt1758++;
		} else {
			local13 = this.anIntArray240[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2370(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub4_5.method1256();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub4_5.aByteArray12[this.aClass3_Sub4_5.anInt1758] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub4_5.anInt1758++;
				this.anIntArray240[arg0] = local57;
				return this.method2370(arg0, local57);
			}
		}
		this.aClass3_Sub4_5.anInt1758 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	private int method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static158.aByteArray33[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub4_5.method1278() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub4_5.method1278() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub4_5.method1278();
		local12 = this.aClass3_Sub4_5.method1256();
		if (local7 == 47) {
			this.aClass3_Sub4_5.anInt1758 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub4_5.method1271();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray238[arg0];
			this.aLong99 += (long) local38 * (long) (this.anInt3264 - local32);
			this.anInt3264 = local32;
			this.aClass3_Sub4_5.anInt1758 += local12;
			return 2;
		} else {
			this.aClass3_Sub4_5.anInt1758 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	public void method2371(@OriginalArg(0) int arg0) {
		this.anIntArray241[arg0] = this.aClass3_Sub4_5.anInt1758;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	public void method2372() {
		this.aClass3_Sub4_5.anInt1758 = -1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
	public void method2373(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub4_5.aByteArray12 = arg0;
		this.aClass3_Sub4_5.anInt1758 = 10;
		@Pc(12) int local12 = this.aClass3_Sub4_5.method1270();
		this.anInt3265 = this.aClass3_Sub4_5.method1270();
		this.anInt3264 = 500000;
		this.anIntArray239 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub4_5.method1245();
			@Pc(38) int local38 = this.aClass3_Sub4_5.method1245();
			if (local33 == 1297379947) {
				this.anIntArray239[local27] = this.aClass3_Sub4_5.anInt1758;
				local27++;
			}
			this.aClass3_Sub4_5.anInt1758 += local38;
		}
		this.aLong99 = 0L;
		this.anIntArray241 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray241[local33] = this.anIntArray239[local33];
		}
		this.anIntArray238 = new int[local12];
		this.anIntArray240 = new int[local12];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
	public void method2374(@OriginalArg(0) long arg0) {
		this.aLong99 = arg0;
		@Pc(6) int local6 = this.anIntArray241.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray238[local8] = 0;
			this.anIntArray240[local8] = 0;
			this.aClass3_Sub4_5.anInt1758 = this.anIntArray239[local8];
			this.method2367(local8);
			this.anIntArray241[local8] = this.aClass3_Sub4_5.anInt1758;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()Z")
	public boolean method2375() {
		@Pc(3) int local3 = this.anIntArray241.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray241[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	public int method2376() {
		@Pc(3) int local3 = this.anIntArray241.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray241[local9] >= 0 && this.anIntArray238[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray238[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()Z")
	public boolean method2377() {
		return this.aClass3_Sub4_5.aByteArray12 != null;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)J")
	public long method2378(@OriginalArg(0) int arg0) {
		return this.aLong99 + (long) arg0 * (long) this.anInt3264;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()V")
	public void method2379() {
		this.aClass3_Sub4_5.aByteArray12 = null;
		this.anIntArray239 = null;
		this.anIntArray241 = null;
		this.anIntArray238 = null;
		this.anIntArray240 = null;
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()I")
	public int method2380() {
		return this.anIntArray241.length;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
	public int method2381(@OriginalArg(0) int arg0) {
		return this.method2368(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	public void method2382(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_5.anInt1758 = this.anIntArray241[arg0];
	}
}

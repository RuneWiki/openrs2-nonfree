import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class146 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
	private int[] anIntArray282;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public int anInt3945;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
	private int anInt3946;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Lclient!ae;")
	private final Class6_Sub1 aClass6_Sub1_2 = new Class6_Sub1(null);

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class146() {
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "([B)V")
	public Class146(@OriginalArg(0) byte[] arg0) {
		this.method3271(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
	public void method3265() {
		this.aClass6_Sub1_2.anInt7898 = -1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)I")
	private int method3266(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub1_2.aByteArray96[this.aClass6_Sub1_2.anInt7898];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray282[arg0] = local13;
			this.aClass6_Sub1_2.anInt7898++;
		} else {
			local13 = this.anIntArray282[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3277(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub1_2.method6460();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub1_2.aByteArray96[this.aClass6_Sub1_2.anInt7898] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub1_2.anInt7898++;
				this.anIntArray282[arg0] = local57;
				return this.method3277(arg0, local57);
			}
		}
		this.aClass6_Sub1_2.anInt7898 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public void method3267(@OriginalArg(0) int arg0) {
		this.anIntArray281[arg0] = this.aClass6_Sub1_2.anInt7898;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public void method3268(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub1_2.method6460();
		this.anIntArray284[arg0] += local4;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V")
	public void method3269(@OriginalArg(0) int arg0) {
		this.aClass6_Sub1_2.anInt7898 = this.anIntArray281[arg0];
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "()Z")
	public boolean method3270() {
		@Pc(3) int local3 = this.anIntArray281.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray281[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "([B)V")
	public void method3271(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub1_2.aByteArray96 = arg0;
		this.aClass6_Sub1_2.anInt7898 = 10;
		@Pc(12) int local12 = this.aClass6_Sub1_2.method6485();
		this.anInt3945 = this.aClass6_Sub1_2.method6485();
		this.anInt3946 = 500000;
		this.anIntArray283 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub1_2.method6442();
			@Pc(38) int local38 = this.aClass6_Sub1_2.method6442();
			if (local33 == 1297379947) {
				this.anIntArray283[local27] = this.aClass6_Sub1_2.anInt7898;
				local27++;
			}
			this.aClass6_Sub1_2.anInt7898 += local38;
		}
		this.aLong120 = 0L;
		this.anIntArray281 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray281[local33] = this.anIntArray283[local33];
		}
		this.anIntArray284 = new int[local12];
		this.anIntArray282 = new int[local12];
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)J")
	public long method3272(@OriginalArg(0) int arg0) {
		return this.aLong120 + (long) arg0 * (long) this.anInt3946;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()I")
	public int method3273() {
		@Pc(3) int local3 = this.anIntArray281.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray281[local9] >= 0 && this.anIntArray284[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray284[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "()I")
	public int method3274() {
		return this.anIntArray281.length;
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)I")
	public int method3275(@OriginalArg(0) int arg0) {
		return this.method3266(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "()Z")
	public boolean method3276() {
		return this.aClass6_Sub1_2.aByteArray96 != null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I")
	private int method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static218.aByteArray48[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub1_2.method6433() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub1_2.method6433() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub1_2.method6433();
		local12 = this.aClass6_Sub1_2.method6460();
		if (local7 == 47) {
			this.aClass6_Sub1_2.anInt7898 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub1_2.method6435();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray284[arg0];
			this.aLong120 += (long) local38 * (long) (this.anInt3946 - local32);
			this.anInt3946 = local32;
			this.aClass6_Sub1_2.anInt7898 += local12;
			return 2;
		} else {
			this.aClass6_Sub1_2.anInt7898 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V")
	public void method3278(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
		@Pc(6) int local6 = this.anIntArray281.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray284[local8] = 0;
			this.anIntArray282[local8] = 0;
			this.aClass6_Sub1_2.anInt7898 = this.anIntArray283[local8];
			this.method3268(local8);
			this.anIntArray281[local8] = this.aClass6_Sub1_2.anInt7898;
		}
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "()V")
	public void method3280() {
		this.aClass6_Sub1_2.aByteArray96 = null;
		this.anIntArray283 = null;
		this.anIntArray281 = null;
		this.anIntArray284 = null;
		this.anIntArray282 = null;
	}
}

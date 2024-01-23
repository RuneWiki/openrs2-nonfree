import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class39 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	private int anInt1198;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "Lclient!qm;")
	private Class1_Sub14 aClass1_Sub14_3 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	public Class39() {
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([B)V")
	public Class39(@OriginalArg(0) byte[] arg0) {
		this.method1006(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I")
	private int method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static52.aByteArray42[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_3.method2199() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_3.method2199() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_3.method2199();
		local12 = this.aClass1_Sub14_3.method2190();
		if (local7 == 47) {
			this.aClass1_Sub14_3.anInt3000 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_3.method2215();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray152[arg0];
			this.aLong52 += (long) local38 * (long) (this.anInt1198 - local32);
			this.anInt1198 = local32;
			this.aClass1_Sub14_3.anInt3000 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_3.anInt3000 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method994(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_3.method2190();
		this.anIntArray152[arg0] += local4;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()I")
	public int method995() {
		return this.anIntArray153.length;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "()I")
	public int method996() {
		@Pc(3) int local3 = this.anIntArray153.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray153[local9] >= 0 && this.anIntArray152[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray152[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I")
	private int method997(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_3.aByteArray55[this.aClass1_Sub14_3.anInt3000];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray154[arg0] = local13;
			this.aClass1_Sub14_3.anInt3000++;
		} else {
			local13 = this.anIntArray154[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method993(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_3.method2190();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_3.aByteArray55[this.aClass1_Sub14_3.anInt3000] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_3.anInt3000++;
				this.anIntArray154[arg0] = local57;
				return this.method993(arg0, local57);
			}
		}
		this.aClass1_Sub14_3.anInt3000 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "()V")
	public void method998() {
		this.aClass1_Sub14_3.anInt3000 = -1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(J)V")
	public void method1000(@OriginalArg(0) long arg0) {
		this.aLong52 = arg0;
		@Pc(6) int local6 = this.anIntArray153.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray152[local8] = 0;
			this.anIntArray154[local8] = 0;
			this.aClass1_Sub14_3.anInt3000 = this.anIntArray151[local8];
			this.method994(local8);
			this.anIntArray153[local8] = this.aClass1_Sub14_3.anInt3000;
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I")
	public int method1001(@OriginalArg(0) int arg0) {
		return this.method997(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public void method1002(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_3.anInt3000 = this.anIntArray153[arg0];
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "()V")
	public void method1003() {
		this.aClass1_Sub14_3.aByteArray55 = null;
		this.anIntArray151 = null;
		this.anIntArray153 = null;
		this.anIntArray152 = null;
		this.anIntArray154 = null;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	public void method1004(@OriginalArg(0) int arg0) {
		this.anIntArray153[arg0] = this.aClass1_Sub14_3.anInt3000;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)J")
	public long method1005(@OriginalArg(0) int arg0) {
		return this.aLong52 + (long) arg0 * (long) this.anInt1198;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([B)V")
	public void method1006(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_3.aByteArray55 = arg0;
		this.aClass1_Sub14_3.anInt3000 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_3.method2244();
		this.anInt1199 = this.aClass1_Sub14_3.method2244();
		this.anInt1198 = 500000;
		this.anIntArray151 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub14_3.method2194();
			@Pc(40) int local40 = this.aClass1_Sub14_3.method2194();
			if (local35 == 1297379947) {
				this.anIntArray151[local27] = this.aClass1_Sub14_3.anInt3000;
				local27++;
			}
			this.aClass1_Sub14_3.anInt3000 += local40;
		}
		this.aLong52 = 0L;
		this.anIntArray153 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray153[local27] = this.anIntArray151[local27];
		}
		this.anIntArray152 = new int[local12];
		this.anIntArray154 = new int[local12];
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "()Z")
	public boolean method1007() {
		@Pc(3) int local3 = this.anIntArray153.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray153[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "()Z")
	public boolean method1008() {
		return this.aClass1_Sub14_3.aByteArray55 != null;
	}
}

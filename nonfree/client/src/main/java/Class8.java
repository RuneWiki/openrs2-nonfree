import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class8 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!hp;")
	private final Class1_Sub5 aClass1_Sub5_1 = new Class1_Sub5(null);

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class8() {
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "([B)V")
	public Class8(@OriginalArg(0) byte[] arg0) {
		this.method347(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "()I")
	public int method334() {
		@Pc(3) int local3 = this.anIntArray23.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray23[local9] >= 0 && this.anIntArray26[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray26[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "()Z")
	public boolean method335() {
		@Pc(3) int local3 = this.anIntArray23.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray23[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method336(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub5_1.method5377();
		this.anIntArray26[arg0] += local4;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J")
	public long method337(@OriginalArg(0) int arg0) {
		return this.aLong17 + (long) arg0 * (long) this.anInt364;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "()V")
	public void method338() {
		this.aClass1_Sub5_1.aByteArray89 = null;
		this.anIntArray25 = null;
		this.anIntArray23 = null;
		this.anIntArray26 = null;
		this.anIntArray24 = null;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)I")
	private int method339(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub5_1.aByteArray89[this.aClass1_Sub5_1.anInt6475];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray24[arg0] = local13;
			this.aClass1_Sub5_1.anInt6475++;
		} else {
			local13 = this.anIntArray24[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method341(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub5_1.method5377();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub5_1.aByteArray89[this.aClass1_Sub5_1.anInt6475] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub5_1.anInt6475++;
				this.anIntArray24[arg0] = local57;
				return this.method341(arg0, local57);
			}
		}
		this.aClass1_Sub5_1.anInt6475 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "()I")
	public int method340() {
		return this.anIntArray23.length;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
	private int method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static11.aByteArray6[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub5_1.method5366() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub5_1.method5366() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub5_1.method5366();
		local12 = this.aClass1_Sub5_1.method5377();
		if (local7 == 47) {
			this.aClass1_Sub5_1.anInt6475 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub5_1.method5399();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray26[arg0];
			this.aLong17 += (long) local38 * (long) (this.anInt364 - local32);
			this.anInt364 = local32;
			this.aClass1_Sub5_1.anInt6475 += local12;
			return 2;
		} else {
			this.aClass1_Sub5_1.anInt6475 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(J)V")
	public void method342(@OriginalArg(0) long arg0) {
		this.aLong17 = arg0;
		@Pc(6) int local6 = this.anIntArray23.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray26[local8] = 0;
			this.anIntArray24[local8] = 0;
			this.aClass1_Sub5_1.anInt6475 = this.anIntArray25[local8];
			this.method336(local8);
			this.anIntArray23[local8] = this.aClass1_Sub5_1.anInt6475;
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
	public void method343(@OriginalArg(0) int arg0) {
		this.anIntArray23[arg0] = this.aClass1_Sub5_1.anInt6475;
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)I")
	public int method344(@OriginalArg(0) int arg0) {
		return this.method339(arg0);
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "()V")
	public void method345() {
		this.aClass1_Sub5_1.anInt6475 = -1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([B)V")
	public void method347(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub5_1.aByteArray89 = arg0;
		this.aClass1_Sub5_1.anInt6475 = 10;
		@Pc(12) int local12 = this.aClass1_Sub5_1.method5362();
		this.anInt365 = this.aClass1_Sub5_1.method5362();
		this.anInt364 = 500000;
		this.anIntArray25 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub5_1.method5407();
			@Pc(38) int local38 = this.aClass1_Sub5_1.method5407();
			if (local33 == 1297379947) {
				this.anIntArray25[local27] = this.aClass1_Sub5_1.anInt6475;
				local27++;
			}
			this.aClass1_Sub5_1.anInt6475 += local38;
		}
		this.aLong17 = 0L;
		this.anIntArray23 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray23[local33] = this.anIntArray25[local33];
		}
		this.anIntArray26 = new int[local12];
		this.anIntArray24 = new int[local12];
	}

	@OriginalMember(owner = "client!al", name = "g", descriptor = "()Z")
	public boolean method348() {
		return this.aClass1_Sub5_1.aByteArray89 != null;
	}

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
	public void method349(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_1.anInt6475 = this.anIntArray23[arg0];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class136 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
	private int[] anIntArray369;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	private int[] anIntArray370;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt3331;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	public int anInt3332;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!lk;")
	private final Class2_Sub13 aClass2_Sub13_10 = new Class2_Sub13(null);

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class136() {
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([B)V")
	public Class136(@OriginalArg(0) byte[] arg0) {
		this.method3035(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public void method3024() {
		this.aClass2_Sub13_10.aByteArray77 = null;
		this.anIntArray370 = null;
		this.anIntArray369 = null;
		this.anIntArray372 = null;
		this.anIntArray371 = null;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()Z")
	public boolean method3025() {
		@Pc(3) int local3 = this.anIntArray369.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray369[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J")
	public long method3027(@OriginalArg(0) int arg0) {
		return this.aLong109 + (long) arg0 * (long) this.anInt3331;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	private int method3028(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub13_10.aByteArray77[this.aClass2_Sub13_10.anInt4788];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray371[arg0] = local13;
			this.aClass2_Sub13_10.anInt4788++;
		} else {
			local13 = this.anIntArray371[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3038(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub13_10.method4213();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub13_10.aByteArray77[this.aClass2_Sub13_10.anInt4788] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub13_10.anInt4788++;
				this.anIntArray371[arg0] = local57;
				return this.method3038(arg0, local57);
			}
		}
		this.aClass2_Sub13_10.anInt4788 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()V")
	public void method3029() {
		this.aClass2_Sub13_10.anInt4788 = -1;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "()Z")
	public boolean method3030() {
		return this.aClass2_Sub13_10.aByteArray77 != null;
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "()I")
	public int method3031() {
		@Pc(3) int local3 = this.anIntArray369.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray369[local9] >= 0 && this.anIntArray372[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray372[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(J)V")
	public void method3032(@OriginalArg(0) long arg0) {
		this.aLong109 = arg0;
		@Pc(6) int local6 = this.anIntArray369.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray372[local8] = 0;
			this.anIntArray371[local8] = 0;
			this.aClass2_Sub13_10.anInt4788 = this.anIntArray370[local8];
			this.method3036(local8);
			this.anIntArray369[local8] = this.aClass2_Sub13_10.anInt4788;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public void method3033(@OriginalArg(0) int arg0) {
		this.anIntArray369[arg0] = this.aClass2_Sub13_10.anInt4788;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public void method3034(@OriginalArg(0) int arg0) {
		this.aClass2_Sub13_10.anInt4788 = this.anIntArray369[arg0];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([B)V")
	public void method3035(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub13_10.aByteArray77 = arg0;
		this.aClass2_Sub13_10.anInt4788 = 10;
		@Pc(12) int local12 = this.aClass2_Sub13_10.method4245();
		this.anInt3332 = this.aClass2_Sub13_10.method4245();
		this.anInt3331 = 500000;
		this.anIntArray370 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub13_10.method4239();
			@Pc(38) int local38 = this.aClass2_Sub13_10.method4239();
			if (local33 == 1297379947) {
				this.anIntArray370[local27] = this.aClass2_Sub13_10.anInt4788;
				local27++;
			}
			this.aClass2_Sub13_10.anInt4788 += local38;
		}
		this.aLong109 = 0L;
		this.anIntArray369 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray369[local33] = this.anIntArray370[local33];
		}
		this.anIntArray372 = new int[local12];
		this.anIntArray371 = new int[local12];
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
	public void method3036(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub13_10.method4213();
		this.anIntArray372[arg0] += local4;
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()I")
	public int method3037() {
		return this.anIntArray369.length;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	private int method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static188.aByteArray54[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub13_10.method4240() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub13_10.method4240() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub13_10.method4240();
		local12 = this.aClass2_Sub13_10.method4213();
		if (local7 == 47) {
			this.aClass2_Sub13_10.anInt4788 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub13_10.method4235();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray372[arg0];
			this.aLong109 += (long) local38 * (long) (this.anInt3331 - local32);
			this.anInt3331 = local32;
			this.aClass2_Sub13_10.anInt4788 += local12;
			return 2;
		} else {
			this.aClass2_Sub13_10.anInt4788 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)I")
	public int method3039(@OriginalArg(0) int arg0) {
		return this.method3028(arg0);
	}
}

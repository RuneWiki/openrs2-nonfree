import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class15 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!jg;")
	private final Class1_Sub8 aClass1_Sub8_2 = new Class1_Sub8(null);

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "([B)V")
	public Class15(@OriginalArg(0) byte[] arg0) {
		this.method507(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
	public long method499(@OriginalArg(0) int arg0) {
		return this.aLong26 + (long) arg0 * (long) this.anInt866;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public void method500() {
		this.aClass1_Sub8_2.anInt1357 = -1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	public boolean method501() {
		return this.aClass1_Sub8_2.aByteArray12 != null;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public void method502(@OriginalArg(0) int arg0) {
		this.anIntArray110[arg0] = this.aClass1_Sub8_2.anInt1357;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public void method503() {
		this.aClass1_Sub8_2.aByteArray12 = null;
		this.anIntArray112 = null;
		this.anIntArray110 = null;
		this.anIntArray113 = null;
		this.anIntArray111 = null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
	public int method504(@OriginalArg(0) int arg0) {
		return this.method510(arg0);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public void method505(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub8_2.method859();
		this.anIntArray113[arg0] += local4;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	public void method506(@OriginalArg(0) int arg0) {
		this.aClass1_Sub8_2.anInt1357 = this.anIntArray110[arg0];
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([B)V")
	public void method507(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub8_2.aByteArray12 = arg0;
		this.aClass1_Sub8_2.anInt1357 = 10;
		@Pc(12) int local12 = this.aClass1_Sub8_2.method878();
		this.anInt865 = this.aClass1_Sub8_2.method878();
		this.anInt866 = 500000;
		this.anIntArray112 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub8_2.method868();
			@Pc(38) int local38 = this.aClass1_Sub8_2.method868();
			if (local33 == 1297379947) {
				this.anIntArray112[local27] = this.aClass1_Sub8_2.anInt1357;
				local27++;
			}
			this.aClass1_Sub8_2.anInt1357 += local38;
		}
		this.aLong26 = 0L;
		this.anIntArray110 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray110[local33] = this.anIntArray112[local33];
		}
		this.anIntArray113 = new int[local12];
		this.anIntArray111 = new int[local12];
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
	public int method508() {
		return this.anIntArray110.length;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	public boolean method509() {
		@Pc(3) int local3 = this.anIntArray110.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray110[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)I")
	private int method510(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub8_2.aByteArray12[this.aClass1_Sub8_2.anInt1357];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray111[arg0] = local13;
			this.aClass1_Sub8_2.anInt1357++;
		} else {
			local13 = this.anIntArray111[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method514(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub8_2.method859();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub8_2.aByteArray12[this.aClass1_Sub8_2.anInt1357] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub8_2.anInt1357++;
				this.anIntArray111[arg0] = local57;
				return this.method514(arg0, local57);
			}
		}
		this.aClass1_Sub8_2.anInt1357 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(J)V")
	public void method512(@OriginalArg(0) long arg0) {
		this.aLong26 = arg0;
		@Pc(6) int local6 = this.anIntArray110.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray113[local8] = 0;
			this.anIntArray111[local8] = 0;
			this.aClass1_Sub8_2.anInt1357 = this.anIntArray112[local8];
			this.method505(local8);
			this.anIntArray110[local8] = this.aClass1_Sub8_2.anInt1357;
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()I")
	public int method513() {
		@Pc(3) int local3 = this.anIntArray110.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray110[local9] >= 0 && this.anIntArray113[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray113[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	private int method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static28.aByteArray4[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub8_2.method861() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub8_2.method861() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub8_2.method861();
		local12 = this.aClass1_Sub8_2.method859();
		if (local7 == 47) {
			this.aClass1_Sub8_2.anInt1357 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub8_2.method888();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray113[arg0];
			this.aLong26 += (long) local38 * (long) (this.anInt866 - local32);
			this.anInt866 = local32;
			this.aClass1_Sub8_2.anInt1357 += local12;
			return 2;
		} else {
			this.aClass1_Sub8_2.anInt1357 += local12;
			return 3;
		}
	}
}

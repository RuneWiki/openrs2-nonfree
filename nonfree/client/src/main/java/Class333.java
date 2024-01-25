import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class333 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "J")
	private long aLong281;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "[I")
	private int[] anIntArray641;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "[I")
	private int[] anIntArray642;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "[I")
	private int[] anIntArray643;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "I")
	private int anInt8901;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "[I")
	public int[] anIntArray644;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
	public int anInt8902;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "Lclient!et;")
	private final Class2_Sub20 aClass2_Sub20_11 = new Class2_Sub20((byte[]) null);

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class333() {
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "([B)V")
	public Class333(@OriginalArg(0) byte[] arg0) {
		this.method7875(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
	public void method7866(@OriginalArg(0) int arg0) {
		this.anIntArray643[arg0] = this.aClass2_Sub20_11.anInt9723;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)V")
	public void method7867(@OriginalArg(0) int arg0) {
		this.aClass2_Sub20_11.anInt9723 = this.anIntArray643[arg0];
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)I")
	public int method7868(@OriginalArg(0) int arg0) {
		return this.method7881(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "()Z")
	public boolean method7869() {
		@Pc(3) int local3 = this.anIntArray643.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray643[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "()I")
	public int method7870() {
		@Pc(3) int local3 = this.anIntArray643.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray643[local9] >= 0 && this.anIntArray644[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray644[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "()I")
	public int method7871() {
		return this.anIntArray643.length;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)I")
	private int method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static568.aByteArray103[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub20_11.method8581(-17416) << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub20_11.method8581(-17416) << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub20_11.method8581(-17416);
		local12 = this.aClass2_Sub20_11.method8545();
		if (local7 == 47) {
			this.aClass2_Sub20_11.anInt9723 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub20_11.method8583();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray644[arg0];
			this.aLong281 += (long) local38 * (long) (this.anInt8901 - local32);
			this.anInt8901 = local32;
			this.aClass2_Sub20_11.anInt9723 += local12;
			return 2;
		} else {
			this.aClass2_Sub20_11.anInt9723 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)J")
	public long method7873(@OriginalArg(0) int arg0) {
		return this.aLong281 + (long) arg0 * (long) this.anInt8901;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([B)V")
	public void method7875(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub20_11.aByteArray111 = arg0;
		this.aClass2_Sub20_11.anInt9723 = 10;
		@Pc(12) int local12 = this.aClass2_Sub20_11.method8575();
		this.anInt8902 = this.aClass2_Sub20_11.method8575();
		this.anInt8901 = 500000;
		this.anIntArray641 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub20_11.method8555(-9372);
			@Pc(38) int local38 = this.aClass2_Sub20_11.method8555(-9372);
			if (local33 == 1297379947) {
				this.anIntArray641[local27] = this.aClass2_Sub20_11.anInt9723;
				local27++;
			}
			this.aClass2_Sub20_11.anInt9723 += local38;
		}
		this.aLong281 = 0L;
		this.anIntArray643 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray643[local33] = this.anIntArray641[local33];
		}
		this.anIntArray644 = new int[local12];
		this.anIntArray642 = new int[local12];
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V")
	public void method7876(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub20_11.method8545();
		this.anIntArray644[arg0] += local4;
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "()Z")
	public boolean method7877() {
		return this.aClass2_Sub20_11.aByteArray111 != null;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "()V")
	public void method7878() {
		this.aClass2_Sub20_11.anInt9723 = -1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(J)V")
	public void method7879(@OriginalArg(0) long arg0) {
		this.aLong281 = arg0;
		@Pc(6) int local6 = this.anIntArray643.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray644[local8] = 0;
			this.anIntArray642[local8] = 0;
			this.aClass2_Sub20_11.anInt9723 = this.anIntArray641[local8];
			this.method7876(local8);
			this.anIntArray643[local8] = this.aClass2_Sub20_11.anInt9723;
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "()V")
	public void method7880() {
		this.aClass2_Sub20_11.aByteArray111 = null;
		this.anIntArray641 = null;
		this.anIntArray643 = null;
		this.anIntArray644 = null;
		this.anIntArray642 = null;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)I")
	private int method7881(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub20_11.aByteArray111[this.aClass2_Sub20_11.anInt9723];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray642[arg0] = local13;
			this.aClass2_Sub20_11.anInt9723++;
		} else {
			local13 = this.anIntArray642[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7872(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub20_11.method8545();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub20_11.aByteArray111[this.aClass2_Sub20_11.anInt9723] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub20_11.anInt9723++;
				this.anIntArray642[arg0] = local57;
				return this.method7872(arg0, local57);
			}
		}
		this.aClass2_Sub20_11.anInt9723 += local42;
		return 0;
	}
}

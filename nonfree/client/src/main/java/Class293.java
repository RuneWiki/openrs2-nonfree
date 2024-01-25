import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class293 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public int anInt8992;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt8993;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!cea;")
	private final Class2_Sub11 aClass2_Sub11_7 = new Class2_Sub11(null);

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class293() {
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
	public Class293(@OriginalArg(0) byte[] arg0) {
		this.method7532(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()Z")
	public boolean method7530() {
		@Pc(3) int local3 = this.anIntArray580.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray580[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
	private int method7531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static484.aByteArray115[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub11_7.method8383() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub11_7.method8383() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub11_7.method8383();
		local12 = this.aClass2_Sub11_7.method8362();
		if (local7 == 47) {
			this.aClass2_Sub11_7.anInt10066 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub11_7.method8347();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray579[arg0];
			this.aLong222 += (long) local38 * (long) (this.anInt8993 - local32);
			this.anInt8993 = local32;
			this.aClass2_Sub11_7.anInt10066 += local12;
			return 2;
		} else {
			this.aClass2_Sub11_7.anInt10066 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
	public void method7532(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub11_7.aByteArray128 = arg0;
		this.aClass2_Sub11_7.anInt10066 = 10;
		@Pc(12) int local12 = this.aClass2_Sub11_7.method8326();
		this.anInt8992 = this.aClass2_Sub11_7.method8326();
		this.anInt8993 = 500000;
		this.anIntArray578 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub11_7.method8381();
			@Pc(38) int local38 = this.aClass2_Sub11_7.method8381();
			if (local33 == 1297379947) {
				this.anIntArray578[local27] = this.aClass2_Sub11_7.anInt10066;
				local27++;
			}
			this.aClass2_Sub11_7.anInt10066 += local38;
		}
		this.aLong222 = 0L;
		this.anIntArray580 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray580[local33] = this.anIntArray578[local33];
		}
		this.anIntArray579 = new int[local12];
		this.anIntArray577 = new int[local12];
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
	public int method7533() {
		return this.anIntArray580.length;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(J)V")
	public void method7534(@OriginalArg(0) long arg0) {
		this.aLong222 = arg0;
		@Pc(6) int local6 = this.anIntArray580.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray579[local8] = 0;
			this.anIntArray577[local8] = 0;
			this.aClass2_Sub11_7.anInt10066 = this.anIntArray578[local8];
			this.method7535(local8);
			this.anIntArray580[local8] = this.aClass2_Sub11_7.anInt10066;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method7535(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub11_7.method8362();
		this.anIntArray579[arg0] += local4;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method7536(@OriginalArg(0) int arg0) {
		this.anIntArray580[arg0] = this.aClass2_Sub11_7.anInt10066;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
	public void method7537() {
		this.aClass2_Sub11_7.aByteArray128 = null;
		this.anIntArray578 = null;
		this.anIntArray580 = null;
		this.anIntArray579 = null;
		this.anIntArray577 = null;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)J")
	public long method7538(@OriginalArg(0) int arg0) {
		return this.aLong222 + (long) arg0 * (long) this.anInt8993;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
	private int method7539(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub11_7.aByteArray128[this.aClass2_Sub11_7.anInt10066];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray577[arg0] = local13;
			this.aClass2_Sub11_7.anInt10066++;
		} else {
			local13 = this.anIntArray577[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method7531(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub11_7.method8362();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub11_7.aByteArray128[this.aClass2_Sub11_7.anInt10066] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub11_7.anInt10066++;
				this.anIntArray577[arg0] = local57;
				return this.method7531(arg0, local57);
			}
		}
		this.aClass2_Sub11_7.anInt10066 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()I")
	public int method7540() {
		@Pc(3) int local3 = this.anIntArray580.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray580[local9] >= 0 && this.anIntArray579[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray579[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "()Z")
	public boolean method7541() {
		return this.aClass2_Sub11_7.aByteArray128 != null;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
	public void method7542(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_7.anInt10066 = this.anIntArray580[arg0];
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I")
	public int method7544(@OriginalArg(0) int arg0) {
		return this.method7539(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "()V")
	public void method7545() {
		this.aClass2_Sub11_7.anInt10066 = -1;
	}
}

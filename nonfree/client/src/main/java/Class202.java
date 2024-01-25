import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class202 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	private int[] anIntArray584;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt5848;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
	private int[] anIntArray585;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt5849;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	private int[] anIntArray587;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!ge;")
	private final Class1_Sub6 aClass1_Sub6_7 = new Class1_Sub6(null);

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class202() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Class202(@OriginalArg(0) byte[] arg0) {
		this.method4977(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)J")
	public long method4964(@OriginalArg(0) int arg0) {
		return this.aLong244 + (long) arg0 * (long) this.anInt5849;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public void method4965() {
		this.aClass1_Sub6_7.aByteArray66 = null;
		this.anIntArray584 = null;
		this.anIntArray587 = null;
		this.anIntArray586 = null;
		this.anIntArray585 = null;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()Z")
	public boolean method4966() {
		@Pc(3) int local3 = this.anIntArray587.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray587[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
	public int method4967(@OriginalArg(0) int arg0) {
		return this.method4975(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public void method4968(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub6_7.method3958();
		this.anIntArray586[arg0] += local4;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
	public void method4969(@OriginalArg(0) long arg0) {
		this.aLong244 = arg0;
		@Pc(6) int local6 = this.anIntArray587.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray586[local8] = 0;
			this.anIntArray585[local8] = 0;
			this.aClass1_Sub6_7.anInt4555 = this.anIntArray584[local8];
			this.method4968(local8);
			this.anIntArray587[local8] = this.aClass1_Sub6_7.anInt4555;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public void method4970(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_7.anInt4555 = this.anIntArray587[arg0];
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	public void method4971() {
		this.aClass1_Sub6_7.anInt4555 = -1;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()I")
	public int method4972() {
		@Pc(3) int local3 = this.anIntArray587.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray587[local9] >= 0 && this.anIntArray586[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray586[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()Z")
	public boolean method4974() {
		return this.aClass1_Sub6_7.aByteArray66 != null;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
	private int method4975(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub6_7.aByteArray66[this.aClass1_Sub6_7.anInt4555];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray585[arg0] = local13;
			this.aClass1_Sub6_7.anInt4555++;
		} else {
			local13 = this.anIntArray585[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4978(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub6_7.method3958();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub6_7.aByteArray66[this.aClass1_Sub6_7.anInt4555] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub6_7.anInt4555++;
				this.anIntArray585[arg0] = local57;
				return this.method4978(arg0, local57);
			}
		}
		this.aClass1_Sub6_7.anInt4555 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()I")
	public int method4976() {
		return this.anIntArray587.length;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
	public void method4977(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub6_7.aByteArray66 = arg0;
		this.aClass1_Sub6_7.anInt4555 = 10;
		@Pc(12) int local12 = this.aClass1_Sub6_7.method3967();
		this.anInt5848 = this.aClass1_Sub6_7.method3967();
		this.anInt5849 = 500000;
		this.anIntArray584 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub6_7.method3925();
			@Pc(38) int local38 = this.aClass1_Sub6_7.method3925();
			if (local33 == 1297379947) {
				this.anIntArray584[local27] = this.aClass1_Sub6_7.anInt4555;
				local27++;
			}
			this.aClass1_Sub6_7.anInt4555 += local38;
		}
		this.aLong244 = 0L;
		this.anIntArray587 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray587[local33] = this.anIntArray584[local33];
		}
		this.anIntArray586 = new int[local12];
		this.anIntArray585 = new int[local12];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	private int method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static319.aByteArray93[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub6_7.method3922() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub6_7.method3922() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub6_7.method3922();
		local12 = this.aClass1_Sub6_7.method3958();
		if (local7 == 47) {
			this.aClass1_Sub6_7.anInt4555 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub6_7.method3920();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray586[arg0];
			this.aLong244 += (long) local38 * (long) (this.anInt5849 - local32);
			this.anInt5849 = local32;
			this.aClass1_Sub6_7.anInt4555 += local12;
			return 2;
		} else {
			this.aClass1_Sub6_7.anInt4555 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public void method4979(@OriginalArg(0) int arg0) {
		this.anIntArray587[arg0] = this.aClass1_Sub6_7.anInt4555;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class256 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	private int anInt7349;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!gw;")
	private final Class1_Sub13 aClass1_Sub13_7 = new Class1_Sub13(null);

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class256() {
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([B)V")
	public Class256(@OriginalArg(0) byte[] arg0) {
		this.method6260(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public void method6257(@OriginalArg(0) int arg0) {
		this.aClass1_Sub13_7.anInt3400 = this.anIntArray580[arg0];
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
	public void method6258() {
		this.aClass1_Sub13_7.anInt3400 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)J")
	public long method6259(@OriginalArg(0) int arg0) {
		return this.aLong188 + (long) arg0 * (long) this.anInt7349;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "([B)V")
	public void method6260(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub13_7.aByteArray45 = arg0;
		this.aClass1_Sub13_7.anInt3400 = 10;
		@Pc(12) int local12 = this.aClass1_Sub13_7.method3056();
		this.anInt7350 = this.aClass1_Sub13_7.method3056();
		this.anInt7349 = 500000;
		this.anIntArray578 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub13_7.method3037();
			@Pc(38) int local38 = this.aClass1_Sub13_7.method3037();
			if (local33 == 1297379947) {
				this.anIntArray578[local27] = this.aClass1_Sub13_7.anInt3400;
				local27++;
			}
			this.aClass1_Sub13_7.anInt3400 += local38;
		}
		this.aLong188 = 0L;
		this.anIntArray580 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray580[local33] = this.anIntArray578[local33];
		}
		this.anIntArray581 = new int[local12];
		this.anIntArray579 = new int[local12];
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)I")
	public int method6261(@OriginalArg(0) int arg0) {
		return this.method6265(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
	public void method6262(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub13_7.method3032();
		this.anIntArray581[arg0] += local4;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "()I")
	public int method6263() {
		return this.anIntArray580.length;
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)I")
	private int method6265(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub13_7.aByteArray45[this.aClass1_Sub13_7.anInt3400];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray579[arg0] = local13;
			this.aClass1_Sub13_7.anInt3400++;
		} else {
			local13 = this.anIntArray579[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6270(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub13_7.method3032();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub13_7.aByteArray45[this.aClass1_Sub13_7.anInt3400] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub13_7.anInt3400++;
				this.anIntArray579[arg0] = local57;
				return this.method6270(arg0, local57);
			}
		}
		this.aClass1_Sub13_7.anInt3400 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(J)V")
	public void method6266(@OriginalArg(0) long arg0) {
		this.aLong188 = arg0;
		@Pc(6) int local6 = this.anIntArray580.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray581[local8] = 0;
			this.anIntArray579[local8] = 0;
			this.aClass1_Sub13_7.anInt3400 = this.anIntArray578[local8];
			this.method6262(local8);
			this.anIntArray580[local8] = this.aClass1_Sub13_7.anInt3400;
		}
	}

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V")
	public void method6267(@OriginalArg(0) int arg0) {
		this.anIntArray580[arg0] = this.aClass1_Sub13_7.anInt3400;
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "()V")
	public void method6268() {
		this.aClass1_Sub13_7.aByteArray45 = null;
		this.anIntArray578 = null;
		this.anIntArray580 = null;
		this.anIntArray581 = null;
		this.anIntArray579 = null;
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "()Z")
	public boolean method6269() {
		@Pc(3) int local3 = this.anIntArray580.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray580[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)I")
	private int method6270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static421.aByteArray93[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub13_7.method3043() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub13_7.method3043() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub13_7.method3043();
		local12 = this.aClass1_Sub13_7.method3032();
		if (local7 == 47) {
			this.aClass1_Sub13_7.anInt3400 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub13_7.method3039();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray581[arg0];
			this.aLong188 += (long) local38 * (long) (this.anInt7349 - local32);
			this.anInt7349 = local32;
			this.aClass1_Sub13_7.anInt3400 += local12;
			return 2;
		} else {
			this.aClass1_Sub13_7.anInt3400 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "()I")
	public int method6271() {
		@Pc(3) int local3 = this.anIntArray580.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray580[local9] >= 0 && this.anIntArray581[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray581[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "()Z")
	public boolean method6272() {
		return this.aClass1_Sub13_7.aByteArray45 != null;
	}
}

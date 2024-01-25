import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class185 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	public int[] anIntArray348;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	private int anInt5945;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!ig;")
	private final Class8_Sub8 aClass8_Sub8_8 = new Class8_Sub8(null);

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class185() {
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "([B)V")
	public Class185(@OriginalArg(0) byte[] arg0) {
		this.method4872(arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public void method4865(@OriginalArg(0) int arg0) {
		this.aClass8_Sub8_8.anInt10588 = this.anIntArray349[arg0];
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "()I")
	public int method4867() {
		return this.anIntArray349.length;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
	public void method4868() {
		this.aClass8_Sub8_8.anInt10588 = -1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(J)V")
	public void method4869(@OriginalArg(0) long arg0) {
		this.aLong149 = arg0;
		@Pc(6) int local6 = this.anIntArray349.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray348[local8] = 0;
			this.anIntArray346[local8] = 0;
			this.aClass8_Sub8_8.anInt10588 = this.anIntArray347[local8];
			this.method4874(local8);
			this.anIntArray349[local8] = this.aClass8_Sub8_8.anInt10588;
		}
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "()Z")
	public boolean method4870() {
		return this.aClass8_Sub8_8.aByteArray107 != null;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I")
	private int method4871(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass8_Sub8_8.aByteArray107[this.aClass8_Sub8_8.anInt10588];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray346[arg0] = local13;
			this.aClass8_Sub8_8.anInt10588++;
		} else {
			local13 = this.anIntArray346[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4879(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass8_Sub8_8.method8580();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass8_Sub8_8.aByteArray107[this.aClass8_Sub8_8.anInt10588] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass8_Sub8_8.anInt10588++;
				this.anIntArray346[arg0] = local57;
				return this.method4879(arg0, local57);
			}
		}
		this.aClass8_Sub8_8.anInt10588 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([B)V")
	public void method4872(@OriginalArg(0) byte[] arg0) {
		this.aClass8_Sub8_8.aByteArray107 = arg0;
		this.aClass8_Sub8_8.anInt10588 = 10;
		@Pc(12) int local12 = this.aClass8_Sub8_8.method8578();
		this.anInt5946 = this.aClass8_Sub8_8.method8578();
		this.anInt5945 = 500000;
		this.anIntArray347 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass8_Sub8_8.method8540();
			@Pc(38) int local38 = this.aClass8_Sub8_8.method8540();
			if (local33 == 1297379947) {
				this.anIntArray347[local27] = this.aClass8_Sub8_8.anInt10588;
				local27++;
			}
			this.aClass8_Sub8_8.anInt10588 += local38;
		}
		this.aLong149 = 0L;
		this.anIntArray349 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray349[local33] = this.anIntArray347[local33];
		}
		this.anIntArray348 = new int[local12];
		this.anIntArray346 = new int[local12];
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "()I")
	public int method4873() {
		@Pc(3) int local3 = this.anIntArray349.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray349[local9] >= 0 && this.anIntArray348[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray348[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	public void method4874(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass8_Sub8_8.method8580();
		this.anIntArray348[arg0] += local4;
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)J")
	public long method4875(@OriginalArg(0) int arg0) {
		return this.aLong149 + (long) arg0 * (long) this.anInt5945;
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "()Z")
	public boolean method4876() {
		@Pc(3) int local3 = this.anIntArray349.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray349[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
	public void method4877(@OriginalArg(0) int arg0) {
		this.anIntArray349[arg0] = this.aClass8_Sub8_8.anInt10588;
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "()V")
	public void method4878() {
		this.aClass8_Sub8_8.aByteArray107 = null;
		this.anIntArray347 = null;
		this.anIntArray349 = null;
		this.anIntArray348 = null;
		this.anIntArray346 = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
	private int method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static293.aByteArray43[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass8_Sub8_8.method8525() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass8_Sub8_8.method8525() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass8_Sub8_8.method8525();
		local12 = this.aClass8_Sub8_8.method8580();
		if (local7 == 47) {
			this.aClass8_Sub8_8.anInt10588 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass8_Sub8_8.method8560();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray348[arg0];
			this.aLong149 += (long) local38 * (long) (this.anInt5945 - local32);
			this.anInt5945 = local32;
			this.aClass8_Sub8_8.anInt10588 += local12;
			return 2;
		} else {
			this.aClass8_Sub8_8.anInt10588 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)I")
	public int method4880(@OriginalArg(0) int arg0) {
		return this.method4871(arg0);
	}
}

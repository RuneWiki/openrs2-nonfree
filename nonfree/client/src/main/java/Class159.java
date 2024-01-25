import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class159 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public int anInt5142;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	private int anInt5143;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!rg;")
	private final Class6_Sub40 aClass6_Sub40_5 = new Class6_Sub40((byte[]) null);

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class159() {
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class159(@OriginalArg(0) byte[] arg0) {
		this.method4598(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()I")
	public int method4586() {
		@Pc(3) int local3 = this.anIntArray294.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray294[local9] >= 0 && this.anIntArray297[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray297[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method4587(@OriginalArg(0) int arg0) {
		this.aClass6_Sub40_5.anInt10169 = this.anIntArray294[arg0];
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
	private int method4588(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass6_Sub40_5.aByteArray113[this.aClass6_Sub40_5.anInt10169];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray295[arg0] = local13;
			this.aClass6_Sub40_5.anInt10169++;
		} else {
			local13 = this.anIntArray295[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4599(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass6_Sub40_5.method8575();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass6_Sub40_5.aByteArray113[this.aClass6_Sub40_5.anInt10169] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass6_Sub40_5.anInt10169++;
				this.anIntArray295[arg0] = local57;
				return this.method4599(arg0, local57);
			}
		}
		this.aClass6_Sub40_5.anInt10169 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)J")
	public long method4589(@OriginalArg(0) int arg0) {
		return this.aLong127 + (long) arg0 * (long) this.anInt5143;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	public void method4590() {
		this.aClass6_Sub40_5.anInt10169 = -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(J)V")
	public void method4591(@OriginalArg(0) long arg0) {
		this.aLong127 = arg0;
		@Pc(6) int local6 = this.anIntArray294.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray297[local8] = 0;
			this.anIntArray295[local8] = 0;
			this.aClass6_Sub40_5.anInt10169 = this.anIntArray296[local8];
			this.method4597(local8);
			this.anIntArray294[local8] = this.aClass6_Sub40_5.anInt10169;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
	public int method4593() {
		return this.anIntArray294.length;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()Z")
	public boolean method4594() {
		return this.aClass6_Sub40_5.aByteArray113 != null;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()V")
	public void method4595() {
		this.aClass6_Sub40_5.aByteArray113 = null;
		this.anIntArray296 = null;
		this.anIntArray294 = null;
		this.anIntArray297 = null;
		this.anIntArray295 = null;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
	public int method4596(@OriginalArg(0) int arg0) {
		return this.method4588(arg0);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public void method4597(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass6_Sub40_5.method8575();
		this.anIntArray297[arg0] += local4;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([B)V")
	public void method4598(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub40_5.aByteArray113 = arg0;
		this.aClass6_Sub40_5.anInt10169 = 10;
		@Pc(12) int local12 = this.aClass6_Sub40_5.method8571();
		this.anInt5142 = this.aClass6_Sub40_5.method8571();
		this.anInt5143 = 500000;
		this.anIntArray296 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass6_Sub40_5.method8579();
			@Pc(38) int local38 = this.aClass6_Sub40_5.method8579();
			if (local33 == 1297379947) {
				this.anIntArray296[local27] = this.aClass6_Sub40_5.anInt10169;
				local27++;
			}
			this.aClass6_Sub40_5.anInt10169 += local38;
		}
		this.aLong127 = 0L;
		this.anIntArray294 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray294[local33] = this.anIntArray296[local33];
		}
		this.anIntArray297 = new int[local12];
		this.anIntArray295 = new int[local12];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
	private int method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static256.aByteArray57[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass6_Sub40_5.method8604() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass6_Sub40_5.method8604() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass6_Sub40_5.method8604();
		local12 = this.aClass6_Sub40_5.method8575();
		if (local7 == 47) {
			this.aClass6_Sub40_5.anInt10169 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass6_Sub40_5.method8606();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray297[arg0];
			this.aLong127 += (long) local38 * (long) (this.anInt5143 - local32);
			this.anInt5143 = local32;
			this.aClass6_Sub40_5.anInt10169 += local12;
			return 2;
		} else {
			this.aClass6_Sub40_5.anInt10169 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
	public void method4600(@OriginalArg(0) int arg0) {
		this.anIntArray294[arg0] = this.aClass6_Sub40_5.anInt10169;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "()Z")
	public boolean method4601() {
		@Pc(3) int local3 = this.anIntArray294.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray294[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}

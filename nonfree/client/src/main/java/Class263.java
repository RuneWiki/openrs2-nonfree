import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class263 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	private int anInt7702;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "J")
	private long aLong234;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public int anInt7703;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[I")
	private int[] anIntArray579;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!ti;")
	private final Class1_Sub14 aClass1_Sub14_8 = new Class1_Sub14(null);

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class263() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V")
	public Class263(@OriginalArg(0) byte[] arg0) {
		this.method5934(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I")
	public int method5923(@OriginalArg(0) int arg0) {
		return this.method5929(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
	private int method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static445.aByteArray95[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub14_8.method4548() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub14_8.method4548() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub14_8.method4548();
		local12 = this.aClass1_Sub14_8.method4541();
		if (local7 == 47) {
			this.aClass1_Sub14_8.anInt5695 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub14_8.method4496();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray580[arg0];
			this.aLong234 += (long) local38 * (long) (this.anInt7702 - local32);
			this.anInt7702 = local32;
			this.aClass1_Sub14_8.anInt5695 += local12;
			return 2;
		} else {
			this.aClass1_Sub14_8.anInt5695 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method5925(@OriginalArg(0) int arg0) {
		this.anIntArray577[arg0] = this.aClass1_Sub14_8.anInt5695;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	public void method5926() {
		this.aClass1_Sub14_8.aByteArray65 = null;
		this.anIntArray578 = null;
		this.anIntArray577 = null;
		this.anIntArray580 = null;
		this.anIntArray579 = null;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)J")
	public long method5927(@OriginalArg(0) int arg0) {
		return this.aLong234 + (long) arg0 * (long) this.anInt7702;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
	public int method5928() {
		return this.anIntArray577.length;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)I")
	private int method5929(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub14_8.aByteArray65[this.aClass1_Sub14_8.anInt5695];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray579[arg0] = local13;
			this.aClass1_Sub14_8.anInt5695++;
		} else {
			local13 = this.anIntArray579[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5924(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub14_8.method4541();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub14_8.aByteArray65[this.aClass1_Sub14_8.anInt5695] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub14_8.anInt5695++;
				this.anIntArray579[arg0] = local57;
				return this.method5924(arg0, local57);
			}
		}
		this.aClass1_Sub14_8.anInt5695 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "()I")
	public int method5930() {
		@Pc(3) int local3 = this.anIntArray577.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray577[local9] >= 0 && this.anIntArray580[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray580[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "()Z")
	public boolean method5931() {
		@Pc(3) int local3 = this.anIntArray577.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray577[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "()V")
	public void method5932() {
		this.aClass1_Sub14_8.anInt5695 = -1;
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V")
	public void method5933(@OriginalArg(0) int arg0) {
		this.aClass1_Sub14_8.anInt5695 = this.anIntArray577[arg0];
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([B)V")
	public void method5934(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub14_8.aByteArray65 = arg0;
		this.aClass1_Sub14_8.anInt5695 = 10;
		@Pc(12) int local12 = this.aClass1_Sub14_8.method4498();
		this.anInt7703 = this.aClass1_Sub14_8.method4498();
		this.anInt7702 = 500000;
		this.anIntArray578 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub14_8.method4500();
			@Pc(38) int local38 = this.aClass1_Sub14_8.method4500();
			if (local33 == 1297379947) {
				this.anIntArray578[local27] = this.aClass1_Sub14_8.anInt5695;
				local27++;
			}
			this.aClass1_Sub14_8.anInt5695 += local38;
		}
		this.aLong234 = 0L;
		this.anIntArray577 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray577[local33] = this.anIntArray578[local33];
		}
		this.anIntArray580 = new int[local12];
		this.anIntArray579 = new int[local12];
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "()Z")
	public boolean method5935() {
		return this.aClass1_Sub14_8.aByteArray65 != null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(J)V")
	public void method5936(@OriginalArg(0) long arg0) {
		this.aLong234 = arg0;
		@Pc(6) int local6 = this.anIntArray577.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray580[local8] = 0;
			this.anIntArray579[local8] = 0;
			this.aClass1_Sub14_8.anInt5695 = this.anIntArray578[local8];
			this.method5938(local8);
			this.anIntArray577[local8] = this.aClass1_Sub14_8.anInt5695;
		}
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
	public void method5938(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub14_8.method4541();
		this.anIntArray580[arg0] += local4;
	}
}

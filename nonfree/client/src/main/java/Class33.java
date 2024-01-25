import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class33 {

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	private int anInt1122;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	public int anInt1123;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!os;")
	private final Class1_Sub17 aClass1_Sub17_1 = new Class1_Sub17(null);

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class33() {
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V")
	public Class33(@OriginalArg(0) byte[] arg0) {
		this.method1141(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I")
	private int method1132(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub17_1.aByteArray58[this.aClass1_Sub17_1.anInt4872];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray77[arg0] = local13;
			this.aClass1_Sub17_1.anInt4872++;
		} else {
			local13 = this.anIntArray77[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1134(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub17_1.method4462();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub17_1.aByteArray58[this.aClass1_Sub17_1.anInt4872] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub17_1.anInt4872++;
				this.anIntArray77[arg0] = local57;
				return this.method1134(arg0, local57);
			}
		}
		this.aClass1_Sub17_1.anInt4872 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()I")
	public int method1133() {
		return this.anIntArray78.length;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
	private int method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static41.aByteArray11[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub17_1.method4487() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub17_1.method4487() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub17_1.method4487();
		local12 = this.aClass1_Sub17_1.method4462();
		if (local7 == 47) {
			this.aClass1_Sub17_1.anInt4872 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub17_1.method4486();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray75[arg0];
			this.aLong25 += (long) local38 * (long) (this.anInt1122 - local32);
			this.anInt1122 = local32;
			this.aClass1_Sub17_1.anInt4872 += local12;
			return 2;
		} else {
			this.aClass1_Sub17_1.anInt4872 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()V")
	public void method1135() {
		this.aClass1_Sub17_1.anInt4872 = -1;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)J")
	public long method1136(@OriginalArg(0) int arg0) {
		return this.aLong25 + (long) arg0 * (long) this.anInt1122;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	public void method1137(@OriginalArg(0) int arg0) {
		this.aClass1_Sub17_1.anInt4872 = this.anIntArray78[arg0];
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()Z")
	public boolean method1138() {
		return this.aClass1_Sub17_1.aByteArray58 != null;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z")
	public boolean method1139() {
		@Pc(3) int local3 = this.anIntArray78.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray78[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([B)V")
	public void method1141(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub17_1.aByteArray58 = arg0;
		this.aClass1_Sub17_1.anInt4872 = 10;
		@Pc(12) int local12 = this.aClass1_Sub17_1.method4494();
		this.anInt1123 = this.aClass1_Sub17_1.method4494();
		this.anInt1122 = 500000;
		this.anIntArray76 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub17_1.method4481();
			@Pc(38) int local38 = this.aClass1_Sub17_1.method4481();
			if (local33 == 1297379947) {
				this.anIntArray76[local27] = this.aClass1_Sub17_1.anInt4872;
				local27++;
			}
			this.aClass1_Sub17_1.anInt4872 += local38;
		}
		this.aLong25 = 0L;
		this.anIntArray78 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray78[local33] = this.anIntArray76[local33];
		}
		this.anIntArray75 = new int[local12];
		this.anIntArray77 = new int[local12];
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "()I")
	public int method1142() {
		@Pc(3) int local3 = this.anIntArray78.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray78[local9] >= 0 && this.anIntArray75[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray75[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
	public void method1143(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub17_1.method4462();
		this.anIntArray75[arg0] += local4;
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "()V")
	public void method1144() {
		this.aClass1_Sub17_1.aByteArray58 = null;
		this.anIntArray76 = null;
		this.anIntArray78 = null;
		this.anIntArray75 = null;
		this.anIntArray77 = null;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)I")
	public int method1145(@OriginalArg(0) int arg0) {
		return this.method1132(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V")
	public void method1146(@OriginalArg(0) int arg0) {
		this.anIntArray78[arg0] = this.aClass1_Sub17_1.anInt4872;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(J)V")
	public void method1147(@OriginalArg(0) long arg0) {
		this.aLong25 = arg0;
		@Pc(6) int local6 = this.anIntArray78.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray75[local8] = 0;
			this.anIntArray77[local8] = 0;
			this.aClass1_Sub17_1.anInt4872 = this.anIntArray76[local8];
			this.method1143(local8);
			this.anIntArray78[local8] = this.aClass1_Sub17_1.anInt4872;
		}
	}
}

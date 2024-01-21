import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class22 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!pa;")
	private final Class5_Sub14 aClass5_Sub14_3 = new Class5_Sub14(null);

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class22() {
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
	public Class22(@OriginalArg(0) byte[] arg0) {
		this.method686(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()Z")
	public boolean method680() {
		@Pc(3) int local3 = this.anIntArray160.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray160[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
	public int method681() {
		return this.anIntArray160.length;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
	public void method682() {
		this.aClass5_Sub14_3.aByteArray33 = null;
		this.anIntArray162 = null;
		this.anIntArray160 = null;
		this.anIntArray161 = null;
		this.anIntArray163 = null;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "()V")
	public void method683() {
		this.aClass5_Sub14_3.anInt2199 = -1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(J)V")
	public void method684(@OriginalArg(0) long arg0) {
		this.aLong41 = arg0;
		@Pc(6) int local6 = this.anIntArray160.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray161[local8] = 0;
			this.anIntArray163[local8] = 0;
			this.aClass5_Sub14_3.anInt2199 = this.anIntArray162[local8];
			this.method687(local8);
			this.anIntArray160[local8] = this.aClass5_Sub14_3.anInt2199;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	public int method685(@OriginalArg(0) int arg0) {
		return this.method690(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([B)V")
	public void method686(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub14_3.aByteArray33 = arg0;
		this.aClass5_Sub14_3.anInt2199 = 10;
		@Pc(12) int local12 = this.aClass5_Sub14_3.method1478();
		this.anInt1008 = this.aClass5_Sub14_3.method1478();
		this.anInt1009 = 500000;
		this.anIntArray162 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub14_3.method1461();
			@Pc(38) int local38 = this.aClass5_Sub14_3.method1461();
			if (local33 == 1297379947) {
				this.anIntArray162[local27] = this.aClass5_Sub14_3.anInt2199;
				local27++;
			}
			this.aClass5_Sub14_3.anInt2199 += local38;
		}
		this.aLong41 = 0L;
		this.anIntArray160 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray160[local33] = this.anIntArray162[local33];
		}
		this.anIntArray161 = new int[local12];
		this.anIntArray163 = new int[local12];
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public void method687(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub14_3.method1433();
		this.anIntArray161[arg0] += local4;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "()I")
	public int method688() {
		@Pc(3) int local3 = this.anIntArray160.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray160[local9] >= 0 && this.anIntArray161[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray161[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
	private int method690(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub14_3.aByteArray33[this.aClass5_Sub14_3.anInt2199];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray163[arg0] = local13;
			this.aClass5_Sub14_3.anInt2199++;
		} else {
			local13 = this.anIntArray163[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method695(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub14_3.method1433();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub14_3.aByteArray33[this.aClass5_Sub14_3.anInt2199] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub14_3.anInt2199++;
				this.anIntArray163[arg0] = local57;
				return this.method695(arg0, local57);
			}
		}
		this.aClass5_Sub14_3.anInt2199 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public void method691(@OriginalArg(0) int arg0) {
		this.aClass5_Sub14_3.anInt2199 = this.anIntArray160[arg0];
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public void method692(@OriginalArg(0) int arg0) {
		this.anIntArray160[arg0] = this.aClass5_Sub14_3.anInt2199;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)J")
	public long method693(@OriginalArg(0) int arg0) {
		return this.aLong41 + (long) arg0 * (long) this.anInt1009;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "()Z")
	public boolean method694() {
		return this.aClass5_Sub14_3.aByteArray33 != null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	private int method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static35.aByteArray19[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub14_3.method1471() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub14_3.method1471() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub14_3.method1471();
		local12 = this.aClass5_Sub14_3.method1433();
		if (local7 == 47) {
			this.aClass5_Sub14_3.anInt2199 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub14_3.method1439();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray161[arg0];
			this.aLong41 += (long) local38 * (long) (this.anInt1009 - local32);
			this.anInt1009 = local32;
			this.aClass5_Sub14_3.anInt2199 += local12;
			return 2;
		} else {
			this.aClass5_Sub14_3.anInt2199 += local12;
			return 3;
		}
	}
}

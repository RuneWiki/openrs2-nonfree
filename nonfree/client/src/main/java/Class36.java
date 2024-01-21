import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class36 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public int anInt1655;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	private int anInt1656;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!wb;")
	private final Class2_Sub17 aClass2_Sub17_1 = new Class2_Sub17(null);

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class36() {
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
	public Class36(@OriginalArg(0) byte[] arg0) {
		this.method981(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
	public int method969(@OriginalArg(0) int arg0) {
		return this.method982(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
	private int method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static54.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub17_1.method1780() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub17_1.method1780() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub17_1.method1780();
		local12 = this.aClass2_Sub17_1.method1761();
		if (local7 == 47) {
			this.aClass2_Sub17_1.anInt2799 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub17_1.method1795();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray214[arg0];
			this.aLong50 += (long) local38 * (long) (this.anInt1656 - local32);
			this.anInt1656 = local32;
			this.aClass2_Sub17_1.anInt2799 += local12;
			return 2;
		} else {
			this.aClass2_Sub17_1.anInt2799 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
	public boolean method971() {
		return this.aClass2_Sub17_1.aByteArray38 != null;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public void method972(@OriginalArg(0) int arg0) {
		this.aClass2_Sub17_1.anInt2799 = this.anIntArray211[arg0];
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
	public int method973() {
		return this.anIntArray211.length;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public void method974(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub17_1.method1761();
		this.anIntArray214[arg0] += local4;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
	public void method975() {
		this.aClass2_Sub17_1.anInt2799 = -1;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "()Z")
	public boolean method977() {
		@Pc(3) int local3 = this.anIntArray211.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray211[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "()I")
	public int method978() {
		@Pc(3) int local3 = this.anIntArray211.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray211[local9] >= 0 && this.anIntArray214[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray214[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)J")
	public long method979(@OriginalArg(0) int arg0) {
		return this.aLong50 + (long) arg0 * (long) this.anInt1656;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "()V")
	public void method980() {
		this.aClass2_Sub17_1.aByteArray38 = null;
		this.anIntArray213 = null;
		this.anIntArray211 = null;
		this.anIntArray214 = null;
		this.anIntArray212 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([B)V")
	public void method981(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub17_1.aByteArray38 = arg0;
		this.aClass2_Sub17_1.anInt2799 = 10;
		@Pc(12) int local12 = this.aClass2_Sub17_1.method1783();
		this.anInt1655 = this.aClass2_Sub17_1.method1783();
		this.anInt1656 = 500000;
		this.anIntArray213 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub17_1.method1747();
			@Pc(38) int local38 = this.aClass2_Sub17_1.method1747();
			if (local33 == 1297379947) {
				this.anIntArray213[local27] = this.aClass2_Sub17_1.anInt2799;
				local27++;
			}
			this.aClass2_Sub17_1.anInt2799 += local38;
		}
		this.aLong50 = 0L;
		this.anIntArray211 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray211[local33] = this.anIntArray213[local33];
		}
		this.anIntArray214 = new int[local12];
		this.anIntArray212 = new int[local12];
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)I")
	private int method982(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub17_1.aByteArray38[this.aClass2_Sub17_1.anInt2799];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray212[arg0] = local13;
			this.aClass2_Sub17_1.anInt2799++;
		} else {
			local13 = this.anIntArray212[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method970(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub17_1.method1761();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub17_1.aByteArray38[this.aClass2_Sub17_1.anInt2799] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub17_1.anInt2799++;
				this.anIntArray212[arg0] = local57;
				return this.method970(arg0, local57);
			}
		}
		this.aClass2_Sub17_1.anInt2799 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	public void method983(@OriginalArg(0) int arg0) {
		this.anIntArray211[arg0] = this.aClass2_Sub17_1.anInt2799;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(J)V")
	public void method984(@OriginalArg(0) long arg0) {
		this.aLong50 = arg0;
		@Pc(6) int local6 = this.anIntArray211.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray214[local8] = 0;
			this.anIntArray212[local8] = 0;
			this.aClass2_Sub17_1.anInt2799 = this.anIntArray213[local8];
			this.method974(local8);
			this.anIntArray211[local8] = this.aClass2_Sub17_1.anInt2799;
		}
	}
}

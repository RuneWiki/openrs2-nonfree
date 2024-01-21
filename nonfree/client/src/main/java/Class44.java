import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class44 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public int anInt1759;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!re;")
	private final Class4_Sub13 aClass4_Sub13_3 = new Class4_Sub13(null);

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
	public Class44(@OriginalArg(0) byte[] arg0) {
		this.method1313(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()Z")
	public boolean method1307() {
		return this.aClass4_Sub13_3.aByteArray68 != null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method1308(@OriginalArg(0) int arg0) {
		this.anIntArray182[arg0] = this.aClass4_Sub13_3.anInt1643;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
	private int method1309(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub13_3.aByteArray68[this.aClass4_Sub13_3.anInt1643];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray183[arg0] = local13;
			this.aClass4_Sub13_3.anInt1643++;
		} else {
			local13 = this.anIntArray183[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1311(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub13_3.method1239();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub13_3.aByteArray68[this.aClass4_Sub13_3.anInt1643] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub13_3.anInt1643++;
				this.anIntArray183[arg0] = local57;
				return this.method1311(arg0, local57);
			}
		}
		this.aClass4_Sub13_3.anInt1643 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "()Z")
	public boolean method1310() {
		@Pc(3) int local3 = this.anIntArray182.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray182[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
	private int method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static68.aByteArray71[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub13_3.method1223() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub13_3.method1223() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub13_3.method1223();
		local12 = this.aClass4_Sub13_3.method1239();
		if (local7 == 47) {
			this.aClass4_Sub13_3.anInt1643 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub13_3.method1241();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray180[arg0];
			this.aLong67 += (long) local38 * (long) (this.anInt1758 - local32);
			this.anInt1758 = local32;
			this.aClass4_Sub13_3.anInt1643 += local12;
			return 2;
		} else {
			this.aClass4_Sub13_3.anInt1643 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public void method1312(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub13_3.method1239();
		this.anIntArray180[arg0] += local4;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([B)V")
	public void method1313(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub13_3.aByteArray68 = arg0;
		this.aClass4_Sub13_3.anInt1643 = 10;
		@Pc(12) int local12 = this.aClass4_Sub13_3.method1244();
		this.anInt1759 = this.aClass4_Sub13_3.method1244();
		this.anInt1758 = 500000;
		this.anIntArray181 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub13_3.method1215();
			@Pc(38) int local38 = this.aClass4_Sub13_3.method1215();
			if (local33 == 1297379947) {
				this.anIntArray181[local27] = this.aClass4_Sub13_3.anInt1643;
				local27++;
			}
			this.aClass4_Sub13_3.anInt1643 += local38;
		}
		this.aLong67 = 0L;
		this.anIntArray182 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray182[local33] = this.anIntArray181[local33];
		}
		this.anIntArray180 = new int[local12];
		this.anIntArray183 = new int[local12];
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "()I")
	public int method1314() {
		@Pc(3) int local3 = this.anIntArray182.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray182[local9] >= 0 && this.anIntArray180[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray180[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public void method1315(@OriginalArg(0) int arg0) {
		this.aClass4_Sub13_3.anInt1643 = this.anIntArray182[arg0];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(J)V")
	public void method1316(@OriginalArg(0) long arg0) {
		this.aLong67 = arg0;
		@Pc(6) int local6 = this.anIntArray182.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray180[local8] = 0;
			this.anIntArray183[local8] = 0;
			this.aClass4_Sub13_3.anInt1643 = this.anIntArray181[local8];
			this.method1312(local8);
			this.anIntArray182[local8] = this.aClass4_Sub13_3.anInt1643;
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "()V")
	public void method1317() {
		this.aClass4_Sub13_3.aByteArray68 = null;
		this.anIntArray181 = null;
		this.anIntArray182 = null;
		this.anIntArray180 = null;
		this.anIntArray183 = null;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "()V")
	public void method1318() {
		this.aClass4_Sub13_3.anInt1643 = -1;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
	public int method1319(@OriginalArg(0) int arg0) {
		return this.method1309(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)J")
	public long method1320(@OriginalArg(0) int arg0) {
		return this.aLong67 + (long) arg0 * (long) this.anInt1758;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "()I")
	public int method1321() {
		return this.anIntArray182.length;
	}
}

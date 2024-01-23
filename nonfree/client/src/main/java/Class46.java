import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class46 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	private int anInt1541;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!im;")
	private Class1_Sub16 aClass1_Sub16_5 = new Class1_Sub16(null);

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class46() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V")
	public Class46(@OriginalArg(0) byte[] arg0) {
		this.method1177(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()Z")
	public boolean method1163() {
		return this.aClass1_Sub16_5.aByteArray39 != null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(J)V")
	public void method1164(@OriginalArg(0) long arg0) {
		this.aLong59 = arg0;
		@Pc(6) int local6 = this.anIntArray159.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray162[local8] = 0;
			this.anIntArray161[local8] = 0;
			this.aClass1_Sub16_5.anInt3328 = this.anIntArray160[local8];
			this.method1176(local8);
			this.anIntArray159[local8] = this.aClass1_Sub16_5.anInt3328;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "()V")
	public void method1165() {
		this.aClass1_Sub16_5.aByteArray39 = null;
		this.anIntArray160 = null;
		this.anIntArray159 = null;
		this.anIntArray162 = null;
		this.anIntArray161 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public void method1166(@OriginalArg(0) int arg0) {
		this.aClass1_Sub16_5.anInt3328 = this.anIntArray159[arg0];
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
	private int method1168(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub16_5.aByteArray39[this.aClass1_Sub16_5.anInt3328];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray161[arg0] = local13;
			this.aClass1_Sub16_5.anInt3328++;
		} else {
			local13 = this.anIntArray161[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1169(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub16_5.method2622();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub16_5.aByteArray39[this.aClass1_Sub16_5.anInt3328] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub16_5.anInt3328++;
				this.anIntArray161[arg0] = local57;
				return this.method1169(arg0, local57);
			}
		}
		this.aClass1_Sub16_5.anInt3328 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
	private int method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static60.aByteArray14[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub16_5.method2655() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub16_5.method2655() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub16_5.method2655();
		local12 = this.aClass1_Sub16_5.method2622();
		if (local7 == 47) {
			this.aClass1_Sub16_5.anInt3328 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub16_5.method2634();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray162[arg0];
			this.aLong59 += (long) local38 * (long) (this.anInt1541 - local32);
			this.anInt1541 = local32;
			this.aClass1_Sub16_5.anInt3328 += local12;
			return 2;
		} else {
			this.aClass1_Sub16_5.anInt3328 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
	public int method1170() {
		@Pc(3) int local3 = this.anIntArray159.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray159[local9] >= 0 && this.anIntArray162[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray162[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)J")
	public long method1171(@OriginalArg(0) int arg0) {
		return this.aLong59 + (long) arg0 * (long) this.anInt1541;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "()V")
	public void method1172() {
		this.aClass1_Sub16_5.anInt3328 = -1;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	public void method1173(@OriginalArg(0) int arg0) {
		this.anIntArray159[arg0] = this.aClass1_Sub16_5.anInt3328;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)I")
	public int method1174(@OriginalArg(0) int arg0) {
		return this.method1168(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "()Z")
	public boolean method1175() {
		@Pc(3) int local3 = this.anIntArray159.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray159[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V")
	public void method1176(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub16_5.method2622();
		this.anIntArray162[arg0] += local4;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([B)V")
	public void method1177(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub16_5.aByteArray39 = arg0;
		this.aClass1_Sub16_5.anInt3328 = 10;
		@Pc(12) int local12 = this.aClass1_Sub16_5.method2652();
		this.anInt1540 = this.aClass1_Sub16_5.method2652();
		this.anInt1541 = 500000;
		this.anIntArray160 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass1_Sub16_5.method2610();
			@Pc(40) int local40 = this.aClass1_Sub16_5.method2610();
			if (local35 == 1297379947) {
				this.anIntArray160[local27] = this.aClass1_Sub16_5.anInt3328;
				local27++;
			}
			this.aClass1_Sub16_5.anInt3328 += local40;
		}
		this.aLong59 = 0L;
		this.anIntArray159 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray159[local27] = this.anIntArray160[local27];
		}
		this.anIntArray162 = new int[local12];
		this.anIntArray161 = new int[local12];
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "()I")
	public int method1178() {
		return this.anIntArray159.length;
	}
}

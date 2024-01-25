import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class49 {

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "[I")
	private int[] anIntArray105;

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
	public int anInt1058;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Lclient!mo;")
	private final Class1_Sub35 aClass1_Sub35_3 = new Class1_Sub35(null);

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	public Class49() {
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "([B)V")
	public Class49(@OriginalArg(0) byte[] arg0) {
		this.method983(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	public void method979(@OriginalArg(0) int arg0) {
		this.anIntArray108[arg0] = this.aClass1_Sub35_3.anInt7214;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)J")
	public long method980(@OriginalArg(0) int arg0) {
		return this.aLong41 + (long) arg0 * (long) this.anInt1057;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "()I")
	public int method981() {
		return this.anIntArray108.length;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "()V")
	public void method982() {
		this.aClass1_Sub35_3.aByteArray85 = null;
		this.anIntArray106 = null;
		this.anIntArray108 = null;
		this.anIntArray107 = null;
		this.anIntArray105 = null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([B)V")
	public void method983(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub35_3.aByteArray85 = arg0;
		this.aClass1_Sub35_3.anInt7214 = 10;
		@Pc(12) int local12 = this.aClass1_Sub35_3.method5771();
		this.anInt1058 = this.aClass1_Sub35_3.method5771();
		this.anInt1057 = 500000;
		this.anIntArray106 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub35_3.method5804();
			@Pc(38) int local38 = this.aClass1_Sub35_3.method5804();
			if (local33 == 1297379947) {
				this.anIntArray106[local27] = this.aClass1_Sub35_3.anInt7214;
				local27++;
			}
			this.aClass1_Sub35_3.anInt7214 += local38;
		}
		this.aLong41 = 0L;
		this.anIntArray108 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray108[local33] = this.anIntArray106[local33];
		}
		this.anIntArray107 = new int[local12];
		this.anIntArray105 = new int[local12];
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "()I")
	public int method984() {
		@Pc(3) int local3 = this.anIntArray108.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray108[local9] >= 0 && this.anIntArray107[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray107[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
	public void method985(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub35_3.method5744();
		this.anIntArray107[arg0] += local4;
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V")
	public void method986(@OriginalArg(0) int arg0) {
		this.aClass1_Sub35_3.anInt7214 = this.anIntArray108[arg0];
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "()Z")
	public boolean method987() {
		return this.aClass1_Sub35_3.aByteArray85 != null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
	private int method988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static54.aByteArray9[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub35_3.method5750() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub35_3.method5750() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub35_3.method5750();
		local12 = this.aClass1_Sub35_3.method5744();
		if (local7 == 47) {
			this.aClass1_Sub35_3.anInt7214 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub35_3.method5797();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray107[arg0];
			this.aLong41 += (long) local38 * (long) (this.anInt1057 - local32);
			this.anInt1057 = local32;
			this.aClass1_Sub35_3.anInt7214 += local12;
			return 2;
		} else {
			this.aClass1_Sub35_3.anInt7214 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "()V")
	public void method989() {
		this.aClass1_Sub35_3.anInt7214 = -1;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "()Z")
	public boolean method990() {
		@Pc(3) int local3 = this.anIntArray108.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray108[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)I")
	private int method991(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub35_3.aByteArray85[this.aClass1_Sub35_3.anInt7214];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray105[arg0] = local13;
			this.aClass1_Sub35_3.anInt7214++;
		} else {
			local13 = this.anIntArray105[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method988(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub35_3.method5744();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub35_3.aByteArray85[this.aClass1_Sub35_3.anInt7214] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub35_3.anInt7214++;
				this.anIntArray105[arg0] = local57;
				return this.method988(arg0, local57);
			}
		}
		this.aClass1_Sub35_3.anInt7214 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)I")
	public int method993(@OriginalArg(0) int arg0) {
		return this.method991(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(J)V")
	public void method994(@OriginalArg(0) long arg0) {
		this.aLong41 = arg0;
		@Pc(6) int local6 = this.anIntArray108.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray107[local8] = 0;
			this.anIntArray105[local8] = 0;
			this.aClass1_Sub35_3.anInt7214 = this.anIntArray106[local8];
			this.method985(local8);
			this.anIntArray108[local8] = this.aClass1_Sub35_3.anInt7214;
		}
	}
}

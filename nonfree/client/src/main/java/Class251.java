import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class251 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
	private int[] anIntArray496;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	private int anInt7495;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "J")
	private long aLong189;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public int anInt7496;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!daa;")
	private final Class12_Sub8 aClass12_Sub8_5 = new Class12_Sub8(null);

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class251() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class251(@OriginalArg(0) byte[] arg0) {
		this.method6245(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
	public void method6245(@OriginalArg(0) byte[] arg0) {
		this.aClass12_Sub8_5.aByteArray82 = arg0;
		this.aClass12_Sub8_5.anInt6217 = 10;
		@Pc(12) int local12 = this.aClass12_Sub8_5.method5199();
		this.anInt7496 = this.aClass12_Sub8_5.method5199();
		this.anInt7495 = 500000;
		this.anIntArray499 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass12_Sub8_5.method5225();
			@Pc(38) int local38 = this.aClass12_Sub8_5.method5225();
			if (local33 == 1297379947) {
				this.anIntArray499[local27] = this.aClass12_Sub8_5.anInt6217;
				local27++;
			}
			this.aClass12_Sub8_5.anInt6217 += local38;
		}
		this.aLong189 = 0L;
		this.anIntArray496 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray496[local33] = this.anIntArray499[local33];
		}
		this.anIntArray497 = new int[local12];
		this.anIntArray498 = new int[local12];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
	public boolean method6246() {
		return this.aClass12_Sub8_5.aByteArray82 != null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	private int method6247(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass12_Sub8_5.aByteArray82[this.aClass12_Sub8_5.anInt6217];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray498[arg0] = local13;
			this.aClass12_Sub8_5.anInt6217++;
		} else {
			local13 = this.anIntArray498[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method6250(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass12_Sub8_5.method5229();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass12_Sub8_5.aByteArray82[this.aClass12_Sub8_5.anInt6217] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass12_Sub8_5.anInt6217++;
				this.anIntArray498[arg0] = local57;
				return this.method6250(arg0, local57);
			}
		}
		this.aClass12_Sub8_5.anInt6217 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	public void method6248() {
		this.aClass12_Sub8_5.anInt6217 = -1;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
	public int method6249() {
		@Pc(3) int local3 = this.anIntArray496.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray496[local9] >= 0 && this.anIntArray497[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray497[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	private int method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static399.aByteArray95[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass12_Sub8_5.method5216() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass12_Sub8_5.method5216() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass12_Sub8_5.method5216();
		local12 = this.aClass12_Sub8_5.method5229();
		if (local7 == 47) {
			this.aClass12_Sub8_5.anInt6217 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass12_Sub8_5.method5195();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray497[arg0];
			this.aLong189 += (long) local38 * (long) (this.anInt7495 - local32);
			this.anInt7495 = local32;
			this.aClass12_Sub8_5.anInt6217 += local12;
			return 2;
		} else {
			this.aClass12_Sub8_5.anInt6217 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	public int method6251() {
		return this.anIntArray496.length;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method6253(@OriginalArg(0) int arg0) {
		this.aClass12_Sub8_5.anInt6217 = this.anIntArray496[arg0];
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
	public int method6254(@OriginalArg(0) int arg0) {
		return this.method6247(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)J")
	public long method6255(@OriginalArg(0) int arg0) {
		return this.aLong189 + (long) arg0 * (long) this.anInt7495;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()V")
	public void method6256() {
		this.aClass12_Sub8_5.aByteArray82 = null;
		this.anIntArray499 = null;
		this.anIntArray496 = null;
		this.anIntArray497 = null;
		this.anIntArray498 = null;
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z")
	public boolean method6257() {
		@Pc(3) int local3 = this.anIntArray496.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray496[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
	public void method6258(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass12_Sub8_5.method5229();
		this.anIntArray497[arg0] += local4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
	public void method6259(@OriginalArg(0) long arg0) {
		this.aLong189 = arg0;
		@Pc(6) int local6 = this.anIntArray496.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray497[local8] = 0;
			this.anIntArray498[local8] = 0;
			this.aClass12_Sub8_5.anInt6217 = this.anIntArray499[local8];
			this.method6258(local8);
			this.anIntArray496[local8] = this.aClass12_Sub8_5.anInt6217;
		}
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	public void method6260(@OriginalArg(0) int arg0) {
		this.anIntArray496[arg0] = this.aClass12_Sub8_5.anInt6217;
	}
}

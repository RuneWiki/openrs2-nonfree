import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class238 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public int anInt6982;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	private int anInt6983;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Lclient!un;")
	private final Class4_Sub11 aClass4_Sub11_5 = new Class4_Sub11(null);

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class238() {
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "([B)V")
	public Class238(@OriginalArg(0) byte[] arg0) {
		this.method5806(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(J)V")
	public void method5796(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
		@Pc(6) int local6 = this.anIntArray360.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray361[local8] = 0;
			this.anIntArray359[local8] = 0;
			this.aClass4_Sub11_5.anInt5831 = this.anIntArray362[local8];
			this.method5803(local8);
			this.anIntArray360[local8] = this.aClass4_Sub11_5.anInt5831;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "()V")
	public void method5797() {
		this.aClass4_Sub11_5.aByteArray68 = null;
		this.anIntArray362 = null;
		this.anIntArray360 = null;
		this.anIntArray361 = null;
		this.anIntArray359 = null;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "()I")
	public int method5798() {
		return this.anIntArray360.length;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "()V")
	public void method5799() {
		this.aClass4_Sub11_5.anInt5831 = -1;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method5800(@OriginalArg(0) int arg0) {
		this.anIntArray360[arg0] = this.aClass4_Sub11_5.anInt5831;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "()Z")
	public boolean method5801() {
		return this.aClass4_Sub11_5.aByteArray68 != null;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I")
	public int method5802(@OriginalArg(0) int arg0) {
		return this.method5805(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	public void method5803(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub11_5.method4921();
		this.anIntArray361[arg0] += local4;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	private int method5804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static359.aByteArray84[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub11_5.method4905() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub11_5.method4905() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub11_5.method4905();
		local12 = this.aClass4_Sub11_5.method4921();
		if (local7 == 47) {
			this.aClass4_Sub11_5.anInt5831 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub11_5.method4934();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray361[arg0];
			this.aLong175 += (long) local38 * (long) (this.anInt6983 - local32);
			this.anInt6983 = local32;
			this.aClass4_Sub11_5.anInt5831 += local12;
			return 2;
		} else {
			this.aClass4_Sub11_5.anInt5831 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I")
	private int method5805(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub11_5.aByteArray68[this.aClass4_Sub11_5.anInt5831];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray359[arg0] = local13;
			this.aClass4_Sub11_5.anInt5831++;
		} else {
			local13 = this.anIntArray359[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5804(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub11_5.method4921();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub11_5.aByteArray68[this.aClass4_Sub11_5.anInt5831] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub11_5.anInt5831++;
				this.anIntArray359[arg0] = local57;
				return this.method5804(arg0, local57);
			}
		}
		this.aClass4_Sub11_5.anInt5831 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([B)V")
	public void method5806(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub11_5.aByteArray68 = arg0;
		this.aClass4_Sub11_5.anInt5831 = 10;
		@Pc(12) int local12 = this.aClass4_Sub11_5.method4936();
		this.anInt6982 = this.aClass4_Sub11_5.method4936();
		this.anInt6983 = 500000;
		this.anIntArray362 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub11_5.method4931();
			@Pc(38) int local38 = this.aClass4_Sub11_5.method4931();
			if (local33 == 1297379947) {
				this.anIntArray362[local27] = this.aClass4_Sub11_5.anInt5831;
				local27++;
			}
			this.aClass4_Sub11_5.anInt5831 += local38;
		}
		this.aLong175 = 0L;
		this.anIntArray360 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray360[local33] = this.anIntArray362[local33];
		}
		this.anIntArray361 = new int[local12];
		this.anIntArray359 = new int[local12];
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "()I")
	public int method5807() {
		@Pc(3) int local3 = this.anIntArray360.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray360[local9] >= 0 && this.anIntArray361[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray361[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
	public void method5808(@OriginalArg(0) int arg0) {
		this.aClass4_Sub11_5.anInt5831 = this.anIntArray360[arg0];
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "()Z")
	public boolean method5810() {
		@Pc(3) int local3 = this.anIntArray360.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray360[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)J")
	public long method5811(@OriginalArg(0) int arg0) {
		return this.aLong175 + (long) arg0 * (long) this.anInt6983;
	}
}

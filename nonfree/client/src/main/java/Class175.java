import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class175 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[Lclient!vm;")
	public static final Class363[] aClass363Array1 = new Class363[5];

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	private int anInt4421;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	private int anInt4422;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public int anInt4423;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Lclient!tn;")
	public Class5_Sub27 aClass5_Sub27_2;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt4424;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	private int anInt4432;

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass363Array1.length; local8++) {
			aClass363Array1[local8] = new Class363();
		}
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	private Class175() {
		if (Static357.anIntArray491 == null) {
			Static562.method7902();
		}
		this.method4043();
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ha;Lclient!ee;I)V")
	public Class175(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class5_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (Static357.anIntArray491 == null) {
			Static562.method7902();
		}
		this.anInt4431 = arg1.method8645();
		this.aBoolean363 = (this.anInt4431 & 0x10) != 0;
		this.aBoolean361 = (this.anInt4431 & 0x8) != 0;
		this.anInt4431 &= 0x7;
		@Pc(44) int local44 = arg1.method8631() << arg2;
		@Pc(50) int local50 = arg1.method8631() << arg2;
		@Pc(56) int local56 = arg1.method8631() << arg2;
		@Pc(60) int local60 = arg1.method8645();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray59 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray59.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method8631();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray59[local72] = (short) (local94 | local83 << 8);
		}
		local60 = Static617.anInt10032 + (local60 << Static162.anInt2830);
		@Pc(149) int local149 = Static643.anIntArray836 == null ? Static421.anIntArray844[Static311.method4936(arg1.method8631()) & 0xFFFF] : Static643.anIntArray836[arg1.method8631()];
		local83 = arg1.method8645();
		this.anInt4423 = local83 & 0x1F;
		this.anInt4421 = (local83 & 0xE0) << 3;
		if (this.anInt4423 != 31) {
			this.method4043();
		}
		this.method4044(local60, local50, local56, arg0, local44, local149);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)V")
	public void method4040(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(55) int local55;
		if (arg1) {
			local55 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt4421 + this.anInt4432 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt4427;
			if (local26 == 1) {
				local55 = (Class5_Sub12_Sub1.anIntArray748[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local55 = Static357.anIntArray491[local23] >> 1;
			} else if (local26 == 4) {
				local55 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local55 = local23;
			} else if (local26 == 5) {
				local55 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local55 = 2048;
			}
		}
		this.aClass5_Sub27_2.method6337((float) (this.anInt4422 + (this.anInt4424 * local55 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIII)V")
	public void method4041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4432 = arg2;
		this.anInt4422 = arg1;
		this.anInt4424 = arg3;
		this.anInt4427 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	private void method4043() {
		@Pc(15) int local15 = this.anInt4423;
		if (local15 == 2) {
			this.anInt4424 = 2048;
			this.anInt4422 = 0;
			this.anInt4427 = 1;
			this.anInt4432 = 2048;
		} else if (local15 == 3) {
			this.anInt4432 = 4096;
			this.anInt4427 = 1;
			this.anInt4422 = 0;
			this.anInt4424 = 2048;
		} else if (local15 == 4) {
			this.anInt4427 = 4;
			this.anInt4424 = 2048;
			this.anInt4432 = 2048;
			this.anInt4422 = 0;
		} else if (local15 == 5) {
			this.anInt4422 = 0;
			this.anInt4432 = 8192;
			this.anInt4427 = 4;
			this.anInt4424 = 2048;
		} else if (local15 == 12) {
			this.anInt4422 = 0;
			this.anInt4427 = 2;
			this.anInt4432 = 2048;
			this.anInt4424 = 2048;
		} else if (local15 == 13) {
			this.anInt4422 = 0;
			this.anInt4432 = 8192;
			this.anInt4427 = 2;
			this.anInt4424 = 2048;
		} else if (local15 == 10) {
			this.anInt4427 = 3;
			this.anInt4432 = 2048;
			this.anInt4424 = 512;
			this.anInt4422 = 1536;
		} else if (local15 == 11) {
			this.anInt4422 = 1536;
			this.anInt4424 = 512;
			this.anInt4427 = 3;
			this.anInt4432 = 4096;
		} else if (local15 == 6) {
			this.anInt4422 = 1280;
			this.anInt4432 = 2048;
			this.anInt4424 = 768;
			this.anInt4427 = 3;
		} else if (local15 == 7) {
			this.anInt4424 = 768;
			this.anInt4427 = 3;
			this.anInt4422 = 1280;
			this.anInt4432 = 4096;
		} else if (local15 == 8) {
			this.anInt4424 = 1024;
			this.anInt4427 = 3;
			this.anInt4422 = 1024;
			this.anInt4432 = 2048;
		} else if (local15 == 9) {
			this.anInt4422 = 1024;
			this.anInt4427 = 3;
			this.anInt4424 = 1024;
			this.anInt4432 = 4096;
		} else if (local15 == 14) {
			this.anInt4432 = 2048;
			this.anInt4422 = 1280;
			this.anInt4427 = 1;
			this.anInt4424 = 768;
		} else if (local15 == 15) {
			this.anInt4424 = 512;
			this.anInt4432 = 4096;
			this.anInt4422 = 1536;
			this.anInt4427 = 1;
		} else if (local15 == 16) {
			this.anInt4432 = 8192;
			this.anInt4422 = 1792;
			this.anInt4424 = 256;
			this.anInt4427 = 1;
		} else {
			this.anInt4422 = 0;
			this.anInt4424 = 2048;
			this.anInt4427 = 0;
			this.anInt4432 = 2048;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILclient!ha;III)V")
	private void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class126 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub27_2 = arg3.method6992(arg4, arg2, arg1, arg0, arg5, 1.0F);
	}
}

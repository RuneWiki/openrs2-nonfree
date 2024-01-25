import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class237 {

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "Lclient!qea;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
	private int anInt6641;

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
	private int anInt6643;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
	private int anInt6645;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
	private int anInt6647;

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
	private int anInt6648;

	@OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
	public int anInt6651;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	private Class237() {
		if (Static556.anIntArray469 == null) {
			Static108.method5950();
		}
		this.method5470();
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!r;Lclient!io;I)V")
	public Class237(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class1_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (Static556.anIntArray469 == null) {
			Static108.method5950();
		}
		this.anInt6651 = arg1.method4393();
		this.aBoolean474 = (this.anInt6651 & 0x8) != 0;
		this.aBoolean475 = (this.anInt6651 & 0x10) != 0;
		this.anInt6651 &= 0x7;
		@Pc(50) int local50 = arg1.method4426() << arg2;
		@Pc(56) int local56 = arg1.method4426() << arg2;
		@Pc(62) int local62 = arg1.method4426() << arg2;
		@Pc(66) int local66 = arg1.method4393();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray78 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray78.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method4426();
			local89 = local85 >>> 8;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local100 > local72 - local89) {
				local100 = local72 - local89;
			}
			this.aShortArray78[local78] = (short) (local100 | local89 << 8);
		}
		local66 = Static159.anInt2896 + (local66 << Static378.anInt6665);
		@Pc(155) int local155 = Static279.anIntArray313 == null ? Static341.anIntArray409[Static242.method3964(arg1.method4426()) & 0xFFFF] : Static279.anIntArray313[arg1.method4426()];
		local89 = arg1.method4393();
		this.anInt6648 = (local89 & 0xE0) << 3;
		this.anInt6640 = local89 & 0x1F;
		if (this.anInt6640 != 31) {
			this.method5470();
		}
		this.method5469(local56, local50, arg0, local62, local155, local66);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIBI)V")
	public void method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6641 = arg2;
		this.anInt6643 = arg0;
		this.anInt6645 = arg1;
		this.anInt6647 = arg3;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIILclient!r;III)V")
	private void method5469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub5_1 = arg2.method6426(arg1, arg3, arg0, arg5, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	private void method5470() {
		@Pc(8) int local8 = this.anInt6640;
		if (local8 == 2) {
			this.anInt6645 = 0;
			this.anInt6647 = 2048;
			this.anInt6643 = 2048;
			this.anInt6641 = 1;
		} else if (local8 == 3) {
			this.anInt6645 = 0;
			this.anInt6643 = 2048;
			this.anInt6647 = 4096;
			this.anInt6641 = 1;
		} else if (local8 == 4) {
			this.anInt6641 = 4;
			this.anInt6645 = 0;
			this.anInt6643 = 2048;
			this.anInt6647 = 2048;
		} else if (local8 == 5) {
			this.anInt6641 = 4;
			this.anInt6645 = 0;
			this.anInt6643 = 2048;
			this.anInt6647 = 8192;
		} else if (local8 == 12) {
			this.anInt6647 = 2048;
			this.anInt6645 = 0;
			this.anInt6641 = 2;
			this.anInt6643 = 2048;
		} else if (local8 == 13) {
			this.anInt6645 = 0;
			this.anInt6643 = 2048;
			this.anInt6641 = 2;
			this.anInt6647 = 8192;
		} else if (local8 == 10) {
			this.anInt6641 = 3;
			this.anInt6647 = 2048;
			this.anInt6645 = 1536;
			this.anInt6643 = 512;
		} else if (local8 == 11) {
			this.anInt6645 = 1536;
			this.anInt6641 = 3;
			this.anInt6643 = 512;
			this.anInt6647 = 4096;
		} else if (local8 == 6) {
			this.anInt6643 = 768;
			this.anInt6647 = 2048;
			this.anInt6645 = 1280;
			this.anInt6641 = 3;
		} else if (local8 == 7) {
			this.anInt6645 = 1280;
			this.anInt6647 = 4096;
			this.anInt6641 = 3;
			this.anInt6643 = 768;
		} else if (local8 == 8) {
			this.anInt6641 = 3;
			this.anInt6647 = 2048;
			this.anInt6645 = 1024;
			this.anInt6643 = 1024;
		} else if (local8 == 9) {
			this.anInt6641 = 3;
			this.anInt6643 = 1024;
			this.anInt6647 = 4096;
			this.anInt6645 = 1024;
		} else if (local8 == 14) {
			this.anInt6643 = 768;
			this.anInt6641 = 1;
			this.anInt6645 = 1280;
			this.anInt6647 = 2048;
		} else if (local8 == 15) {
			this.anInt6645 = 1536;
			this.anInt6647 = 4096;
			this.anInt6643 = 512;
			this.anInt6641 = 1;
		} else if (local8 == 16) {
			this.anInt6647 = 8192;
			this.anInt6645 = 1792;
			this.anInt6641 = 1;
			this.anInt6643 = 256;
		} else {
			this.anInt6643 = 2048;
			this.anInt6647 = 2048;
			this.anInt6641 = 0;
			this.anInt6645 = 0;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BZI)V")
	public void method5472(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = arg1 * this.anInt6647 / 50 + this.anInt6648 & 0x7FF;
			@Pc(34) int local34 = this.anInt6641;
			if (local34 == 1) {
				local17 = (Class151.anIntArray244[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local17 = Static556.anIntArray469[local31] >> 1;
			} else if (local34 == 4) {
				local17 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local17 = local31;
			} else if (local34 == 5) {
				local17 = (local31 < 1024 ? local31 : 2048 - local31) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass1_Sub5_1.method4166((float) (this.anInt6645 + (local17 * this.anInt6643 >> 11)) / 2048.0F);
	}
}

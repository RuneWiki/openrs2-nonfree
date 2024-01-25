import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class394 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private int anInt10785;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Z")
	public boolean aBoolean742;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	private int anInt10788;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Lclient!sca;")
	public Class6_Sub17 aClass6_Sub17_3;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
	public boolean aBoolean743;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	private int anInt10790;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	public int anInt10791;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	private int anInt10792;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "[S")
	public short[] aShortArray160;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
	public int anInt10794;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	private int anInt10795;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	private Class394() {
		if (Static148.anIntArray147 == null) {
			Static135.method2046();
		}
		this.method9110();
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ha;Lclient!gga;I)V")
	public Class394(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class6_Sub23 arg1, @OriginalArg(2) int arg2) {
		if (Static148.anIntArray147 == null) {
			Static135.method2046();
		}
		this.anInt10794 = arg1.method8374();
		this.aBoolean742 = (this.anInt10794 & 0x8) != 0;
		this.aBoolean743 = (this.anInt10794 & 0x10) != 0;
		this.anInt10794 &= 0x7;
		@Pc(44) int local44 = arg1.method8363() << arg2;
		@Pc(50) int local50 = arg1.method8363() << arg2;
		@Pc(56) int local56 = arg1.method8363() << arg2;
		@Pc(60) int local60 = arg1.method8374();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray160 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray160.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method8363();
			local83 = local79 >>> 8;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			@Pc(98) int local98 = local79 & 0xFF;
			if (local66 - local83 < local98) {
				local98 = local66 - local83;
			}
			this.aShortArray160[local72] = (short) (local98 | local83 << 8);
		}
		local60 = Static625.anInt10177 + (local60 << Static185.anInt3178);
		@Pc(153) int local153 = Static70.anIntArray71 == null ? Static310.anIntArray309[Static372.method5335(arg1.method8363()) & 0xFFFF] : Static70.anIntArray71[arg1.method8363()];
		local83 = arg1.method8374();
		this.anInt10791 = local83 & 0x1F;
		this.anInt10795 = (local83 & 0xE0) << 3;
		if (this.anInt10791 != 31) {
			this.method9110();
		}
		this.method9111(local50, local44, local153, arg0, local60, local56);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBIII)V")
	public void method9109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10785 = arg1;
		this.anInt10790 = arg0;
		this.anInt10788 = arg2;
		this.anInt10792 = arg3;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	private void method9110() {
		@Pc(16) int local16 = this.anInt10791;
		if (local16 == 2) {
			this.anInt10790 = 0;
			this.anInt10785 = 2048;
			this.anInt10792 = 1;
			this.anInt10788 = 2048;
		} else if (local16 == 3) {
			this.anInt10788 = 4096;
			this.anInt10790 = 0;
			this.anInt10785 = 2048;
			this.anInt10792 = 1;
		} else if (local16 == 4) {
			this.anInt10790 = 0;
			this.anInt10792 = 4;
			this.anInt10788 = 2048;
			this.anInt10785 = 2048;
		} else if (local16 == 5) {
			this.anInt10788 = 8192;
			this.anInt10785 = 2048;
			this.anInt10792 = 4;
			this.anInt10790 = 0;
		} else if (local16 == 12) {
			this.anInt10792 = 2;
			this.anInt10788 = 2048;
			this.anInt10785 = 2048;
			this.anInt10790 = 0;
		} else if (local16 == 13) {
			this.anInt10792 = 2;
			this.anInt10788 = 8192;
			this.anInt10785 = 2048;
			this.anInt10790 = 0;
		} else if (local16 == 10) {
			this.anInt10790 = 1536;
			this.anInt10788 = 2048;
			this.anInt10792 = 3;
			this.anInt10785 = 512;
		} else if (local16 == 11) {
			this.anInt10792 = 3;
			this.anInt10790 = 1536;
			this.anInt10788 = 4096;
			this.anInt10785 = 512;
		} else if (local16 == 6) {
			this.anInt10792 = 3;
			this.anInt10785 = 768;
			this.anInt10790 = 1280;
			this.anInt10788 = 2048;
		} else if (local16 == 7) {
			this.anInt10788 = 4096;
			this.anInt10785 = 768;
			this.anInt10792 = 3;
			this.anInt10790 = 1280;
		} else if (local16 == 8) {
			this.anInt10792 = 3;
			this.anInt10788 = 2048;
			this.anInt10785 = 1024;
			this.anInt10790 = 1024;
		} else if (local16 == 9) {
			this.anInt10790 = 1024;
			this.anInt10792 = 3;
			this.anInt10785 = 1024;
			this.anInt10788 = 4096;
		} else if (local16 == 14) {
			this.anInt10792 = 1;
			this.anInt10790 = 1280;
			this.anInt10785 = 768;
			this.anInt10788 = 2048;
		} else if (local16 == 15) {
			this.anInt10792 = 1;
			this.anInt10790 = 1536;
			this.anInt10785 = 512;
			this.anInt10788 = 4096;
		} else if (local16 == 16) {
			this.anInt10788 = 8192;
			this.anInt10792 = 1;
			this.anInt10785 = 256;
			this.anInt10790 = 1792;
		} else {
			this.anInt10790 = 0;
			this.anInt10788 = 2048;
			this.anInt10792 = 0;
			this.anInt10785 = 2048;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIILclient!ha;II)V")
	private void method9111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class132 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub17_3 = arg3.method7501(arg1, arg5, arg0, arg4, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZB)V")
	public void method9112(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(19) int local19;
		if (arg1) {
			local19 = 2048;
		} else {
			@Pc(34) int local34 = this.anInt10795 + this.anInt10788 * arg0 / 50 & 0x7FF;
			@Pc(37) int local37 = this.anInt10792;
			if (local37 == 1) {
				local19 = (Class6_Sub1_Sub3.anIntArray56[local34 << 3] >> 4) + 1024;
			} else if (local37 == 3) {
				local19 = Static148.anIntArray147[local34] >> 1;
			} else if (local37 == 4) {
				local19 = local34 >> 10 << 11;
			} else if (local37 == 2) {
				local19 = local34;
			} else if (local37 == 5) {
				local19 = (local34 < 1024 ? local34 : 2048 - local34) << 1;
			} else {
				local19 = 2048;
			}
		}
		this.aClass6_Sub17_3.method8523((float) (this.anInt10790 + (local19 * this.anInt10785 >> 11)) / 2048.0F);
	}
}

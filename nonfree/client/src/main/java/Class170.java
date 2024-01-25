import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class170 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
	public boolean aBoolean347;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	private int anInt4833;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
	public boolean aBoolean348;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
	private int anInt4837;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public int anInt4839;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	private int anInt4840;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!jd;")
	public Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	public int anInt4842;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	private int anInt4844;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	private int anInt4847;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	private Class170() {
		if (Static451.anIntArray634 == null) {
			Static264.method3953();
		}
		this.method3897();
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ya;Lclient!si;I)V")
	public Class170(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2) {
		if (Static451.anIntArray634 == null) {
			Static264.method3953();
		}
		this.anInt4842 = arg1.method5495();
		this.aBoolean347 = (this.anInt4842 & 0x10) != 0;
		this.aBoolean348 = (this.anInt4842 & 0x8) != 0;
		this.anInt4842 &= 0x7;
		@Pc(50) int local50 = arg1.method5500() << arg2;
		@Pc(56) int local56 = arg1.method5500() << arg2;
		@Pc(62) int local62 = arg1.method5500() << arg2;
		@Pc(66) int local66 = arg1.method5495();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray77 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray77.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5500();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			if (local72 - local89 < local93) {
				local93 = local72 - local89;
			}
			this.aShortArray77[local78] = (short) (local89 << 8 | local93);
		}
		local66 = Static414.anInt6898 + (local66 << Static307.anInt5425);
		@Pc(155) int local155 = Static199.anIntArray337 == null ? Static244.anIntArray595[Static70.method1330(arg1.method5500()) & 0xFFFF] : Static199.anIntArray337[arg1.method5500()];
		local89 = arg1.method5495();
		this.anInt4840 = (local89 & 0xE0) << 3;
		this.anInt4839 = local89 & 0x1F;
		if (this.anInt4839 != 31) {
			this.method3897();
		}
		this.method3901(arg0, local155, local62, local66, local50, local56);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	private void method3897() {
		@Pc(8) int local8 = this.anInt4839;
		if (local8 == 2) {
			this.anInt4844 = 2048;
			this.anInt4847 = 2048;
			this.anInt4837 = 0;
			this.anInt4833 = 1;
		} else if (local8 == 3) {
			this.anInt4833 = 1;
			this.anInt4844 = 2048;
			this.anInt4837 = 0;
			this.anInt4847 = 4096;
		} else if (local8 == 4) {
			this.anInt4833 = 4;
			this.anInt4837 = 0;
			this.anInt4847 = 2048;
			this.anInt4844 = 2048;
		} else if (local8 == 5) {
			this.anInt4833 = 4;
			this.anInt4837 = 0;
			this.anInt4844 = 2048;
			this.anInt4847 = 8192;
		} else if (local8 == 12) {
			this.anInt4837 = 0;
			this.anInt4844 = 2048;
			this.anInt4833 = 2;
			this.anInt4847 = 2048;
		} else if (local8 == 13) {
			this.anInt4833 = 2;
			this.anInt4837 = 0;
			this.anInt4844 = 2048;
			this.anInt4847 = 8192;
		} else if (local8 == 10) {
			this.anInt4847 = 2048;
			this.anInt4833 = 3;
			this.anInt4837 = 1536;
			this.anInt4844 = 512;
		} else if (local8 == 11) {
			this.anInt4844 = 512;
			this.anInt4837 = 1536;
			this.anInt4833 = 3;
			this.anInt4847 = 4096;
		} else if (local8 == 6) {
			this.anInt4833 = 3;
			this.anInt4844 = 768;
			this.anInt4837 = 1280;
			this.anInt4847 = 2048;
		} else if (local8 == 7) {
			this.anInt4833 = 3;
			this.anInt4844 = 768;
			this.anInt4837 = 1280;
			this.anInt4847 = 4096;
		} else if (local8 == 8) {
			this.anInt4833 = 3;
			this.anInt4847 = 2048;
			this.anInt4837 = 1024;
			this.anInt4844 = 1024;
		} else if (local8 == 9) {
			this.anInt4844 = 1024;
			this.anInt4847 = 4096;
			this.anInt4837 = 1024;
			this.anInt4833 = 3;
		} else if (local8 == 14) {
			this.anInt4847 = 2048;
			this.anInt4833 = 1;
			this.anInt4844 = 768;
			this.anInt4837 = 1280;
		} else if (local8 == 15) {
			this.anInt4837 = 1536;
			this.anInt4844 = 512;
			this.anInt4833 = 1;
			this.anInt4847 = 4096;
		} else if (local8 == 16) {
			this.anInt4844 = 256;
			this.anInt4847 = 8192;
			this.anInt4837 = 1792;
			this.anInt4833 = 1;
		} else {
			this.anInt4844 = 2048;
			this.anInt4837 = 0;
			this.anInt4847 = 2048;
			this.anInt4833 = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	public void method3900(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(66) int local66;
		if (arg1) {
			local66 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt4840 + arg0 * this.anInt4847 / 50 & 0x7FF;
			@Pc(31) int local31 = this.anInt4833;
			if (local31 == 1) {
				local66 = (Class162.anIntArray388[local28 << 3] >> 5) + 1024;
			} else if (local31 == 3) {
				local66 = Static451.anIntArray634[local28] >> 1;
			} else if (local31 == 4) {
				local66 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local66 = local28;
			} else if (local31 == 5) {
				local66 = (local28 < 1024 ? local28 : 2048 - local28) << 1;
			} else {
				local66 = 2048;
			}
		}
		this.aClass2_Sub20_1.method5738((float) ((this.anInt4844 * local66 >> 11) + this.anInt4837) / 2048.0F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ya;IIIIBI)V")
	private void method3901(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub20_1 = arg0.method4478(arg4, arg2, arg5, arg3, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public void method3903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4847 = arg0;
		this.anInt4844 = arg2;
		this.anInt4833 = arg3;
		this.anInt4837 = arg1;
	}
}

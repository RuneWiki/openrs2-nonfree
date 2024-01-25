import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class111 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private int anInt2913;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	private int anInt2918;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!rd;")
	public Class5_Sub19 aClass5_Sub19_2;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	private Class111() {
		if (Static159.anIntArray151 == null) {
			Static49.method791();
		}
		this.method2363();
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!za;Lclient!fh;I)V")
	public Class111(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class5_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static159.anIntArray151 == null) {
			Static49.method791();
		}
		this.anInt2911 = arg1.method5539();
		this.aBoolean183 = (this.anInt2911 & 0x10) != 0;
		this.aBoolean184 = (this.anInt2911 & 0x8) != 0;
		this.anInt2911 &= 0x7;
		@Pc(44) int local44 = arg1.method5598() << arg2;
		@Pc(50) int local50 = arg1.method5598() << arg2;
		@Pc(56) int local56 = arg1.method5598() << arg2;
		@Pc(60) int local60 = arg1.method5539();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray33 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray33.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method5598();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray33[local72] = (short) (local83 << 8 | local94);
		}
		local60 = Static301.anInt4709 + (local60 << Static419.anInt6980);
		@Pc(149) int local149 = Static219.anIntArray223 == null ? Static175.anIntArray132[Static297.method3688(arg1.method5598()) & 0xFFFF] : Static219.anIntArray223[arg1.method5598()];
		local83 = arg1.method5539();
		this.anInt2920 = (local83 & 0xE0) << 3;
		this.anInt2915 = local83 & 0x1F;
		if (this.anInt2915 != 31) {
			this.method2363();
		}
		this.method2360(local149, local50, local56, arg0, local60, local44);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
	public void method2359(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(58) int local58;
		if (arg1) {
			local58 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt2920 + arg0 * this.anInt2913 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt2918;
			if (local27 == 1) {
				local58 = (Class30.anIntArray38[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local58 = Static159.anIntArray151[local24] >> 1;
			} else if (local27 == 4) {
				local58 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local58 = local24;
			} else if (local27 == 5) {
				local58 = (local24 < 1024 ? local24 : 2048 - local24) << 1;
			} else {
				local58 = 2048;
			}
		}
		this.aClass5_Sub19_2.method4980((float) ((this.anInt2916 * local58 >> 11) + this.anInt2910) / 2048.0F);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZILclient!za;II)V")
	private void method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class200 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub19_2 = arg3.method5858(arg5, arg2, arg1, arg4, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	private void method2363() {
		@Pc(10) int local10 = this.anInt2915;
		if (local10 == 2) {
			this.anInt2910 = 0;
			this.anInt2913 = 2048;
			this.anInt2916 = 2048;
			this.anInt2918 = 1;
		} else if (local10 == 3) {
			this.anInt2910 = 0;
			this.anInt2913 = 4096;
			this.anInt2918 = 1;
			this.anInt2916 = 2048;
		} else if (local10 == 4) {
			this.anInt2910 = 0;
			this.anInt2918 = 4;
			this.anInt2916 = 2048;
			this.anInt2913 = 2048;
		} else if (local10 == 5) {
			this.anInt2910 = 0;
			this.anInt2913 = 8192;
			this.anInt2918 = 4;
			this.anInt2916 = 2048;
		} else if (local10 == 12) {
			this.anInt2916 = 2048;
			this.anInt2918 = 2;
			this.anInt2913 = 2048;
			this.anInt2910 = 0;
		} else if (local10 == 13) {
			this.anInt2916 = 2048;
			this.anInt2913 = 8192;
			this.anInt2910 = 0;
			this.anInt2918 = 2;
		} else if (local10 == 10) {
			this.anInt2910 = 1536;
			this.anInt2918 = 3;
			this.anInt2916 = 512;
			this.anInt2913 = 2048;
		} else if (local10 == 11) {
			this.anInt2913 = 4096;
			this.anInt2910 = 1536;
			this.anInt2918 = 3;
			this.anInt2916 = 512;
		} else if (local10 == 6) {
			this.anInt2913 = 2048;
			this.anInt2910 = 1280;
			this.anInt2916 = 768;
			this.anInt2918 = 3;
		} else if (local10 == 7) {
			this.anInt2910 = 1280;
			this.anInt2916 = 768;
			this.anInt2913 = 4096;
			this.anInt2918 = 3;
		} else if (local10 == 8) {
			this.anInt2918 = 3;
			this.anInt2916 = 1024;
			this.anInt2910 = 1024;
			this.anInt2913 = 2048;
		} else if (local10 == 9) {
			this.anInt2913 = 4096;
			this.anInt2918 = 3;
			this.anInt2916 = 1024;
			this.anInt2910 = 1024;
		} else if (local10 == 14) {
			this.anInt2910 = 1280;
			this.anInt2913 = 2048;
			this.anInt2918 = 1;
			this.anInt2916 = 768;
		} else if (local10 == 15) {
			this.anInt2918 = 1;
			this.anInt2916 = 512;
			this.anInt2913 = 4096;
			this.anInt2910 = 1536;
		} else if (local10 == 16) {
			this.anInt2918 = 1;
			this.anInt2910 = 1792;
			this.anInt2916 = 256;
			this.anInt2913 = 8192;
		} else {
			this.anInt2913 = 2048;
			this.anInt2910 = 0;
			this.anInt2918 = 0;
			this.anInt2916 = 2048;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
	public void method2364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2913 = arg3;
		this.anInt2916 = arg1;
		this.anInt2918 = arg0;
		this.anInt2910 = arg2;
	}
}

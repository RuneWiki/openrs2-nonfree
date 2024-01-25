import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class93 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	public int anInt2922;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	private int anInt2923;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
	private int anInt2925;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Z")
	public boolean aBoolean254;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	private int anInt2926;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public int anInt2927;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!bh;")
	public Class2_Sub4 aClass2_Sub4_3;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "[S")
	public short[] aShortArray37;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
	private int anInt2932;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	private int anInt2934;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	private Class93() {
		if (Static642.anIntArray742 == null) {
			Static441.method6545();
		}
		this.method2519();
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ha;Lclient!ud;I)V")
	public Class93(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class2_Sub34 arg1, @OriginalArg(2) int arg2) {
		if (Static642.anIntArray742 == null) {
			Static441.method6545();
		}
		this.anInt2922 = arg1.method6904();
		this.aBoolean255 = (this.anInt2922 & 0x10) != 0;
		this.aBoolean254 = (this.anInt2922 & 0x8) != 0;
		this.anInt2922 &= 0x7;
		@Pc(47) int local47 = arg1.method6884() << arg2;
		@Pc(53) int local53 = arg1.method6884() << arg2;
		@Pc(59) int local59 = arg1.method6884() << arg2;
		@Pc(63) int local63 = arg1.method6904();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray37 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray37.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method6884();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(97) int local97 = local82 & 0xFF;
			if (local69 - local86 < local97) {
				local97 = local69 - local86;
			}
			this.aShortArray37[local75] = (short) (local97 | local86 << 8);
		}
		local63 = (local63 << Static415.anInt7579) + Static290.anInt5464;
		@Pc(153) int local153 = Static349.anIntArray394 == null ? Static562.anIntArray652[Static415.method6349(arg1.method6884()) & 0xFFFF] : Static349.anIntArray394[arg1.method6884()];
		local86 = arg1.method6904();
		this.anInt2927 = local86 & 0x1F;
		this.anInt2932 = (local86 & 0xE0) << 3;
		if (this.anInt2927 != 31) {
			this.method2519();
		}
		this.method2515(local59, local153, local63, arg0, local53, local47);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZB)V")
	public void method2514(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) int local52;
		if (arg1) {
			local52 = 2048;
		} else {
			@Pc(23) int local23 = arg0 * this.anInt2926 / 50 + this.anInt2932 & 0x7FF;
			@Pc(26) int local26 = this.anInt2923;
			if (local26 == 1) {
				local52 = (Class353.anIntArray681[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local52 = Static642.anIntArray742[local23] >> 1;
			} else if (local26 == 4) {
				local52 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local52 = local23;
			} else if (local26 == 5) {
				local52 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local52 = 2048;
			}
		}
		this.aClass2_Sub4_3.method8149((float) ((this.anInt2925 * local52 >> 11) + this.anInt2934) / 2048.0F);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILclient!ha;III)V")
	private void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub4_3 = arg3.method7928(arg5, arg0, arg4, arg2, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIIII)V")
	public void method2517(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2923 = arg0;
		this.anInt2934 = arg2;
		this.anInt2925 = arg3;
		this.anInt2926 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	private void method2519() {
		@Pc(12) int local12 = this.anInt2927;
		if (local12 == 2) {
			this.anInt2934 = 0;
			this.anInt2926 = 2048;
			this.anInt2925 = 2048;
			this.anInt2923 = 1;
		} else if (local12 == 3) {
			this.anInt2934 = 0;
			this.anInt2926 = 4096;
			this.anInt2925 = 2048;
			this.anInt2923 = 1;
		} else if (local12 == 4) {
			this.anInt2926 = 2048;
			this.anInt2925 = 2048;
			this.anInt2934 = 0;
			this.anInt2923 = 4;
		} else if (local12 == 5) {
			this.anInt2926 = 8192;
			this.anInt2934 = 0;
			this.anInt2923 = 4;
			this.anInt2925 = 2048;
		} else if (local12 == 12) {
			this.anInt2925 = 2048;
			this.anInt2923 = 2;
			this.anInt2926 = 2048;
			this.anInt2934 = 0;
		} else if (local12 == 13) {
			this.anInt2926 = 8192;
			this.anInt2925 = 2048;
			this.anInt2923 = 2;
			this.anInt2934 = 0;
		} else if (local12 == 10) {
			this.anInt2926 = 2048;
			this.anInt2923 = 3;
			this.anInt2925 = 512;
			this.anInt2934 = 1536;
		} else if (local12 == 11) {
			this.anInt2926 = 4096;
			this.anInt2923 = 3;
			this.anInt2925 = 512;
			this.anInt2934 = 1536;
		} else if (local12 == 6) {
			this.anInt2934 = 1280;
			this.anInt2925 = 768;
			this.anInt2926 = 2048;
			this.anInt2923 = 3;
		} else if (local12 == 7) {
			this.anInt2923 = 3;
			this.anInt2934 = 1280;
			this.anInt2926 = 4096;
			this.anInt2925 = 768;
		} else if (local12 == 8) {
			this.anInt2926 = 2048;
			this.anInt2923 = 3;
			this.anInt2925 = 1024;
			this.anInt2934 = 1024;
		} else if (local12 == 9) {
			this.anInt2926 = 4096;
			this.anInt2934 = 1024;
			this.anInt2923 = 3;
			this.anInt2925 = 1024;
		} else if (local12 == 14) {
			this.anInt2926 = 2048;
			this.anInt2923 = 1;
			this.anInt2925 = 768;
			this.anInt2934 = 1280;
		} else if (local12 == 15) {
			this.anInt2923 = 1;
			this.anInt2926 = 4096;
			this.anInt2925 = 512;
			this.anInt2934 = 1536;
		} else if (local12 == 16) {
			this.anInt2923 = 1;
			this.anInt2926 = 8192;
			this.anInt2934 = 1792;
			this.anInt2925 = 256;
		} else {
			this.anInt2925 = 2048;
			this.anInt2926 = 2048;
			this.anInt2934 = 0;
			this.anInt2923 = 0;
		}
	}
}

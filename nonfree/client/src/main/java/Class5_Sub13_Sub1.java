import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class5_Sub13_Sub1 extends Class5_Sub13 {

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public int anInt2085;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
	private int anInt2089;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	public int anInt2094;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	private int anInt2095;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	private int anInt2097;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	private Class5_Sub13_Sub1() {
		if (Static79.anIntArray103 == null) {
			Static132.method2688();
		}
		this.method1927();
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class5_Sub13_Sub1(@OriginalArg(0) Class5_Sub1 arg0) {
		if (Static79.anIntArray103 == null) {
			Static132.method2688();
		}
		this.anInt2094 = arg0.method1832();
		this.aBoolean132 = (this.anInt2094 & 0x10) != 0;
		this.aBoolean131 = (this.anInt2094 & 0x8) != 0;
		this.anInt2094 &= 0x7;
		super.anInt2080 = arg0.method1845();
		super.anInt2082 = arg0.method1845();
		super.anInt2076 = arg0.method1845();
		super.anInt2079 = arg0.method1832();
		@Pc(68) int local68 = super.anInt2079 * 2 + 1;
		this.aShortArray17 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray17.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method1845();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local68 <= local85) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray17[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt2079 = (super.anInt2079 << 7) + 64;
		if (Static169.anIntArray252 == null) {
			super.anInt2077 = Static82.anIntArray113[Static352.method5794(arg0.method1845()) & 0xFFFF];
		} else {
			super.anInt2077 = Static169.anIntArray252[arg0.method1845()];
		}
		@Pc(161) int local161 = arg0.method1832();
		this.anInt2086 = (local161 & 0xE0) << 3;
		this.anInt2085 = local161 & 0x1F;
		if (this.anInt2085 != 31) {
			this.method1927();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIZ)V")
	public void method1925(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(50) int local50;
		if (arg1) {
			local50 = 2048;
		} else {
			@Pc(20) int local20 = this.anInt2086 + this.anInt2096 * arg0 / 50 & 0x7FF;
			@Pc(23) int local23 = this.anInt2097;
			if (local23 == 1) {
				local50 = (Class5_Sub9_Sub12.anIntArray169[local20 << 3] >> 5) + 1024;
			} else if (local23 == 3) {
				local50 = Static79.anIntArray103[local20] >> 1;
			} else if (local23 == 4) {
				local50 = local20 >> 10 << 11;
			} else if (local23 == 2) {
				local50 = local20;
			} else if (local23 == 5) {
				local50 = (local20 < 1024 ? local20 : 2048 - local20) << 1;
			} else {
				local50 = 2048;
			}
		}
		super.aFloat29 = (float) ((local50 * this.anInt2089 >> 11) + this.anInt2095) / 2048.0F;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIBI)V")
	public void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2095 = arg2;
		this.anInt2096 = arg0;
		this.anInt2089 = arg1;
		this.anInt2097 = arg3;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	private void method1927() {
		@Pc(4) int local4 = this.anInt2085;
		if (local4 == 2) {
			this.anInt2095 = 0;
			this.anInt2097 = 1;
			this.anInt2096 = 2048;
			this.anInt2089 = 2048;
		} else if (local4 == 3) {
			this.anInt2095 = 0;
			this.anInt2097 = 1;
			this.anInt2096 = 4096;
			this.anInt2089 = 2048;
		} else if (local4 == 4) {
			this.anInt2096 = 2048;
			this.anInt2089 = 2048;
			this.anInt2095 = 0;
			this.anInt2097 = 4;
		} else if (local4 == 5) {
			this.anInt2089 = 2048;
			this.anInt2097 = 4;
			this.anInt2095 = 0;
			this.anInt2096 = 8192;
		} else if (local4 == 12) {
			this.anInt2089 = 2048;
			this.anInt2095 = 0;
			this.anInt2096 = 2048;
			this.anInt2097 = 2;
		} else if (local4 == 13) {
			this.anInt2089 = 2048;
			this.anInt2096 = 8192;
			this.anInt2095 = 0;
			this.anInt2097 = 2;
		} else if (local4 == 10) {
			this.anInt2089 = 512;
			this.anInt2096 = 2048;
			this.anInt2097 = 3;
			this.anInt2095 = 1536;
		} else if (local4 == 11) {
			this.anInt2095 = 1536;
			this.anInt2096 = 4096;
			this.anInt2089 = 512;
			this.anInt2097 = 3;
		} else if (local4 == 6) {
			this.anInt2096 = 2048;
			this.anInt2095 = 1280;
			this.anInt2089 = 768;
			this.anInt2097 = 3;
		} else if (local4 == 7) {
			this.anInt2095 = 1280;
			this.anInt2096 = 4096;
			this.anInt2097 = 3;
			this.anInt2089 = 768;
		} else if (local4 == 8) {
			this.anInt2096 = 2048;
			this.anInt2095 = 1024;
			this.anInt2089 = 1024;
			this.anInt2097 = 3;
		} else if (local4 == 9) {
			this.anInt2095 = 1024;
			this.anInt2096 = 4096;
			this.anInt2089 = 1024;
			this.anInt2097 = 3;
		} else if (local4 == 14) {
			this.anInt2089 = 768;
			this.anInt2096 = 2048;
			this.anInt2097 = 1;
			this.anInt2095 = 1280;
		} else if (local4 == 15) {
			this.anInt2089 = 512;
			this.anInt2095 = 1536;
			this.anInt2097 = 1;
			this.anInt2096 = 4096;
		} else if (local4 == 16) {
			this.anInt2096 = 8192;
			this.anInt2097 = 1;
			this.anInt2095 = 1792;
			this.anInt2089 = 256;
		} else {
			this.anInt2089 = 2048;
			this.anInt2095 = 0;
			this.anInt2096 = 2048;
			this.anInt2097 = 0;
		}
	}
}

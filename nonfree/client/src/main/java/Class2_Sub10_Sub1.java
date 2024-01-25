import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	private int anInt4049;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
	private int anInt4053;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
	private int anInt4055;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "Z")
	public boolean aBoolean342;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt4058;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	private Class2_Sub10_Sub1() {
		if (Static164.anIntArray290 == null) {
			Static319.method5303();
		}
		this.method3481();
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) Class2_Sub12 arg0) {
		if (Static164.anIntArray290 == null) {
			Static319.method5303();
		}
		this.anInt4052 = arg0.method3124();
		this.aBoolean343 = (this.anInt4052 & 0x10) != 0;
		this.aBoolean342 = (this.anInt4052 & 0x8) != 0;
		this.anInt4052 &= 0x7;
		super.anInt4039 = arg0.method3104();
		super.anInt4043 = arg0.method3104();
		super.anInt4045 = arg0.method3104();
		super.anInt4042 = arg0.method3124();
		@Pc(68) int local68 = super.anInt4042 * 2 + 1;
		this.aShortArray59 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray59.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method3104();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray59[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt4042 = Static31.anInt496 + (super.anInt4042 << Static325.anInt6336);
		if (Static354.anIntArray519 == null) {
			super.anInt4041 = Static233.anIntArray394[Static54.method1201(arg0.method3104()) & 0xFFFF];
		} else {
			super.anInt4041 = Static354.anIntArray519[arg0.method3104()];
		}
		@Pc(165) int local165 = arg0.method3124();
		this.anInt4060 = local165 & 0x1F;
		this.anInt4049 = (local165 & 0xE0) << 3;
		if (this.anInt4060 != 31) {
			this.method3481();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4055 = arg2;
		this.anInt4058 = arg3;
		this.anInt4053 = arg1;
		this.anInt4051 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZI)V")
	public void method3479(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		if (arg0) {
			local19 = 2048;
		} else {
			@Pc(33) int local33 = this.anInt4051 * arg1 / 50 + this.anInt4049 & 0x7FF;
			@Pc(36) int local36 = this.anInt4055;
			if (local36 == 1) {
				local19 = (Class101.anIntArray234[local33 << 3] >> 5) + 1024;
			} else if (local36 == 3) {
				local19 = Static164.anIntArray290[local33] >> 1;
			} else if (local36 == 4) {
				local19 = local33 >> 10 << 11;
			} else if (local36 == 2) {
				local19 = local33;
			} else if (local36 == 5) {
				local19 = (local33 < 1024 ? local33 : 2048 - local33) << 1;
			} else {
				local19 = 2048;
			}
		}
		super.aFloat42 = (float) ((this.anInt4058 * local19 >> 11) + this.anInt4053) / 2048.0F;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	private void method3481() {
		@Pc(11) int local11 = this.anInt4060;
		if (local11 == 2) {
			this.anInt4058 = 2048;
			this.anInt4053 = 0;
			this.anInt4051 = 2048;
			this.anInt4055 = 1;
		} else if (local11 == 3) {
			this.anInt4055 = 1;
			this.anInt4058 = 2048;
			this.anInt4053 = 0;
			this.anInt4051 = 4096;
		} else if (local11 == 4) {
			this.anInt4055 = 4;
			this.anInt4058 = 2048;
			this.anInt4053 = 0;
			this.anInt4051 = 2048;
		} else if (local11 == 5) {
			this.anInt4051 = 8192;
			this.anInt4055 = 4;
			this.anInt4053 = 0;
			this.anInt4058 = 2048;
		} else if (local11 == 12) {
			this.anInt4055 = 2;
			this.anInt4051 = 2048;
			this.anInt4058 = 2048;
			this.anInt4053 = 0;
		} else if (local11 == 13) {
			this.anInt4058 = 2048;
			this.anInt4051 = 8192;
			this.anInt4053 = 0;
			this.anInt4055 = 2;
		} else if (local11 == 10) {
			this.anInt4055 = 3;
			this.anInt4053 = 1536;
			this.anInt4051 = 2048;
			this.anInt4058 = 512;
		} else if (local11 == 11) {
			this.anInt4055 = 3;
			this.anInt4053 = 1536;
			this.anInt4058 = 512;
			this.anInt4051 = 4096;
		} else if (local11 == 6) {
			this.anInt4051 = 2048;
			this.anInt4055 = 3;
			this.anInt4058 = 768;
			this.anInt4053 = 1280;
		} else if (local11 == 7) {
			this.anInt4053 = 1280;
			this.anInt4058 = 768;
			this.anInt4051 = 4096;
			this.anInt4055 = 3;
		} else if (local11 == 8) {
			this.anInt4058 = 1024;
			this.anInt4055 = 3;
			this.anInt4053 = 1024;
			this.anInt4051 = 2048;
		} else if (local11 == 9) {
			this.anInt4051 = 4096;
			this.anInt4058 = 1024;
			this.anInt4055 = 3;
			this.anInt4053 = 1024;
		} else if (local11 == 14) {
			this.anInt4053 = 1280;
			this.anInt4055 = 1;
			this.anInt4058 = 768;
			this.anInt4051 = 2048;
		} else if (local11 == 15) {
			this.anInt4053 = 1536;
			this.anInt4051 = 4096;
			this.anInt4055 = 1;
			this.anInt4058 = 512;
		} else if (local11 == 16) {
			this.anInt4058 = 256;
			this.anInt4051 = 8192;
			this.anInt4053 = 1792;
			this.anInt4055 = 1;
		} else {
			this.anInt4058 = 2048;
			this.anInt4053 = 0;
			this.anInt4051 = 2048;
			this.anInt4055 = 0;
		}
	}
}

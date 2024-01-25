import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class14_Sub13_Sub1 extends Class14_Sub13 {

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
	private int anInt5645;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
	public int anInt5646;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "Z")
	public boolean aBoolean372;

	@OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
	private int anInt5649;

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
	public int anInt5650;

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
	private int anInt5652;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
	private int anInt5653;

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "Z")
	public boolean aBoolean373;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	private Class14_Sub13_Sub1() {
		if (Static288.anIntArray504 == null) {
			Static307.method2743();
		}
		this.method5026();
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class14_Sub13_Sub1(@OriginalArg(0) Class14_Sub4 arg0) {
		if (Static288.anIntArray504 == null) {
			Static307.method2743();
		}
		this.anInt5650 = arg0.method2548();
		this.aBoolean373 = (this.anInt5650 & 0x10) != 0;
		this.aBoolean372 = (this.anInt5650 & 0x8) != 0;
		this.anInt5650 &= 0x7;
		super.anInt5640 = arg0.method2498();
		super.anInt5638 = arg0.method2498();
		super.anInt5635 = arg0.method2498();
		super.anInt5639 = arg0.method2548();
		@Pc(68) int local68 = super.anInt5639 * 2 + 1;
		this.aShortArray113 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray113.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method2498();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local89 > local68 - local85) {
				local89 = local68 - local85;
			}
			this.aShortArray113[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt5639 = (super.anInt5639 << 7) + 64;
		if (Static50.anIntArray75 == null) {
			super.anInt5637 = Static71.anIntArray514[Static32.method786(arg0.method2498()) & 0xFFFF];
		} else {
			super.anInt5637 = Static50.anIntArray75[arg0.method2498()];
		}
		@Pc(164) int local164 = arg0.method2548();
		this.anInt5653 = (local164 & 0xE0) << 3;
		this.anInt5646 = local164 & 0x1F;
		if (this.anInt5646 != 31) {
			this.method5026();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIII)V")
	public void method5023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5649 = arg1;
		this.anInt5645 = arg0;
		this.anInt5647 = arg2;
		this.anInt5652 = arg3;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIZ)V")
	public void method5025(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(56) int local56;
		if (arg1) {
			local56 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt5653 + arg0 * this.anInt5645 / 50 & 0x7FF;
			@Pc(22) int local22 = this.anInt5652;
			if (local22 == 1) {
				local56 = (Class14_Sub3_Sub34.anIntArray547[local19 << 3] >> 5) + 1024;
			} else if (local22 == 3) {
				local56 = Static288.anIntArray504[local19] >> 1;
			} else if (local22 == 4) {
				local56 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local56 = local19;
			} else if (local22 == 5) {
				local56 = (local19 < 1024 ? local19 : 2048 - local19) << 1;
			} else {
				local56 = 2048;
			}
		}
		super.aFloat105 = (float) ((local56 * this.anInt5649 >> 11) + this.anInt5647) / 2048.0F;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
	private void method5026() {
		@Pc(8) int local8 = this.anInt5646;
		if (local8 == 2) {
			this.anInt5647 = 0;
			this.anInt5649 = 2048;
			this.anInt5652 = 1;
			this.anInt5645 = 2048;
		} else if (local8 == 3) {
			this.anInt5649 = 2048;
			this.anInt5647 = 0;
			this.anInt5652 = 1;
			this.anInt5645 = 4096;
		} else if (local8 == 4) {
			this.anInt5649 = 2048;
			this.anInt5652 = 4;
			this.anInt5647 = 0;
			this.anInt5645 = 2048;
		} else if (local8 == 5) {
			this.anInt5652 = 4;
			this.anInt5645 = 8192;
			this.anInt5647 = 0;
			this.anInt5649 = 2048;
		} else if (local8 == 12) {
			this.anInt5645 = 2048;
			this.anInt5649 = 2048;
			this.anInt5652 = 2;
			this.anInt5647 = 0;
		} else if (local8 == 13) {
			this.anInt5652 = 2;
			this.anInt5645 = 8192;
			this.anInt5649 = 2048;
			this.anInt5647 = 0;
		} else if (local8 == 10) {
			this.anInt5649 = 512;
			this.anInt5645 = 2048;
			this.anInt5647 = 1536;
			this.anInt5652 = 3;
		} else if (local8 == 11) {
			this.anInt5647 = 1536;
			this.anInt5649 = 512;
			this.anInt5652 = 3;
			this.anInt5645 = 4096;
		} else if (local8 == 6) {
			this.anInt5645 = 2048;
			this.anInt5649 = 768;
			this.anInt5647 = 1280;
			this.anInt5652 = 3;
		} else if (local8 == 7) {
			this.anInt5645 = 4096;
			this.anInt5647 = 1280;
			this.anInt5652 = 3;
			this.anInt5649 = 768;
		} else if (local8 == 8) {
			this.anInt5649 = 1024;
			this.anInt5645 = 2048;
			this.anInt5647 = 1024;
			this.anInt5652 = 3;
		} else if (local8 == 9) {
			this.anInt5649 = 1024;
			this.anInt5647 = 1024;
			this.anInt5645 = 4096;
			this.anInt5652 = 3;
		} else if (local8 == 14) {
			this.anInt5649 = 768;
			this.anInt5652 = 1;
			this.anInt5647 = 1280;
			this.anInt5645 = 2048;
		} else if (local8 == 15) {
			this.anInt5645 = 4096;
			this.anInt5647 = 1536;
			this.anInt5652 = 1;
			this.anInt5649 = 512;
		} else if (local8 == 16) {
			this.anInt5649 = 256;
			this.anInt5645 = 8192;
			this.anInt5652 = 1;
			this.anInt5647 = 1792;
		} else {
			this.anInt5645 = 2048;
			this.anInt5652 = 0;
			this.anInt5649 = 2048;
			this.anInt5647 = 0;
		}
	}
}

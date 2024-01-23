import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub2_Sub4_Sub1 extends Class4_Sub2_Sub4 {

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "[I")
	public static int[] anIntArray194 = new int[256];

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	public int anInt1805;

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "Lclient!p;")
	public Class4_Sub17 aClass4_Sub17_1;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local6;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray194[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)I")
	@Override
	public int method1601() {
		return this.aClass4_Sub17_1 == null ? 0 : this.aClass4_Sub17_1.anInt2400 * 100 / (this.aClass4_Sub17_1.aByteArray30.length - this.aByte10);
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method1606() {
		if (this.aBoolean157 || this.aClass4_Sub17_1.anInt2400 < this.aClass4_Sub17_1.aByteArray30.length - this.aByte10) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub17_1.aByteArray30;
	}
}

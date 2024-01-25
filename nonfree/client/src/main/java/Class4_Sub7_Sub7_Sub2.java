import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class4_Sub7_Sub7_Sub2 extends Class4_Sub7_Sub7 {

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "[I")
	public static final int[] anIntArray699 = new int[128];

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!eh;")
	public Class4_Sub9 aClass4_Sub9_7;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	public int anInt9269;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "B")
	public byte aByte106;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray699.length; local4++) {
			anIntArray699[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray699[local16] = local16 - 65;
		}
		for (@Pc(29) int local29 = 97; local29 <= 122; local29++) {
			anIntArray699[local29] = local29 + 26 - 97;
		}
		for (@Pc(46) int local46 = 48; local46 <= 57; local46++) {
			anIntArray699[local46] = local46 + 4;
		}
		anIntArray699[45] = anIntArray699[47] = 63;
		anIntArray699[42] = anIntArray699[43] = 62;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7629() {
		if (super.aBoolean642 || this.aClass4_Sub9_7.anInt7219 < this.aClass4_Sub9_7.aByteArray97.length - this.aByte106) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub9_7.aByteArray97;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
	@Override
	public int method7630() {
		return this.aClass4_Sub9_7 == null ? 0 : this.aClass4_Sub9_7.anInt7219 * 100 / (this.aClass4_Sub9_7.aByteArray97.length - this.aByte106);
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!md", name = "E", descriptor = "[I")
	public static int[] anIntArray203 = new int[256];

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "[Lclient!sc;")
	public Class58[] aClass58Array1;

	@OriginalMember(owner = "client!md", name = "H", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "[Lclient!sc;")
	public Class58[] aClass58Array2;

	static {
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(21) int local21 = local18;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1) == 1) {
					local21 = local21 >>> 1 ^ 0xEDB88320;
				} else {
					local21 >>>= 0x1;
				}
			}
			anIntArray203[local18] = local21;
		}
	}
}

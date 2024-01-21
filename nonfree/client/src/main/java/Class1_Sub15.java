import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
	public static int[] anIntArray317 = new int[256];

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	public int anInt2040;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!i;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
	public int anInt2041;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	public int anInt2042;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "Lclient!pd;")
	public Class1_Sub16_Sub1 aClass1_Sub16_Sub1_1;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
	public int anInt2043;

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
	public int anInt2044;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
	public int anInt2045;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	public int anInt2046;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Lclient!uc;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
	public int anInt2049;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	public int anInt2050;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
	public int anInt2054;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!ob", name = "W", descriptor = "Lclient!pf;")
	public Class1_Sub17 aClass1_Sub17_1;

	@OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
	public int anInt2058;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray317[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public void method1446() {
		this.aClass1_Sub16_Sub1_1 = null;
		this.aClass1_Sub8_Sub1_3 = null;
		this.aClass1_Sub17_1 = null;
		this.aClass73_1 = null;
	}
}

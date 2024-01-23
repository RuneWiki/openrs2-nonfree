import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
	public static int[] anIntArray374 = new int[4096];

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "Lclient!tm;")
	public Class159 aClass159_2;

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "[B")
	public byte[] aByteArray66;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray374[local6] = Static239.method3768(local6);
		}
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method2546() {
		if (this.aBoolean233) {
			throw new RuntimeException();
		}
		return this.aByteArray66;
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
	@Override
	public int method2547() {
		return this.aBoolean233 ? 0 : 100;
	}
}

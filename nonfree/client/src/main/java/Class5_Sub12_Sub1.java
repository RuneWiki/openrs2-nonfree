import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class5_Sub12_Sub1 extends Class5_Sub12 {

	@OriginalMember(owner = "client!uf", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray748 = new int[16384];

	@OriginalMember(owner = "client!uf", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray749 = new int[16384];

	static {
		@Pc(11) double local11 = 3.834951969714103E-4D;
		for (@Pc(13) int local13 = 0; local13 < 16384; local13++) {
			anIntArray748[local13] = (int) (Math.sin(local11 * (double) local13) * 16384.0D);
			anIntArray749[local13] = (int) (Math.cos((double) local13 * local11) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IF)V")
	public void method8129(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray104[super.anInt10154++] = (byte) local6;
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 8);
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 16);
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IF)V")
	public void method8130(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 24);
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 16);
		super.aByteArray104[super.anInt10154++] = (byte) (local6 >> 8);
		super.aByteArray104[super.anInt10154++] = (byte) local6;
	}
}

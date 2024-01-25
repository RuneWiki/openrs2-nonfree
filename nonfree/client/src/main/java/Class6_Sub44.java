import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[16384];

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[16384];

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	public final int anInt8800;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	public final int anInt8798;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray63[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray62[local15] = (float) Math.cos((double) local15 * local13);
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
	public Class6_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8800 = arg0;
		this.anInt8798 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
	public int method7359() {
		return Static198.method3733(this.anInt8800);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Z")
	public boolean method7360(@OriginalArg(0) int arg0) {
		return (this.anInt8800 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public int method7361() {
		return this.anInt8800 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)Z")
	public boolean method7363() {
		return (this.anInt8800 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)Z")
	public boolean method7364() {
		return (this.anInt8800 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)Z")
	public boolean method7366() {
		return (this.anInt8800 & 0x1) != 0;
	}
}

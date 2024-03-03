import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!s;")
	public static final Class210 aClass210_7 = new Class210(0, 4);

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_102 = new Class145(45, 3);

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	public final int anInt2674;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	public final int anInt2676;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
	public final int[] anIntArray169;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "[Z")
	public final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
	public final int[] anIntArray168;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[B)V", line = 67)
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2674 = arg0;
		@Pc(11) Class2_Sub4 local11 = new Class2_Sub4(arg1);
		this.anInt2676 = local11.method4816();
		this.anIntArray169 = new int[this.anInt2676];
		this.aBooleanArray25 = new boolean[this.anInt2676];
		this.anIntArrayArray21 = new int[this.anInt2676][];
		this.anIntArray168 = new int[this.anInt2676];
		for (@Pc(38) int local38 = 0; local38 < this.anInt2676; local38++) {
			this.anIntArray168[local38] = local11.method4816();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2676; local58++) {
			this.aBooleanArray25[local58] = local11.method4816() == 1;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt2676; local85++) {
			this.anIntArray169[local85] = local11.method4830();
		}
		for (@Pc(101) int local101 = 0; local101 < this.anInt2676; local101++) {
			this.anIntArrayArray21[local101] = new int[local11.method4816()];
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt2676; local118++) {
			for (@Pc(122) int local122 = 0; local122 < this.anIntArrayArray21[local118].length; local122++) {
				this.anIntArrayArray21[local118][local122] = local11.method4816();
			}
		}
	}
}

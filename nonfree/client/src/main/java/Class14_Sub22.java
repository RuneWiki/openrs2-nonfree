import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class14_Sub22 extends Class14 {

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "[Lclient!pda;")
	public static final Class283[] aClass283Array1 = new Class283[5];

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	public final int anInt5145;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public final int anInt5146;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "[I")
	public final int[] anIntArray284;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
	public final int[] anIntArray285;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray34;

	static {
		for (@Pc(49) int local49 = 0; local49 < aClass283Array1.length; local49++) {
			aClass283Array1[local49] = new Class283();
		}
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[B)V")
	public Class14_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5145 = arg0;
		@Pc(11) Class14_Sub21 local11 = new Class14_Sub21(arg1);
		this.anInt5146 = local11.method7695(121);
		this.anIntArray284 = new int[this.anInt5146];
		this.anIntArray285 = new int[this.anInt5146];
		this.aBooleanArray14 = new boolean[this.anInt5146];
		this.anIntArrayArray34 = new int[this.anInt5146][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt5146; local38++) {
			this.anIntArray285[local38] = local11.method7695(100);
			if (this.anIntArray285[local38] == 6) {
				this.anIntArray285[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt5146; local71++) {
			this.aBooleanArray14[local71] = local11.method7695(105) == 1;
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt5146; local97++) {
			this.anIntArray284[local97] = local11.method7717(-1978450544);
		}
		for (@Pc(117) int local117 = 0; local117 < this.anInt5146; local117++) {
			this.anIntArrayArray34[local117] = new int[local11.method7695(104)];
		}
		for (@Pc(138) int local138 = 0; local138 < this.anInt5146; local138++) {
			for (@Pc(144) int local144 = 0; local144 < this.anIntArrayArray34[local138].length; local144++) {
				this.anIntArrayArray34[local138][local144] = local11.method7695(109);
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!via", name = "l", descriptor = "I")
	public final int anInt10083;

	@OriginalMember(owner = "client!via", name = "t", descriptor = "I")
	public final int anInt10086;

	@OriginalMember(owner = "client!via", name = "p", descriptor = "[I")
	public final int[] anIntArray711;

	@OriginalMember(owner = "client!via", name = "n", descriptor = "[Z")
	public final boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!via", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray110;

	@OriginalMember(owner = "client!via", name = "q", descriptor = "[I")
	public final int[] anIntArray712;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub46(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt10083 = arg0;
		@Pc(9) Class2_Sub17 local9 = new Class2_Sub17(arg1);
		this.anInt10086 = local9.method2859();
		this.anIntArray711 = new int[this.anInt10086];
		this.aBooleanArray29 = new boolean[this.anInt10086];
		this.anIntArrayArray110 = new int[this.anInt10086][];
		this.anIntArray712 = new int[this.anInt10086];
		for (@Pc(36) int local36 = 0; local36 < this.anInt10086; local36++) {
			this.anIntArray712[local36] = local9.method2859();
			if (this.anIntArray712[local36] == 6) {
				this.anIntArray712[local36] = 2;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < this.anInt10086; local66++) {
			this.aBooleanArray29[local66] = local9.method2859() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt10086; local92++) {
			this.anIntArray711[local92] = local9.method2825();
		}
		for (@Pc(111) int local111 = 0; local111 < this.anInt10086; local111++) {
			this.anIntArrayArray110[local111] = new int[local9.method2859()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt10086; local131++) {
			for (@Pc(134) int local134 = 0; local134 < this.anIntArrayArray110[local131].length; local134++) {
				this.anIntArrayArray110[local131][local134] = local9.method2859();
			}
		}
	}
}

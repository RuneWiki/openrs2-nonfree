import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public final int anInt6146;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public final int anInt6147;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "[I")
	public final int[] anIntArray502;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
	public final int[] anIntArray501;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[[I")
	public final int[][] anIntArrayArray60;

	static {
		new Class34("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6146 = arg0;
		@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(arg1);
		this.anInt6147 = local11.method4532();
		this.aBooleanArray27 = new boolean[this.anInt6147];
		this.anIntArray502 = new int[this.anInt6147];
		this.anIntArray501 = new int[this.anInt6147];
		this.anIntArrayArray60 = new int[this.anInt6147][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt6147; local38++) {
			this.anIntArray501[local38] = local11.method4532();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt6147; local54++) {
			this.aBooleanArray27[local54] = local11.method4532() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt6147; local79++) {
			this.anIntArray502[local79] = local11.method4556();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt6147; local99++) {
			this.anIntArrayArray60[local99] = new int[local11.method4532()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt6147; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray60[local116].length; local120++) {
				this.anIntArrayArray60[local116][local120] = local11.method4532();
			}
		}
	}
}

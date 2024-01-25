import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class4_Sub34 extends Class4 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public final int anInt7711;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public final int anInt7712;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "[Z")
	public final boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "[I")
	public final int[] anIntArray391;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "[I")
	public final int[] anIntArray392;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt7711 = arg0;
		@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(arg1);
		this.anInt7712 = local11.method4905();
		this.aBooleanArray24 = new boolean[this.anInt7712];
		this.anIntArray391 = new int[this.anInt7712];
		this.anIntArray392 = new int[this.anInt7712];
		this.anIntArrayArray46 = new int[this.anInt7712][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt7712; local38++) {
			this.anIntArray391[local38] = local11.method4905();
			if (this.anIntArray391[local38] == 6) {
				this.anIntArray391[local38] = 2;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt7712; local65++) {
			this.aBooleanArray24[local65] = local11.method4905() == 1;
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt7712; local86++) {
			this.anIntArray392[local86] = local11.method4936();
		}
		for (@Pc(102) int local102 = 0; local102 < this.anInt7712; local102++) {
			this.anIntArrayArray46[local102] = new int[local11.method4905()];
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt7712; local119++) {
			for (@Pc(123) int local123 = 0; local123 < this.anIntArrayArray46[local119].length; local123++) {
				this.anIntArrayArray46[local119][local123] = local11.method4905();
			}
		}
	}
}

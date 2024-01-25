import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class4_Sub4_Sub22 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	private int anInt4974;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	private int anInt4976;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
	private int anInt4978;

	static {
		new Class15("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub22() {
		this(0);
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
	private Class4_Sub4_Sub22(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3973(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.method3973(arg1.method5008());
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static419.anInt6404; local29++) {
				local19[local29] = this.anInt4974;
				local23[local29] = this.anInt4976;
				local27[local29] = this.anInt4978;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	private void method3973(@OriginalArg(0) int arg0) {
		this.anInt4976 = arg0 >> 4 & 0xFF0;
		this.anInt4978 = (arg0 & 0xFF) << 4;
		this.anInt4974 = arg0 >> 12 & 0xFF0;
	}
}

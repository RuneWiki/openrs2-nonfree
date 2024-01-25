import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class4_Sub3_Sub36 extends Class4_Sub3 {

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
	private int anInt7501;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	private int anInt7504;

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
	private int anInt7505;

	static {
		new Class21("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
	private Class4_Sub3_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6028(arg0);
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
	private void method6028(@OriginalArg(1) int arg0) {
		this.anInt7501 = arg0 >> 4 & 0xFF0;
		this.anInt7504 = (arg0 & 0xFF) << 4;
		this.anInt7505 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.method6028(arg1.method4582());
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static304.anInt5637; local37++) {
				local27[local37] = this.anInt7505;
				local31[local37] = this.anInt7501;
				local35[local37] = this.anInt7504;
			}
		}
		return local11;
	}
}

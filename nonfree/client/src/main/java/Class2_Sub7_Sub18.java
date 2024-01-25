import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class2_Sub7_Sub18 extends Class2_Sub7 {

	@OriginalMember(owner = "client!io", name = "T", descriptor = "I")
	private int anInt3774 = 1024;

	@OriginalMember(owner = "client!io", name = "W", descriptor = "I")
	private int anInt3777 = 3072;

	@OriginalMember(owner = "client!io", name = "N", descriptor = "I")
	private int anInt3768 = 2048;

	static {
		new Class202(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class202("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.anInt3768 = this.anInt3777 - this.anInt3774;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3774 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt3777 = arg1.method5229();
		} else if (arg0 == 2) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(26) int[] local26 = this.method7581(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static352.anInt6485; local28++) {
				local16[local28] = this.anInt3774 + (this.anInt3768 * local26[local28] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7589(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static352.anInt6485; local52++) {
				local42[local52] = this.anInt3774 + (local30[local52] * this.anInt3768 >> 12);
				local46[local52] = (this.anInt3768 * local34[local52] >> 12) + this.anInt3774;
				local50[local52] = this.anInt3774 + (local38[local52] * this.anInt3768 >> 12);
			}
		}
		return local16;
	}
}

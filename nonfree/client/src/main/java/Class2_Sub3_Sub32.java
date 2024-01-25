import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class2_Sub3_Sub32 extends Class2_Sub3 {

	@OriginalMember(owner = "client!um", name = "G", descriptor = "I")
	private int anInt6425 = 3072;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	private int anInt6428 = 2048;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "I")
	private int anInt6432 = 1024;

	static {
		new Class140("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(29) int[] local29 = this.method5700(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static263.anInt5504; local31++) {
				local11[local31] = (local29[local31] * this.anInt6428 >> 12) + this.anInt6432;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(21) int[][] local21 = this.method5707(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static263.anInt5504; local47++) {
				local37[local47] = this.anInt6432 + (local25[local47] * this.anInt6428 >> 12);
				local41[local47] = (this.anInt6428 * local29[local47] >> 12) + this.anInt6432;
				local45[local47] = this.anInt6432 + (this.anInt6428 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.anInt6428 = this.anInt6425 - this.anInt6432;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6432 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt6425 = arg1.method3104();
		} else if (arg0 == 2) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}
}

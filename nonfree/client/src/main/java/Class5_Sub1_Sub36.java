import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class5_Sub1_Sub36 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	private int anInt8570 = 4096;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	private int anInt8574 = 0;

	static {
		new Class40("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static147.anInt3075; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt8574 <= local37 && this.anInt8570 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8574 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt8570 = arg1.method4227();
		}
	}
}

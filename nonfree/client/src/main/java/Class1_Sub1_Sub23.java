import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "Z")
	private boolean aBoolean317 = true;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
	private boolean aBoolean316 = true;

	static {
		new Class151("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(29) int[] local29 = this.method5620(this.aBoolean316 ? Static249.anInt4068 - arg0 : arg0, 0);
			if (this.aBoolean317) {
				for (@Pc(42) int local42 = 0; local42 < Static434.anInt4326; local42++) {
					local11[local42] = local29[Static429.anInt7144 - local42];
				}
			} else {
				Static459.method2112(local29, 0, local11, 0, Static434.anInt4326);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(33) int[][] local33 = this.method5624(0, this.aBoolean316 ? Static249.anInt4068 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			@Pc(62) int local62;
			if (this.aBoolean317) {
				for (local62 = 0; local62 < Static434.anInt4326; local62++) {
					local49[local62] = local37[Static429.anInt7144 - local62];
					local53[local62] = local41[Static429.anInt7144 - local62];
					local57[local62] = local45[Static429.anInt7144 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static434.anInt4326; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean317 = arg1.method4463() == 1;
		} else if (arg0 == 1) {
			this.aBoolean316 = arg1.method4463() == 1;
		} else if (arg0 == 2) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}
}

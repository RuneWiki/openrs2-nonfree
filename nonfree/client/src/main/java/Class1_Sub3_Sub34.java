import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ur", name = "L", descriptor = "Z")
	private boolean aBoolean658 = true;

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "Z")
	private boolean aBoolean659 = true;

	static {
		new Class45("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(34) int[] local34 = this.method8201(0, this.aBoolean659 ? Static109.anInt2298 - arg0 : arg0);
			if (this.aBoolean658) {
				for (@Pc(47) int local47 = 0; local47 < Static254.anInt4973; local47++) {
					local16[local47] = local34[Static184.anInt3830 - local47];
				}
			} else {
				Static556.method7043(local34, 0, local16, 0, Static254.anInt4973);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(33) int[][] local33 = this.method8199(0, this.aBoolean659 ? Static109.anInt2298 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local16[0];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean658) {
				for (local62 = 0; local62 < Static254.anInt4973; local62++) {
					local49[local62] = local37[Static184.anInt3830 - local62];
					local53[local62] = local41[Static184.anInt3830 - local62];
					local57[local62] = local45[Static184.anInt3830 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static254.anInt4973; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.aBoolean658 = arg1.method4487() == 1;
		} else if (arg0 == 1) {
			this.aBoolean659 = arg1.method4487() == 1;
		} else if (arg0 == 2) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}
}

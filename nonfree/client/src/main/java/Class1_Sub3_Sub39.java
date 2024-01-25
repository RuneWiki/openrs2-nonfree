import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!we", name = "O", descriptor = "Z")
	private boolean aBoolean651 = true;

	@OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
	private boolean aBoolean650 = true;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(37) int[] local37 = this.method5532(0, this.aBoolean650 ? Static49.anInt1526 - arg0 : arg0);
			if (this.aBoolean651) {
				for (@Pc(42) int local42 = 0; local42 < Static153.anInt3378; local42++) {
					local19[local42] = local37[Static250.anInt5127 - local42];
				}
			} else {
				Static361.method1337(local37, 0, local19, 0, Static153.anInt3378);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean651 = arg1.method4532() == 1;
		} else if (arg0 == 1) {
			this.aBoolean650 = arg1.method4532() == 1;
		} else if (arg0 == 2) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(35) int[][] local35 = this.method5528(this.aBoolean650 ? Static49.anInt1526 - arg0 : arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local35[2];
			@Pc(51) int[] local51 = local16[0];
			@Pc(55) int[] local55 = local16[1];
			@Pc(59) int[] local59 = local16[2];
			@Pc(64) int local64;
			if (this.aBoolean651) {
				for (local64 = 0; local64 < Static153.anInt3378; local64++) {
					local51[local64] = local39[Static250.anInt5127 - local64];
					local55[local64] = local43[Static250.anInt5127 - local64];
					local59[local64] = local47[Static250.anInt5127 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static153.anInt3378; local64++) {
					local51[local64] = local39[local64];
					local55[local64] = local43[local64];
					local59[local64] = local47[local64];
				}
			}
		}
		return local16;
	}
}

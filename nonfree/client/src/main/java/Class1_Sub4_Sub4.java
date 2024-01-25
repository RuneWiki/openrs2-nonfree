import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "Z")
	private boolean aBoolean51 = true;

	static {
		new Class119("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean50 = arg0.method5337() == 1;
		} else if (arg1 == 1) {
			this.aBoolean51 = arg0.method5337() == 1;
		} else if (arg1 == 2) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(28) int[] local28 = this.method5695(this.aBoolean51 ? Static452.anInt7487 - arg0 : arg0, 0);
			if (this.aBoolean50) {
				for (@Pc(33) int local33 = 0; local33 < Static395.anInt6592; local33++) {
					local11[local33] = local28[Static247.anInt4469 - local33];
				}
			} else {
				Static468.method5038(local28, 0, local11, 0, Static395.anInt6592);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(29) int[][] local29 = this.method5696(this.aBoolean51 ? Static452.anInt7487 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean50) {
				for (local58 = 0; local58 < Static395.anInt6592; local58++) {
					local45[local58] = local33[Static247.anInt4469 - local58];
					local49[local58] = local37[Static247.anInt4469 - local58];
					local53[local58] = local41[Static247.anInt4469 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static395.anInt6592; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}
}

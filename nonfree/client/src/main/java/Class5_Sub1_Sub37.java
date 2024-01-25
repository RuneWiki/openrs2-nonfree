import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class5_Sub1_Sub37 extends Class5_Sub1 {

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
	private int anInt8597 = 4;

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
	private int anInt8598 = 4;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8597 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt8598 = arg1.method4220();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(28) int local28 = Static147.anInt3075 / this.anInt8597;
			@Pc(33) int local33 = Static250.anInt5057 / this.anInt8598;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method7160(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method7160(0, Static250.anInt5057 * local50 / local33);
			}
			for (local50 = 0; local50 < Static147.anInt3075; local50++) {
				if (local28 <= 0) {
					local19[local50] = local44[0];
				} else {
					@Pc(78) int local78 = local50 % local28;
					local19[local50] = local44[local78 * Static147.anInt3075 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(28) int local28 = Static147.anInt3075 / this.anInt8597;
			@Pc(33) int local33 = Static250.anInt5057 / this.anInt8598;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method7154(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method7154(0, Static250.anInt5057 * local47 / local33);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static147.anInt3075; local83++) {
				@Pc(97) int local97;
				if (local28 > 0) {
					@Pc(91) int local91 = local83 % local28;
					local97 = Static147.anInt3075 * local91 / local28;
				} else {
					local97 = 0;
				}
				local73[local83] = local61[local97];
				local77[local83] = local65[local97];
				local81[local83] = local69[local97];
			}
		}
		return local19;
	}
}

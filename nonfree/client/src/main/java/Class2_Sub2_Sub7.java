import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt666 = arg1.method1456();
		} else if (arg0 == 1) {
			this.anInt668 = arg1.method1456();
		} else if (arg0 == 2) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(29) int[] local29 = this.method2573(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static149.anInt3233; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt666 > local37) {
					local15[local31] = this.anInt666;
				} else if (local37 <= this.anInt668) {
					local15[local31] = local37;
				} else {
					local15[local31] = this.anInt668;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(29) int[][] local29 = this.method2582(0, arg0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static149.anInt3233; local55++) {
				@Pc(61) int local61 = local37[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt666 > local61) {
					local45[local55] = this.anInt666;
				} else if (local61 > this.anInt668) {
					local45[local55] = this.anInt668;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt666 > local65) {
					local49[local55] = this.anInt666;
				} else if (this.anInt668 < local65) {
					local49[local55] = this.anInt668;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt666 > local69) {
					local53[local55] = this.anInt666;
				} else if (this.anInt668 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt668;
				}
			}
		}
		return local19;
	}
}

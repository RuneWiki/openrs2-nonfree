import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub2_Sub7 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	private int anInt2201 = 4096;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	private int anInt2203 = 0;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(29) int[][] local29 = this.method7947(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static153.anInt3070; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt2203) {
					local45[local55] = this.anInt2203;
				} else if (this.anInt2201 < local61) {
					local45[local55] = this.anInt2201;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt2203) {
					local49[local55] = this.anInt2203;
				} else if (local65 > this.anInt2201) {
					local49[local55] = this.anInt2201;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt2203 > local69) {
					local53[local55] = this.anInt2203;
				} else if (local69 > this.anInt2201) {
					local53[local55] = this.anInt2201;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int[] local29 = this.method7951(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3070; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt2203 > local37) {
					local19[local31] = this.anInt2203;
				} else if (local37 > this.anInt2201) {
					local19[local31] = this.anInt2201;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2203 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt2201 = arg0.method4294();
		} else if (arg1 == 2) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}
}

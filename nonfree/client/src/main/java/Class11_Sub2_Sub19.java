import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class11_Sub2_Sub19 extends Class11_Sub2 {

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	private int anInt3389 = 4096;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "I")
	private int anInt3393 = 0;

	static {
		new Class117("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3393 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt3389 = arg0.method5187();
		} else if (arg1 == 2) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(29) int[][] local29 = this.method5715(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6549; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt3393 > local61) {
					local45[local55] = this.anInt3393;
				} else if (local61 > this.anInt3389) {
					local45[local55] = this.anInt3389;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt3393 > local65) {
					local49[local55] = this.anInt3393;
				} else if (this.anInt3389 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt3389;
				}
				if (local69 < this.anInt3393) {
					local53[local55] = this.anInt3393;
				} else if (local69 > this.anInt3389) {
					local53[local55] = this.anInt3389;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(21) int[] local21 = this.method5710(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static339.anInt6549; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt3393) {
					local11[local23] = this.anInt3393;
				} else if (local29 > this.anInt3389) {
					local11[local23] = this.anInt3389;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}
}

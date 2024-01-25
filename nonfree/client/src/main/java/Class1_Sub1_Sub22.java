import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	static {
		new Class106(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(29) int[] local29 = this.method6013(arg0, 2);
			@Pc(35) int[][] local35 = this.method6006(0, arg0);
			@Pc(41) int[][] local41 = this.method6006(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static85.anInt1910; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(137) int local137 = 4096 - local85;
					local45[local79] = local85 * local57[local79] + local69[local79] * local137 >> 12;
					local49[local79] = local61[local79] * local85 + local73[local79] * local137 >> 12;
					local53[local79] = local77[local79] * local137 + local85 * local65[local79] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method6013(arg0, 0);
			@Pc(32) int[] local32 = this.method6013(arg0, 1);
			@Pc(40) int[] local40 = this.method6013(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static85.anInt1910; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local26[local42];
				} else if (local48 == 0) {
					local16[local42] = local32[local42];
				} else {
					local16[local42] = local26[local42] * local48 + (4096 - local48) * local32[local42] >> 12;
				}
			}
		}
		return local16;
	}
}

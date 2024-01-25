import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class5_Sub6_Sub10 extends Class5_Sub6 {

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(37) int[][] local37 = this.method8116(0, this.aBoolean150 ? Static442.anInt7781 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean151) {
				for (local66 = 0; local66 < Static421.anInt7443; local66++) {
					local53[local66] = local41[Static575.anInt9380 - local66];
					local57[local66] = local45[Static575.anInt9380 - local66];
					local61[local66] = local49[Static575.anInt9380 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static421.anInt7443; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean151 = arg0.method3642() == 1;
		} else if (arg1 == 1) {
			this.aBoolean150 = arg0.method3642() == 1;
		} else if (arg1 == 2) {
			super.aBoolean718 = arg0.method3642() == 1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(37) int[] local37 = this.method8117(this.aBoolean150 ? Static442.anInt7781 - arg0 : arg0, 0);
			if (this.aBoolean151) {
				for (@Pc(50) int local50 = 0; local50 < Static421.anInt7443; local50++) {
					local19[local50] = local37[Static575.anInt9380 - local50];
				}
			} else {
				Static685.method8329(local37, 0, local19, 0, Static421.anInt7443);
			}
		}
		return local19;
	}
}

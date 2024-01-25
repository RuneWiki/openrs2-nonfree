import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!us", name = "M", descriptor = "Z")
	private boolean aBoolean661 = true;

	@OriginalMember(owner = "client!us", name = "D", descriptor = "Z")
	private boolean aBoolean660 = true;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean660 = arg1.method4393() == 1;
		} else if (arg0 == 1) {
			this.aBoolean661 = arg1.method4393() == 1;
		} else if (arg0 == 2) {
			super.aBoolean696 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(29) int[][] local29 = this.method7880(this.aBoolean661 ? Static561.anInt6003 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean660) {
				for (local58 = 0; local58 < Static87.anInt1964; local58++) {
					local45[local58] = local33[Static451.anInt8721 - local58];
					local49[local58] = local37[Static451.anInt8721 - local58];
					local53[local58] = local41[Static451.anInt8721 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static87.anInt1964; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(34) int[] local34 = this.method7882(0, this.aBoolean661 ? Static561.anInt6003 - arg0 : arg0);
			if (this.aBoolean660) {
				for (@Pc(39) int local39 = 0; local39 < Static87.anInt1964; local39++) {
					local16[local39] = local34[Static451.anInt8721 - local39];
				}
			} else {
				Static600.method3769(local34, 0, local16, 0, Static87.anInt1964);
			}
		}
		return local16;
	}
}

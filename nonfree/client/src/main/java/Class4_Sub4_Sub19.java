import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class4_Sub4_Sub19 extends Class4_Sub4 {

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
	private int anInt5335 = 4096;

	@OriginalMember(owner = "client!kv", name = "L", descriptor = "I")
	private int anInt5338 = 0;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(23) int[] local23 = this.method7890(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static560.anInt9394; local25++) {
				@Pc(31) int local31 = local23[local25];
				if (this.anInt5338 > local31) {
					local13[local25] = this.anInt5338;
				} else if (local31 > this.anInt5335) {
					local13[local25] = this.anInt5335;
				} else {
					local13[local25] = local31;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7892(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static560.anInt9394; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt5338) {
					local42[local52] = this.anInt5338;
				} else if (local58 > this.anInt5335) {
					local42[local52] = this.anInt5335;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt5338) {
					local46[local52] = this.anInt5338;
				} else if (this.anInt5335 < local62) {
					local46[local52] = this.anInt5335;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt5338 > local66) {
					local50[local52] = this.anInt5338;
				} else if (this.anInt5335 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt5335;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt5338 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt5335 = arg1.method5982();
		} else if (arg0 == 2) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}
}

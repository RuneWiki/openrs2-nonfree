import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
	private int anInt5424 = 4096;

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
	private int anInt5423 = 0;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt5423 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt5424 = arg1.method7591();
		} else if (arg0 == 2) {
			super.aBoolean687 = arg1.method7548() == 1;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(27) int[][] local27 = this.method7779(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static307.anInt4846; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt5423 > local59) {
					local43[local53] = this.anInt5423;
				} else if (local59 > this.anInt5424) {
					local43[local53] = this.anInt5424;
				} else {
					local43[local53] = local59;
				}
				if (local63 < this.anInt5423) {
					local47[local53] = this.anInt5423;
				} else if (local63 <= this.anInt5424) {
					local47[local53] = local63;
				} else {
					local47[local53] = this.anInt5424;
				}
				if (this.anInt5423 > local67) {
					local51[local53] = this.anInt5423;
				} else if (local67 <= this.anInt5424) {
					local51[local53] = local67;
				} else {
					local51[local53] = this.anInt5424;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(29) int[] local29 = this.method7778(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static307.anInt4846; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (this.anInt5423 > local37) {
					local19[local31] = this.anInt5423;
				} else if (this.anInt5424 < local37) {
					local19[local31] = this.anInt5424;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}
}

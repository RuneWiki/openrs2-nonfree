import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub5_Sub34 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
	private int anInt3457;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	private int anInt3458;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	private int anInt3460;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
	private int anInt3461;

	@OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
	private int anInt3463;

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
	private int anInt3465;

	@OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
	private int anInt3464;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		Static80.method1357();
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(III)Z")
	private boolean method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = (arg0 + arg1) * this.anInt3458 >> 12;
		@Pc(22) int local22 = Static61.anIntArray125[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3458;
		@Pc(41) int local41 = (local29 << 12) / this.anInt3463;
		@Pc(48) int local48 = this.anInt3464 * local41 >> 12;
		return local48 > arg1 - arg0 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3461 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt3465 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt3460 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt3457 = arg0.method359();
		} else if (arg1 == 4) {
			this.anInt3458 = arg0.method359();
		} else if (arg1 == 5) {
			this.anInt3464 = arg0.method359();
		} else if (arg1 == 6) {
			this.anInt3463 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(III)Z")
	private boolean method2653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3458 >> 12;
		@Pc(23) int local23 = Static61.anIntArray125[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3458;
		@Pc(45) int local45 = (local30 << 12) / this.anInt3463;
		@Pc(52) int local52 = this.anInt3464 * local45 >> 12;
		return local52 > arg1 + arg0 && arg1 + arg0 > -local52;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(22) int local22 = Static34.anIntArray75[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static177.anInt4018; local24++) {
				@Pc(31) int local31 = this.anInt3457 + local22;
				@Pc(37) int local37 = Static116.anIntArray275[local24] - 2048;
				@Pc(43) int local43 = local37 + this.anInt3461;
				@Pc(48) int local48 = this.anInt3465 + local22;
				@Pc(59) int local59 = local43 >= -2048 ? local43 : local43 + 4096;
				@Pc(68) int local68 = local48 >= -2048 ? local48 : local48 + 4096;
				@Pc(77) int local77 = local68 > 2048 ? local68 - 4096 : local68;
				@Pc(82) int local82 = this.anInt3460 + local37;
				@Pc(91) int local91 = local59 <= 2048 ? local59 : local59 - 4096;
				@Pc(102) int local102 = local82 >= -2048 ? local82 : local82 + 4096;
				@Pc(111) int local111 = local31 >= -2048 ? local31 : local31 + 4096;
				@Pc(120) int local120 = local111 > 2048 ? local111 - 4096 : local111;
				@Pc(131) int local131 = local102 > 2048 ? local102 - 4096 : local102;
				local12[local24] = this.method2653(local77, local91) || this.method2652(local131, local120) ? 4096 : 0;
			}
		}
		return local12;
	}
}

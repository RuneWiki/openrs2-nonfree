import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class6_Sub5_Sub9 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	private int anInt2108 = 4;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	private int anInt2105 = 4;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(25) int local25 = Static240.anInt4386 / this.anInt2105;
			@Pc(30) int local30 = Static235.anInt4304 / this.anInt2108;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method6543(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method6543(0, local44 * Static235.anInt4304 / local30);
			}
			for (local44 = 0; local44 < Static240.anInt4386; local44++) {
				if (local25 <= 0) {
					local11[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local25;
					local11[local44] = local38[Static240.anInt4386 * local72 / local25];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt2105 = arg1.method6433();
		} else if (arg0 == 1) {
			this.anInt2108 = arg1.method6433();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(26) int local26 = Static240.anInt4386 / this.anInt2105;
			@Pc(31) int local31 = Static235.anInt4304 / this.anInt2108;
			@Pc(39) int[][] local39;
			if (local31 <= 0) {
				local39 = this.method6544(0, 0);
			} else {
				@Pc(45) int local45 = arg0 % local31;
				local39 = this.method6544(local45 * Static235.anInt4304 / local31, 0);
			}
			@Pc(59) int[] local59 = local39[0];
			@Pc(63) int[] local63 = local39[1];
			@Pc(67) int[] local67 = local39[2];
			@Pc(71) int[] local71 = local11[0];
			@Pc(75) int[] local75 = local11[1];
			@Pc(79) int[] local79 = local11[2];
			for (@Pc(81) int local81 = 0; local81 < Static240.anInt4386; local81++) {
				@Pc(87) int local87;
				if (local26 <= 0) {
					local87 = 0;
				} else {
					@Pc(93) int local93 = local81 % local26;
					local87 = local93 * Static240.anInt4386 / local26;
				}
				local71[local81] = local59[local87];
				local75[local81] = local63[local87];
				local79[local81] = local67[local87];
			}
		}
		return local11;
	}
}

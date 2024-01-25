import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!er", name = "F", descriptor = "I")
	private int anInt1813 = 0;

	@OriginalMember(owner = "client!er", name = "E", descriptor = "I")
	private int anInt1812 = 1;

	@OriginalMember(owner = "client!er", name = "L", descriptor = "I")
	private int anInt1819 = 0;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1813 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt1819 = arg1.method5007();
		} else if (arg0 == 3) {
			this.anInt1812 = arg1.method5007();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(25) int local25 = Static334.anIntArray437[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static419.anInt6404; local33++) {
				@Pc(39) int local39 = Static226.anIntArray284[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt1813 == 0) {
					local68 = this.anInt1812 * (local39 - local25);
				} else {
					@Pc(58) int local58 = local31 * local31 + local45 * local45 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (this.anInt1812 * local68) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt1819 == 0) {
					local68 = Static449.anIntArray563[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1819 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local11[local33] = local68;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		Static232.method3165();
	}
}

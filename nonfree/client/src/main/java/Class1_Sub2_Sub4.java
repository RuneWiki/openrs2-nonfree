import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!bs", name = "W", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
	private int anInt829 = 0;

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
	private int anInt837 = 10;

	@OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
	private int anInt839 = 2048;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
	@Override
	public void method5661() {
		this.method905();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(24) int local24 = Static66.anIntArray158[arg0];
			@Pc(36) int local36;
			if (this.anInt829 == 0) {
				@Pc(137) short local137 = 0;
				for (local36 = 0; local36 < this.anInt837; local36++) {
					if (this.anIntArray103[local36] <= local24 && local24 < this.anIntArray103[local36 + 1]) {
						if (this.anIntArray101[local36] > local24) {
							local137 = 4096;
						}
						break;
					}
				}
				Static367.method5379(local16, 0, Static251.anInt6509, local137);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static251.anInt6509; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static7.anIntArray23[local32];
					@Pc(45) int local45 = this.anInt829;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local24 + local42 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local24 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt837; local45++) {
						if (this.anIntArray103[local45] <= local36 && local36 < this.anIntArray103[local45 + 1]) {
							if (this.anIntArray101[local45] > local36) {
								local38 = 4096;
							}
							break;
						}
					}
					local16[local32] = local38;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
	private void method905() {
		this.anIntArray101 = new int[this.anInt837 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray103 = new int[this.anInt837 + 1];
		@Pc(26) int local26 = 4096 / this.anInt837;
		@Pc(33) int local33 = this.anInt839 * local26 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt837; local39++) {
			this.anIntArray103[local39] = local14;
			this.anIntArray101[local39] = local14 + local33;
			local14 += local26;
		}
		this.anIntArray103[this.anInt837] = 4096;
		this.anIntArray101[this.anInt837] = this.anIntArray101[0] + 4096;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt837 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt839 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt829 = arg1.method3141();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	private int anInt1493 = 2048;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
	private int anInt1495 = 0;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	private int anInt1490 = 10;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1490 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt1493 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt1495 = arg0.method8374();
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.method1362();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(19) int local19 = Static230.anIntArray222[arg0];
			@Pc(31) int local31;
			if (this.anInt1495 == 0) {
				@Pc(137) short local137 = 0;
				for (local31 = 0; local31 < this.anInt1490; local31++) {
					if (local19 >= this.anIntArray83[local31] && this.anIntArray83[local31 + 1] > local19) {
						if (local19 < this.anIntArray84[local31]) {
							local137 = 4096;
						}
						break;
					}
				}
				Static679.method1566(local11, 0, Static479.anInt8231, local137);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static479.anInt8231; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static205.anIntArray199[local27];
					@Pc(40) int local40 = this.anInt1495;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local37 + local19 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt1490; local40++) {
						if (local31 >= this.anIntArray83[local40] && this.anIntArray83[local40 + 1] > local31) {
							if (local31 < this.anIntArray84[local40]) {
								local33 = 4096;
							}
							break;
						}
					}
					local11[local27] = local33;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	private void method1362() {
		@Pc(7) int local7 = 0;
		this.anIntArray84 = new int[this.anInt1490 + 1];
		this.anIntArray83 = new int[this.anInt1490 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1490;
		@Pc(33) int local33 = this.anInt1493 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1490; local35++) {
			this.anIntArray83[local35] = local7;
			this.anIntArray84[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray83[this.anInt1490] = 4096;
		this.anIntArray84[this.anInt1490] = this.anIntArray84[0] + 4096;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class78 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	private final int anInt1817 = Static638.method8459(16);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	private final int anInt1819 = Static638.method8459(24);

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	private final int anInt1820 = Static638.method8459(24);

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	private final int anInt1818 = Static638.method8459(24) + 1;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	private final int anInt1821 = Static638.method8459(6) + 1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	private final int anInt1816 = Static638.method8459(8);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
	private final int[] anIntArray92;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class78() {
		@Pc(33) int[] local33 = new int[this.anInt1821];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1821; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static638.method8459(3);
			@Pc(47) boolean local47 = Static638.method8455() != 0;
			if (local47) {
				local38 = Static638.method8459(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray92 = new int[this.anInt1821 * 8];
		for (local38 = 0; local38 < this.anInt1821 * 8; local38++) {
			this.anIntArray92[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static638.method8459(8);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIZ)V")
	public void method1695(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static638.aClass372Array1[this.anInt1816].anInt10058;
		@Pc(25) int local25 = this.anInt1820 - this.anInt1819;
		@Pc(30) int local30 = local25 / this.anInt1818;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static638.aClass372Array1[this.anInt1816].method8377();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt1821;
						}
						local47 /= this.anInt1821;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray92[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt1819 + local38 * this.anInt1818;
						@Pc(104) Class372 local104 = Static638.aClass372Array1[local90];
						@Pc(113) int local113;
						if (this.anInt1817 == 0) {
							local113 = this.anInt1818 / local104.anInt10058;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method8376();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt10058; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt1818) {
								@Pc(153) float[] local153 = local104.method8376();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt10058; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}

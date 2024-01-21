import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class30 {

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	private final int anInt1938 = Static176.method3179(16);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	private final int anInt1935 = Static176.method3179(24);

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	private final int anInt1936 = Static176.method3179(24);

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private final int anInt1937 = Static176.method3179(24) + 1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	private final int anInt1934 = Static176.method3179(6) + 1;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	private final int anInt1939 = Static176.method3179(8);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
	private final int[] anIntArray164;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class30() {
		@Pc(33) int[] local33 = new int[this.anInt1934];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1934; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static176.method3179(3);
			@Pc(47) boolean local47 = Static176.method3177() != 0;
			if (local47) {
				local38 = Static176.method3179(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray164 = new int[this.anInt1934 * 8];
		for (local38 = 0; local38 < this.anInt1934 * 8; local38++) {
			this.anIntArray164[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static176.method3179(8);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([FIZ)V")
	public void method1278(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static176.aClass74Array1[this.anInt1939].anInt4204;
		@Pc(25) int local25 = this.anInt1936 - this.anInt1935;
		@Pc(30) int local30 = local25 / this.anInt1937;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static176.aClass74Array1[this.anInt1939].method2872();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt1934;
						}
						local47 /= this.anInt1934;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray164[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt1935 + local38 * this.anInt1937;
						@Pc(104) Class74 local104 = Static176.aClass74Array1[local90];
						@Pc(113) int local113;
						if (this.anInt1938 == 0) {
							local113 = this.anInt1937 / local104.anInt4204;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method2873();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt4204; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt1937) {
								@Pc(153) float[] local153 = local104.method2873();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt4204; local155++) {
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

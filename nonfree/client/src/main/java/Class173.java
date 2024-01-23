import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class173 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "I")
	private int anInt5306 = Static32.method551(16);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	private int anInt5303 = Static32.method551(24);

	@OriginalMember(owner = "client!u", name = "b", descriptor = "I")
	private int anInt5302 = Static32.method551(24);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	private int anInt5301 = Static32.method551(24) + 1;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	private int anInt5305 = Static32.method551(6) + 1;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	private int anInt5304 = Static32.method551(8);

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class173() {
		@Pc(33) int[] local33 = new int[this.anInt5305];
		@Pc(35) int local35;
		for (local35 = 0; local35 < this.anInt5305; local35++) {
			@Pc(41) int local41 = 0;
			@Pc(44) int local44 = Static32.method551(3);
			@Pc(50) boolean local50 = Static32.method559() != 0;
			if (local50) {
				local41 = Static32.method551(5);
			}
			local33[local35] = local41 << 3 | local44;
		}
		this.anIntArray490 = new int[this.anInt5305 * 8];
		for (local35 = 0; local35 < this.anInt5305 * 8; local35++) {
			this.anIntArray490[local35] = (local33[local35 >> 3] & 0x1 << (local35 & 0x7)) == 0 ? -1 : Static32.method551(8);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([FIZ)V")
	public void method4133(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		local1 = Static32.aClass20Array1[this.anInt5304].anInt420;
		@Pc(25) int local25 = this.anInt5302 - this.anInt5303;
		@Pc(30) int local30 = local25 / this.anInt5301;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(40) int local40 = 0;
			while (local40 < local30) {
				@Pc(51) int local51;
				@Pc(55) int local55;
				if (local35 == 0) {
					local51 = Static32.aClass20Array1[this.anInt5304].method424();
					for (local55 = local1 - 1; local55 >= 0; local55--) {
						if (local40 + local55 < local30) {
							local33[local40 + local55] = local51 % this.anInt5305;
						}
						local51 /= this.anInt5305;
					}
				}
				for (local51 = 0; local51 < local1; local51++) {
					local55 = local33[local40];
					@Pc(96) int local96 = this.anIntArray490[local55 * 8 + local35];
					if (local96 >= 0) {
						@Pc(106) int local106 = this.anInt5303 + local40 * this.anInt5301;
						@Pc(110) Class20 local110 = Static32.aClass20Array1[local96];
						@Pc(119) int local119;
						if (this.anInt5306 == 0) {
							local119 = this.anInt5301 / local110.anInt420;
							for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
								@Pc(127) float[] local127 = local110.method426();
								for (@Pc(129) int local129 = 0; local129 < local110.anInt420; local129++) {
									arg0[local106 + local121 + local129 * local119] += local127[local129];
								}
							}
						} else {
							local119 = 0;
							while (local119 < this.anInt5301) {
								@Pc(162) float[] local162 = local110.method426();
								for (@Pc(164) int local164 = 0; local164 < local110.anInt420; local164++) {
									arg0[local106 + local119] += local162[local164];
									local119++;
								}
							}
						}
					}
					local40++;
					if (local40 >= local30) {
						break;
					}
				}
			}
		}
	}
}

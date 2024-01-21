import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class8_Sub1_Sub1_Sub1 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
	private final int anInt167;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
	private final int anInt175;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
	private final int anInt168;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
	private final int anInt171;

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
	private final int anInt170;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
	private final int anInt176;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "Lclient!dc;")
	private Class8_Sub1_Sub6 aClass8_Sub1_Sub6_1;

	@OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIZLclient!ka;)V")
	public Class8_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class8_Sub1_Sub1 arg8) {
		this.anInt167 = arg0;
		this.anInt175 = arg3;
		this.anInt168 = arg5;
		this.anInt171 = arg2;
		this.anInt170 = arg4;
		this.anInt176 = arg1;
		if (arg6 != -1) {
			this.aClass8_Sub1_Sub6_1 = Static47.method733(arg6);
			this.anInt178 = 0;
			this.anInt177 = Static21.anInt655 - 1;
			if (this.aClass8_Sub1_Sub6_1.anInt711 == 0 && arg8 != null && arg8 instanceof Class8_Sub1_Sub1_Sub1) {
				@Pc(48) Class8_Sub1_Sub1_Sub1 local48 = (Class8_Sub1_Sub1_Sub1) arg8;
				if (local48.aClass8_Sub1_Sub6_1 == this.aClass8_Sub1_Sub6_1) {
					this.anInt178 = local48.anInt178;
					this.anInt177 = local48.anInt177;
					return;
				}
			}
			if (arg7 && this.aClass8_Sub1_Sub6_1.anInt724 != -1) {
				this.anInt178 = (int) ((double) this.aClass8_Sub1_Sub6_1.anIntArray79.length * Math.random());
				this.anInt177 -= (int) (Math.random() * (double) this.aClass8_Sub1_Sub6_1.anIntArray76[this.anInt178]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		if (this.aClass8_Sub1_Sub6_1 != null) {
			@Pc(14) int local14 = Static21.anInt655 - this.anInt177;
			if (local14 > 100 && this.aClass8_Sub1_Sub6_1.anInt724 > 0) {
				local14 = 100;
			}
			label46: {
				do {
					do {
						if (this.aClass8_Sub1_Sub6_1.anIntArray76[this.anInt178] >= local14) {
							break label46;
						}
						local14 -= this.aClass8_Sub1_Sub6_1.anIntArray76[this.anInt178];
						this.anInt178++;
					} while (this.aClass8_Sub1_Sub6_1.anIntArray79.length > this.anInt178);
					this.anInt178 -= this.aClass8_Sub1_Sub6_1.anInt724;
				} while (this.anInt178 >= 0 && this.anInt178 < this.aClass8_Sub1_Sub6_1.anIntArray79.length);
				this.aClass8_Sub1_Sub6_1 = null;
			}
			this.anInt177 = Static21.anInt655 - local14;
		}
		@Pc(98) Class8_Sub1_Sub4 local98 = Static50.method752(this.anInt167);
		if (local98.anIntArray56 != null) {
			local98 = local98.method263();
		}
		if (local98 == null) {
			return null;
		}
		@Pc(127) int local127;
		@Pc(124) int local124;
		if (this.anInt171 == 1 || this.anInt171 == 3) {
			local127 = local98.anInt455;
			local124 = local98.anInt443;
		} else {
			local124 = local98.anInt455;
			local127 = local98.anInt443;
		}
		@Pc(143) int local143 = this.anInt170 + (local127 >> 1);
		@Pc(152) int local152 = (local127 + 1 >> 1) + this.anInt170;
		@Pc(159) int local159 = (local124 >> 1) + this.anInt168;
		@Pc(164) int[][] local164 = Static24.anIntArrayArrayArray4[this.anInt175];
		@Pc(174) int local174 = this.anInt168 + (local124 + 1 >> 1);
		@Pc(200) int local200 = local164[local152][local174] + local164[local143][local174] + local164[local152][local159] + local164[local143][local159] >> 2;
		@Pc(214) int local214 = (local127 << 6) + (this.anInt170 << 7);
		@Pc(223) int local223 = (this.anInt168 << 7) + (local124 << 6);
		return local98.method262(this.anInt178, local223, local200, local214, this.aClass8_Sub1_Sub6_1, this.anInt176, local164, this.anInt171);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
	private final int anInt86;

	@OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
	private final int anInt93;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
	private final int anInt83;

	@OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
	private final int anInt89;

	@OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
	private final int anInt94;

	@OriginalMember(owner = "client!aa", name = "rb", descriptor = "I")
	private final int anInt92;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lclient!ae;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIIZLclient!ma;)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8) {
		this.anInt86 = arg5;
		this.anInt93 = arg0;
		this.anInt83 = arg2;
		this.anInt89 = arg3;
		this.anInt94 = arg1;
		this.anInt92 = arg4;
		if (arg6 != -1) {
			this.aClass2_Sub1_Sub2_1 = Static23.method1313(arg6);
			this.anInt87 = 0;
			this.anInt85 = Static10.anInt2951 - 1;
			if (this.aClass2_Sub1_Sub2_1.anInt168 == 0 && arg8 != null && arg8 instanceof Class2_Sub1_Sub1_Sub1) {
				@Pc(51) Class2_Sub1_Sub1_Sub1 local51 = (Class2_Sub1_Sub1_Sub1) arg8;
				if (this.aClass2_Sub1_Sub2_1 == local51.aClass2_Sub1_Sub2_1) {
					this.anInt85 = local51.anInt85;
					this.anInt87 = local51.anInt87;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub1_Sub2_1.anInt160 != -1) {
				this.anInt87 = (int) ((double) this.aClass2_Sub1_Sub2_1.anIntArray19.length * Math.random());
				this.anInt85 -= (int) (Math.random() * (double) this.aClass2_Sub1_Sub2_1.anIntArray21[this.anInt87]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		if (this.aClass2_Sub1_Sub2_1 != null) {
			@Pc(9) int local9 = Static10.anInt2951 - this.anInt85;
			if (local9 > 100 && this.aClass2_Sub1_Sub2_1.anInt160 > 0) {
				local9 = 100;
			}
			label46: {
				do {
					do {
						if (local9 <= this.aClass2_Sub1_Sub2_1.anIntArray21[this.anInt87]) {
							break label46;
						}
						local9 -= this.aClass2_Sub1_Sub2_1.anIntArray21[this.anInt87];
						this.anInt87++;
					} while (this.anInt87 < this.aClass2_Sub1_Sub2_1.anIntArray19.length);
					this.anInt87 -= this.aClass2_Sub1_Sub2_1.anInt160;
				} while (this.anInt87 >= 0 && this.aClass2_Sub1_Sub2_1.anIntArray19.length > this.anInt87);
				this.aClass2_Sub1_Sub2_1 = null;
			}
			this.anInt85 = Static10.anInt2951 - local9;
		}
		@Pc(93) Class2_Sub1_Sub15 local93 = Static73.method1248(this.anInt93);
		if (local93.anIntArray351 != null) {
			local93 = local93.method1917();
		}
		if (local93 == null) {
			return null;
		}
		@Pc(124) int local124;
		@Pc(121) int local121;
		if (this.anInt83 == 1 || this.anInt83 == 3) {
			local121 = local93.anInt2671;
			local124 = local93.anInt2689;
		} else {
			local121 = local93.anInt2689;
			local124 = local93.anInt2671;
		}
		@Pc(139) int local139 = (local124 >> 1) + this.anInt92;
		@Pc(148) int local148 = this.anInt92 + (local124 + 1 >> 1);
		@Pc(155) int local155 = this.anInt86 + (local121 >> 1);
		@Pc(164) int local164 = (local121 + 1 >> 1) + this.anInt86;
		@Pc(169) int[][] local169 = Static67.anIntArrayArrayArray8[this.anInt89];
		@Pc(195) int local195 = local169[local139][local164] + local169[local148][local155] + local169[local139][local155] + local169[local148][local164] >> 2;
		@Pc(213) int local213 = (local121 << 6) + (this.anInt86 << 7);
		@Pc(222) int local222 = (local124 << 6) + (this.anInt92 << 7);
		return local93.method1910(this.anInt87, this.anInt83, this.aClass2_Sub1_Sub2_1, local222, local213, local195, this.anInt94, local169);
	}
}

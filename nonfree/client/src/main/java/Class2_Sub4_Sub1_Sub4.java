import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub4_Sub1_Sub4 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!ea", name = "Ob", descriptor = "I")
	private final int anInt1084;

	@OriginalMember(owner = "client!ea", name = "Fb", descriptor = "I")
	private final int anInt1079;

	@OriginalMember(owner = "client!ea", name = "Rb", descriptor = "I")
	private final int anInt1087;

	@OriginalMember(owner = "client!ea", name = "Eb", descriptor = "I")
	private final int anInt1078;

	@OriginalMember(owner = "client!ea", name = "Pb", descriptor = "I")
	private final int anInt1085;

	@OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
	private final int anInt1080;

	@OriginalMember(owner = "client!ea", name = "Mb", descriptor = "Lclient!ah;")
	private Class2_Sub4_Sub2 aClass2_Sub4_Sub2_2;

	@OriginalMember(owner = "client!ea", name = "Qb", descriptor = "I")
	private int anInt1086;

	@OriginalMember(owner = "client!ea", name = "Lb", descriptor = "I")
	private int anInt1082;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIZLclient!d;)V")
	public Class2_Sub4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub4_Sub1 arg8) {
		this.anInt1084 = arg4;
		this.anInt1079 = arg1;
		this.anInt1087 = arg0;
		this.anInt1078 = arg2;
		this.anInt1085 = arg5;
		this.anInt1080 = arg3;
		if (arg6 != -1) {
			this.aClass2_Sub4_Sub2_2 = Static49.method926(arg6);
			this.anInt1086 = Static156.anInt3491 - 1;
			this.anInt1082 = 0;
			if (this.aClass2_Sub4_Sub2_2.anInt489 == 0 && arg8 != null && arg8 instanceof Class2_Sub4_Sub1_Sub4) {
				@Pc(50) Class2_Sub4_Sub1_Sub4 local50 = (Class2_Sub4_Sub1_Sub4) arg8;
				if (local50.aClass2_Sub4_Sub2_2 == this.aClass2_Sub4_Sub2_2) {
					this.anInt1082 = local50.anInt1082;
					this.anInt1086 = local50.anInt1086;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub4_Sub2_2.anInt486 != -1) {
				this.anInt1082 = (int) ((double) this.aClass2_Sub4_Sub2_2.anIntArray37.length * Math.random());
				this.anInt1086 -= (int) ((double) this.aClass2_Sub4_Sub2_2.anIntArray36[this.anInt1082] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!df;")
	@Override
	protected Class2_Sub4_Sub1_Sub3 method2858() {
		if (this.aClass2_Sub4_Sub2_2 != null) {
			@Pc(10) int local10 = Static156.anInt3491 - this.anInt1086;
			if (local10 > 100 && this.aClass2_Sub4_Sub2_2.anInt486 > 0) {
				local10 = 100;
			}
			label46: {
				do {
					do {
						if (local10 <= this.aClass2_Sub4_Sub2_2.anIntArray36[this.anInt1082]) {
							break label46;
						}
						local10 -= this.aClass2_Sub4_Sub2_2.anIntArray36[this.anInt1082];
						this.anInt1082++;
					} while (this.anInt1082 < this.aClass2_Sub4_Sub2_2.anIntArray37.length);
					this.anInt1082 -= this.aClass2_Sub4_Sub2_2.anInt486;
				} while (this.anInt1082 >= 0 && this.aClass2_Sub4_Sub2_2.anIntArray37.length > this.anInt1082);
				this.aClass2_Sub4_Sub2_2 = null;
			}
			this.anInt1086 = Static156.anInt3491 - local10;
		}
		@Pc(99) Class2_Sub4_Sub6 local99 = Static151.method2339(this.anInt1087);
		if (local99.anIntArray82 != null) {
			local99 = local99.method718();
		}
		if (local99 == null) {
			return null;
		}
		@Pc(128) int local128;
		@Pc(125) int local125;
		if (this.anInt1078 == 1 || this.anInt1078 == 3) {
			local128 = local99.anInt1037;
			local125 = local99.anInt1050;
		} else {
			local125 = local99.anInt1037;
			local128 = local99.anInt1050;
		}
		@Pc(143) int local143 = (local128 >> 1) + this.anInt1084;
		@Pc(152) int local152 = (local128 + 1 >> 1) + this.anInt1084;
		@Pc(157) int[][] local157 = Static78.anIntArrayArrayArray6[this.anInt1080];
		@Pc(167) int local167 = (this.anInt1084 << 7) + (local128 << 6);
		@Pc(176) int local176 = (local125 << 6) + (this.anInt1085 << 7);
		@Pc(185) int local185 = (local125 + 1 >> 1) + this.anInt1085;
		@Pc(192) int local192 = this.anInt1085 + (local125 >> 1);
		@Pc(220) int local220 = local157[local152][local185] + local157[local143][local192] + local157[local152][local192] + local157[local143][local185] >> 2;
		return local99.method717(local157, local167, this.aClass2_Sub4_Sub2_2, local176, this.anInt1082, local220, this.anInt1078, this.anInt1079);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
	private final int anInt3585;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	private final int anInt3580;

	@OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
	private final int anInt3586;

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
	private final int anInt3584;

	@OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
	private final int anInt3583;

	@OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
	private final int anInt3590;

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lclient!wf;")
	private Class1_Sub1_Sub18 aClass1_Sub1_Sub18_3;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
	private int anInt3578;

	@OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIZLclient!ka;)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8) {
		this.anInt3585 = arg2;
		this.anInt3580 = arg4;
		this.anInt3586 = arg1;
		this.anInt3584 = arg3;
		this.anInt3583 = arg0;
		this.anInt3590 = arg5;
		if (arg6 != -1) {
			this.aClass1_Sub1_Sub18_3 = Static157.method2652(arg6);
			this.anInt3578 = Static26.anInt845 - 1;
			this.anInt3589 = 0;
			if (this.aClass1_Sub1_Sub18_3.anInt4297 == 0 && arg8 != null && arg8 instanceof Class1_Sub1_Sub1_Sub5) {
				@Pc(50) Class1_Sub1_Sub1_Sub5 local50 = (Class1_Sub1_Sub1_Sub5) arg8;
				if (this.aClass1_Sub1_Sub18_3 == local50.aClass1_Sub1_Sub18_3) {
					this.anInt3589 = local50.anInt3589;
					this.anInt3578 = local50.anInt3578;
					return;
				}
			}
			if (arg7 && this.aClass1_Sub1_Sub18_3.anInt4304 != -1) {
				this.anInt3589 = (int) (Math.random() * (double) this.aClass1_Sub1_Sub18_3.anIntArray602.length);
				this.anInt3578 -= (int) (Math.random() * (double) this.aClass1_Sub1_Sub18_3.anIntArray601[this.anInt3589]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)Lclient!w;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method3157() {
		if (this.aClass1_Sub1_Sub18_3 != null) {
			@Pc(13) int local13 = Static26.anInt845 - this.anInt3578;
			if (local13 > 100 && this.aClass1_Sub1_Sub18_3.anInt4304 > 0) {
				local13 = 100;
			}
			label46: {
				do {
					do {
						if (local13 <= this.aClass1_Sub1_Sub18_3.anIntArray601[this.anInt3589]) {
							break label46;
						}
						local13 -= this.aClass1_Sub1_Sub18_3.anIntArray601[this.anInt3589];
						this.anInt3589++;
					} while (this.anInt3589 < this.aClass1_Sub1_Sub18_3.anIntArray602.length);
					this.anInt3589 -= this.aClass1_Sub1_Sub18_3.anInt4304;
				} while (this.anInt3589 >= 0 && this.anInt3589 < this.aClass1_Sub1_Sub18_3.anIntArray602.length);
				this.aClass1_Sub1_Sub18_3 = null;
			}
			this.anInt3578 = Static26.anInt845 - local13;
		}
		@Pc(94) Class1_Sub1_Sub3 local94 = Static84.method3155(this.anInt3583);
		if (local94.anIntArray88 != null) {
			local94 = local94.method371();
		}
		if (local94 == null) {
			return null;
		}
		@Pc(127) int local127;
		@Pc(124) int local124;
		if (this.anInt3585 == 1 || this.anInt3585 == 3) {
			local124 = local94.anInt656;
			local127 = local94.anInt657;
		} else {
			local124 = local94.anInt657;
			local127 = local94.anInt656;
		}
		@Pc(143) int local143 = this.anInt3580 + (local127 >> 1);
		@Pc(150) int local150 = (local124 >> 1) + this.anInt3590;
		@Pc(159) int local159 = (local127 + 1 >> 1) + this.anInt3580;
		@Pc(169) int local169 = this.anInt3590 + (local124 + 1 >> 1);
		@Pc(178) int local178 = (local127 << 6) + (this.anInt3580 << 7);
		@Pc(183) int[][] local183 = Static141.anIntArrayArrayArray3[this.anInt3584];
		@Pc(192) int local192 = (this.anInt3590 << 7) + (local124 << 6);
		@Pc(218) int local218 = local183[local159][local169] + local183[local159][local150] + local183[local143][local150] + local183[local143][local169] >> 2;
		return local94.method375(local178, local183, this.aClass1_Sub1_Sub18_3, this.anInt3585, this.anInt3589, this.anInt3586, local218, local192);
	}
}

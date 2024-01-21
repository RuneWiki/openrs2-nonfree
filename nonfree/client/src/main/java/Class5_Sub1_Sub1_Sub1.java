import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1_Sub1_Sub1 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "Cb", descriptor = "I")
	private final int anInt175;

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
	private final int anInt167;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
	private final int anInt163;

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
	private final int anInt165;

	@OriginalMember(owner = "client!ae", name = "ub", descriptor = "I")
	private final int anInt170;

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
	private final int anInt162;

	@OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
	private final int anInt168;

	@OriginalMember(owner = "client!ae", name = "xb", descriptor = "Lclient!wc;")
	private Class5_Sub1_Sub18 aClass5_Sub1_Sub18_1;

	@OriginalMember(owner = "client!ae", name = "zb", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!ae", name = "Ab", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIIIZLclient!pe;)V")
	public Class5_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class5_Sub1_Sub1 arg9) {
		this.anInt175 = arg0;
		this.anInt167 = arg2;
		this.anInt163 = arg1;
		this.anInt165 = arg6;
		this.anInt170 = arg5;
		this.anInt162 = arg4;
		this.anInt168 = arg3;
		if (arg7 != -1) {
			this.aClass5_Sub1_Sub18_1 = Static57.method1017(arg7);
			this.anInt173 = 0;
			this.anInt174 = Static95.anInt2285 - 1;
			if (this.aClass5_Sub1_Sub18_1.anInt2944 == 0 && arg9 != null && arg9 instanceof Class5_Sub1_Sub1_Sub1) {
				@Pc(54) Class5_Sub1_Sub1_Sub1 local54 = (Class5_Sub1_Sub1_Sub1) arg9;
				if (this.aClass5_Sub1_Sub18_1 == local54.aClass5_Sub1_Sub18_1) {
					this.anInt173 = local54.anInt173;
					this.anInt174 = local54.anInt174;
					return;
				}
			}
			if (arg8 && this.aClass5_Sub1_Sub18_1.anInt2945 != -1) {
				this.anInt173 = (int) ((double) this.aClass5_Sub1_Sub18_1.anIntArray294.length * Math.random());
				this.anInt174 -= (int) ((double) this.aClass5_Sub1_Sub18_1.anIntArray290[this.anInt173] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lclient!bf;")
	@Override
	public Class5_Sub1_Sub1_Sub2 method1976() {
		if (this.aClass5_Sub1_Sub18_1 != null) {
			@Pc(10) int local10 = Static95.anInt2285 - this.anInt174;
			if (local10 > 100 && this.aClass5_Sub1_Sub18_1.anInt2945 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (local10 <= this.aClass5_Sub1_Sub18_1.anIntArray290[this.anInt173]) {
							break label37;
						}
						local10 -= this.aClass5_Sub1_Sub18_1.anIntArray290[this.anInt173];
						this.anInt173++;
					} while (this.anInt173 < this.aClass5_Sub1_Sub18_1.anIntArray294.length);
					this.anInt173 -= this.aClass5_Sub1_Sub18_1.anInt2945;
				} while (this.anInt173 >= 0 && this.anInt173 < this.aClass5_Sub1_Sub18_1.anIntArray294.length);
				this.aClass5_Sub1_Sub18_1 = null;
			}
			this.anInt174 = Static95.anInt2285 - local10;
		}
		@Pc(106) Class5_Sub1_Sub15 local106 = Static97.method1606(this.anInt175);
		if (local106.anIntArray267 != null) {
			local106 = local106.method1712();
		}
		return local106 == null ? null : local106.method1711(this.anInt173, this.anInt170, this.anInt167, this.anInt162, this.anInt163, this.aClass5_Sub1_Sub18_1, this.anInt165, this.anInt168);
	}
}

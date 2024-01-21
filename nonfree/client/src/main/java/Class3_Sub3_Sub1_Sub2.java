import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub3_Sub1_Sub2 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!e", name = "xb", descriptor = "I")
	private final int anInt587;

	@OriginalMember(owner = "client!e", name = "vb", descriptor = "I")
	private final int anInt586;

	@OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
	private final int anInt584;

	@OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
	private final int anInt589;

	@OriginalMember(owner = "client!e", name = "Ab", descriptor = "I")
	private final int anInt588;

	@OriginalMember(owner = "client!e", name = "Jb", descriptor = "I")
	private final int anInt595;

	@OriginalMember(owner = "client!e", name = "Gb", descriptor = "I")
	private final int anInt593;

	@OriginalMember(owner = "client!e", name = "Lb", descriptor = "Lclient!ua;")
	private Class3_Sub3_Sub14 aClass3_Sub3_Sub14_1;

	@OriginalMember(owner = "client!e", name = "Ib", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
	private int anInt585;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class3_Sub3_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt587 = arg6;
		this.anInt586 = arg1;
		this.anInt584 = arg5;
		this.anInt589 = arg2;
		this.anInt588 = arg3;
		this.anInt595 = arg4;
		this.anInt593 = arg0;
		if (arg7 != -1) {
			this.aClass3_Sub3_Sub14_1 = Static16.method298(arg7);
			this.anInt594 = 0;
			this.anInt585 = Static2.anInt38 - 1;
			if (arg8 && this.aClass3_Sub3_Sub14_1.anInt2609 != -1) {
				this.anInt594 = (int) ((double) this.aClass3_Sub3_Sub14_1.anIntArray382.length * Math.random());
				this.anInt585 -= (int) (Math.random() * (double) this.aClass3_Sub3_Sub14_1.anIntArray383[this.anInt594]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		if (this.aClass3_Sub3_Sub14_1 != null) {
			@Pc(9) int local9 = Static2.anInt38 - this.anInt585;
			if (local9 > 100 && this.aClass3_Sub3_Sub14_1.anInt2609 > 0) {
				local9 = 100;
			}
			label37: {
				do {
					do {
						if (local9 <= this.aClass3_Sub3_Sub14_1.anIntArray383[this.anInt594]) {
							break label37;
						}
						local9 -= this.aClass3_Sub3_Sub14_1.anIntArray383[this.anInt594];
						this.anInt594++;
					} while (this.anInt594 < this.aClass3_Sub3_Sub14_1.anIntArray382.length);
					this.anInt594 -= this.aClass3_Sub3_Sub14_1.anInt2609;
				} while (this.anInt594 >= 0 && this.aClass3_Sub3_Sub14_1.anIntArray382.length > this.anInt594);
				this.aClass3_Sub3_Sub14_1 = null;
			}
			this.anInt585 = Static2.anInt38 - local9;
		}
		@Pc(105) Class3_Sub3_Sub4 local105 = Static108.method1902(this.anInt593);
		if (local105.anIntArray215 != null) {
			local105 = local105.method974();
		}
		return local105 == null ? null : local105.method968(this.aClass3_Sub3_Sub14_1, this.anInt584, this.anInt586, this.anInt588, this.anInt589, this.anInt587, this.anInt594, this.anInt595);
	}
}

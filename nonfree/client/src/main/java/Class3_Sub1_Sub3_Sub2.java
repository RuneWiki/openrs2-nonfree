import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!l", name = "yb", descriptor = "I")
	private final int anInt1543;

	@OriginalMember(owner = "client!l", name = "Eb", descriptor = "I")
	private final int anInt1547;

	@OriginalMember(owner = "client!l", name = "vb", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
	private final int anInt1532;

	@OriginalMember(owner = "client!l", name = "nb", descriptor = "I")
	private final int anInt1535;

	@OriginalMember(owner = "client!l", name = "qb", descriptor = "I")
	private final int anInt1537;

	@OriginalMember(owner = "client!l", name = "rb", descriptor = "I")
	private final int anInt1538;

	@OriginalMember(owner = "client!l", name = "Bb", descriptor = "Lclient!oe;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_1;

	@OriginalMember(owner = "client!l", name = "mb", descriptor = "I")
	private int anInt1534;

	@OriginalMember(owner = "client!l", name = "Ab", descriptor = "I")
	private int anInt1544;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt1543 = arg4;
		this.anInt1547 = arg5;
		this.anInt1540 = arg3;
		this.anInt1532 = arg2;
		this.anInt1535 = arg6;
		this.anInt1537 = arg1;
		this.anInt1538 = arg0;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub11_1 = Static41.method705(arg7);
			this.anInt1534 = Static12.anInt451 - 1;
			this.anInt1544 = 0;
			if (arg8 && this.aClass3_Sub1_Sub11_1.anInt2016 != -1) {
				this.anInt1544 = (int) (Math.random() * (double) this.aClass3_Sub1_Sub11_1.anIntArray232.length);
				this.anInt1534 -= (int) (Math.random() * (double) this.aClass3_Sub1_Sub11_1.anIntArray231[this.anInt1544]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		if (this.aClass3_Sub1_Sub11_1 != null) {
			@Pc(9) int local9 = Static12.anInt451 - this.anInt1534;
			if (local9 > 100 && this.aClass3_Sub1_Sub11_1.anInt2016 > 0) {
				local9 = 100;
			}
			label37: {
				do {
					do {
						if (local9 <= this.aClass3_Sub1_Sub11_1.anIntArray231[this.anInt1544]) {
							break label37;
						}
						local9 -= this.aClass3_Sub1_Sub11_1.anIntArray231[this.anInt1544];
						this.anInt1544++;
					} while (this.aClass3_Sub1_Sub11_1.anIntArray232.length > this.anInt1544);
					this.anInt1544 -= this.aClass3_Sub1_Sub11_1.anInt2016;
				} while (this.anInt1544 >= 0 && this.anInt1544 < this.aClass3_Sub1_Sub11_1.anIntArray232.length);
				this.aClass3_Sub1_Sub11_1 = null;
			}
			this.anInt1534 = Static12.anInt451 - local9;
		}
		@Pc(98) Class3_Sub1_Sub9 local98 = Static10.method1322(this.anInt1538);
		if (local98.anIntArray72 != null) {
			local98 = local98.method653();
		}
		return local98 == null ? null : local98.method644(this.anInt1535, this.anInt1547, this.anInt1537, this.anInt1532, this.aClass3_Sub1_Sub11_1, this.anInt1540, this.anInt1543, this.anInt1544);
	}
}

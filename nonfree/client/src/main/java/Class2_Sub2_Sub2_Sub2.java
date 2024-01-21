import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!ef", name = "Hb", descriptor = "I")
	private final int anInt726;

	@OriginalMember(owner = "client!ef", name = "Cb", descriptor = "I")
	private final int anInt722;

	@OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
	private final int anInt715;

	@OriginalMember(owner = "client!ef", name = "Eb", descriptor = "I")
	private final int anInt723;

	@OriginalMember(owner = "client!ef", name = "Gb", descriptor = "I")
	private final int anInt725;

	@OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
	private final int anInt717;

	@OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
	private final int anInt716;

	@OriginalMember(owner = "client!ef", name = "Bb", descriptor = "Lclient!ma;")
	private Class2_Sub2_Sub11 aClass2_Sub2_Sub11_1;

	@OriginalMember(owner = "client!ef", name = "Ab", descriptor = "I")
	private int anInt721;

	@OriginalMember(owner = "client!ef", name = "Kb", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIIIIZLclient!vb;)V")
	public Class2_Sub2_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class2_Sub2_Sub2 arg9) {
		this.anInt726 = arg3;
		this.anInt722 = arg4;
		this.anInt715 = arg1;
		this.anInt723 = arg6;
		this.anInt725 = arg0;
		this.anInt717 = arg2;
		this.anInt716 = arg5;
		if (arg7 != -1) {
			this.aClass2_Sub2_Sub11_1 = Static12.method270(arg7);
			this.anInt721 = 0;
			this.anInt729 = Static107.anInt2338 - 1;
			if (this.aClass2_Sub2_Sub11_1.anInt1528 == 0 && arg9 != null && arg9 instanceof Class2_Sub2_Sub2_Sub2) {
				@Pc(54) Class2_Sub2_Sub2_Sub2 local54 = (Class2_Sub2_Sub2_Sub2) arg9;
				if (local54.aClass2_Sub2_Sub11_1 == this.aClass2_Sub2_Sub11_1) {
					this.anInt721 = local54.anInt721;
					this.anInt729 = local54.anInt729;
					return;
				}
			}
			if (arg8 && this.aClass2_Sub2_Sub11_1.anInt1511 != -1) {
				this.anInt721 = (int) (Math.random() * (double) this.aClass2_Sub2_Sub11_1.anIntArray192.length);
				this.anInt729 -= (int) ((double) this.aClass2_Sub2_Sub11_1.anIntArray191[this.anInt721] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		if (this.aClass2_Sub2_Sub11_1 != null) {
			@Pc(13) int local13 = Static107.anInt2338 - this.anInt729;
			if (local13 > 100 && this.aClass2_Sub2_Sub11_1.anInt1511 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (local13 <= this.aClass2_Sub2_Sub11_1.anIntArray191[this.anInt721]) {
							break label37;
						}
						local13 -= this.aClass2_Sub2_Sub11_1.anIntArray191[this.anInt721];
						this.anInt721++;
					} while (this.anInt721 < this.aClass2_Sub2_Sub11_1.anIntArray192.length);
					this.anInt721 -= this.aClass2_Sub2_Sub11_1.anInt1511;
				} while (this.anInt721 >= 0 && this.anInt721 < this.aClass2_Sub2_Sub11_1.anIntArray192.length);
				this.aClass2_Sub2_Sub11_1 = null;
			}
			this.anInt729 = Static107.anInt2338 - local13;
		}
		@Pc(94) Class2_Sub2_Sub14 local94 = Static2.method19(this.anInt725);
		if (local94.anIntArray318 != null) {
			local94 = local94.method1558();
		}
		return local94 == null ? null : local94.method1556(this.anInt722, this.anInt723, this.anInt726, this.aClass2_Sub2_Sub11_1, this.anInt717, this.anInt715, this.anInt716, this.anInt721);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub1_Sub2_Sub5 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ta", name = "Eb", descriptor = "I")
	private final int anInt2261;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "I")
	private final int anInt2256;

	@OriginalMember(owner = "client!ta", name = "Ab", descriptor = "I")
	private final int anInt2257;

	@OriginalMember(owner = "client!ta", name = "Lb", descriptor = "I")
	private final int anInt2267;

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	private final int anInt2254;

	@OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
	private final int anInt2268;

	@OriginalMember(owner = "client!ta", name = "Ib", descriptor = "I")
	private final int anInt2265;

	@OriginalMember(owner = "client!ta", name = "zb", descriptor = "Lclient!e;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "I")
	private int anInt2259;

	@OriginalMember(owner = "client!ta", name = "Fb", descriptor = "I")
	private int anInt2262;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIZLclient!ha;)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub1_Sub2 arg9) {
		this.anInt2261 = arg0;
		this.anInt2256 = arg2;
		this.anInt2257 = arg3;
		this.anInt2267 = arg5;
		this.anInt2254 = arg1;
		this.anInt2268 = arg4;
		this.anInt2265 = arg6;
		if (arg7 != -1) {
			this.aClass1_Sub1_Sub4_2 = Static10.method254(arg7);
			this.anInt2259 = Static15.anInt471 - 1;
			this.anInt2262 = 0;
			if (this.aClass1_Sub1_Sub4_2.anInt709 == 0 && arg9 != null && arg9 instanceof Class1_Sub1_Sub2_Sub5) {
				@Pc(53) Class1_Sub1_Sub2_Sub5 local53 = (Class1_Sub1_Sub2_Sub5) arg9;
				if (local53.aClass1_Sub1_Sub4_2 == this.aClass1_Sub1_Sub4_2) {
					this.anInt2259 = local53.anInt2259;
					this.anInt2262 = local53.anInt2262;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub1_Sub4_2.anInt707 != -1) {
				this.anInt2262 = (int) ((double) this.aClass1_Sub1_Sub4_2.anIntArray97.length * Math.random());
				this.anInt2259 -= (int) ((double) this.aClass1_Sub1_Sub4_2.anIntArray96[this.anInt2262] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		if (this.aClass1_Sub1_Sub4_2 != null) {
			@Pc(19) int local19 = Static15.anInt471 - this.anInt2259;
			if (local19 > 100 && this.aClass1_Sub1_Sub4_2.anInt707 > 0) {
				local19 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub1_Sub4_2.anIntArray96[this.anInt2262] >= local19) {
							break label37;
						}
						local19 -= this.aClass1_Sub1_Sub4_2.anIntArray96[this.anInt2262];
						this.anInt2262++;
					} while (this.anInt2262 < this.aClass1_Sub1_Sub4_2.anIntArray97.length);
					this.anInt2262 -= this.aClass1_Sub1_Sub4_2.anInt707;
				} while (this.anInt2262 >= 0 && this.anInt2262 < this.aClass1_Sub1_Sub4_2.anIntArray97.length);
				this.aClass1_Sub1_Sub4_2 = null;
			}
			this.anInt2259 = Static15.anInt471 - local19;
		}
		@Pc(103) Class1_Sub1_Sub3 local103 = Static108.method1807(this.anInt2261);
		if (local103.anIntArray61 != null) {
			local103 = local103.method248();
		}
		return local103 == null ? null : local103.method257(this.anInt2257, this.anInt2254, this.anInt2262, this.aClass1_Sub1_Sub4_2, this.anInt2268, this.anInt2267, this.anInt2256, this.anInt2265);
	}
}

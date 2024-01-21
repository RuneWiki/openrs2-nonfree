import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!b", name = "Ab", descriptor = "[I")
	public static int[] anIntArray25 = new int[99];

	@OriginalMember(owner = "client!b", name = "Gb", descriptor = "I")
	private final int anInt195;

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
	private final int anInt184;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "I")
	private final int anInt191;

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
	private final int anInt190;

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
	private final int anInt189;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
	private final int anInt186;

	@OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
	private final int anInt193;

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "Lclient!nf;")
	private Class3_Sub1_Sub14 aClass3_Sub1_Sub14_1;

	@OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!b", name = "Ib", descriptor = "I")
	private int anInt196;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray25[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIZLclient!ee;)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class3_Sub1_Sub1 arg9) {
		this.anInt195 = arg6;
		this.anInt184 = arg1;
		this.anInt191 = arg3;
		this.anInt190 = arg4;
		this.anInt189 = arg0;
		this.anInt186 = arg5;
		this.anInt193 = arg2;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub14_1 = Static109.method2054(arg7);
			this.anInt192 = Static34.anInt1183 - 1;
			this.anInt196 = 0;
			if (this.aClass3_Sub1_Sub14_1.anInt2469 == 0 && arg9 != null && arg9 instanceof Class3_Sub1_Sub1_Sub2) {
				@Pc(51) Class3_Sub1_Sub1_Sub2 local51 = (Class3_Sub1_Sub1_Sub2) arg9;
				if (this.aClass3_Sub1_Sub14_1 == local51.aClass3_Sub1_Sub14_1) {
					this.anInt192 = local51.anInt192;
					this.anInt196 = local51.anInt196;
					return;
				}
			}
			if (arg8 && this.aClass3_Sub1_Sub14_1.anInt2478 != -1) {
				this.anInt196 = (int) ((double) this.aClass3_Sub1_Sub14_1.anIntArray243.length * Math.random());
				this.anInt192 -= (int) ((double) this.aClass3_Sub1_Sub14_1.anIntArray247[this.anInt196] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		if (this.aClass3_Sub1_Sub14_1 != null) {
			@Pc(13) int local13 = Static34.anInt1183 - this.anInt192;
			if (local13 > 100 && this.aClass3_Sub1_Sub14_1.anInt2478 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (local13 <= this.aClass3_Sub1_Sub14_1.anIntArray247[this.anInt196]) {
							break label37;
						}
						local13 -= this.aClass3_Sub1_Sub14_1.anIntArray247[this.anInt196];
						this.anInt196++;
					} while (this.aClass3_Sub1_Sub14_1.anIntArray243.length > this.anInt196);
					this.anInt196 -= this.aClass3_Sub1_Sub14_1.anInt2478;
				} while (this.anInt196 >= 0 && this.aClass3_Sub1_Sub14_1.anIntArray243.length > this.anInt196);
				this.aClass3_Sub1_Sub14_1 = null;
			}
			this.anInt192 = Static34.anInt1183 - local13;
		}
		@Pc(91) Class3_Sub1_Sub17 local91 = Static18.method517(this.anInt189);
		if (local91.anIntArray387 != null) {
			local91 = local91.method2275();
		}
		return local91 == null ? null : local91.method2284(this.aClass3_Sub1_Sub14_1, this.anInt186, this.anInt190, this.anInt193, this.anInt195, this.anInt191, this.anInt184, this.anInt196);
	}
}

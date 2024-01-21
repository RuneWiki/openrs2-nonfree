import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
	private final int anInt1122;

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
	private final int anInt1127;

	@OriginalMember(owner = "client!hc", name = "wb", descriptor = "I")
	private final int anInt1130;

	@OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
	private final int anInt1126;

	@OriginalMember(owner = "client!hc", name = "zb", descriptor = "I")
	private final int anInt1131;

	@OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
	private final int anInt1129;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	private final int anInt1121;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "Lclient!ne;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_2;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
	private int anInt1120;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
	private int anInt1123;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIZLclient!gd;)V")
	public Class3_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class3_Sub1_Sub1 arg9) {
		this.anInt1122 = arg0;
		this.anInt1127 = arg5;
		this.anInt1130 = arg4;
		this.anInt1126 = arg6;
		this.anInt1131 = arg2;
		this.anInt1129 = arg1;
		this.anInt1121 = arg3;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub11_2 = Static31.method778(arg7);
			this.anInt1120 = 0;
			this.anInt1123 = Static3.anInt289 - 1;
			if (this.aClass3_Sub1_Sub11_2.anInt1924 == 0 && arg9 != null && arg9 instanceof Class3_Sub1_Sub1_Sub3) {
				@Pc(51) Class3_Sub1_Sub1_Sub3 local51 = (Class3_Sub1_Sub1_Sub3) arg9;
				if (local51.aClass3_Sub1_Sub11_2 == this.aClass3_Sub1_Sub11_2) {
					this.anInt1123 = local51.anInt1123;
					this.anInt1120 = local51.anInt1120;
					return;
				}
			}
			if (arg8 && this.aClass3_Sub1_Sub11_2.anInt1932 != -1) {
				this.anInt1120 = (int) ((double) this.aClass3_Sub1_Sub11_2.anIntArray221.length * Math.random());
				this.anInt1123 -= (int) ((double) this.aClass3_Sub1_Sub11_2.anIntArray219[this.anInt1120] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		if (this.aClass3_Sub1_Sub11_2 != null) {
			@Pc(10) int local10 = Static3.anInt289 - this.anInt1123;
			if (local10 > 100 && this.aClass3_Sub1_Sub11_2.anInt1932 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (local10 <= this.aClass3_Sub1_Sub11_2.anIntArray219[this.anInt1120]) {
							break label37;
						}
						local10 -= this.aClass3_Sub1_Sub11_2.anIntArray219[this.anInt1120];
						this.anInt1120++;
					} while (this.anInt1120 < this.aClass3_Sub1_Sub11_2.anIntArray221.length);
					this.anInt1120 -= this.aClass3_Sub1_Sub11_2.anInt1932;
				} while (this.anInt1120 >= 0 && this.anInt1120 < this.aClass3_Sub1_Sub11_2.anIntArray221.length);
				this.aClass3_Sub1_Sub11_2 = null;
			}
			this.anInt1123 = Static3.anInt289 - local10;
		}
		@Pc(95) Class3_Sub1_Sub15 local95 = Static72.method1211(this.anInt1122);
		if (local95.anIntArray263 != null) {
			local95 = local95.method1522();
		}
		return local95 == null ? null : local95.method1526(this.anInt1126, this.anInt1127, this.anInt1120, this.anInt1129, this.anInt1130, this.anInt1131, this.aClass3_Sub1_Sub11_2, this.anInt1121);
	}
}

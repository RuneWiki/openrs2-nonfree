import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class7_Sub5 extends Class7 {

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt3235 = -32768;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private final int anInt3220;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	private final int anInt3225;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	private final int anInt3224;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	private final int anInt3232;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	private final int anInt3223;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	private final int anInt3234;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "Lclient!wb;")
	private Class2_Sub1_Sub25 aClass2_Sub1_Sub25_3;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	private int anInt3226;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	private int anInt3229;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIZLclient!mf;)V")
	public Class7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class7 arg8) {
		this.anInt3220 = arg4;
		this.anInt3225 = arg0;
		this.anInt3224 = arg1;
		this.anInt3232 = arg2;
		this.anInt3223 = arg5;
		this.anInt3234 = arg3;
		if (arg6 != -1) {
			this.aClass2_Sub1_Sub25_3 = Static90.method27(arg6);
			this.anInt3226 = 0;
			this.anInt3229 = Static25.anInt581 - 1;
			if (this.aClass2_Sub1_Sub25_3.anInt4373 == 0 && arg8 != null && arg8 instanceof Class7_Sub5) {
				@Pc(50) Class7_Sub5 local50 = (Class7_Sub5) arg8;
				if (local50.aClass2_Sub1_Sub25_3 == this.aClass2_Sub1_Sub25_3) {
					this.anInt3229 = local50.anInt3229;
					this.anInt3226 = local50.anInt3226;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub1_Sub25_3.anInt4368 != -1) {
				this.anInt3226 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub25_3.anIntArray392.length);
				this.anInt3229 -= (int) (Math.random() * (double) this.aClass2_Sub1_Sub25_3.anIntArray389[this.anInt3226]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Lclient!mf;")
	private Class7 method2255() {
		@Pc(6) Class2_Sub1_Sub11 local6 = Static60.method844(this.anInt3225);
		if (local6.anIntArray133 != null) {
			local6 = local6.method1062();
		}
		if (local6 == null) {
			return null;
		}
		@Pc(30) int local30;
		@Pc(49) int local49;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (this.aClass2_Sub1_Sub25_3 != null) {
			local30 = Static25.anInt581 - this.anInt3229;
			if (local30 > 100 && this.aClass2_Sub1_Sub25_3.anInt4368 > 0) {
				local49 = this.aClass2_Sub1_Sub25_3.anIntArray392.length - this.aClass2_Sub1_Sub25_3.anInt4368;
				while (this.anInt3226 < local49 && local30 > this.aClass2_Sub1_Sub25_3.anIntArray389[this.anInt3226]) {
					local30 -= this.aClass2_Sub1_Sub25_3.anIntArray389[this.anInt3226];
					this.anInt3226++;
				}
				if (this.anInt3226 >= local49) {
					local88 = 0;
					for (local90 = local49; local90 < this.aClass2_Sub1_Sub25_3.anIntArray392.length; local90++) {
						local88 += this.aClass2_Sub1_Sub25_3.anIntArray389[local90];
					}
					local30 %= local88;
				}
			}
			label79: {
				do {
					do {
						if (local30 <= this.aClass2_Sub1_Sub25_3.anIntArray389[this.anInt3226]) {
							break label79;
						}
						local30 -= this.aClass2_Sub1_Sub25_3.anIntArray389[this.anInt3226];
						this.anInt3226++;
					} while (this.anInt3226 < this.aClass2_Sub1_Sub25_3.anIntArray392.length);
					this.anInt3226 -= this.aClass2_Sub1_Sub25_3.anInt4368;
				} while (this.anInt3226 >= 0 && this.aClass2_Sub1_Sub25_3.anIntArray392.length > this.anInt3226);
				this.aClass2_Sub1_Sub25_3 = null;
			}
			this.anInt3229 = Static25.anInt581 - local30;
		}
		if (this.anInt3232 == 1 || this.anInt3232 == 3) {
			local30 = local6.anInt1559;
			local49 = local6.anInt1556;
		} else {
			local30 = local6.anInt1556;
			local49 = local6.anInt1559;
		}
		local88 = this.anInt3220 + (local30 >> 1);
		local90 = (local30 + 1 >> 1) + this.anInt3220;
		@Pc(226) int local226 = (local49 >> 1) + this.anInt3223;
		@Pc(231) int[][] local231 = Static171.anIntArrayArrayArray7[this.anInt3234];
		@Pc(241) int local241 = (this.anInt3220 << 7) + (local30 << 6);
		@Pc(251) int local251 = (this.anInt3223 << 7) + (local49 << 6);
		@Pc(260) int local260 = (local49 + 1 >> 1) + this.anInt3223;
		@Pc(287) int local287 = local231[local90][local226] + local231[local88][local226] + local231[local88][local260] + local231[local90][local260] >> 2;
		@Pc(306) Class2_Sub1_Sub10 local306;
		if (this.aClass2_Sub1_Sub25_3 == null) {
			local306 = local6.method1070(local251, this.anInt3232, this.anInt3224, local241, false, local287, local231);
		} else {
			local306 = local6.method1061(this.aClass2_Sub1_Sub25_3, local251, this.anInt3226, local287, this.anInt3232, local241, local231, this.anInt3224);
		}
		return local306 == null ? null : local306.aClass7_6;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class7 local3 = this.method2255();
		if (local3 != null) {
			local3.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3235 = local3.method3148();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return this.anInt3235;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	private int anInt938 = -32768;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	private final int anInt927;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private final int anInt922;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	private final int anInt930;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	private final int anInt937;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	private final int anInt931;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	private final int anInt921;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Lclient!nd;")
	private Class3_Sub3_Sub17 aClass3_Sub3_Sub17_1;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIZLclient!m;)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class26 arg8) {
		this.anInt927 = arg1;
		this.anInt922 = arg2;
		this.anInt930 = arg3;
		this.anInt937 = arg5;
		this.anInt931 = arg0;
		this.anInt921 = arg4;
		if (arg6 != -1) {
			this.aClass3_Sub3_Sub17_1 = Static11.method254(arg6);
			this.anInt926 = Static184.anInt3760 - 1;
			this.anInt923 = 0;
			if (this.aClass3_Sub3_Sub17_1.anInt2737 == 0 && arg8 != null && arg8 instanceof Class26_Sub1) {
				@Pc(51) Class26_Sub1 local51 = (Class26_Sub1) arg8;
				if (this.aClass3_Sub3_Sub17_1 == local51.aClass3_Sub3_Sub17_1) {
					this.anInt923 = local51.anInt923;
					this.anInt926 = local51.anInt926;
					return;
				}
			}
			if (arg7 && this.aClass3_Sub3_Sub17_1.anInt2738 != -1) {
				this.anInt923 = (int) (Math.random() * (double) this.aClass3_Sub3_Sub17_1.anIntArray197.length);
				this.anInt926 -= (int) (Math.random() * (double) this.aClass3_Sub3_Sub17_1.anIntArray193[this.anInt923]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Lclient!m;")
	private Class26 method726() {
		@Pc(17) Class3_Sub3_Sub9 local17 = Static161.method2421(this.anInt931);
		if (local17.anIntArray52 != null) {
			local17 = local17.method769();
		}
		if (local17 == null) {
			return null;
		}
		@Pc(36) int local36;
		@Pc(58) int local58;
		@Pc(93) int local93;
		@Pc(95) int local95;
		if (this.aClass3_Sub3_Sub17_1 != null) {
			local36 = Static184.anInt3760 - this.anInt926;
			if (local36 > 100 && this.aClass3_Sub3_Sub17_1.anInt2738 > 0) {
				local58 = this.aClass3_Sub3_Sub17_1.anIntArray197.length - this.aClass3_Sub3_Sub17_1.anInt2738;
				while (local58 > this.anInt923 && local36 > this.aClass3_Sub3_Sub17_1.anIntArray193[this.anInt923]) {
					local36 -= this.aClass3_Sub3_Sub17_1.anIntArray193[this.anInt923];
					this.anInt923++;
				}
				if (local58 <= this.anInt923) {
					local93 = 0;
					for (local95 = local58; local95 < this.aClass3_Sub3_Sub17_1.anIntArray197.length; local95++) {
						local93 += this.aClass3_Sub3_Sub17_1.anIntArray193[local95];
					}
					local36 %= local93;
				}
			}
			label79: {
				do {
					do {
						if (local36 <= this.aClass3_Sub3_Sub17_1.anIntArray193[this.anInt923]) {
							break label79;
						}
						local36 -= this.aClass3_Sub3_Sub17_1.anIntArray193[this.anInt923];
						this.anInt923++;
					} while (this.aClass3_Sub3_Sub17_1.anIntArray197.length > this.anInt923);
					this.anInt923 -= this.aClass3_Sub3_Sub17_1.anInt2738;
				} while (this.anInt923 >= 0 && this.anInt923 < this.aClass3_Sub3_Sub17_1.anIntArray197.length);
				this.aClass3_Sub3_Sub17_1 = null;
			}
			this.anInt926 = Static184.anInt3760 - local36;
		}
		if (this.anInt922 == 1 || this.anInt922 == 3) {
			local36 = local17.anInt1002;
			local58 = local17.anInt1010;
		} else {
			local36 = local17.anInt1010;
			local58 = local17.anInt1002;
		}
		local95 = (local36 + 1 >> 1) + this.anInt921;
		local93 = (local36 >> 1) + this.anInt921;
		@Pc(236) int local236 = (local58 >> 1) + this.anInt937;
		@Pc(245) int local245 = (local58 + 1 >> 1) + this.anInt937;
		@Pc(250) int[][] local250 = Static23.anIntArrayArrayArray4[this.anInt930];
		@Pc(277) int local277 = local250[local95][local245] + local250[local93][local245] + local250[local93][local236] + local250[local95][local236] >> 2;
		@Pc(286) int local286 = (this.anInt921 << 7) + (local36 << 6);
		@Pc(295) int local295 = (local58 << 6) + (this.anInt937 << 7);
		@Pc(314) Class3_Sub3_Sub25 local314;
		if (this.aClass3_Sub3_Sub17_1 == null) {
			local314 = local17.method763(local295, local286, local277, this.anInt927, false, this.anInt922, local250);
		} else {
			local314 = local17.method760(this.anInt922, local277, local250, this.aClass3_Sub3_Sub17_1, this.anInt927, this.anInt923, local286, local295);
		}
		return local314 == null ? null : local314.aClass26_10;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class26 local7 = this.method726();
		if (local7 != null) {
			local7.method2993(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt938 = local7.method2995();
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()I")
	@Override
	public int method2995() {
		return this.anInt938;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class328 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	private int anInt8253 = -1;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Z")
	public boolean aBoolean698 = true;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_40;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private final int anInt8258;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	private final int anInt8251;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!pga;")
	private final Class268 aClass268_1;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	private final int anInt8252;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "Lclient!aaa;")
	private Class3_Sub1 aClass3_Sub1_4;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!re;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!oj;")
	private Class79_Sub2 aClass79_Sub2_2;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!uca;Lclient!pga;Lclient!vfa;IIIII)V")
	public Class328(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) Class151_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass162_Sub3_40 = arg0;
		this.anInt8258 = arg7;
		this.anInt8251 = arg6;
		this.aClass268_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt9572;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray14[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt8252 = local27;
		if (local27 <= 0) {
			this.aClass3_Sub1_4 = null;
		} else {
			@Pc(101) Class2_Sub7 local101 = new Class2_Sub7(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass162_Sub3_40.aBoolean720) {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = local31 + arg2.anInt9572 * (local51 + local35);
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray14[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method4511(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = arg2.anInt9572 * (local51 + local35) + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray14[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method4469(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface21_4 = this.aClass162_Sub3_40.method6921(local101.anInt5186, false, local101.aByteArray52);
			this.aClass79_Sub2_2 = new Class79_Sub2(this.aClass162_Sub3_40, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	private void method6670() {
		if (!this.aBoolean698) {
			return;
		}
		this.aBoolean698 = false;
		@Pc(16) byte[] local16 = this.aClass268_1.aByteArray64;
		@Pc(20) byte[] local20 = this.aClass162_Sub3_40.aByteArray93;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass268_1.anInt6684;
		@Pc(36) int local36 = this.anInt8258 * this.aClass268_1.anInt6684 + this.anInt8251;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass3_Sub1_4 != null && local22 == this.anInt8253) {
			this.aBoolean698 = false;
			return;
		}
		this.anInt8253 = local22;
		local49 = 0;
		local36 = this.anInt8251 + local26 * this.anInt8258;
		for (@Pc(102) int local102 = -128; local102 < 0; local102++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local36] == 0) {
					@Pc(117) int local117 = 0;
					if (local16[local36 - 1] != 0) {
						local117++;
					}
					if (local16[local36 + 1] != 0) {
						local117++;
					}
					if (local16[local36 - local26] != 0) {
						local117++;
					}
					if (local16[local36 + local26] != 0) {
						local117++;
					}
					local20[local49++] = (byte) (local117 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass268_1.anInt6684 - 128;
		}
		if (this.aClass3_Sub1_4 == null) {
			this.aClass3_Sub1_4 = new Class3_Sub1(this.aClass162_Sub3_40, 3553, 6406, 128, 128, false, this.aClass162_Sub3_40.aByteArray93, 6406, false);
			this.aClass3_Sub1_4.method1720(false, false);
			this.aClass3_Sub1_4.method5571(true);
		} else {
			this.aClass3_Sub1_4.method1719(128, 128, this.aClass162_Sub3_40.aByteArray93, 6406, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!re;I)V")
	private void method6671(@OriginalArg(1) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method6670();
			this.aClass162_Sub3_40.method6911(this.aClass3_Sub1_4);
			this.aClass162_Sub3_40.method6904(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[BIB)V")
	public void method6672(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass79_Sub2_2.method5344(this.aClass162_Sub3_40.method6944(5123) * arg0, arg1);
		this.method6671(this.aClass79_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public void method6675() {
		this.method6671(this.anInterface21_4, this.anInt8252);
	}
}

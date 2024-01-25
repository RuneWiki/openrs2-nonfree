import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class255 {

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
	public boolean aBoolean522 = true;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	private int anInt6751 = -1;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	private final int anInt6745;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_29;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!lg;")
	private final Class206 aClass206_2;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	private final int anInt6744;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Lclient!cw;")
	private Class46_Sub2 aClass46_Sub2_5;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!ii;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!er;")
	private Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!lj;Lclient!lg;Lclient!hca;IIIII)V")
	public Class255(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class129_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6750 = arg6;
		this.anInt6745 = arg7;
		this.aClass78_Sub3_29 = arg0;
		this.aClass206_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt8065 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray2[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt6744 = local27;
		if (local27 <= 0) {
			this.aClass46_Sub2_5 = null;
		} else {
			@Pc(94) Class1_Sub3 local94 = new Class1_Sub3(local27 * 2);
			@Pc(114) int local114;
			@Pc(122) short[] local122;
			@Pc(126) int local126;
			@Pc(112) int local112;
			if (this.aClass78_Sub3_29.aBoolean425) {
				for (local51 = 0; local51 < local25; local51++) {
					local112 = (local51 + local35) * arg2.anInt8065 + local31;
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray2[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local94.method7937(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local112 = local31 + (local35 + local51) * arg2.anInt8065;
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray2[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local94.method7948(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface12_2 = this.aClass78_Sub3_29.method4508(local94.aByteArray104, local94.anInt9802, false);
			this.aClass86_Sub1_2 = new Class86_Sub1(this.aClass78_Sub3_29, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLclient!ii;)V")
	private void method5462(@OriginalArg(0) int arg0, @OriginalArg(2) Interface12 arg1) {
		if (arg0 != 0) {
			this.method5464();
			this.aClass78_Sub3_29.method4535(this.aClass46_Sub2_5);
			this.aClass78_Sub3_29.method4564(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIZ)V")
	public void method5463(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass86_Sub1_2.method4195(arg1 * this.aClass78_Sub3_29.method4494(5123), arg0);
		this.method5462(arg1, this.aClass86_Sub1_2);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	private void method5464() {
		if (!this.aBoolean522) {
			return;
		}
		this.aBoolean522 = false;
		@Pc(16) byte[] local16 = this.aClass206_2.aByteArray42;
		@Pc(20) byte[] local20 = this.aClass78_Sub3_29.aByteArray43;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass206_2.anInt5315;
		@Pc(36) int local36 = this.anInt6750 + this.aClass206_2.anInt5315 * this.anInt6745;
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
		if (this.aClass46_Sub2_5 != null && this.anInt6751 == local22) {
			this.aBoolean522 = false;
			return;
		}
		this.anInt6751 = local22;
		local49 = 0;
		local36 = this.anInt6750 + local26 * this.anInt6745;
		for (@Pc(99) int local99 = -128; local99 < 0; local99++) {
			for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
				if (local16[local36] == 0) {
					@Pc(121) int local121 = 0;
					if (local16[local36 - 1] != 0) {
						local121++;
					}
					if (local16[local36 + 1] != 0) {
						local121++;
					}
					if (local16[local36 - local26] != 0) {
						local121++;
					}
					if (local16[local36 + local26] != 0) {
						local121++;
					}
					local20[local49++] = (byte) (local121 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass206_2.anInt5315 - 128;
		}
		if (this.aClass46_Sub2_5 == null) {
			this.aClass46_Sub2_5 = new Class46_Sub2(this.aClass78_Sub3_29, 3553, 6406, 128, 128, false, this.aClass78_Sub3_29.aByteArray43, 6406, false);
			this.aClass46_Sub2_5.method5150(false, false);
			this.aClass46_Sub2_5.method5134(true);
		} else {
			this.aClass46_Sub2_5.method5145(6406, false, 128, this.aClass78_Sub3_29.aByteArray43, 128);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public void method5465() {
		this.method5462(this.anInt6744, this.anInterface12_2);
	}
}

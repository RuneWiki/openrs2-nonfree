import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class110 {

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Z")
	public boolean aBoolean231 = true;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	private int anInt3111 = -1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
	private final int anInt3103;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	private final int anInt3106;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Lclient!oi;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_13;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	private final int anInt3108;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "Lclient!mn;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!kca;")
	private Class114_Sub2 aClass114_Sub2_2;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!il;")
	private Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!kfa;Lclient!oi;Lclient!fw;IIIII)V")
	public Class110(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class115_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3103 = arg6;
		this.anInt3106 = arg7;
		this.aClass248_1 = arg1;
		this.aClass7_Sub2_13 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt10330;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray10[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt3108 = local27;
		if (local27 <= 0) {
			this.aClass3_Sub2_1 = null;
		} else {
			@Pc(88) Class4_Sub13 local88 = new Class4_Sub13(local27 * 2);
			@Pc(107) int local107;
			@Pc(115) short[] local115;
			@Pc(119) int local119;
			@Pc(105) int local105;
			if (this.aClass7_Sub2_13.aBoolean388) {
				for (local50 = 0; local50 < local25; local50++) {
					local105 = (local50 + local35) * arg2.anInt10330 + local31;
					for (local107 = 0; local107 < local25; local107++) {
						local115 = arg2.aShortArrayArray10[local105++];
						if (local115 != null) {
							for (local119 = 0; local119 < local115.length; local119++) {
								local88.method7038(local115[local119] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local105 = arg2.anInt10330 * (local35 + local50) + local31;
					for (local107 = 0; local107 < local25; local107++) {
						local115 = arg2.aShortArrayArray10[local105++];
						if (local115 != null) {
							for (local119 = 0; local119 < local115.length; local119++) {
								local88.method7041(local115[local119] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface14_1 = this.aClass7_Sub2_13.method4314(local88.anInt9170, false, local88.aByteArray88);
			this.aClass114_Sub2_2 = new Class114_Sub2(this.aClass7_Sub2_13, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2514() {
		this.method2516(this.anInterface14_1, this.anInt3108);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!mn;II)V")
	private void method2516(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method2517();
			this.aClass7_Sub2_13.method4313(this.aClass3_Sub2_1);
			this.aClass7_Sub2_13.method4338(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	private void method2517() {
		if (!this.aBoolean231) {
			return;
		}
		this.aBoolean231 = false;
		@Pc(16) byte[] local16 = this.aClass248_1.aByteArray69;
		@Pc(20) byte[] local20 = this.aClass7_Sub2_13.aByteArray45;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass248_1.anInt7455;
		@Pc(36) int local36 = this.anInt3103 + this.anInt3106 * this.aClass248_1.anInt7455;
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
		if (this.aClass3_Sub2_1 != null && local22 == this.anInt3111) {
			this.aBoolean231 = false;
			return;
		}
		this.anInt3111 = local22;
		local36 = local26 * this.anInt3106 + this.anInt3103;
		local49 = 0;
		for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
			for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
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
			local36 += this.aClass248_1.anInt7455 - 128;
		}
		if (this.aClass3_Sub2_1 == null) {
			this.aClass3_Sub2_1 = new Class3_Sub2(this.aClass7_Sub2_13, 3553, 6406, 128, 128, false, this.aClass7_Sub2_13.aByteArray45, 6406, false);
			this.aClass3_Sub2_1.method953(false, false);
			this.aClass3_Sub2_1.method2739(true);
		} else {
			this.aClass3_Sub2_1.method958(128, false, this.aClass7_Sub2_13.aByteArray45, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[BI)V")
	public void method2518(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass114_Sub2_2.method4147(arg0, this.aClass7_Sub2_13.method4316(5123) * arg1);
		this.method2516(this.aClass114_Sub2_2, arg1);
	}
}

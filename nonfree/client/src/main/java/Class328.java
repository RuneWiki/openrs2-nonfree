import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class328 {

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Z")
	public boolean aBoolean674 = true;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
	private int anInt9387 = -1;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_40;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	private final int anInt9383;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
	private final int anInt9386;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Lclient!cea;")
	private final Class47 aClass47_2;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
	private final int anInt9380;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!lo;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "Lclient!js;")
	private Class19_Sub2 aClass19_Sub2_2;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Lclient!ol;")
	private Class76_Sub3 aClass76_Sub3_6;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!kw;Lclient!cea;Lclient!mt;IIIII)V")
	public Class328(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class51_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass5_Sub2_40 = arg0;
		this.anInt9383 = arg6;
		this.anInt9386 = arg7;
		this.aClass47_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local35 + local37) * arg2.anInt9121 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray12[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt9380 = local27;
		if (local27 <= 0) {
			this.aClass76_Sub3_6 = null;
		} else {
			@Pc(87) Class3_Sub3 local87 = new Class3_Sub3(local27 * 2);
			@Pc(106) int local106;
			@Pc(114) short[] local114;
			@Pc(118) int local118;
			@Pc(104) int local104;
			if (this.aClass5_Sub2_40.aBoolean387) {
				for (local52 = 0; local52 < local25; local52++) {
					local104 = local31 + arg2.anInt9121 * (local35 + local52);
					for (local106 = 0; local106 < local25; local106++) {
						local114 = arg2.aShortArrayArray12[local104++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local87.method4201(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local104 = local31 + arg2.anInt9121 * (local52 + local35);
					for (local106 = 0; local106 < local25; local106++) {
						local114 = arg2.aShortArrayArray12[local104++];
						if (local114 != null) {
							for (local118 = 0; local118 < local114.length; local118++) {
								local87.method4257(local114[local118] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface15_5 = this.aClass5_Sub2_40.method4972(local87.anInt4736, false, local87.aByteArray54);
			this.aClass19_Sub2_2 = new Class19_Sub2(this.aClass5_Sub2_40, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[B)V")
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass19_Sub2_2.method8705(this.aClass5_Sub2_40.method4992(5123) * arg0, arg1);
		this.method8088(this.aClass19_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BLclient!lo;I)V")
	private void method8088(@OriginalArg(1) Interface15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method8092();
			this.aClass5_Sub2_40.method4997(this.aClass76_Sub3_6);
			this.aClass5_Sub2_40.method4968(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	public void method8091() {
		this.method8088(this.anInterface15_5, this.anInt9380);
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	private void method8092() {
		if (!this.aBoolean674) {
			return;
		}
		this.aBoolean674 = false;
		@Pc(16) byte[] local16 = this.aClass47_2.aByteArray7;
		@Pc(20) byte[] local20 = this.aClass5_Sub2_40.aByteArray60;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass47_2.anInt1678;
		@Pc(36) int local36 = this.anInt9383 + this.aClass47_2.anInt1678 * this.anInt9386;
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
		if (this.aClass76_Sub3_6 != null && local22 == this.anInt9387) {
			this.aBoolean674 = false;
			return;
		}
		this.anInt9387 = local22;
		local36 = this.anInt9383 + this.anInt9386 * local26;
		local49 = 0;
		for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
			for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
				if (local16[local36] == 0) {
					@Pc(124) int local124 = 0;
					if (local16[local36 - 1] != 0) {
						local124++;
					}
					if (local16[local36 + 1] != 0) {
						local124++;
					}
					if (local16[local36 - local26] != 0) {
						local124++;
					}
					if (local16[local26 + local36] != 0) {
						local124++;
					}
					local20[local49++] = (byte) (local124 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass47_2.anInt1678 - 128;
		}
		if (this.aClass76_Sub3_6 == null) {
			this.aClass76_Sub3_6 = new Class76_Sub3(this.aClass5_Sub2_40, 3553, 6406, 128, 128, false, this.aClass5_Sub2_40.aByteArray60, 6406, false);
			this.aClass76_Sub3_6.method6412(false, false);
			this.aClass76_Sub3_6.method7930(true);
		} else {
			this.aClass76_Sub3_6.method6408(this.aClass5_Sub2_40.aByteArray60, 128, 6406, 128, false);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class205 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	private int anInt6106 = -1;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_39;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	private final int anInt6104;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!ek;")
	private final Class62 aClass62_1;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	private final int anInt6107;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	private final int anInt6105;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!lb;")
	private Class28_Sub3 aClass28_Sub3_7;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!gp;")
	private Interface4 anInterface4_6;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!ge;Lclient!ek;Lclient!wh;IIIII)V")
	public Class205(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class106_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass81_Sub1_39 = arg0;
		this.anInt6104 = arg7;
		this.aClass62_1 = arg1;
		this.anInt6107 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(47) int local47;
		@Pc(49) int local49;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local47 = arg2.anInt6271 * (local35 + local33) + local29;
			for (local49 = 0; local49 < local23; local49++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray61[local47++];
				if (local58 != null) {
					local25 += local58.length;
				}
			}
		}
		this.anInt6105 = local25;
		if (local25 <= 0) {
			this.aClass28_Sub3_7 = null;
		} else {
			@Pc(87) Class6_Sub10 local87 = new Class6_Sub10(local25 * 2);
			@Pc(120) short[] local120;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass81_Sub1_39.aBoolean156) {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + (local47 + local33) * arg2.anInt6271;
					for (local111 = 0; local111 < local23; local111++) {
						local120 = arg2.aShortArrayArray61[local49++];
						if (local120 != null) {
							for (local125 = 0; local125 < local120.length; local125++) {
								local87.method4025(local120[local125]);
							}
						}
					}
				}
			} else {
				for (local47 = 0; local47 < local23; local47++) {
					local49 = local29 + arg2.anInt6271 * (local47 + local33);
					for (local111 = 0; local111 < local23; local111++) {
						local120 = arg2.aShortArrayArray61[local49++];
						if (local120 != null) {
							for (local125 = 0; local125 < local120.length; local125++) {
								local87.method4002(local120[local125]);
							}
						}
					}
				}
			}
			this.anInterface4_6 = this.aClass81_Sub1_39.method1970(local87.aByteArray67, local87.anInt4188, false);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public void method5505() {
		this.method5506(this.anInterface4_6, this.anInt6105);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!gp;II)V")
	public void method5506(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5507();
			this.aClass81_Sub1_39.method2022(this.aClass28_Sub3_7);
			this.aClass81_Sub1_39.method1973(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	private void method5507() {
		if (!this.aBoolean405) {
			return;
		}
		this.aBoolean405 = false;
		@Pc(10) byte[] local10 = this.aClass62_1.aByteArray32;
		@Pc(12) byte[] local12 = Static331.aByteArray94;
		@Pc(14) int local14 = 0;
		@Pc(18) int local18 = this.aClass62_1.anInt1359;
		@Pc(37) int local37 = this.anInt6107 + this.anInt6104 * this.aClass62_1.anInt1359;
		@Pc(39) int local39;
		@Pc(50) int local50;
		for (local39 = -128; local39 < 0; local39++) {
			local14 = (local14 << 8) - local14;
			for (local50 = -128; local50 < 0; local50++) {
				if (local10[local37++] != 0) {
					local14++;
				}
			}
			local37 += local18 - 128;
		}
		if (this.aClass28_Sub3_7 != null && local14 == this.anInt6106) {
			this.aBoolean405 = false;
			return;
		}
		this.anInt6106 = local14;
		local39 = 0;
		local37 = local18 * this.anInt6104 + this.anInt6107;
		for (local50 = -128; local50 < 0; local50++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local10[local37] == 0) {
					@Pc(125) int local125 = 0;
					if (local10[local37 - 1] != 0) {
						local125++;
					}
					if (local10[local37 + 1] != 0) {
						local125++;
					}
					if (local10[local37 - local18] != 0) {
						local125++;
					}
					if (local10[local18 + local37] != 0) {
						local125++;
					}
					local12[local39++] = (byte) (local125 * 17);
				} else {
					local12[local39++] = 68;
				}
				local37++;
			}
			local37 += this.aClass62_1.anInt1359 - 128;
		}
		if (this.aClass28_Sub3_7 == null) {
			this.aClass28_Sub3_7 = new Class28_Sub3(this.aClass81_Sub1_39, 3553, 6406, 128, 128, false, Static331.aByteArray94, 6406, false);
			this.aClass28_Sub3_7.method1257(false, false);
			this.aClass28_Sub3_7.method4124(true);
		} else {
			this.aClass28_Sub3_7.method1254(128, 128, Static331.aByteArray94, 6406, false);
		}
	}
}

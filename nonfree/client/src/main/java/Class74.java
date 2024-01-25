import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class74 {

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	private int anInt1447 = -1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Z")
	public boolean aBoolean146 = true;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	private final int anInt1444;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!pc;")
	private final Class275 aClass275_2;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	private final int anInt1442;

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
	private final int anInt1445;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Lclient!bca;")
	private Class32_Sub1 aClass32_Sub1_1;

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "Lclient!raa;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!cq", name = "q", descriptor = "Lclient!kfa;")
	private Class38_Sub2 aClass38_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!ffa;Lclient!pc;Lclient!aq;IIIII)V")
	public Class74(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(2) Class22_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1444 = arg6;
		this.aClass275_2 = arg1;
		this.anInt1442 = arg7;
		this.aClass57_Sub2_8 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(53) int local53;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(51) int local51 = arg2.anInt9376 * (local35 + local37) + local31;
			for (local53 = 0; local53 < local25; local53++) {
				@Pc(61) short[] local61 = arg2.aShortArrayArray1[local51++];
				if (local61 != null) {
					local27 += local61.length;
				}
			}
		}
		this.anInt1445 = local27;
		if (local27 <= 0) {
			this.aClass32_Sub1_1 = null;
		} else {
			@Pc(99) Class5_Sub23 local99 = new Class5_Sub23(local27 * 2);
			@Pc(118) int local118;
			@Pc(126) short[] local126;
			@Pc(130) int local130;
			@Pc(116) int local116;
			if (this.aClass57_Sub2_8.aBoolean216) {
				for (local53 = 0; local53 < local25; local53++) {
					local116 = local31 + (local35 + local53) * arg2.anInt9376;
					for (local118 = 0; local118 < local25; local118++) {
						local126 = arg2.aShortArrayArray1[local116++];
						if (local126 != null) {
							for (local130 = 0; local130 < local126.length; local130++) {
								local99.method8480(local126[local130] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local53 = 0; local53 < local25; local53++) {
					local116 = local31 + arg2.anInt9376 * (local53 + local35);
					for (local118 = 0; local118 < local25; local118++) {
						local126 = arg2.aShortArrayArray1[local116++];
						if (local126 != null) {
							for (local130 = 0; local130 < local126.length; local130++) {
								local99.method8539(local126[local130] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface21_1 = this.aClass57_Sub2_8.method2356(local99.anInt9869, local99.aByteArray102, false);
			this.aClass38_Sub2_1 = new Class38_Sub2(this.aClass57_Sub2_8, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BILclient!raa;)V")
	private void method1310(@OriginalArg(1) int arg0, @OriginalArg(2) Interface21 arg1) {
		if (arg0 != 0) {
			this.method1313();
			this.aClass57_Sub2_8.method2362(this.aClass32_Sub1_1);
			this.aClass57_Sub2_8.method2323(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([BIII)V")
	public void method1312(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass38_Sub2_1.method8198(arg0, this.aClass57_Sub2_8.method2343(5123) * arg1);
		this.method1310(arg1, this.aClass38_Sub2_1);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	private void method1313() {
		if (!this.aBoolean146) {
			return;
		}
		this.aBoolean146 = false;
		@Pc(17) byte[] local17 = this.aClass275_2.aByteArray73;
		@Pc(21) byte[] local21 = this.aClass57_Sub2_8.aByteArray13;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = this.aClass275_2.anInt7530;
		@Pc(37) int local37 = this.anInt1442 * this.aClass275_2.anInt7530 + this.anInt1444;
		@Pc(49) int local49;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local23 = (local23 << 8) - local23;
			for (local49 = -128; local49 < 0; local49++) {
				if (local17[local37++] != 0) {
					local23++;
				}
			}
			local37 += local27 - 128;
		}
		if (this.aClass32_Sub1_1 != null && this.anInt1447 == local23) {
			this.aBoolean146 = false;
			return;
		}
		this.anInt1447 = local23;
		local49 = 0;
		local37 = this.anInt1444 + local27 * this.anInt1442;
		for (@Pc(124) int local124 = -128; local124 < 0; local124++) {
			for (@Pc(128) int local128 = -128; local128 < 0; local128++) {
				if (local17[local37] == 0) {
					@Pc(138) int local138 = 0;
					if (local17[local37 - 1] != 0) {
						local138++;
					}
					if (local17[local37 + 1] != 0) {
						local138++;
					}
					if (local17[local37 - local27] != 0) {
						local138++;
					}
					if (local17[local27 + local37] != 0) {
						local138++;
					}
					local21[local49++] = (byte) (local138 * 17);
				} else {
					local21[local49++] = 68;
				}
				local37++;
			}
			local37 += this.aClass275_2.anInt7530 - 128;
		}
		if (this.aClass32_Sub1_1 == null) {
			this.aClass32_Sub1_1 = new Class32_Sub1(this.aClass57_Sub2_8, 3553, 6406, 128, 128, false, this.aClass57_Sub2_8.aByteArray13, 6406, false);
			this.aClass32_Sub1_1.method2721(false, false);
			this.aClass32_Sub1_1.method8430(true);
		} else {
			this.aClass32_Sub1_1.method2724(this.aClass57_Sub2_8.aByteArray13, 6406, false, 128, 128);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1314() {
		this.method1310(this.anInt1445, this.anInterface21_1);
	}
}

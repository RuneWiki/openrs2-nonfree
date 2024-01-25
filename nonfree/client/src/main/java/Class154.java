import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class154 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
	public boolean aBoolean454 = true;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	private int anInt5193 = -1;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!pg;")
	private final Class158 aClass158_1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private final int anInt5191;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_29;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	private final int anInt5194;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private final int anInt5192;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!pq;")
	private Class81_Sub4 aClass81_Sub4_5;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!io;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!sd;")
	private Class106_Sub2 aClass106_Sub2_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!cg;Lclient!pg;Lclient!pj;IIIII)V")
	public Class154(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class105_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass158_1 = arg1;
		this.anInt5191 = arg7;
		this.aClass37_Sub1_29 = arg0;
		this.anInt5194 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local51 = local29 + (local35 + local33) * arg2.anInt5260;
			for (local53 = 0; local53 < local23; local53++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray13[local51++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt5192 = local25;
		if (local25 <= 0) {
			this.aClass81_Sub4_5 = null;
		} else {
			@Pc(93) Class2_Sub12 local93 = new Class2_Sub12(local25 * 2);
			@Pc(127) short[] local127;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass37_Sub1_29.aBoolean72) {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = arg2.anInt5260 * (local51 + local33) + local29;
					for (local118 = 0; local118 < local23; local118++) {
						local127 = arg2.aShortArrayArray13[local53++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local93.method3158(local127[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = local29 + arg2.anInt5260 * (local33 + local51);
					for (local118 = 0; local118 < local23; local118++) {
						local127 = arg2.aShortArrayArray13[local53++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local93.method3110(local127[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_4 = this.aClass37_Sub1_29.method777(local93.aByteArray30, local93.anInt3606, false);
			this.aClass106_Sub2_1 = new Class106_Sub2(this.aClass37_Sub1_29, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	private void method4387() {
		if (!this.aBoolean454) {
			return;
		}
		this.aBoolean454 = false;
		@Pc(11) byte[] local11 = this.aClass158_1.aByteArray75;
		@Pc(13) byte[] local13 = Static246.aByteArray74;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass158_1.anInt5216;
		@Pc(29) int local29 = this.aClass158_1.anInt5216 * this.anInt5191 + this.anInt5194;
		@Pc(31) int local31;
		@Pc(41) int local41;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local41 = -128; local41 < 0; local41++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass81_Sub4_5 != null && local15 == this.anInt5193) {
			this.aBoolean454 = false;
			return;
		}
		this.anInt5193 = local15;
		local29 = this.anInt5194 + this.anInt5191 * local19;
		local31 = 0;
		for (local41 = -128; local41 < 0; local41++) {
			for (@Pc(101) int local101 = -128; local101 < 0; local101++) {
				if (local11[local29] == 0) {
					@Pc(119) int local119 = 0;
					if (local11[local29 - 1] != 0) {
						local119++;
					}
					if (local11[local29 + 1] != 0) {
						local119++;
					}
					if (local11[local29 - local19] != 0) {
						local119++;
					}
					if (local11[local19 + local29] != 0) {
						local119++;
					}
					local13[local31++] = (byte) (local119 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass158_1.anInt5216 - 128;
		}
		if (this.aClass81_Sub4_5 == null) {
			this.aClass81_Sub4_5 = new Class81_Sub4(this.aClass37_Sub1_29, 3553, 6406, 128, 128, false, Static246.aByteArray74, 6406, false);
			this.aClass81_Sub4_5.method4745(false, false);
			this.aClass81_Sub4_5.method4737(true);
		} else {
			this.aClass81_Sub4_5.method4746(128, 128, Static246.aByteArray74, 6406, false);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!io;II)V")
	private void method4388(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4387();
			this.aClass37_Sub1_29.method767(this.aClass81_Sub4_5);
			this.aClass37_Sub1_29.method765(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[BB)V")
	public void method4389(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass106_Sub2_1.method4905(arg1, this.aClass37_Sub1_29.method792(5123) * arg0);
		this.method4388(this.aClass106_Sub2_1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public void method4390() {
		this.method4388(this.anInterface5_4, this.anInt5192);
	}
}

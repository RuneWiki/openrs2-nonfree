import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class169 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	private int anInt4046 = -1;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Z")
	public boolean aBoolean307 = true;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	private final int anInt4049;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_32;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!cr;")
	private final Class39 aClass39_2;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	private final int anInt4048;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	private final int anInt4047;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!jj;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!br;")
	private Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!uo;")
	private Class20_Sub4 aClass20_Sub4_6;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!fu;Lclient!cr;Lclient!ka;IIIII)V")
	public Class169(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class107_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4049 = arg7;
		this.aClass63_Sub2_32 = arg0;
		this.aClass39_2 = arg1;
		this.anInt4048 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(52) int local52;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local52 = arg2.anInt5379 * (local35 + local33) + local29;
			for (local54 = 0; local54 < local23; local54++) {
				@Pc(67) short[] local67 = arg2.aShortArrayArray4[local52++];
				if (local67 != null) {
					local25 += local67.length;
				}
			}
		}
		this.anInt4047 = local25;
		if (local25 > 0) {
			@Pc(94) Class2_Sub16 local94 = new Class2_Sub16(local25 * 2);
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(115) int local115;
			if (this.aClass63_Sub2_32.aBoolean153) {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = (local52 + local33) * arg2.anInt5379 + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray4[local54++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local94.method5351(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + arg2.anInt5379 * (local33 + local52);
					for (local115 = 0; local115 < local23; local115++) {
						local128 = arg2.aShortArrayArray4[local54++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local94.method5374(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface3_5 = this.aClass63_Sub2_32.method2100(local94.aByteArray112, local94.anInt6145, false);
			this.aClass23_Sub1_1 = new Class23_Sub1(this.aClass63_Sub2_32, 5123, null, 1);
		} else {
			this.aClass20_Sub4_6 = null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public void method3722() {
		this.method3723(this.anInt4047, this.anInterface3_5);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!jj;I)V")
	private void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1) {
		if (arg0 != 0) {
			this.method3724();
			this.aClass63_Sub2_32.method2068(this.aClass20_Sub4_6);
			this.aClass63_Sub2_32.method2072(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	private void method3724() {
		if (!this.aBoolean307) {
			return;
		}
		this.aBoolean307 = false;
		@Pc(11) byte[] local11 = this.aClass39_2.aByteArray11;
		@Pc(13) byte[] local13 = Static229.aByteArray71;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass39_2.anInt1002;
		@Pc(29) int local29 = this.anInt4049 * this.aClass39_2.anInt1002 + this.anInt4048;
		@Pc(31) int local31;
		@Pc(42) int local42;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local42 = -128; local42 < 0; local42++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass20_Sub4_6 != null && local15 == this.anInt4046) {
			this.aBoolean307 = false;
			return;
		}
		this.anInt4046 = local15;
		local31 = 0;
		local29 = this.anInt4048 + local19 * this.anInt4049;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(99) int local99 = -128; local99 < 0; local99++) {
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
			local29 += this.aClass39_2.anInt1002 - 128;
		}
		if (this.aClass20_Sub4_6 == null) {
			this.aClass20_Sub4_6 = new Class20_Sub4(this.aClass63_Sub2_32, 3553, 6406, 128, 128, false, Static229.aByteArray71, 6406, false);
			this.aClass20_Sub4_6.method5511(false, false);
			this.aClass20_Sub4_6.method5502(true);
		} else {
			this.aClass20_Sub4_6.method5508(128, 128, Static229.aByteArray71, 6406, false);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BI)V")
	public void method3725(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass23_Sub1_1.method3592(arg1, this.aClass63_Sub2_32.method2071(5123) * arg0);
		this.method3723(arg0, this.aClass23_Sub1_1);
	}
}

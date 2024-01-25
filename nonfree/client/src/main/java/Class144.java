import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class144 {

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Z")
	public boolean aBoolean320 = true;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	private int anInt3519 = -1;

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "Lclient!li;")
	private final Class223 aClass223_2;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	private final int anInt3512;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
	private final int anInt3518;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_16;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!ng;")
	private Class64_Sub4 aClass64_Sub4_1;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!jv;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!id;")
	private Class172_Sub1 aClass172_Sub1_2;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!uja;Lclient!li;Lclient!gba;IIIII)V")
	public Class144(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class133_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass223_2 = arg1;
		this.anInt3512 = arg6;
		this.anInt3518 = arg7;
		this.aClass145_Sub3_16 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local37 + local35) * arg2.anInt9318 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray3[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt3514 = local27;
		if (local27 <= 0) {
			this.aClass64_Sub4_1 = null;
		} else {
			@Pc(101) Class2_Sub20 local101 = new Class2_Sub20(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass145_Sub3_16.aBoolean872) {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = arg2.anInt9318 * (local52 + local35) + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray3[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method8551(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local118 = arg2.anInt9318 * (local52 + local35) + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray3[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method8589(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface12_4 = this.aClass145_Sub3_16.method8911(false, local101.anInt9723, local101.aByteArray111);
			this.aClass172_Sub1_2 = new Class172_Sub1(this.aClass145_Sub3_16, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	private void method3085() {
		if (!this.aBoolean320) {
			return;
		}
		this.aBoolean320 = false;
		@Pc(17) byte[] local17 = this.aClass223_2.aByteArray75;
		@Pc(21) byte[] local21 = this.aClass145_Sub3_16.aByteArray115;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = this.aClass223_2.anInt5824;
		@Pc(37) int local37 = this.anInt3518 * this.aClass223_2.anInt5824 + this.anInt3512;
		@Pc(61) int local61;
		for (@Pc(50) int local50 = -128; local50 < 0; local50++) {
			local23 = (local23 << 8) - local23;
			for (local61 = -128; local61 < 0; local61++) {
				if (local17[local37++] != 0) {
					local23++;
				}
			}
			local37 += local27 - 128;
		}
		if (this.aClass64_Sub4_1 != null && this.anInt3519 == local23) {
			this.aBoolean320 = false;
			return;
		}
		this.anInt3519 = local23;
		local37 = this.anInt3512 + this.anInt3518 * local27;
		local61 = 0;
		for (@Pc(121) int local121 = -128; local121 < 0; local121++) {
			for (@Pc(125) int local125 = -128; local125 < 0; local125++) {
				if (local17[local37] == 0) {
					@Pc(144) int local144 = 0;
					if (local17[local37 - 1] != 0) {
						local144++;
					}
					if (local17[local37 + 1] != 0) {
						local144++;
					}
					if (local17[local37 - local27] != 0) {
						local144++;
					}
					if (local17[local27 + local37] != 0) {
						local144++;
					}
					local21[local61++] = (byte) (local144 * 17);
				} else {
					local21[local61++] = 68;
				}
				local37++;
			}
			local37 += this.aClass223_2.anInt5824 - 128;
		}
		if (this.aClass64_Sub4_1 == null) {
			this.aClass64_Sub4_1 = new Class64_Sub4(this.aClass145_Sub3_16, 3553, 6406, 128, 128, false, this.aClass145_Sub3_16.aByteArray115, 6406, false);
			this.aClass64_Sub4_1.method4548(false, false);
			this.aClass64_Sub4_1.method4540(true);
		} else {
			this.aClass64_Sub4_1.method4547(128, 128, false, this.aClass145_Sub3_16.aByteArray115, 6406);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method3086() {
		this.method3088(this.anInt3514, this.anInterface12_4);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI[BI)V")
	public void method3087(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass172_Sub1_2.method7099(arg1, this.aClass145_Sub3_16.method8916(5123) * arg0);
		this.method3088(arg0, this.aClass172_Sub1_2);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BILclient!jv;)V")
	private void method3088(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		if (arg0 != 0) {
			this.method3085();
			this.aClass145_Sub3_16.method8872(this.aClass64_Sub4_1);
			this.aClass145_Sub3_16.method8921(arg0, 0, arg1);
		}
	}
}

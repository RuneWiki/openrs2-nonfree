import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class191 {

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
	public boolean aBoolean323 = true;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	private int anInt4928 = -1;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	private final int anInt4930;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	private final int anInt4929;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!dh;")
	private final Class80 aClass80_2;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_19;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	private final int anInt4925;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!kia;")
	private Class29_Sub3 aClass29_Sub3_3;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!bv;")
	private Interface6 anInterface6_3;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!tb;")
	private Class276_Sub2 aClass276_Sub2_2;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!vf;Lclient!dh;Lclient!dl;IIIII)V")
	public Class191(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4930 = arg6;
		this.anInt4929 = arg7;
		this.aClass80_2 = arg1;
		this.aClass100_Sub3_19 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = local31 + arg2.anInt8883 * (local35 + local37);
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray8[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt4925 = local27;
		if (local27 <= 0) {
			this.aClass29_Sub3_3 = null;
		} else {
			@Pc(105) Class5_Sub36 local105 = new Class5_Sub36(local27 * 2);
			@Pc(125) int local125;
			@Pc(133) short[] local133;
			@Pc(137) int local137;
			@Pc(123) int local123;
			if (this.aClass100_Sub3_19.aBoolean735) {
				for (local52 = 0; local52 < local25; local52++) {
					local123 = arg2.anInt8883 * (local35 + local52) + local31;
					for (local125 = 0; local125 < local25; local125++) {
						local133 = arg2.aShortArrayArray8[local123++];
						if (local133 != null) {
							for (local137 = 0; local137 < local133.length; local137++) {
								local105.method7296(local133[local137] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local123 = local31 + (local35 + local52) * arg2.anInt8883;
					for (local125 = 0; local125 < local25; local125++) {
						local133 = arg2.aShortArrayArray8[local123++];
						if (local133 != null) {
							for (local137 = 0; local137 < local133.length; local137++) {
								local105.method7279(local133[local137] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface6_3 = this.aClass100_Sub3_19.method8711(false, local105.anInt8456, local105.aByteArray89);
			this.aClass276_Sub2_2 = new Class276_Sub2(this.aClass100_Sub3_19, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	private void method4464() {
		if (!this.aBoolean323) {
			return;
		}
		this.aBoolean323 = false;
		@Pc(17) byte[] local17 = this.aClass80_2.aByteArray21;
		@Pc(21) byte[] local21 = this.aClass100_Sub3_19.aByteArray106;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = this.aClass80_2.anInt1577;
		@Pc(37) int local37 = this.anInt4930 + this.anInt4929 * this.aClass80_2.anInt1577;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local23 = (local23 << 8) - local23;
			for (local50 = -128; local50 < 0; local50++) {
				if (local17[local37++] != 0) {
					local23++;
				}
			}
			local37 += local27 - 128;
		}
		if (this.aClass29_Sub3_3 != null && local23 == this.anInt4928) {
			this.aBoolean323 = false;
			return;
		}
		this.anInt4928 = local23;
		local50 = 0;
		local37 = local27 * this.anInt4929 + this.anInt4930;
		for (@Pc(113) int local113 = -128; local113 < 0; local113++) {
			for (@Pc(119) int local119 = -128; local119 < 0; local119++) {
				if (local17[local37] == 0) {
					@Pc(141) int local141 = 0;
					if (local17[local37 - 1] != 0) {
						local141++;
					}
					if (local17[local37 + 1] != 0) {
						local141++;
					}
					if (local17[local37 - local27] != 0) {
						local141++;
					}
					if (local17[local37 + local27] != 0) {
						local141++;
					}
					local21[local50++] = (byte) (local141 * 17);
				} else {
					local21[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass80_2.anInt1577 - 128;
		}
		if (false) {
			this.aClass276_Sub2_2 = null;
		}
		if (this.aClass29_Sub3_3 == null) {
			this.aClass29_Sub3_3 = new Class29_Sub3(this.aClass100_Sub3_19, 3553, 6406, 128, 128, false, this.aClass100_Sub3_19.aByteArray106, 6406, false);
			this.aClass29_Sub3_3.method8174(false, false);
			this.aClass29_Sub3_3.method8164(true);
		} else {
			this.aClass29_Sub3_3.method8173(128, 6406, this.aClass100_Sub3_19.aByteArray106, false, 128);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZ[B)V")
	public void method4465(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass276_Sub2_2.method7654(arg0 * this.aClass100_Sub3_19.method8686(5123), arg1);
		this.method4466(arg0, this.aClass276_Sub2_2);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!bv;)V")
	private void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (arg0 != 0) {
			this.method4464();
			this.aClass100_Sub3_19.method8743(this.aClass29_Sub3_3);
			this.aClass100_Sub3_19.method8707(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method4467() {
		this.method4466(this.anInt4925, this.anInterface6_3);
	}
}

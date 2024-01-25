import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class44 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt910 = -1;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!hr;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_5;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	private final int anInt912;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	private final int anInt911;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	private final int anInt909;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Lclient!im;")
	private Class56_Sub4 aClass56_Sub4_2;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!ok;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!sr;")
	private Class100_Sub2 aClass100_Sub2_1;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!tb;Lclient!hr;Lclient!fq;IIIII)V")
	public Class44(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class77_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass98_1 = arg1;
		this.aClass129_Sub2_5 = arg0;
		this.anInt912 = arg7;
		this.anInt911 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local51 = local29 + arg2.anInt4673 * (local35 + local33);
			for (local53 = 0; local53 < local23; local53++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray2[local51++];
				if (local62 != null) {
					local25 += local62.length;
				}
			}
		}
		this.anInt909 = local25;
		if (local25 <= 0) {
			this.aClass56_Sub4_2 = null;
		} else {
			@Pc(94) Class11_Sub25 local94 = new Class11_Sub25(local25 * 2);
			@Pc(127) short[] local127;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass129_Sub2_5.aBoolean377) {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = local29 + (local51 + local33) * arg2.anInt4673;
					for (local118 = 0; local118 < local23; local118++) {
						local127 = arg2.aShortArrayArray2[local53++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local94.method5204(local127[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local23; local51++) {
					local53 = (local33 + local51) * arg2.anInt4673 + local29;
					for (local118 = 0; local118 < local23; local118++) {
						local127 = arg2.aShortArrayArray2[local53++];
						if (local127 != null) {
							for (local132 = 0; local132 < local127.length; local132++) {
								local94.method5223(local127[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_2 = this.aClass129_Sub2_5.method5060(local94.aByteArray93, local94.anInt6076, false);
			this.aClass100_Sub2_1 = new Class100_Sub2(this.aClass129_Sub2_5, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI[B)V")
	public void method683(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass100_Sub2_1.method4886(arg1, arg0 * this.aClass129_Sub2_5.method5057(5123));
		this.method684(arg0, this.aClass100_Sub2_1);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!ok;)V")
	private void method684(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1) {
		if (arg0 != 0) {
			this.method686();
			this.aClass129_Sub2_5.method5084(this.aClass56_Sub4_2);
			this.aClass129_Sub2_5.method5092(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public void method685() {
		this.method684(this.anInt909, this.anInterface5_2);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	private void method686() {
		if (!this.aBoolean56) {
			return;
		}
		this.aBoolean56 = false;
		@Pc(11) byte[] local11 = this.aClass98_1.aByteArray32;
		@Pc(13) byte[] local13 = Static47.aByteArray21;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass98_1.anInt2252;
		@Pc(29) int local29 = this.anInt911 + this.aClass98_1.anInt2252 * this.anInt912;
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
		if (this.aClass56_Sub4_2 != null && this.anInt910 == local15) {
			this.aBoolean56 = false;
			return;
		}
		this.anInt910 = local15;
		local31 = 0;
		local29 = this.anInt911 + local19 * this.anInt912;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(98) int local98 = -128; local98 < 0; local98++) {
				if (local11[local29] == 0) {
					@Pc(110) int local110 = 0;
					if (local11[local29 - 1] != 0) {
						local110++;
					}
					if (local11[local29 + 1] != 0) {
						local110++;
					}
					if (local11[local29 - local19] != 0) {
						local110++;
					}
					if (local11[local29 + local19] != 0) {
						local110++;
					}
					local13[local31++] = (byte) (local110 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass98_1.anInt2252 - 128;
		}
		if (this.aClass56_Sub4_2 == null) {
			this.aClass56_Sub4_2 = new Class56_Sub4(this.aClass129_Sub2_5, 3553, 6406, 128, 128, false, Static47.aByteArray21, 6406, false);
			this.aClass56_Sub4_2.method2553(false, false);
			this.aClass56_Sub4_2.method2542(true);
		} else {
			this.aClass56_Sub4_2.method2551(128, 128, Static47.aByteArray21, 6406, false);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class193 {

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
	public boolean aBoolean399 = true;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	private int anInt5051 = -1;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!iu;")
	private final Class166 aClass166_2;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_29;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	private final int anInt5048;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	private final int anInt5056;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	private final int anInt5053;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!pm;")
	private Class23_Sub1 aClass23_Sub1_4;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "Lclient!dw;")
	private Interface3 anInterface3_3;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!wk;")
	private Class44_Sub2 aClass44_Sub2_2;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qj;Lclient!iu;Lclient!dga;IIIII)V")
	public Class193(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class67_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass166_2 = arg1;
		this.aClass100_Sub3_29 = arg0;
		this.anInt5048 = arg7;
		this.anInt5056 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt8111;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray2[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5053 = local27;
		if (local27 <= 0) {
			this.aClass23_Sub1_4 = null;
		} else {
			@Pc(98) Class2_Sub15 local98 = new Class2_Sub15(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass100_Sub3_29.aBoolean595) {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + (local35 + local51) * arg2.anInt8111;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray2[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method4350(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + arg2.anInt8111 * (local51 + local35);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray2[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method4308(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface3_3 = this.aClass100_Sub3_29.method6301(local98.anInt5241, local98.aByteArray62, false);
			this.aClass44_Sub2_2 = new Class44_Sub2(this.aClass100_Sub3_29, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	private void method4209() {
		if (!this.aBoolean399) {
			return;
		}
		this.aBoolean399 = false;
		@Pc(16) byte[] local16 = this.aClass166_2.aByteArray51;
		@Pc(20) byte[] local20 = this.aClass100_Sub3_29.aByteArray74;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass166_2.anInt4357;
		@Pc(42) int local42 = this.anInt5048 * this.aClass166_2.anInt4357 + this.anInt5056;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local28 = (local28 << 8) - local28;
			for (local55 = -128; local55 < 0; local55++) {
				if (local16[local42++] != 0) {
					local28++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass23_Sub1_4 != null && this.anInt5051 == local28) {
			this.aBoolean399 = false;
			return;
		}
		this.anInt5051 = local28;
		local55 = 0;
		local42 = this.anInt5056 + this.anInt5048 * local32;
		for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local16[local42] == 0) {
					@Pc(117) int local117 = 0;
					if (local16[local42 - 1] != 0) {
						local117++;
					}
					if (local16[local42 + 1] != 0) {
						local117++;
					}
					if (local16[local42 - local32] != 0) {
						local117++;
					}
					if (local16[local32 + local42] != 0) {
						local117++;
					}
					local20[local55++] = (byte) (local117 * 17);
				} else {
					local20[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass166_2.anInt4357 - 128;
		}
		if (this.aClass23_Sub1_4 == null) {
			this.aClass23_Sub1_4 = new Class23_Sub1(this.aClass100_Sub3_29, 3553, 6406, 128, 128, false, this.aClass100_Sub3_29.aByteArray74, 6406, false);
			this.aClass23_Sub1_4.method377(false, false);
			this.aClass23_Sub1_4.method7783(true);
		} else {
			this.aClass23_Sub1_4.method371(6406, false, 128, this.aClass100_Sub3_29.aByteArray74, 128);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BIII)V")
	public void method4210(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass44_Sub2_2.method7927(this.aClass100_Sub3_29.method6323(5123) * arg1, arg0);
		this.method4213(arg1, this.aClass44_Sub2_2);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
	public void method4211() {
		this.method4213(this.anInt5053, this.anInterface3_3);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!dw;)V")
	private void method4213(@OriginalArg(1) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg0 != 0) {
			this.method4209();
			this.aClass100_Sub3_29.method6277(this.aClass23_Sub1_4);
			this.aClass100_Sub3_29.method6295(arg0, 0, arg1);
		}
	}
}

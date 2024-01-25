import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class216 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	private int anInt6632 = -1;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
	public boolean aBoolean458 = true;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private final int anInt6624;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!hv;")
	private final Class104 aClass104_2;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_41;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	private final int anInt6633;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private final int anInt6628;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!cm;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!gi;")
	private Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!sr;")
	private Class42_Sub1 aClass42_Sub1_7;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!gk;Lclient!hv;Lclient!eh;IIIII)V")
	public Class216(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class64_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6624 = arg6;
		this.aClass104_2 = arg1;
		this.aClass75_Sub2_41 = arg0;
		this.anInt6633 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt7006 * (local35 + local37);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray2[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt6628 = local27;
		if (local27 <= 0) {
			this.aClass42_Sub1_7 = null;
		} else {
			@Pc(93) Class3_Sub2 local93 = new Class3_Sub2(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass75_Sub2_41.aBoolean228) {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + arg2.anInt7006 * (local35 + local50);
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray2[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method6045(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local111 = local31 + arg2.anInt7006 * (local35 + local50);
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray2[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local93.method6000(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_4 = this.aClass75_Sub2_41.method2437(local93.aByteArray95, false, local93.anInt7620);
			this.aClass85_Sub1_1 = new Class85_Sub1(this.aClass75_Sub2_41, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!cm;B)V")
	private void method5206(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1) {
		if (arg0 != 0) {
			this.method5208();
			this.aClass75_Sub2_41.method2456(this.aClass42_Sub1_7);
			this.aClass75_Sub2_41.method2454(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	private void method5208() {
		if (!this.aBoolean458) {
			return;
		}
		this.aBoolean458 = false;
		@Pc(16) byte[] local16 = this.aClass104_2.aByteArray40;
		@Pc(18) byte[] local18 = Static300.aByteArray62;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = this.aClass104_2.anInt3520;
		@Pc(35) int local35 = this.anInt6624 + this.anInt6633 * this.aClass104_2.anInt3520;
		@Pc(47) int local47;
		for (@Pc(37) int local37 = -128; local37 < 0; local37++) {
			local20 = (local20 << 8) - local20;
			for (local47 = -128; local47 < 0; local47++) {
				if (local16[local35++] != 0) {
					local20++;
				}
			}
			local35 += local24 - 128;
		}
		if (this.aClass42_Sub1_7 != null && local20 == this.anInt6632) {
			this.aBoolean458 = false;
			return;
		}
		this.anInt6632 = local20;
		local47 = 0;
		local35 = this.anInt6624 + local24 * this.anInt6633;
		for (@Pc(97) int local97 = -128; local97 < 0; local97++) {
			for (@Pc(101) int local101 = -128; local101 < 0; local101++) {
				if (local16[local35] == 0) {
					@Pc(112) int local112 = 0;
					if (local16[local35 - 1] != 0) {
						local112++;
					}
					if (local16[local35 + 1] != 0) {
						local112++;
					}
					if (local16[local35 - local24] != 0) {
						local112++;
					}
					if (local16[local35 + local24] != 0) {
						local112++;
					}
					local18[local47++] = (byte) (local112 * 17);
				} else {
					local18[local47++] = 68;
				}
				local35++;
			}
			local35 += this.aClass104_2.anInt3520 - 128;
		}
		if (this.aClass42_Sub1_7 == null) {
			this.aClass42_Sub1_7 = new Class42_Sub1(this.aClass75_Sub2_41, 3553, 6406, 128, 128, false, Static300.aByteArray62, 6406, false);
			this.aClass42_Sub1_7.method1269(false, false);
			this.aClass42_Sub1_7.method4910(true);
		} else {
			this.aClass42_Sub1_7.method1266(128, 128, 6406, Static300.aByteArray62, false);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BBI)V")
	public void method5209(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass85_Sub1_1.method5470(arg0, this.aClass75_Sub2_41.method2427(5123) * arg1);
		this.method5206(arg1, this.aClass85_Sub1_1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public void method5212() {
		this.method5206(this.anInt6628, this.anInterface1_4);
	}
}

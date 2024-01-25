import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class49 {

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
	private int anInt1654 = -1;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
	private final int anInt1653;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	private final int anInt1657;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "Lclient!rw;")
	private final Class256 aClass256_1;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_7;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
	private final int anInt1648;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "Lclient!ot;")
	private Class19_Sub2 aClass19_Sub2_3;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "Lclient!eea;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "Lclient!sw;")
	private Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!os;Lclient!rw;Lclient!nba;IIIII)V")
	public Class49(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class75_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1653 = arg6;
		this.anInt1657 = arg7;
		this.aClass256_1 = arg1;
		this.aClass39_Sub3_7 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = arg2.anInt7998 * (local37 + local35) + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray8[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt1648 = local27;
		if (local27 <= 0) {
			this.aClass19_Sub2_3 = null;
		} else {
			@Pc(100) Class2_Sub29 local100 = new Class2_Sub29(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass39_Sub3_7.aBoolean485) {
				for (local50 = 0; local50 < local25; local50++) {
					local118 = local31 + (local35 + local50) * arg2.anInt7998;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray8[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local100.method5217(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local118 = local31 + arg2.anInt7998 * (local35 + local50);
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray8[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local100.method5199(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_1 = this.aClass39_Sub3_7.method5733(local100.anInt6132, local100.aByteArray96, false);
			this.aClass45_Sub2_1 = new Class45_Sub2(this.aClass39_Sub3_7, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	public void method1569() {
		this.method1572(this.anInterface5_1, this.anInt1648);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!eea;II)V")
	private void method1572(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method1573();
			this.aClass39_Sub3_7.method5719(this.aClass19_Sub2_3);
			this.aClass39_Sub3_7.method5755(arg0, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
	private void method1573() {
		if (!this.aBoolean119) {
			return;
		}
		this.aBoolean119 = false;
		@Pc(16) byte[] local16 = this.aClass256_1.aByteArray105;
		@Pc(24) byte[] local24 = this.aClass39_Sub3_7.aByteArray97;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass256_1.anInt7888;
		@Pc(40) int local40 = this.anInt1657 * this.aClass256_1.anInt7888 + this.anInt1653;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local26 = (local26 << 8) - local26;
			for (local53 = -128; local53 < 0; local53++) {
				if (local16[local40++] != 0) {
					local26++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.aClass19_Sub2_3 != null && local26 == this.anInt1654) {
			this.aBoolean119 = false;
			return;
		}
		this.anInt1654 = local26;
		local53 = 0;
		local40 = this.anInt1653 + this.anInt1657 * local30;
		for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local16[local40] == 0) {
					@Pc(118) int local118 = 0;
					if (local16[local40 - 1] != 0) {
						local118++;
					}
					if (local16[local40 + 1] != 0) {
						local118++;
					}
					if (local16[local40 - local30] != 0) {
						local118++;
					}
					if (local16[local30 + local40] != 0) {
						local118++;
					}
					local24[local53++] = (byte) (local118 * 17);
				} else {
					local24[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass256_1.anInt7888 - 128;
		}
		if (this.aClass19_Sub2_3 == null) {
			this.aClass19_Sub2_3 = new Class19_Sub2(this.aClass39_Sub3_7, 3553, 6406, 128, 128, false, this.aClass39_Sub3_7.aByteArray97, 6406, false);
			this.aClass19_Sub2_3.method2691(false, false);
			this.aClass19_Sub2_3.method4799(true);
		} else {
			this.aClass19_Sub2_3.method2697(128, false, this.aClass39_Sub3_7.aByteArray97, 6406, 128);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII[B)V")
	public void method1574(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass45_Sub2_1.method6824(arg0 * this.aClass39_Sub3_7.method5691(5123), arg1);
		this.method1572(this.aClass45_Sub2_1, arg0);
	}
}

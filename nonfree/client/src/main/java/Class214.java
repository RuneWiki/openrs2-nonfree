import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class214 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
	public boolean aBoolean403 = true;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	private int anInt6217 = -1;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private final int anInt6216;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_40;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!ac;")
	private final Class4 aClass4_2;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	private final int anInt6219;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	private final int anInt6213;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "Lclient!qv;")
	private Class13_Sub1 aClass13_Sub1_7;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!nk;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!va;")
	private Class59_Sub2 aClass59_Sub2_1;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ht;Lclient!ac;Lclient!jt;IIIII)V")
	public Class214(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class136_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6216 = arg7;
		this.aClass109_Sub1_40 = arg0;
		this.aClass4_2 = arg1;
		this.anInt6219 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt7662;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray5[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt6213 = local27;
		if (local27 <= 0) {
			this.aClass13_Sub1_7 = null;
		} else {
			@Pc(96) Class1_Sub1 local96 = new Class1_Sub1(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass109_Sub1_40.aBoolean163) {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = (local50 + local35) * arg2.anInt7662 + local31;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray5[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method4101(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = local31 + (local35 + local50) * arg2.anInt7662;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray5[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method4146(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface8_5 = this.aClass109_Sub1_40.method2568(local96.anInt5056, local96.aByteArray66, false);
			this.aClass59_Sub2_1 = new Class59_Sub2(this.aClass109_Sub1_40, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!nk;II)V")
	private void method5022(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5023();
			this.aClass109_Sub1_40.method2578(this.aClass13_Sub1_7);
			this.aClass109_Sub1_40.method2586(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	private void method5023() {
		if (!this.aBoolean403) {
			return;
		}
		this.aBoolean403 = false;
		@Pc(16) byte[] local16 = this.aClass4_2.aByteArray3;
		@Pc(18) byte[] local18 = Static205.aByteArray52;
		@Pc(20) int local20 = 0;
		@Pc(32) int local32 = this.aClass4_2.anInt185;
		@Pc(42) int local42 = this.anInt6219 + this.anInt6216 * this.aClass4_2.anInt185;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local20 = (local20 << 8) - local20;
			for (local55 = -128; local55 < 0; local55++) {
				if (local16[local42++] != 0) {
					local20++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass13_Sub1_7 != null && this.anInt6217 == local20) {
			this.aBoolean403 = false;
			return;
		}
		this.anInt6217 = local20;
		local55 = 0;
		local42 = this.anInt6219 + local32 * this.anInt6216;
		for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
			for (@Pc(115) int local115 = -128; local115 < 0; local115++) {
				if (local16[local42] == 0) {
					@Pc(126) int local126 = 0;
					if (local16[local42 - 1] != 0) {
						local126++;
					}
					if (local16[local42 + 1] != 0) {
						local126++;
					}
					if (local16[local42 - local32] != 0) {
						local126++;
					}
					if (local16[local42 + local32] != 0) {
						local126++;
					}
					local18[local55++] = (byte) (local126 * 17);
				} else {
					local18[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass4_2.anInt185 - 128;
		}
		if (this.aClass13_Sub1_7 == null) {
			this.aClass13_Sub1_7 = new Class13_Sub1(this.aClass109_Sub1_40, 3553, 6406, 128, 128, false, Static205.aByteArray52, 6406, false);
			this.aClass13_Sub1_7.method1055(false, false);
			this.aClass13_Sub1_7.method2745(true);
		} else {
			this.aClass13_Sub1_7.method1050(Static205.aByteArray52, 6406, 128, false, 128);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public void method5026() {
		this.method5022(this.anInterface8_5, this.anInt6213);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI)V")
	public void method5028(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass59_Sub2_1.method5609(arg0, arg1 * this.aClass109_Sub1_40.method2552(5123));
		this.method5022(this.aClass59_Sub2_1, arg1);
	}
}

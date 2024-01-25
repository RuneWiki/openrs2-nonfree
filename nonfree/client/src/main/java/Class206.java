import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class206 {

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	private int anInt5935 = -1;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
	public boolean aBoolean384 = true;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
	private final int anInt5934;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	private final int anInt5928;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!dr;")
	private final Class59 aClass59_1;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_33;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	private final int anInt5931;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "Lclient!af;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Lclient!bi;")
	private Class26_Sub1 aClass26_Sub1_2;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!sq;")
	private Class4_Sub1 aClass4_Sub1_4;

	static {
		new Class182("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!da;Lclient!dr;Lclient!wv;IIIII)V")
	public Class206(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) Class154_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5934 = arg7;
		this.anInt5928 = arg6;
		this.aClass59_1 = arg1;
		this.aClass50_Sub1_33 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt7614;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray10[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5931 = local27;
		if (local27 <= 0) {
			this.aClass4_Sub1_4 = null;
		} else {
			@Pc(89) Class10_Sub8 local89 = new Class10_Sub8(local27 * 2);
			@Pc(109) int local109;
			@Pc(117) short[] local117;
			@Pc(121) int local121;
			@Pc(107) int local107;
			if (this.aClass50_Sub1_33.aBoolean99) {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = arg2.anInt7614 * (local51 + local35) + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray10[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local89.method2509(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local107 = (local51 + local35) * arg2.anInt7614 + local31;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray10[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local89.method2496(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_4 = this.aClass50_Sub1_33.method1305(local89.anInt2989, false, local89.aByteArray44);
			this.aClass26_Sub1_2 = new Class26_Sub1(this.aClass50_Sub1_33, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public void method4714() {
		this.method4717(this.anInt5931, this.anInterface1_4);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	private void method4715() {
		if (!this.aBoolean384) {
			return;
		}
		this.aBoolean384 = false;
		@Pc(16) byte[] local16 = this.aClass59_1.aByteArray12;
		@Pc(20) byte[] local20 = this.aClass50_Sub1_33.aByteArray11;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass59_1.anInt1669;
		@Pc(37) int local37 = this.anInt5928 + this.aClass59_1.anInt1669 * this.anInt5934;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass4_Sub1_4 != null && this.anInt5935 == local22) {
			this.aBoolean384 = false;
			return;
		}
		this.anInt5935 = local22;
		local37 = this.anInt5928 + local26 * this.anInt5934;
		local50 = 0;
		for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local16[local37] == 0) {
					@Pc(115) int local115 = 0;
					if (local16[local37 - 1] != 0) {
						local115++;
					}
					if (local16[local37 + 1] != 0) {
						local115++;
					}
					if (local16[local37 - local26] != 0) {
						local115++;
					}
					if (local16[local37 + local26] != 0) {
						local115++;
					}
					local20[local50++] = (byte) (local115 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass59_1.anInt1669 - 128;
		}
		if (this.aClass4_Sub1_4 == null) {
			this.aClass4_Sub1_4 = new Class4_Sub1(this.aClass50_Sub1_33, 3553, 6406, 128, 128, false, this.aClass50_Sub1_33.aByteArray11, 6406, false);
			this.aClass4_Sub1_4.method154(false, false);
			this.aClass4_Sub1_4.method4580(true);
		} else {
			this.aClass4_Sub1_4.method156(128, false, 6406, 128, this.aClass50_Sub1_33.aByteArray11);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI[B)V")
	public void method4716(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass26_Sub1_2.method1769(arg1, arg0 * this.aClass50_Sub1_33.method1268(5123));
		this.method4717(arg0, this.aClass26_Sub1_2);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!af;I)V")
	private void method4717(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1) {
		if (arg0 != 0) {
			this.method4715();
			this.aClass50_Sub1_33.method1295(this.aClass4_Sub1_4);
			this.aClass50_Sub1_33.method1290(arg0, 0, arg1);
		}
	}
}

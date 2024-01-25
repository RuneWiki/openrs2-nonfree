import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class340 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
	private int anInt8847 = -1;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
	public boolean aBoolean694 = true;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
	private final int anInt8850;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!pj;")
	private final Class261 aClass261_2;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_42;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
	private final int anInt8857;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	private final int anInt8853;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "Lclient!cv;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "Lclient!bl;")
	private Class28_Sub1 aClass28_Sub1_2;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "Lclient!db;")
	private Class34_Sub2 aClass34_Sub2_6;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!us;Lclient!pj;Lclient!oj;IIIII)V")
	public Class340(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class139_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8850 = arg7;
		this.aClass261_2 = arg1;
		this.aClass43_Sub3_42 = arg0;
		this.anInt8857 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = (local35 + local37) * arg2.anInt8179 + local31;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray66[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt8853 = local27;
		if (local27 <= 0) {
			this.aClass34_Sub2_6 = null;
		} else {
			@Pc(90) Class3_Sub11 local90 = new Class3_Sub11(local27 * 2);
			@Pc(109) int local109;
			@Pc(117) short[] local117;
			@Pc(121) int local121;
			@Pc(107) int local107;
			if (this.aClass43_Sub3_42.aBoolean671) {
				for (local52 = 0; local52 < local25; local52++) {
					local107 = local31 + (local35 + local52) * arg2.anInt8179;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray66[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method3131(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local107 = local31 + (local52 + local35) * arg2.anInt8179;
					for (local109 = 0; local109 < local25; local109++) {
						local117 = arg2.aShortArrayArray66[local107++];
						if (local117 != null) {
							for (local121 = 0; local121 < local117.length; local121++) {
								local90.method3075(local117[local121] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_5 = this.aClass43_Sub3_42.method7288(false, local90.aByteArray36, local90.anInt3520);
			this.aClass28_Sub1_2 = new Class28_Sub1(this.aClass43_Sub3_42, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
	public void method7327() {
		this.method7328(this.anInterface5_5, this.anInt8853);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!cv;ZI)V")
	private void method7328(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method7330();
			this.aClass43_Sub3_42.method7220(this.aClass34_Sub2_6);
			this.aClass43_Sub3_42.method7224(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	private void method7330() {
		if (!this.aBoolean694) {
			return;
		}
		this.aBoolean694 = false;
		@Pc(16) byte[] local16 = this.aClass261_2.aByteArray86;
		@Pc(20) byte[] local20 = this.aClass43_Sub3_42.aByteArray100;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass261_2.anInt6903;
		@Pc(36) int local36 = this.anInt8850 * this.aClass261_2.anInt6903 + this.anInt8857;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass34_Sub2_6 != null && local22 == this.anInt8847) {
			this.aBoolean694 = false;
			return;
		}
		this.anInt8847 = local22;
		local36 = this.anInt8857 + local26 * this.anInt8850;
		local49 = 0;
		for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
			for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
				if (local16[local36] == 0) {
					@Pc(123) int local123 = 0;
					if (local16[local36 - 1] != 0) {
						local123++;
					}
					if (local16[local36 + 1] != 0) {
						local123++;
					}
					if (local16[local36 - local26] != 0) {
						local123++;
					}
					if (local16[local26 + local36] != 0) {
						local123++;
					}
					local20[local49++] = (byte) (local123 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass261_2.anInt6903 - 128;
		}
		if (this.aClass34_Sub2_6 == null) {
			this.aClass34_Sub2_6 = new Class34_Sub2(this.aClass43_Sub3_42, 3553, 6406, 128, 128, false, this.aClass43_Sub3_42.aByteArray100, 6406, false);
			this.aClass34_Sub2_6.method1964(false, false);
			this.aClass34_Sub2_6.method4974(true);
		} else {
			this.aClass34_Sub2_6.method1963(6406, 128, 128, false, this.aClass43_Sub3_42.aByteArray100);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIIB)V")
	public void method7331(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass28_Sub1_2.method6870(arg0, this.aClass43_Sub3_42.method7255(5123) * arg1);
		this.method7328(this.aClass28_Sub1_2, arg1);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class338 {

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "Z")
	public boolean aBoolean702 = true;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
	private int anInt9092 = -1;

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_40;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!fda;")
	private final Class100 aClass100_1;

	@OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
	private final int anInt9094;

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
	private final int anInt9091;

	@OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
	private final int anInt9098;

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lclient!wn;")
	private Class40_Sub3 aClass40_Sub3_6;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lclient!vu;")
	private Interface23 anInterface23_5;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!jca;")
	private Class167_Sub1 aClass167_Sub1_2;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!ok;Lclient!fda;Lclient!vfa;IIIII)V")
	public Class338(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class47_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass134_Sub2_40 = arg0;
		this.aClass100_1 = arg1;
		this.anInt9094 = arg7;
		this.anInt9091 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local35 + local37) * arg2.anInt9209 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray13[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt9098 = local27;
		if (local27 <= 0) {
			this.aClass40_Sub3_6 = null;
		} else {
			@Pc(94) Class1_Sub35 local94 = new Class1_Sub35(local27 * 2);
			@Pc(113) int local113;
			@Pc(121) short[] local121;
			@Pc(125) int local125;
			@Pc(111) int local111;
			if (this.aClass134_Sub2_40.aBoolean517) {
				for (local51 = 0; local51 < local25; local51++) {
					local111 = local31 + (local51 + local35) * arg2.anInt9209;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray13[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local94.method5776(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local111 = local31 + (local35 + local51) * arg2.anInt9209;
					for (local113 = 0; local113 < local25; local113++) {
						local121 = arg2.aShortArrayArray13[local111++];
						if (local121 != null) {
							for (local125 = 0; local125 < local121.length; local125++) {
								local94.method5767(local121[local125] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface23_5 = this.aClass134_Sub2_40.method5223(local94.aByteArray85, false, local94.anInt7214);
			this.aClass167_Sub1_2 = new Class167_Sub1(this.aClass134_Sub2_40, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III[B)V")
	public void method7448(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass167_Sub1_2.method5061(arg0 * this.aClass134_Sub2_40.method5250(5123), arg1);
		this.method7450(this.aClass167_Sub1_2, arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
	public void method7449() {
		this.method7450(this.anInterface23_5, this.anInt9098);
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!vu;II)V")
	private void method7450(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method7451();
			this.aClass134_Sub2_40.method5202(this.aClass40_Sub3_6);
			this.aClass134_Sub2_40.method5219(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	private void method7451() {
		if (!this.aBoolean702) {
			return;
		}
		this.aBoolean702 = false;
		@Pc(16) byte[] local16 = this.aClass100_1.aByteArray28;
		@Pc(20) byte[] local20 = this.aClass134_Sub2_40.aByteArray78;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass100_1.anInt2578;
		@Pc(37) int local37 = this.anInt9091 + this.aClass100_1.anInt2578 * this.anInt9094;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local22 = (local22 << 8) - local22;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.aClass40_Sub3_6 != null && this.anInt9092 == local22) {
			this.aBoolean702 = false;
			return;
		}
		this.anInt9092 = local22;
		local37 = local26 * this.anInt9094 + this.anInt9091;
		local54 = 0;
		for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
			for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
				if (local16[local37] == 0) {
					@Pc(129) int local129 = 0;
					if (local16[local37 - 1] != 0) {
						local129++;
					}
					if (local16[local37 + 1] != 0) {
						local129++;
					}
					if (local16[local37 - local26] != 0) {
						local129++;
					}
					if (local16[local37 + local26] != 0) {
						local129++;
					}
					local20[local54++] = (byte) (local129 * 17);
				} else {
					local20[local54++] = 68;
				}
				local37++;
			}
			local37 += this.aClass100_1.anInt2578 - 128;
		}
		if (this.aClass40_Sub3_6 == null) {
			this.aClass40_Sub3_6 = new Class40_Sub3(this.aClass134_Sub2_40, 3553, 6406, 128, 128, false, this.aClass134_Sub2_40.aByteArray78, 6406, false);
			this.aClass40_Sub3_6.method5391(false, false);
			this.aClass40_Sub3_6.method5874(true);
		} else {
			this.aClass40_Sub3_6.method5387(this.aClass134_Sub2_40.aByteArray78, 128, false, 6406, 128);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class86 {

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	private int anInt1857 = -1;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
	private final int anInt1865;

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_13;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Lclient!bl;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	private final int anInt1860;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	private final int anInt1866;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lclient!ik;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!en;")
	private Class72_Sub1 aClass72_Sub1_2;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "Lclient!gu;")
	private Class23_Sub3 aClass23_Sub3_2;

	static {
		new Class142("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!ih;Lclient!bl;Lclient!us;IIIII)V")
	public Class86(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) Class139_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1865 = arg7;
		this.aClass117_Sub1_13 = arg0;
		this.aClass30_1 = arg1;
		this.anInt1860 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + arg2.anInt6757 * (local37 + local35);
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray8[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt1866 = local27;
		if (local27 <= 0) {
			this.aClass23_Sub3_2 = null;
		} else {
			@Pc(85) Class1_Sub19 local85 = new Class1_Sub19(local27 * 2);
			@Pc(104) int local104;
			@Pc(112) short[] local112;
			@Pc(116) int local116;
			@Pc(102) int local102;
			if (this.aClass117_Sub1_13.aBoolean291) {
				for (local50 = 0; local50 < local25; local50++) {
					local102 = local31 + arg2.anInt6757 * (local50 + local35);
					for (local104 = 0; local104 < local25; local104++) {
						local112 = arg2.aShortArrayArray8[local102++];
						if (local112 != null) {
							for (local116 = 0; local116 < local112.length; local116++) {
								local85.method2930(local112[local116] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local102 = local31 + arg2.anInt6757 * (local50 + local35);
					for (local104 = 0; local104 < local25; local104++) {
						local112 = arg2.aShortArrayArray8[local102++];
						if (local112 != null) {
							for (local116 = 0; local116 < local112.length; local116++) {
								local85.method2936(local112[local116] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface3_2 = this.aClass117_Sub1_13.method2511(local85.aByteArray38, false, local85.anInt3698);
			this.aClass72_Sub1_2 = new Class72_Sub1(this.aClass117_Sub1_13, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	private void method1516() {
		if (!this.aBoolean196) {
			return;
		}
		this.aBoolean196 = false;
		@Pc(16) byte[] local16 = this.aClass30_1.aByteArray6;
		@Pc(20) byte[] local20 = this.aClass117_Sub1_13.aByteArray33;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass30_1.anInt502;
		@Pc(36) int local36 = this.aClass30_1.anInt502 * this.anInt1865 + this.anInt1860;
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
		if (this.aClass23_Sub3_2 != null && this.anInt1857 == local22) {
			this.aBoolean196 = false;
			return;
		}
		this.anInt1857 = local22;
		local36 = this.anInt1860 + local26 * this.anInt1865;
		local49 = 0;
		for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
			for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
				if (local16[local36] == 0) {
					@Pc(127) int local127 = 0;
					if (local16[local36 - 1] != 0) {
						local127++;
					}
					if (local16[local36 + 1] != 0) {
						local127++;
					}
					if (local16[local36 - local26] != 0) {
						local127++;
					}
					if (local16[local26 + local36] != 0) {
						local127++;
					}
					local20[local49++] = (byte) (local127 * 17);
				} else {
					local20[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass30_1.anInt502 - 128;
		}
		if (this.aClass23_Sub3_2 == null) {
			this.aClass23_Sub3_2 = new Class23_Sub3(this.aClass117_Sub1_13, 3553, 6406, 128, 128, false, this.aClass117_Sub1_13.aByteArray33, 6406, false);
			this.aClass23_Sub3_2.method5808(false, false);
			this.aClass23_Sub3_2.method5805(true);
		} else {
			this.aClass23_Sub3_2.method5811(128, false, this.aClass117_Sub1_13.aByteArray33, 6406, 128);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIII)V")
	public void method1520(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass72_Sub1_2.method5205(arg1 * this.aClass117_Sub1_13.method2470(5123), arg0);
		this.method1521(this.aClass72_Sub1_2, arg1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ik;II)V")
	private void method1521(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method1516();
			this.aClass117_Sub1_13.method2504(this.aClass23_Sub3_2);
			this.aClass117_Sub1_13.method2534(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
	public void method1523() {
		this.method1521(this.anInterface3_2, this.anInt1866);
	}
}

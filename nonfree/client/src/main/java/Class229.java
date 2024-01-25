import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class229 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	private int anInt6988 = -1;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Z")
	public boolean aBoolean444 = true;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!qq;")
	private final Class249 aClass249_2;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	private final int anInt6994;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_30;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	private final int anInt6993;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	private final int anInt6996;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Lclient!cs;")
	private Class11_Sub1 aClass11_Sub1_5;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!il;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!jp;")
	private Class33_Sub2 aClass33_Sub2_2;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ad;Lclient!qq;Lclient!pf;IIIII)V")
	public Class229(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class52_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass249_2 = arg1;
		this.anInt6994 = arg6;
		this.aClass5_Sub1_30 = arg0;
		this.anInt6993 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt9491 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray6[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt6996 = local27;
		if (local27 <= 0) {
			this.aClass11_Sub1_5 = null;
		} else {
			@Pc(101) Class3_Sub27 local101 = new Class3_Sub27(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass5_Sub1_30.aBoolean39) {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = (local35 + local51) * arg2.anInt9491 + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray6[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method7600(local128[local132] & 0xFFFF, 30364);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = local31 + arg2.anInt9491 * (local51 + local35);
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray6[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method7556(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface10_4 = this.aClass5_Sub1_30.method398(local101.aByteArray114, local101.anInt9191, false);
			this.aClass33_Sub2_2 = new Class33_Sub2(this.aClass5_Sub1_30, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([BIII)V")
	public void method5857(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aClass33_Sub2_2.method5402(arg0, arg1 * this.aClass5_Sub1_30.method438(5123));
		this.method5863(this.aClass33_Sub2_2, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	private void method5859() {
		if (!this.aBoolean444) {
			return;
		}
		this.aBoolean444 = false;
		@Pc(16) byte[] local16 = this.aClass249_2.aByteArray87;
		@Pc(25) byte[] local25 = this.aClass5_Sub1_30.aByteArray9;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = this.aClass249_2.anInt7430;
		@Pc(41) int local41 = this.anInt6994 + this.anInt6993 * this.aClass249_2.anInt7430;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local27 = (local27 << 8) - local27;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local41++] != 0) {
					local27++;
				}
			}
			local41 += local31 - 128;
		}
		if (this.aClass11_Sub1_5 != null && local27 == this.anInt6988) {
			this.aBoolean444 = false;
			return;
		}
		this.anInt6988 = local27;
		local41 = local31 * this.anInt6993 + this.anInt6994;
		local54 = 0;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local16[local41] == 0) {
					@Pc(125) int local125 = 0;
					if (local16[local41 - 1] != 0) {
						local125++;
					}
					if (local16[local41 + 1] != 0) {
						local125++;
					}
					if (local16[local41 - local31] != 0) {
						local125++;
					}
					if (local16[local31 + local41] != 0) {
						local125++;
					}
					local25[local54++] = (byte) (local125 * 17);
				} else {
					local25[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass249_2.anInt7430 - 128;
		}
		if (this.aClass11_Sub1_5 == null) {
			this.aClass11_Sub1_5 = new Class11_Sub1(this.aClass5_Sub1_30, 3553, 6406, 128, 128, false, this.aClass5_Sub1_30.aByteArray9, 6406, false);
			this.aClass11_Sub1_5.method605(false, false);
			this.aClass11_Sub1_5.method7303(true);
		} else {
			this.aClass11_Sub1_5.method610(128, 128, this.aClass5_Sub1_30.aByteArray9, false, 6406);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method5862() {
		this.method5863(this.anInterface10_4, this.anInt6996);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!il;II)V")
	private void method5863(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5859();
			this.aClass5_Sub1_30.method423(this.aClass11_Sub1_5);
			this.aClass5_Sub1_30.method391(0, arg1, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class214 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	private int anInt6927 = -1;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "Z")
	public boolean aBoolean617 = true;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	private final int anInt6928;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!ps;")
	private final Class156 aClass156_2;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	private final int anInt6930;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_42;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	private final int anInt6929;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Lclient!rj;")
	private Class124_Sub2 aClass124_Sub2_7;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!as;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Lclient!ef;")
	private Class50_Sub1 aClass50_Sub1_2;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ao;Lclient!ps;Lclient!je;IIIII)V")
	public Class214(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class73_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6928 = arg7;
		this.aClass156_2 = arg1;
		this.anInt6930 = arg6;
		this.aClass4_Sub1_42 = arg0;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(53) int local53;
		@Pc(55) int local55;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local53 = arg2.anInt5546 * (local33 + local35) + local29;
			for (local55 = 0; local55 < local23; local55++) {
				@Pc(68) short[] local68 = arg2.aShortArrayArray4[local53++];
				if (local68 != null) {
					local25 += local68.length;
				}
			}
		}
		this.anInt6929 = local25;
		if (local25 <= 0) {
			this.aClass124_Sub2_7 = null;
		} else {
			@Pc(96) Class2_Sub10 local96 = new Class2_Sub10(local25 * 2);
			@Pc(129) short[] local129;
			@Pc(135) int local135;
			@Pc(116) int local116;
			if (this.aClass4_Sub1_42.aBoolean32) {
				for (local53 = 0; local53 < local23; local53++) {
					local55 = arg2.anInt5546 * (local53 + local33) + local29;
					for (local116 = 0; local116 < local23; local116++) {
						local129 = arg2.aShortArrayArray4[local55++];
						if (local129 != null) {
							for (local135 = 0; local135 < local129.length; local135++) {
								local96.method4452(local129[local135] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local53 = 0; local53 < local23; local53++) {
					local55 = arg2.anInt5546 * (local53 + local33) + local29;
					for (local116 = 0; local116 < local23; local116++) {
						local129 = arg2.aShortArrayArray4[local55++];
						if (local129 != null) {
							for (local135 = 0; local135 < local129.length; local135++) {
								local96.method4456(local129[local135] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_5 = this.aClass4_Sub1_42.method566(local96.aByteArray57, local96.anInt4807, false);
			this.aClass50_Sub1_2 = new Class50_Sub1(this.aClass4_Sub1_42, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BII[B)V")
	public void method5960(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass50_Sub1_2.method4322(arg1, this.aClass4_Sub1_42.method552(5123) * arg0);
		this.method5963(arg0, this.aClass50_Sub1_2);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public void method5961() {
		this.method5963(this.anInt6929, this.anInterface1_5);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	private void method5962() {
		if (!this.aBoolean617) {
			return;
		}
		this.aBoolean617 = false;
		@Pc(15) byte[] local15 = this.aClass156_2.aByteArray58;
		@Pc(17) byte[] local17 = Static353.aByteArray94;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = this.aClass156_2.anInt4867;
		@Pc(33) int local33 = this.anInt6928 * this.aClass156_2.anInt4867 + this.anInt6930;
		@Pc(35) int local35;
		@Pc(47) int local47;
		for (local35 = -128; local35 < 0; local35++) {
			local19 = (local19 << 8) - local19;
			for (local47 = -128; local47 < 0; local47++) {
				if (local15[local33++] != 0) {
					local19++;
				}
			}
			local33 += local23 - 128;
		}
		if (this.aClass124_Sub2_7 != null && local19 == this.anInt6927) {
			this.aBoolean617 = false;
			return;
		}
		this.anInt6927 = local19;
		local33 = this.anInt6930 + this.anInt6928 * local23;
		local35 = 0;
		for (local47 = -128; local47 < 0; local47++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local15[local33] == 0) {
					@Pc(126) int local126 = 0;
					if (local15[local33 - 1] != 0) {
						local126++;
					}
					if (local15[local33 + 1] != 0) {
						local126++;
					}
					if (local15[local33 - local23] != 0) {
						local126++;
					}
					if (local15[local23 + local33] != 0) {
						local126++;
					}
					local17[local35++] = (byte) (local126 * 17);
				} else {
					local17[local35++] = 68;
				}
				local33++;
			}
			local33 += this.aClass156_2.anInt4867 - 128;
		}
		if (this.aClass124_Sub2_7 == null) {
			this.aClass124_Sub2_7 = new Class124_Sub2(this.aClass4_Sub1_42, 3553, 6406, 128, 128, false, Static353.aByteArray94, 6406, false);
			this.aClass124_Sub2_7.method4995(false, false);
			this.aClass124_Sub2_7.method5896(true);
		} else {
			this.aClass124_Sub2_7.method4993(128, 128, Static353.aByteArray94, 6406, false);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!as;)V")
	private void method5963(@OriginalArg(0) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (arg0 != 0) {
			this.method5962();
			this.aClass4_Sub1_42.method602(this.aClass124_Sub2_7);
			this.aClass4_Sub1_42.method567(arg1, 0, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public final class Class375 {

	@OriginalMember(owner = "client!wga", name = "q", descriptor = "[I")
	public static final int[] anIntArray826 = new int[4096];

	@OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
	private int anInt10295 = -1;

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "Z")
	public boolean aBoolean831 = true;

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_41;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
	private final int anInt10294;

	@OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
	private final int anInt10300;

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "Lclient!jl;")
	private final Class174 aClass174_2;

	@OriginalMember(owner = "client!wga", name = "s", descriptor = "I")
	private final int anInt10301;

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Lclient!as;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "Lclient!vp;")
	private Class215_Sub2 aClass215_Sub2_2;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "Lclient!sia;")
	private Class24_Sub4 aClass24_Sub4_6;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray826[local10] = Static450.method6696(local10);
		}
	}

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!rda;Lclient!jl;Lclient!mu;IIIII)V")
	public Class375(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class40_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass126_Sub3_41 = arg0;
		this.anInt10294 = arg6;
		this.anInt10300 = arg7;
		this.aClass174_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local37 + local35) * arg2.anInt9920 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray10[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt10301 = local27;
		if (local27 <= 0) {
			this.aClass24_Sub4_6 = null;
		} else {
			@Pc(93) Class5_Sub12 local93 = new Class5_Sub12(local27 * 2);
			@Pc(112) int local112;
			@Pc(120) short[] local120;
			@Pc(124) int local124;
			@Pc(110) int local110;
			if (this.aClass126_Sub3_41.aBoolean674) {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = local31 + arg2.anInt9920 * (local35 + local50);
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray10[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method8655(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local110 = arg2.anInt9920 * (local50 + local35) + local31;
					for (local112 = 0; local112 < local25; local112++) {
						local120 = arg2.aShortArrayArray10[local110++];
						if (local120 != null) {
							for (local124 = 0; local124 < local120.length; local124++) {
								local93.method8643(local120[local124] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_5 = this.aClass126_Sub3_41.method7101(local93.aByteArray104, local93.anInt10154, false);
			this.aClass215_Sub2_2 = new Class215_Sub2(this.aClass126_Sub3_41, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)V")
	private void method8755() {
		if (!this.aBoolean831) {
			return;
		}
		this.aBoolean831 = false;
		@Pc(16) byte[] local16 = this.aClass174_2.aByteArray39;
		@Pc(20) byte[] local20 = this.aClass126_Sub3_41.aByteArray75;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass174_2.anInt4414;
		@Pc(37) int local37 = this.anInt10294 + this.anInt10300 * this.aClass174_2.anInt4414;
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
		if (this.aClass24_Sub4_6 != null && this.anInt10295 == local22) {
			this.aBoolean831 = false;
			return;
		}
		this.anInt10295 = local22;
		local50 = 0;
		local37 = this.anInt10294 + this.anInt10300 * local26;
		for (@Pc(106) int local106 = -128; local106 < 0; local106++) {
			for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
				if (local16[local37] == 0) {
					@Pc(125) int local125 = 0;
					if (local16[local37 - 1] != 0) {
						local125++;
					}
					if (local16[local37 + 1] != 0) {
						local125++;
					}
					if (local16[local37 - local26] != 0) {
						local125++;
					}
					if (local16[local26 + local37] != 0) {
						local125++;
					}
					local20[local50++] = (byte) (local125 * 17);
				} else {
					local20[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass174_2.anInt4414 - 128;
		}
		if (this.aClass24_Sub4_6 == null) {
			this.aClass24_Sub4_6 = new Class24_Sub4(this.aClass126_Sub3_41, 3553, 6406, 128, 128, false, this.aClass126_Sub3_41.aByteArray75, 6406, false);
			this.aClass24_Sub4_6.method6792(false, false);
			this.aClass24_Sub4_6.method6783(true);
		} else {
			this.aClass24_Sub4_6.method6794(this.aClass126_Sub3_41.aByteArray75, 6406, false, 128, 128);
		}
	}

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)V")
	public void method8756() {
		this.method8758(this.anInt10301, this.anInterface2_5);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BILclient!as;)V")
	private void method8758(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1) {
		if (arg0 != 0) {
			this.method8755();
			this.aClass126_Sub3_41.method7113(this.aClass24_Sub4_6);
			this.aClass126_Sub3_41.method7121(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(BI[BI)V")
	public void method8761(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass215_Sub2_2.method8502(arg1 * this.aClass126_Sub3_41.method7140(5123), arg0);
		this.method8758(arg1, this.aClass215_Sub2_2);
	}
}

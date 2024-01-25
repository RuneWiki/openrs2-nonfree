import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class206 {

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
	private int anInt6040;

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
	public int anInt6046;

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!lia", name = "j", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
	private int anInt6048;

	@OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
	private int anInt6050;

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
	private int anInt6052;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!lia", name = "q", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "Lclient!wh;")
	public Class3_Sub16 aClass3_Sub16_3;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
	private Class206() {
		if (Static624.anIntArray654 == null) {
			Static641.method8743();
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!ha;Lclient!sl;I)V")
	public Class206(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (Static624.anIntArray654 == null) {
			Static641.method8743();
		}
		this.anInt6053 = arg1.method4225();
		this.aBoolean428 = (this.anInt6053 & 0x8) != 0;
		this.aBoolean429 = (this.anInt6053 & 0x10) != 0;
		this.anInt6053 &= 0x7;
		@Pc(44) int local44 = arg1.method4221() << arg2;
		@Pc(50) int local50 = arg1.method4221() << arg2;
		@Pc(56) int local56 = arg1.method4221() << arg2;
		@Pc(60) int local60 = arg1.method4225();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray78 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray78.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method4221();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			if (local87 > local66 - local83) {
				local87 = local66 - local83;
			}
			this.aShortArray78[local72] = (short) (local83 << 8 | local87);
		}
		local60 = Static161.anInt3180 + (local60 << Static308.anInt5834);
		@Pc(152) int local152 = Static159.anIntArray159 == null ? Static513.anIntArray548[Static426.method6666(arg1.method4221()) & 0xFFFF] : Static159.anIntArray159[arg1.method4221()];
		local83 = arg1.method4225();
		this.anInt6046 = local83 & 0x1F;
		this.anInt6052 = (local83 & 0xE0) << 3;
		if (this.anInt6046 != 31) {
			this.method5267();
		}
		this.method5263(local44, local60, arg0, local50, local152, local56);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILclient!ha;IIII)V")
	private void method5263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub16_3 = arg2.method7550(arg0, arg5, arg3, arg1, arg4, (float) 1);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BIIII)V")
	public void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6047 = arg2;
		this.anInt6048 = arg0;
		this.anInt6040 = arg1;
		this.anInt6050 = arg3;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIZ)V")
	public void method5265(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15;
		if (arg1) {
			local15 = 2048;
		} else {
			@Pc(29) int local29 = this.anInt6052 + this.anInt6047 * arg0 / 50 & 0x7FF;
			@Pc(32) int local32 = this.anInt6040;
			if (local32 == 1) {
				local15 = (Class21.anIntArray656[local29 << 3] >> 4) + 1024;
			} else if (local32 == 3) {
				local15 = Static624.anIntArray654[local29] >> 1;
			} else if (local32 == 4) {
				local15 = local29 >> 10 << 11;
			} else if (local32 == 2) {
				local15 = local29;
			} else if (local32 == 5) {
				local15 = (local29 < 1024 ? local29 : 2048 - local29) << 1;
			} else {
				local15 = 2048;
			}
		}
		this.aClass3_Sub16_3.method4780((float) (this.anInt6048 + (local15 * this.anInt6050 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
	private void method5267() {
		@Pc(8) int local8 = this.anInt6046;
		if (local8 == 2) {
			this.anInt6040 = 1;
			this.anInt6047 = 2048;
			this.anInt6048 = 0;
			this.anInt6050 = 2048;
		} else if (local8 == 3) {
			this.anInt6050 = 2048;
			this.anInt6040 = 1;
			this.anInt6047 = 4096;
			this.anInt6048 = 0;
		} else if (local8 == 4) {
			this.anInt6050 = 2048;
			this.anInt6048 = 0;
			this.anInt6047 = 2048;
			this.anInt6040 = 4;
		} else if (local8 == 5) {
			this.anInt6040 = 4;
			this.anInt6047 = 8192;
			this.anInt6048 = 0;
			this.anInt6050 = 2048;
		} else if (local8 == 12) {
			this.anInt6040 = 2;
			this.anInt6048 = 0;
			this.anInt6047 = 2048;
			this.anInt6050 = 2048;
		} else if (local8 == 13) {
			this.anInt6048 = 0;
			this.anInt6050 = 2048;
			this.anInt6040 = 2;
			this.anInt6047 = 8192;
		} else if (local8 == 10) {
			this.anInt6048 = 1536;
			this.anInt6047 = 2048;
			this.anInt6040 = 3;
			this.anInt6050 = 512;
		} else if (local8 == 11) {
			this.anInt6050 = 512;
			this.anInt6047 = 4096;
			this.anInt6040 = 3;
			this.anInt6048 = 1536;
		} else if (local8 == 6) {
			this.anInt6040 = 3;
			this.anInt6047 = 2048;
			this.anInt6050 = 768;
			this.anInt6048 = 1280;
		} else if (local8 == 7) {
			this.anInt6050 = 768;
			this.anInt6047 = 4096;
			this.anInt6040 = 3;
			this.anInt6048 = 1280;
		} else if (local8 == 8) {
			this.anInt6040 = 3;
			this.anInt6048 = 1024;
			this.anInt6047 = 2048;
			this.anInt6050 = 1024;
		} else if (local8 == 9) {
			this.anInt6048 = 1024;
			this.anInt6047 = 4096;
			this.anInt6040 = 3;
			this.anInt6050 = 1024;
		} else if (local8 == 14) {
			this.anInt6040 = 1;
			this.anInt6050 = 768;
			this.anInt6048 = 1280;
			this.anInt6047 = 2048;
		} else if (local8 == 15) {
			this.anInt6050 = 512;
			this.anInt6048 = 1536;
			this.anInt6040 = 1;
			this.anInt6047 = 4096;
		} else if (local8 == 16) {
			this.anInt6050 = 256;
			this.anInt6048 = 1792;
			this.anInt6047 = 8192;
			this.anInt6040 = 1;
		} else {
			this.anInt6050 = 2048;
			this.anInt6047 = 2048;
			this.anInt6048 = 0;
			this.anInt6040 = 0;
		}
	}
}

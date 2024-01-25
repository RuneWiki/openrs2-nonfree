import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class103 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	public int anInt3138;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Z")
	public boolean aBoolean224;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
	public int anInt3141;

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
	private int anInt3142;

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "Lclient!oj;")
	public Class3_Sub30 aClass3_Sub30_1;

	@OriginalMember(owner = "client!gda", name = "m", descriptor = "Z")
	public boolean aBoolean225;

	@OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
	private int anInt3145;

	@OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
	private int anInt3148;

	@OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
	private int anInt3149;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	private Class103() {
		if (Static12.anIntArray111 == null) {
			Static15.method660();
		}
		this.method2648();
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!oa;Lclient!rt;I)V")
	public Class103(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class3_Sub27 arg1, @OriginalArg(2) int arg2) {
		if (Static12.anIntArray111 == null) {
			Static15.method660();
		}
		this.anInt3141 = arg1.method7548();
		this.aBoolean224 = (this.anInt3141 & 0x8) != 0;
		this.aBoolean225 = (this.anInt3141 & 0x10) != 0;
		this.anInt3141 &= 0x7;
		@Pc(47) int local47 = arg1.method7591() << arg2;
		@Pc(53) int local53 = arg1.method7591() << arg2;
		@Pc(59) int local59 = arg1.method7591() << arg2;
		@Pc(63) int local63 = arg1.method7548();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray78 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray78.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method7591();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray78[local75] = (short) (local86 << 8 | local90);
		}
		local63 = Static467.anInt8424 + (local63 << Static33.anInt880);
		@Pc(152) int local152 = Static393.anIntArray638 == null ? Static457.anIntArray710[Static484.method7144(arg1.method7591()) & 0xFFFF] : Static393.anIntArray638[arg1.method7591()];
		local86 = arg1.method7548();
		this.anInt3138 = local86 & 0x1F;
		this.anInt3145 = (local86 & 0xE0) << 3;
		if (this.anInt3138 != 31) {
			this.method2648();
		}
		this.method2644(local53, local63, local47, arg0, local59, local152);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILclient!oa;IBI)V")
	private void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub30_1 = arg3.method7475(arg2, arg4, arg0, arg1, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIBII)V")
	public void method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3148 = arg1;
		this.anInt3137 = arg3;
		this.anInt3142 = arg0;
		this.anInt3149 = arg2;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZBI)V")
	public void method2647(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(65) int local65;
		if (arg0) {
			local65 = 2048;
		} else {
			@Pc(25) int local25 = this.anInt3149 * arg1 / 50 + this.anInt3145 & 0x7FF;
			@Pc(28) int local28 = this.anInt3137;
			if (local28 == 1) {
				local65 = (Class5.anIntArray761[local25 << 3] >> 4) + 1024;
			} else if (local28 == 3) {
				local65 = Static12.anIntArray111[local25] >> 1;
			} else if (local28 == 4) {
				local65 = local25 >> 10 << 11;
			} else if (local28 == 2) {
				local65 = local25;
			} else if (local28 == 5) {
				local65 = (local25 < 1024 ? local25 : 2048 - local25) << 1;
			} else {
				local65 = 2048;
			}
		}
		this.aClass3_Sub30_1.method5383((float) ((this.anInt3142 * local65 >> 11) + this.anInt3148) / 2048.0F);
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)V")
	private void method2648() {
		@Pc(8) int local8 = this.anInt3138;
		if (local8 == 2) {
			this.anInt3149 = 2048;
			this.anInt3148 = 0;
			this.anInt3137 = 1;
			this.anInt3142 = 2048;
		} else if (local8 == 3) {
			this.anInt3137 = 1;
			this.anInt3149 = 4096;
			this.anInt3148 = 0;
			this.anInt3142 = 2048;
		} else if (local8 == 4) {
			this.anInt3148 = 0;
			this.anInt3149 = 2048;
			this.anInt3142 = 2048;
			this.anInt3137 = 4;
		} else if (local8 == 5) {
			this.anInt3142 = 2048;
			this.anInt3148 = 0;
			this.anInt3137 = 4;
			this.anInt3149 = 8192;
		} else if (local8 == 12) {
			this.anInt3142 = 2048;
			this.anInt3137 = 2;
			this.anInt3149 = 2048;
			this.anInt3148 = 0;
		} else if (local8 == 13) {
			this.anInt3137 = 2;
			this.anInt3142 = 2048;
			this.anInt3148 = 0;
			this.anInt3149 = 8192;
		} else if (local8 == 10) {
			this.anInt3148 = 1536;
			this.anInt3137 = 3;
			this.anInt3142 = 512;
			this.anInt3149 = 2048;
		} else if (local8 == 11) {
			this.anInt3148 = 1536;
			this.anInt3149 = 4096;
			this.anInt3137 = 3;
			this.anInt3142 = 512;
		} else if (local8 == 6) {
			this.anInt3148 = 1280;
			this.anInt3149 = 2048;
			this.anInt3142 = 768;
			this.anInt3137 = 3;
		} else if (local8 == 7) {
			this.anInt3148 = 1280;
			this.anInt3149 = 4096;
			this.anInt3137 = 3;
			this.anInt3142 = 768;
		} else if (local8 == 8) {
			this.anInt3142 = 1024;
			this.anInt3137 = 3;
			this.anInt3148 = 1024;
			this.anInt3149 = 2048;
		} else if (local8 == 9) {
			this.anInt3148 = 1024;
			this.anInt3149 = 4096;
			this.anInt3137 = 3;
			this.anInt3142 = 1024;
		} else if (local8 == 14) {
			this.anInt3149 = 2048;
			this.anInt3142 = 768;
			this.anInt3148 = 1280;
			this.anInt3137 = 1;
		} else if (local8 == 15) {
			this.anInt3142 = 512;
			this.anInt3148 = 1536;
			this.anInt3137 = 1;
			this.anInt3149 = 4096;
		} else if (local8 == 16) {
			this.anInt3137 = 1;
			this.anInt3148 = 1792;
			this.anInt3142 = 256;
			this.anInt3149 = 8192;
		} else {
			this.anInt3142 = 2048;
			this.anInt3149 = 2048;
			this.anInt3137 = 0;
			this.anInt3148 = 0;
		}
	}
}

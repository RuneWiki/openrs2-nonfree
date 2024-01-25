import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class248 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	public int anInt6688;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Z")
	public boolean aBoolean570;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	public int anInt6690;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!bba;")
	public Class2_Sub7 aClass2_Sub7_3;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	private int anInt6692;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	private int anInt6695;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
	private int anInt6697;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	private int anInt6698;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Z")
	public boolean aBoolean571;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
	private int anInt6700;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class248() {
		if (Static22.anIntArray35 == null) {
			Static582.method8103();
		}
		this.method6008();
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!ha;Lclient!et;I)V")
	public Class248(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (Static22.anIntArray35 == null) {
			Static582.method8103();
		}
		this.anInt6688 = arg1.method8581(-17416);
		this.aBoolean571 = (this.anInt6688 & 0x10) != 0;
		this.aBoolean570 = (this.anInt6688 & 0x8) != 0;
		this.anInt6688 &= 0x7;
		@Pc(49) int local49 = arg1.method8575() << arg2;
		@Pc(55) int local55 = arg1.method8575() << arg2;
		@Pc(61) int local61 = arg1.method8575() << arg2;
		@Pc(65) int local65 = arg1.method8581(-17416);
		@Pc(71) int local71 = local65 * 2 + 1;
		this.aShortArray111 = new short[local71];
		@Pc(90) int local90;
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray111.length; local77++) {
			@Pc(86) short local86 = (short) arg1.method8575();
			local90 = local86 >>> 8;
			@Pc(94) int local94 = local86 & 0xFF;
			if (local71 <= local90) {
				local90 = local71 - 1;
			}
			if (local71 - local90 < local94) {
				local94 = local71 - local90;
			}
			this.aShortArray111[local77] = (short) (local90 << 8 | local94);
		}
		local65 = (local65 << Static260.anInt4053) + Static328.anInt5032;
		@Pc(162) int local162 = Static555.anIntArray633 == null ? Static488.anIntArray557[Static271.method3801(arg1.method8575()) & 0xFFFF] : Static555.anIntArray633[arg1.method8575()];
		local90 = arg1.method8581(-17416);
		this.anInt6690 = local90 & 0x1F;
		this.anInt6697 = (local90 & 0xE0) << 3;
		if (this.anInt6690 != 31) {
			this.method6008();
		}
		this.method6004(local61, arg0, local55, local65, local162, local49);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	private void method6004(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub7_3 = arg1.method9664(arg5, arg0, arg2, arg3, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZII)V")
	public void method6005(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(67) int local67;
		if (arg0) {
			local67 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt6700 * arg1 / 50 + this.anInt6697 & 0x7FF;
			@Pc(22) int local22 = this.anInt6695;
			if (local22 == 1) {
				local67 = (Class145_Sub1.anIntArray761[local19 << 3] >> 4) + 1024;
			} else if (local22 == 3) {
				local67 = Static22.anIntArray35[local19] >> 1;
			} else if (local22 == 4) {
				local67 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local67 = local19;
			} else if (local22 == 5) {
				local67 = (local19 < 1024 ? local19 : 2048 - local19) << 1;
			} else {
				local67 = 2048;
			}
		}
		this.aClass2_Sub7_3.method8167((float) (this.anInt6698 + (this.anInt6692 * local67 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	private void method6008() {
		@Pc(8) int local8 = this.anInt6690;
		if (local8 == 2) {
			this.anInt6695 = 1;
			this.anInt6698 = 0;
			this.anInt6700 = 2048;
			this.anInt6692 = 2048;
		} else if (local8 == 3) {
			this.anInt6695 = 1;
			this.anInt6698 = 0;
			this.anInt6700 = 4096;
			this.anInt6692 = 2048;
		} else if (local8 == 4) {
			this.anInt6698 = 0;
			this.anInt6700 = 2048;
			this.anInt6695 = 4;
			this.anInt6692 = 2048;
		} else if (local8 == 5) {
			this.anInt6700 = 8192;
			this.anInt6695 = 4;
			this.anInt6692 = 2048;
			this.anInt6698 = 0;
		} else if (local8 == 12) {
			this.anInt6700 = 2048;
			this.anInt6698 = 0;
			this.anInt6695 = 2;
			this.anInt6692 = 2048;
		} else if (local8 == 13) {
			this.anInt6692 = 2048;
			this.anInt6698 = 0;
			this.anInt6700 = 8192;
			this.anInt6695 = 2;
		} else if (local8 == 10) {
			this.anInt6692 = 512;
			this.anInt6695 = 3;
			this.anInt6698 = 1536;
			this.anInt6700 = 2048;
		} else if (local8 == 11) {
			this.anInt6695 = 3;
			this.anInt6700 = 4096;
			this.anInt6698 = 1536;
			this.anInt6692 = 512;
		} else if (local8 == 6) {
			this.anInt6700 = 2048;
			this.anInt6692 = 768;
			this.anInt6698 = 1280;
			this.anInt6695 = 3;
		} else if (local8 == 7) {
			this.anInt6698 = 1280;
			this.anInt6692 = 768;
			this.anInt6700 = 4096;
			this.anInt6695 = 3;
		} else if (local8 == 8) {
			this.anInt6692 = 1024;
			this.anInt6698 = 1024;
			this.anInt6695 = 3;
			this.anInt6700 = 2048;
		} else if (local8 == 9) {
			this.anInt6692 = 1024;
			this.anInt6700 = 4096;
			this.anInt6698 = 1024;
			this.anInt6695 = 3;
		} else if (local8 == 14) {
			this.anInt6698 = 1280;
			this.anInt6695 = 1;
			this.anInt6700 = 2048;
			this.anInt6692 = 768;
		} else if (local8 == 15) {
			this.anInt6700 = 4096;
			this.anInt6695 = 1;
			this.anInt6698 = 1536;
			this.anInt6692 = 512;
		} else if (local8 == 16) {
			this.anInt6695 = 1;
			this.anInt6698 = 1792;
			this.anInt6692 = 256;
			this.anInt6700 = 8192;
		} else {
			this.anInt6698 = 0;
			this.anInt6692 = 2048;
			this.anInt6700 = 2048;
			this.anInt6695 = 0;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)V")
	public void method6009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6700 = arg3;
		this.anInt6698 = arg1;
		this.anInt6692 = arg2;
		this.anInt6695 = arg0;
	}
}

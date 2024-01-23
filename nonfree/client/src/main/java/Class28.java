import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class28 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!ig;")
	public Class80 aClass80_1;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "F")
	public float aFloat8;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Z")
	public boolean aBoolean60;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "[S")
	public short[] aShortArray6;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "F")
	public float aFloat9;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "Z")
	public boolean aBoolean62;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public int anInt876;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public int anInt877;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "[F")
	public float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class28(@OriginalArg(0) Class8_Sub2 arg0) {
		if (Static244.anIntArray369 == null) {
			Static266.method4010();
		}
		this.anInt870 = arg0.method2334();
		this.aBoolean60 = (this.anInt870 & 0x10) != 0;
		this.aBoolean62 = (this.anInt870 & 0x8) != 0;
		this.anInt870 &= 0x7;
		this.anInt863 = arg0.method2375();
		this.anInt877 = arg0.method2375();
		this.anInt862 = arg0.method2375();
		this.anInt876 = arg0.method2334();
		this.method614();
		this.aShortArray6 = new short[this.anInt876 * 2 + 1];
		@Pc(84) int local84;
		for (local84 = 0; local84 < this.aShortArray6.length; local84++) {
			this.aShortArray6[local84] = (short) arg0.method2375();
		}
		this.anInt866 = Static96.anIntArray135[arg0.method2375()];
		local84 = arg0.method2334();
		this.anInt867 = local84 & 0x1F;
		this.anInt871 = (local84 & 0xE0) << 3;
		if (this.anInt867 != 31) {
			this.method618();
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	private void method614() {
		@Pc(17) int local17 = (this.anInt876 << 7) + 64;
		this.aFloat8 = 1.0F / (float) (local17 * local17);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZ)V")
	public void method615(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0 * this.anInt874 / 50 + this.anInt871 & 0x7FF;
		@Pc(20) int local20 = this.anInt878;
		@Pc(55) int local55;
		if (local20 == 1) {
			local55 = (Class68.anIntArray137[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local55 = Static244.anIntArray369[local17] >> 1;
		} else if (local20 == 4) {
			local55 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local55 = local17;
		} else if (local20 == 5) {
			local55 = (local17 >= 1024 ? 2048 - local17 : local17) << 1;
		} else {
			local55 = 2048;
		}
		if (arg1) {
			local55 = 2048;
		}
		this.aFloat9 = (float) (this.anInt872 + (local55 * this.anInt873 >> 11)) / 2048.0F;
		@Pc(125) float local125 = this.aFloat9 / 255.0F;
		this.aFloatArray3[0] = local125 * (float) (this.anInt866 >> 16 & 0xFF);
		this.aFloatArray3[2] = (float) (this.anInt866 & 0xFF) * local125;
		this.aFloatArray3[1] = (float) (this.anInt866 >> 8 & 0xFF) * local125;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	private void method618() {
		@Pc(14) int local14 = this.anInt867;
		if (local14 == 2) {
			this.anInt872 = 0;
			this.anInt878 = 1;
			this.anInt873 = 2048;
			this.anInt874 = 2048;
		} else if (local14 == 3) {
			this.anInt873 = 2048;
			this.anInt878 = 1;
			this.anInt874 = 4096;
			this.anInt872 = 0;
		} else if (local14 == 4) {
			this.anInt872 = 0;
			this.anInt873 = 2048;
			this.anInt874 = 2048;
			this.anInt878 = 4;
		} else if (local14 == 5) {
			this.anInt878 = 4;
			this.anInt872 = 0;
			this.anInt873 = 2048;
			this.anInt874 = 8192;
		} else if (local14 == 12) {
			this.anInt878 = 2;
			this.anInt872 = 0;
			this.anInt873 = 2048;
			this.anInt874 = 2048;
		} else if (local14 == 13) {
			this.anInt878 = 2;
			this.anInt873 = 2048;
			this.anInt874 = 8192;
			this.anInt872 = 0;
		} else if (local14 == 10) {
			this.anInt872 = 1536;
			this.anInt873 = 512;
			this.anInt878 = 3;
			this.anInt874 = 2048;
		} else if (local14 == 11) {
			this.anInt874 = 4096;
			this.anInt878 = 3;
			this.anInt872 = 1536;
			this.anInt873 = 512;
		} else if (local14 == 6) {
			this.anInt874 = 2048;
			this.anInt878 = 3;
			this.anInt872 = 1280;
			this.anInt873 = 768;
		} else if (local14 == 7) {
			this.anInt878 = 3;
			this.anInt873 = 768;
			this.anInt874 = 4096;
			this.anInt872 = 1280;
		} else if (local14 == 8) {
			this.anInt872 = 1024;
			this.anInt878 = 3;
			this.anInt873 = 1024;
			this.anInt874 = 2048;
		} else if (local14 == 9) {
			this.anInt873 = 1024;
			this.anInt874 = 4096;
			this.anInt872 = 1024;
			this.anInt878 = 3;
		} else if (local14 == 14) {
			this.anInt874 = 2048;
			this.anInt873 = 768;
			this.anInt878 = 1;
			this.anInt872 = 1280;
		} else if (local14 == 15) {
			this.anInt878 = 1;
			this.anInt874 = 4096;
			this.anInt872 = 1536;
			this.anInt873 = 512;
		} else if (local14 == 16) {
			this.anInt872 = 1792;
			this.anInt873 = 256;
			this.anInt878 = 1;
			this.anInt874 = 8192;
		} else {
			this.anInt874 = 2048;
			this.anInt872 = 0;
			this.anInt878 = 0;
			this.anInt873 = 2048;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIBII)V")
	public void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt874 = arg2;
		this.anInt872 = arg3;
		this.anInt878 = arg1;
		this.anInt873 = arg0;
	}
}

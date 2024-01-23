import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class170 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public int anInt5260;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
	private int anInt5262;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	private int anInt5264;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!kf;")
	public Class100 aClass100_1;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	private int anInt5267;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private int anInt5268;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
	public int anInt5271;

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
	public int anInt5272;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
	public int anInt5278;

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
	public int anInt5279;

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
	public int anInt5280;

	@OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
	private int anInt5281;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "[F")
	public float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class170(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static217.anIntArray341 == null) {
			Static216.method3402();
		}
		this.anInt5272 = arg0.method2595();
		this.aBoolean376 = (this.anInt5272 & 0x8) != 0;
		this.aBoolean378 = (this.anInt5272 & 0x10) != 0;
		this.anInt5272 &= 0x7;
		this.anInt5278 = arg0.method2593();
		this.anInt5266 = arg0.method2593();
		this.anInt5279 = arg0.method2593();
		this.anInt5280 = arg0.method2595();
		this.method4113();
		this.aShortArray90 = new short[this.anInt5280 * 2 + 1];
		@Pc(82) int local82;
		for (local82 = 0; local82 < this.aShortArray90.length; local82++) {
			this.aShortArray90[local82] = (short) arg0.method2593();
		}
		this.anInt5271 = Static18.anIntArray26[arg0.method2593()];
		local82 = arg0.method2595();
		this.anInt5260 = local82 & 0x1F;
		this.anInt5267 = (local82 & 0xE0) << 3;
		if (this.anInt5260 != 31) {
			this.method4116();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZ)V")
	public void method4109(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt5264 / 50 + this.anInt5267 & 0x7FF;
		@Pc(20) int local20 = this.anInt5262;
		@Pc(52) int local52;
		if (local20 == 1) {
			local52 = (Class17.anIntArray22[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local52 = Static217.anIntArray341[local17] >> 1;
		} else if (local20 == 4) {
			local52 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local52 = local17;
		} else if (local20 == 5) {
			local52 = (local17 >= 1024 ? 2048 - local17 : local17) << 1;
		} else {
			local52 = 2048;
		}
		if (arg0) {
			local52 = 2048;
		}
		this.aFloat50 = (float) ((this.anInt5268 * local52 >> 11) + this.anInt5281) / 2048.0F;
		@Pc(115) float local115 = this.aFloat50 / 255.0F;
		this.aFloatArray29[1] = local115 * (float) (this.anInt5271 >> 8 & 0xFF);
		this.aFloatArray29[0] = local115 * (float) (this.anInt5271 >> 16 & 0xFF);
		this.aFloatArray29[2] = (float) (this.anInt5271 & 0xFF) * local115;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	private void method4113() {
		@Pc(14) int local14 = (this.anInt5280 << 7) + 64;
		this.aFloat51 = 1.0F / (float) (local14 * local14);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public void method4115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5281 = arg3;
		this.anInt5268 = arg0;
		this.anInt5264 = arg2;
		this.anInt5262 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)V")
	private void method4116() {
		@Pc(10) int local10 = this.anInt5260;
		if (local10 == 2) {
			this.anInt5268 = 2048;
			this.anInt5262 = 1;
			this.anInt5281 = 0;
			this.anInt5264 = 2048;
		} else if (local10 == 3) {
			this.anInt5268 = 2048;
			this.anInt5281 = 0;
			this.anInt5264 = 4096;
			this.anInt5262 = 1;
		} else if (local10 == 4) {
			this.anInt5264 = 2048;
			this.anInt5281 = 0;
			this.anInt5262 = 4;
			this.anInt5268 = 2048;
		} else if (local10 == 5) {
			this.anInt5268 = 2048;
			this.anInt5264 = 8192;
			this.anInt5262 = 4;
			this.anInt5281 = 0;
		} else if (local10 == 12) {
			this.anInt5262 = 2;
			this.anInt5281 = 0;
			this.anInt5264 = 2048;
			this.anInt5268 = 2048;
		} else if (local10 == 13) {
			this.anInt5268 = 2048;
			this.anInt5281 = 0;
			this.anInt5262 = 2;
			this.anInt5264 = 8192;
		} else if (local10 == 10) {
			this.anInt5264 = 2048;
			this.anInt5281 = 1536;
			this.anInt5262 = 3;
			this.anInt5268 = 512;
		} else if (local10 == 11) {
			this.anInt5268 = 512;
			this.anInt5281 = 1536;
			this.anInt5262 = 3;
			this.anInt5264 = 4096;
		} else if (local10 == 6) {
			this.anInt5264 = 2048;
			this.anInt5262 = 3;
			this.anInt5281 = 1280;
			this.anInt5268 = 768;
		} else if (local10 == 7) {
			this.anInt5281 = 1280;
			this.anInt5262 = 3;
			this.anInt5264 = 4096;
			this.anInt5268 = 768;
		} else if (local10 == 8) {
			this.anInt5262 = 3;
			this.anInt5264 = 2048;
			this.anInt5281 = 1024;
			this.anInt5268 = 1024;
		} else if (local10 == 9) {
			this.anInt5268 = 1024;
			this.anInt5262 = 3;
			this.anInt5281 = 1024;
			this.anInt5264 = 4096;
		} else if (local10 == 14) {
			this.anInt5281 = 1280;
			this.anInt5262 = 1;
			this.anInt5268 = 768;
			this.anInt5264 = 2048;
		} else if (local10 == 15) {
			this.anInt5281 = 1536;
			this.anInt5262 = 1;
			this.anInt5268 = 512;
			this.anInt5264 = 4096;
		} else if (local10 == 16) {
			this.anInt5264 = 8192;
			this.anInt5262 = 1;
			this.anInt5281 = 1792;
			this.anInt5268 = 256;
		} else {
			this.anInt5281 = 0;
			this.anInt5264 = 2048;
			this.anInt5268 = 2048;
			this.anInt5262 = 0;
		}
	}
}

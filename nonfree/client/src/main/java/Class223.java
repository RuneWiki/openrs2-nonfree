import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class223 {

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "[F")
	public static final float[] aFloatArray45 = new float[16384];

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[16384];

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "Lclient!kaa;")
	public Class184 aClass184_4;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
	public int anInt6070;

	@OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
	public int anInt6073;

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "Z")
	public boolean aBoolean435 = false;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray46[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray45[local11] = (float) Math.cos((double) local11 * local9);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!io;IZ)V")
	private void method5096(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6070 = arg0.method4426();
		} else if (arg1 == 2) {
			this.anInt6073 = arg0.method4396();
		} else if (arg1 == 3) {
			this.aBoolean435 = true;
			return;
		} else if (arg1 == 4) {
			this.anInt6070 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)Z")
	public boolean method5097() {
		return this.aClass184_4.aClass111_60.method2434(this.anInt6070);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZILclient!r;I)Lclient!f;")
	public Class10 method5099(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt7780 << 19 | this.anInt6070 | arg1 << 16 | (arg0 ? 262144 : 0));
		@Pc(34) Class10 local34 = (Class10) this.aClass184_4.aClass326_24.method7238(local24);
		if (local34 != null) {
			return local34;
		} else if (this.aClass184_4.aClass111_60.method2434(this.anInt6070)) {
			@Pc(58) Class318 local58 = Static604.method7062(this.aClass184_4.aClass111_60, this.anInt6070, 0);
			if (local58 != null) {
				local58.anInt8538 = local58.anInt8533 = local58.anInt8536 = local58.anInt8534 = 0;
				if (arg0) {
					local58.method7067();
				}
				for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
					local58.method7066();
				}
			}
			local34 = arg2.method6434(local58, true);
			if (local34 != null) {
				this.aClass184_4.aClass326_24.method7236(local34, local24);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!io;Z)V")
	public void method5100(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4393();
			if (local15 == 0) {
				return;
			}
			this.method5096(arg0, local15);
		}
	}
}

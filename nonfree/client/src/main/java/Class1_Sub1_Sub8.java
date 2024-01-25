import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "[Lclient!uca;")
	public Class285[] aClass285Array1;

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	private final int anInt3582;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub8(@OriginalArg(0) int arg0) {
		this.anInt3582 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)Z")
	public boolean method3245(@OriginalArg(0) int arg0) {
		return this.aClass285Array1[arg0].aBoolean560;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)Z")
	public boolean method3247(@OriginalArg(0) int arg0) {
		return this.aClass285Array1[arg0].aBoolean558;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Z")
	public boolean method3250() {
		if (this.aClass285Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray16 == null) {
			if (!Static304.aClass160_66.method4208(this.anInt3582)) {
				return false;
			}
			@Pc(25) int[] local25 = Static304.aClass160_66.method4226(this.anInt3582);
			this.aByteArrayArray16 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray16[local32] = Static304.aClass160_66.method4198(local25[local32], this.anInt3582);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(74) int local74;
		for (local32 = 0; local32 < this.aByteArrayArray16.length; local32++) {
			@Pc(60) byte[] local60 = this.aByteArrayArray16[local32];
			local74 = local60[1] & 0xFF | (local60[0] & 0xFF) << 8;
			local52 &= Static168.aClass160_40.method4213(local74);
		}
		if (!local52) {
			return false;
		}
		@Pc(100) Class38 local100 = new Class38();
		local74 = Static304.aClass160_66.method4207(this.anInt3582);
		this.aClass285Array1 = new Class285[local74];
		@Pc(116) int[] local116 = Static304.aClass160_66.method4226(this.anInt3582);
		for (@Pc(118) int local118 = 0; local118 < local116.length; local118++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray16[local118];
			@Pc(138) int local138 = (local124[0] & 0xFF) << 8 | local124[1] & 0xFF;
			@Pc(140) Class1_Sub29 local140 = null;
			for (@Pc(145) Class1_Sub29 local145 = (Class1_Sub29) local100.method1419(); local145 != null; local145 = (Class1_Sub29) local100.method1415()) {
				if (local145.anInt5144 == local138) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class1_Sub29(local138, Static168.aClass160_40.method4216(local138));
				local100.method1426(local140);
			}
			this.aClass285Array1[local116[local118]] = new Class285(local124, local140);
		}
		this.aByteArrayArray16 = null;
		return true;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(ZI)Z")
	public boolean method3251(@OriginalArg(1) int arg0) {
		return this.aClass285Array1[arg0].aBoolean559;
	}
}

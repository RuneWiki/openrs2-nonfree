import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[Lclient!eea;")
	public Class80[] aClass80Array1;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
	private final int anInt3364;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub12(@OriginalArg(0) int arg0) {
		this.anInt3364 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z")
	public boolean method2963() {
		if (this.aClass80Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray14 == null) {
			if (!Static25.aClass254_12.method6397(this.anInt3364)) {
				return false;
			}
			@Pc(25) int[] local25 = Static25.aClass254_12.method6424(this.anInt3364);
			this.aByteArrayArray14 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray14[local32] = Static25.aClass254_12.method6401(this.anInt3364, local25[local32]);
			}
		}
		@Pc(56) boolean local56 = true;
		for (local32 = 0; local32 < this.aByteArrayArray14.length; local32++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray14[local32];
			@Pc(69) Class3_Sub7 local69 = new Class3_Sub7(local64);
			local69.anInt7869 = 1;
			@Pc(76) int local76 = local69.method6535();
			local56 &= Static200.aClass254_66.method6417(local76);
		}
		if (!local56) {
			return false;
		}
		@Pc(101) Class183 local101 = new Class183();
		@Pc(107) int local107 = Static25.aClass254_12.method6396(this.anInt3364);
		this.aClass80Array1 = new Class80[local107];
		@Pc(117) int[] local117 = Static25.aClass254_12.method6424(this.anInt3364);
		for (@Pc(119) int local119 = 0; local119 < local117.length; local119++) {
			@Pc(129) byte[] local129 = this.aByteArrayArray14[local119];
			@Pc(134) Class3_Sub7 local134 = new Class3_Sub7(local129);
			local134.anInt7869 = 1;
			@Pc(141) int local141 = local134.method6535();
			@Pc(143) Class3_Sub44 local143 = null;
			for (@Pc(148) Class3_Sub44 local148 = (Class3_Sub44) local101.method4795(); local148 != null; local148 = (Class3_Sub44) local101.method4793()) {
				if (local141 == local148.anInt8918) {
					local143 = local148;
					break;
				}
			}
			if (local143 == null) {
				local143 = new Class3_Sub44(local141, Static200.aClass254_66.method6420(local141));
				local101.method4792(local143);
			}
			this.aClass80Array1[local117[local119]] = new Class80(local129, local143);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
	public boolean method2964(@OriginalArg(0) int arg0) {
		return this.aClass80Array1[arg0].aBoolean201;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public boolean method2965(@OriginalArg(1) int arg0) {
		return this.aClass80Array1[arg0].aBoolean202;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
	public boolean method2966(@OriginalArg(0) int arg0) {
		return this.aClass80Array1[arg0].aBoolean203;
	}
}

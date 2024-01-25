import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class4_Sub5_Sub15 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "[Lclient!of;")
	public Class264[] aClass264Array1;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private final int anInt5796;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
	public Class4_Sub5_Sub15(@OriginalArg(0) int arg0) {
		this.anInt5796 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)Z")
	public boolean method5085(@OriginalArg(0) int arg0) {
		return this.aClass264Array1[arg0].aBoolean523;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)Z")
	public boolean method5086(@OriginalArg(0) int arg0) {
		return this.aClass264Array1[arg0].aBoolean521;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Z")
	public boolean method5087() {
		if (this.aClass264Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray22 == null) {
			@Pc(15) Class34 local15 = Static672.aClass34_133;
			synchronized (Static672.aClass34_133) {
				if (!Static672.aClass34_133.method1234(this.anInt5796)) {
					return false;
				}
				local35 = Static672.aClass34_133.method1243(this.anInt5796);
				this.aByteArrayArray22 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray22[local42] = Static672.aClass34_133.method1239(this.anInt5796, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray22.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray22[local75];
			@Pc(87) Class4_Sub11 local87 = new Class4_Sub11(local82);
			local87.anInt10466 = 1;
			local42 = local87.method8859();
			@Pc(96) Class34 local96 = Static132.aClass34_29;
			synchronized (Static132.aClass34_29) {
				local73 &= Static132.aClass34_29.method1235(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(125) Class163 local125 = new Class163();
		@Pc(127) Class34 local127 = Static672.aClass34_133;
		synchronized (Static672.aClass34_133) {
			@Pc(135) int local135 = Static672.aClass34_133.method1233(this.anInt5796);
			this.aClass264Array1 = new Class264[local135];
			local35 = Static672.aClass34_133.method1243(this.anInt5796);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(160) byte[] local160 = this.aByteArrayArray22[local42];
			@Pc(165) Class4_Sub11 local165 = new Class4_Sub11(local160);
			local165.anInt10466 = 1;
			@Pc(172) int local172 = local165.method8859();
			@Pc(174) Class4_Sub39 local174 = null;
			for (@Pc(179) Class4_Sub39 local179 = (Class4_Sub39) local125.method3639(); local179 != null; local179 = (Class4_Sub39) local125.method3640()) {
				if (local172 == local179.anInt6961) {
					local174 = local179;
					break;
				}
			}
			if (local174 == null) {
				@Pc(203) Class34 local203 = Static132.aClass34_29;
				synchronized (Static132.aClass34_29) {
					local174 = new Class4_Sub39(local172, Static132.aClass34_29.method1255(local172));
				}
				local125.method3646(local174);
			}
			this.aClass264Array1[local35[local42]] = new Class264(local160, local174);
		}
		this.aByteArrayArray22 = null;
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Z")
	public boolean method5089(@OriginalArg(0) int arg0) {
		return this.aClass264Array1[arg0].aBoolean522;
	}
}

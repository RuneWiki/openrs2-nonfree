import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "[Lclient!ws;")
	public Class363[] aClass363Array1;

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	private final int anInt6364;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub13(@OriginalArg(0) int arg0) {
		this.anInt6364 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Z")
	public boolean method5308() {
		if (this.aClass363Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray22 == null) {
			@Pc(15) Class111 local15 = Static213.aClass111_47;
			synchronized (Static213.aClass111_47) {
				if (!Static213.aClass111_47.method2463(this.anInt6364)) {
					return false;
				}
				local35 = Static213.aClass111_47.method2457(this.anInt6364);
				this.aByteArrayArray22 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray22[local42] = Static213.aClass111_47.method2441(local35[local42], this.anInt6364);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray22.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray22[local75];
			@Pc(87) Class1_Sub20 local87 = new Class1_Sub20(local82);
			local87.anInt5238 = 1;
			local42 = local87.method4426();
			@Pc(96) Class111 local96 = Static555.aClass111_120;
			synchronized (Static555.aClass111_120) {
				local73 &= Static555.aClass111_120.method2434(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(125) Class361 local125 = new Class361();
		@Pc(127) Class111 local127 = Static213.aClass111_47;
		synchronized (Static213.aClass111_47) {
			@Pc(135) int local135 = Static213.aClass111_47.method2442(this.anInt6364);
			this.aClass363Array1 = new Class363[local135];
			local35 = Static213.aClass111_47.method2457(this.anInt6364);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(160) byte[] local160 = this.aByteArrayArray22[local42];
			@Pc(165) Class1_Sub20 local165 = new Class1_Sub20(local160);
			local165.anInt5238 = 1;
			@Pc(172) int local172 = local165.method4426();
			@Pc(174) Class1_Sub31 local174 = null;
			for (@Pc(179) Class1_Sub31 local179 = (Class1_Sub31) local125.method7854(); local179 != null; local179 = (Class1_Sub31) local125.method7853()) {
				if (local172 == local179.anInt5961) {
					local174 = local179;
					break;
				}
			}
			if (local174 == null) {
				@Pc(199) Class111 local199 = Static555.aClass111_120;
				synchronized (Static555.aClass111_120) {
					local174 = new Class1_Sub31(local172, Static555.aClass111_120.method2449(local172));
				}
				local125.method7855(local174);
			}
			this.aClass363Array1[local35[local42]] = new Class363(local160, local174);
		}
		this.aByteArrayArray22 = null;
		return true;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
	public boolean method5310(@OriginalArg(0) int arg0) {
		return this.aClass363Array1[arg0].aBoolean695;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZ)Z")
	public boolean method5311(@OriginalArg(0) int arg0) {
		return this.aClass363Array1[arg0].aBoolean693;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)Z")
	public boolean method5313(@OriginalArg(1) int arg0) {
		return this.aClass363Array1[arg0].aBoolean694;
	}
}

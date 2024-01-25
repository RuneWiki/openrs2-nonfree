import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class14_Sub3_Sub1 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "[Lclient!ut;")
	public Class357[] aClass357Array1;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
	private final int anInt250;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class14_Sub3_Sub1(@OriginalArg(0) int arg0) {
		this.anInt250 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z")
	public boolean method213(@OriginalArg(1) int arg0) {
		return this.aClass357Array1[arg0].aBoolean721;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z")
	public boolean method215() {
		if (this.aClass357Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray2 == null) {
			@Pc(15) Class386 local15 = Static101.aClass386_24;
			synchronized (Static101.aClass386_24) {
				if (!Static101.aClass386_24.method9214(this.anInt250)) {
					return false;
				}
				local35 = Static101.aClass386_24.method9205(this.anInt250);
				this.aByteArrayArray2 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray2[local42] = Static101.aClass386_24.method9196(local35[local42], this.anInt250);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray2.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray2[local75];
			@Pc(87) Class14_Sub29 local87 = new Class14_Sub29(local82);
			local87.anInt7264 = 1;
			local42 = local87.method5900();
			@Pc(96) Class386 local96 = Static530.aClass386_112;
			synchronized (Static530.aClass386_112) {
				local73 &= Static530.aClass386_112.method9206(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(133) Class262 local133 = new Class262();
		@Pc(135) Class386 local135 = Static101.aClass386_24;
		synchronized (Static101.aClass386_24) {
			@Pc(143) int local143 = Static101.aClass386_24.method9210(this.anInt250);
			this.aClass357Array1 = new Class357[local143];
			local35 = Static101.aClass386_24.method9205(this.anInt250);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(168) byte[] local168 = this.aByteArrayArray2[local42];
			@Pc(173) Class14_Sub29 local173 = new Class14_Sub29(local168);
			local173.anInt7264 = 1;
			@Pc(180) int local180 = local173.method5900();
			@Pc(182) Class14_Sub23 local182 = null;
			for (@Pc(187) Class14_Sub23 local187 = (Class14_Sub23) local133.method6318(); local187 != null; local187 = (Class14_Sub23) local133.method6311()) {
				if (local180 == local187.anInt4025) {
					local182 = local187;
					break;
				}
			}
			if (local182 == null) {
				@Pc(207) Class386 local207 = Static530.aClass386_112;
				synchronized (Static530.aClass386_112) {
					local182 = new Class14_Sub23(local180, Static530.aClass386_112.method9192(local180));
				}
				local133.method6314(local182);
			}
			this.aClass357Array1[local35[local42]] = new Class357(local168, local182);
		}
		this.aByteArrayArray2 = null;
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Z")
	public boolean method216(@OriginalArg(1) int arg0) {
		return this.aClass357Array1[arg0].aBoolean720;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Z")
	public boolean method217(@OriginalArg(1) int arg0) {
		return this.aClass357Array1[arg0].aBoolean719;
	}
}

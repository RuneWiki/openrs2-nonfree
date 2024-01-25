import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nea", name = "y", descriptor = "[Lclient!ri;")
	public Class301[] aClass301Array1;

	@OriginalMember(owner = "client!nea", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!nea", name = "z", descriptor = "I")
	private final int anInt5852;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt5852 = arg0;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)Z")
	public boolean method5012(@OriginalArg(0) int arg0) {
		return this.aClass301Array1[arg0].aBoolean608;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)Z")
	public boolean method5013() {
		if (this.aClass301Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray18 == null) {
			@Pc(15) Class380 local15 = Static555.aClass380_125;
			synchronized (Static555.aClass380_125) {
				if (!Static555.aClass380_125.method8635(this.anInt5852)) {
					return false;
				}
				local35 = Static555.aClass380_125.method8617(this.anInt5852);
				this.aByteArrayArray18 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray18[local42] = Static555.aClass380_125.method8620(this.anInt5852, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(92) Class380 local92;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray18.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray18[local71];
			@Pc(83) Class2_Sub22 local83 = new Class2_Sub22(local78);
			local83.anInt10247 = 1;
			local42 = local83.method8546();
			local92 = Static189.aClass380_47;
			synchronized (Static189.aClass380_47) {
				local69 &= Static189.aClass380_47.method8638(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(125) Class109 local125 = new Class109();
		local92 = Static555.aClass380_125;
		@Pc(144) int local144;
		synchronized (Static555.aClass380_125) {
			local144 = Static555.aClass380_125.method8631(this.anInt5852);
			this.aClass301Array1 = new Class301[local144];
			local35 = Static555.aClass380_125.method8617(this.anInt5852);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(169) byte[] local169 = this.aByteArrayArray18[local42];
			@Pc(174) Class2_Sub22 local174 = new Class2_Sub22(local169);
			local174.anInt10247 = 1;
			local144 = local174.method8546();
			@Pc(183) Class2_Sub25 local183 = null;
			for (@Pc(188) Class2_Sub25 local188 = (Class2_Sub25) local125.method2325(); local188 != null; local188 = (Class2_Sub25) local125.method2318()) {
				if (local144 == local188.anInt4860) {
					local183 = local188;
					break;
				}
			}
			if (local183 == null) {
				@Pc(208) Class380 local208 = Static189.aClass380_47;
				synchronized (Static189.aClass380_47) {
					local183 = new Class2_Sub25(local144, Static189.aClass380_47.method8616(local144));
				}
				local125.method2323(local183);
			}
			this.aClass301Array1[local35[local42]] = new Class301(local169, local183);
		}
		this.aByteArrayArray18 = null;
		return true;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(II)Z")
	public boolean method5014(@OriginalArg(0) int arg0) {
		return this.aClass301Array1[arg0].aBoolean607;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)Z")
	public boolean method5015(@OriginalArg(1) int arg0) {
		return this.aClass301Array1[arg0].aBoolean606;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ofa", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ofa", name = "z", descriptor = "[Lclient!eq;")
	public Class95[] aClass95Array1;

	@OriginalMember(owner = "client!ofa", name = "A", descriptor = "I")
	private final int anInt6341;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt6341 = arg0;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)Z")
	public boolean method5302(@OriginalArg(1) int arg0) {
		return this.aClass95Array1[arg0].aBoolean143;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BI)Z")
	public boolean method5303(@OriginalArg(1) int arg0) {
		return this.aClass95Array1[arg0].aBoolean142;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IB)Z")
	public boolean method5305(@OriginalArg(0) int arg0) {
		return this.aClass95Array1[arg0].aBoolean144;
	}

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "(I)Z")
	public boolean method5306() {
		if (this.aClass95Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray12 == null) {
			@Pc(15) Class229 local15 = Static173.aClass229_35;
			synchronized (Static173.aClass229_35) {
				if (!Static173.aClass229_35.method4984(this.anInt6341)) {
					return false;
				}
				local35 = Static173.aClass229_35.method4982(this.anInt6341);
				this.aByteArrayArray12 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray12[local42] = Static173.aClass229_35.method4980(this.anInt6341, local35[local42]);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray12.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray12[local75];
			@Pc(87) Class2_Sub7 local87 = new Class2_Sub7(local82);
			local87.anInt5186 = 1;
			local42 = local87.method4518();
			@Pc(98) Class229 local98 = Static193.aClass229_124;
			synchronized (Static193.aClass229_124) {
				local73 &= Static193.aClass229_124.method4954(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(133) Class70 local133 = new Class70();
		@Pc(135) Class229 local135 = Static173.aClass229_35;
		synchronized (Static173.aClass229_35) {
			@Pc(143) int local143 = Static173.aClass229_35.method4981(this.anInt6341);
			this.aClass95Array1 = new Class95[local143];
			local35 = Static173.aClass229_35.method4982(this.anInt6341);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(170) byte[] local170 = this.aByteArrayArray12[local42];
			@Pc(175) Class2_Sub7 local175 = new Class2_Sub7(local170);
			local175.anInt5186 = 1;
			@Pc(182) int local182 = local175.method4518();
			@Pc(184) Class2_Sub18 local184 = null;
			for (@Pc(189) Class2_Sub18 local189 = (Class2_Sub18) local133.method1264(); local189 != null; local189 = (Class2_Sub18) local133.method1261()) {
				if (local182 == local189.anInt2788) {
					local184 = local189;
					break;
				}
			}
			if (local184 == null) {
				@Pc(213) Class229 local213 = Static193.aClass229_124;
				synchronized (Static193.aClass229_124) {
					local184 = new Class2_Sub18(local182, Static193.aClass229_124.method4966(local182));
				}
				local133.method1269(local184);
			}
			this.aClass95Array1[local35[local42]] = new Class95(local170, local184);
		}
		this.aByteArrayArray12 = null;
		return true;
	}
}

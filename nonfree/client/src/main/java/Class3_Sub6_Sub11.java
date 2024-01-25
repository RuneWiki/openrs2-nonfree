import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class3_Sub6_Sub11 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ija", name = "A", descriptor = "[Lclient!g;")
	public Class136[] aClass136Array1;

	@OriginalMember(owner = "client!ija", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ija", name = "G", descriptor = "I")
	private final int anInt4805;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(I)V")
	public Class3_Sub6_Sub11(@OriginalArg(0) int arg0) {
		this.anInt4805 = arg0;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)Z")
	public boolean method4036() {
		if (this.aClass136Array1 != null) {
			return true;
		}
		@Pc(42) int local42;
		if (this.aByteArrayArray9 == null) {
			@Pc(15) Class143 local15 = Static416.aClass143_102;
			synchronized (Static416.aClass143_102) {
				if (!Static416.aClass143_102.method3144(this.anInt4805)) {
					return false;
				}
				@Pc(35) int[] local35 = Static416.aClass143_102.method3133(this.anInt4805);
				this.aByteArrayArray9 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray9[local42] = Static416.aClass143_102.method3125(local35[local42], this.anInt4805);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		@Pc(96) Class143 local96;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray9.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray9[local75];
			@Pc(87) Class3_Sub17 local87 = new Class3_Sub17(local82);
			local87.lb = 1;
			local42 = local87.method4858();
			local96 = Static30.aClass143_7;
			synchronized (Static30.aClass143_7) {
				local73 &= Static30.aClass143_7.method3130(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(137) Class193 local137 = new Class193();
		local96 = Static416.aClass143_102;
		@Pc(157) int[] local157;
		synchronized (Static416.aClass143_102) {
			@Pc(147) int local147 = Static416.aClass143_102.method3123(this.anInt4805);
			this.aClass136Array1 = new Class136[local147];
			local157 = Static416.aClass143_102.method3133(this.anInt4805);
		}
		for (@Pc(165) int local165 = 0; local165 < local157.length; local165++) {
			@Pc(172) byte[] local172 = this.aByteArrayArray9[local165];
			@Pc(177) Class3_Sub17 local177 = new Class3_Sub17(local172);
			local177.lb = 1;
			@Pc(184) int local184 = local177.method4858();
			@Pc(186) Class3_Sub52 local186 = null;
			for (@Pc(191) Class3_Sub52 local191 = (Class3_Sub52) local137.method4457(); local191 != null; local191 = (Class3_Sub52) local137.method4459()) {
				if (local191.anInt9522 == local184) {
					local186 = local191;
					break;
				}
			}
			if (local186 == null) {
				@Pc(211) Class143 local211 = Static30.aClass143_7;
				synchronized (Static30.aClass143_7) {
					local186 = new Class3_Sub52(local184, Static30.aClass143_7.method3135(local184));
				}
				local137.method4462(local186);
			}
			this.aClass136Array1[local157[local165]] = new Class136(local172, local186);
		}
		this.aByteArrayArray9 = null;
		return true;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(II)Z")
	public boolean method4037(@OriginalArg(1) int arg0) {
		return this.aClass136Array1[arg0].aBoolean277;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IB)Z")
	public boolean method4042(@OriginalArg(0) int arg0) {
		return this.aClass136Array1[arg0].aBoolean276;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(II)Z")
	public boolean method4044(@OriginalArg(0) int arg0) {
		return this.aClass136Array1[arg0].aBoolean278;
	}
}

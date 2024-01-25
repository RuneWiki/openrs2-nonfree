import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "[Lclient!uo;")
	public Class207[] aClass207Array1;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
	private final int anInt733;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt733 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)Z")
	public boolean method818(@OriginalArg(1) int arg0) {
		return this.aClass207Array1[arg0].aBoolean543;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
	public boolean method820() {
		if (this.aClass207Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray3 == null) {
			if (!Static185.aClass165_19.method4487(this.anInt733)) {
				return false;
			}
			@Pc(27) int[] local27 = Static185.aClass165_19.method4500(this.anInt733);
			this.aByteArrayArray3 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray3[local34] = Static185.aClass165_19.method4508(local27[local34], this.anInt733);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray3.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray3[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static67.aClass165_30.method4486(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class195 local99 = new Class195();
		local78 = Static185.aClass165_19.method4499(this.anInt733);
		this.aClass207Array1 = new Class207[local78];
		@Pc(115) int[] local115 = Static185.aClass165_19.method4500(this.anInt733);
		for (@Pc(117) int local117 = 0; local117 < local115.length; local117++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray3[local117];
			@Pc(138) int local138 = (local124[0] & 0xFF) << 8 | local124[1] & 0xFF;
			@Pc(140) Class1_Sub30 local140 = null;
			for (@Pc(145) Class1_Sub30 local145 = (Class1_Sub30) local99.method5029(); local145 != null; local145 = (Class1_Sub30) local99.method5021()) {
				if (local138 == local145.anInt4608) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class1_Sub30(local138, Static67.aClass165_30.method4492(local138));
				local99.method5018(local140);
			}
			this.aClass207Array1[local115[local117]] = new Class207(local124, local140);
		}
		this.aByteArrayArray3 = null;
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Z")
	public boolean method824(@OriginalArg(0) int arg0) {
		return this.aClass207Array1[arg0].aBoolean544;
	}
}

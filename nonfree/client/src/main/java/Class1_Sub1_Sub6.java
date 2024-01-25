import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "[Lclient!h;")
	public Class115[] aClass115Array1;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	private final int anInt3392;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub6(@OriginalArg(0) int arg0) {
		this.anInt3392 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Z")
	public boolean method2962(@OriginalArg(0) int arg0) {
		return this.aClass115Array1[arg0].aBoolean210;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)Z")
	public boolean method2963(@OriginalArg(0) int arg0) {
		return this.aClass115Array1[arg0].aBoolean211;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Z")
	public boolean method2965(@OriginalArg(1) int arg0) {
		return this.aClass115Array1[arg0].aBoolean212;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
	public boolean method2967() {
		if (this.aClass115Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray9 == null) {
			if (!Static35.aClass171_17.method4340(this.anInt3392)) {
				return false;
			}
			@Pc(27) int[] local27 = Static35.aClass171_17.method4353(this.anInt3392);
			this.aByteArrayArray9 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray9[local34] = Static35.aClass171_17.method4339(this.anInt3392, local27[local34]);
			}
		}
		@Pc(55) boolean local55 = true;
		for (local34 = 0; local34 < this.aByteArrayArray9.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray9[local34];
			@Pc(69) Class1_Sub6 local69 = new Class1_Sub6(local64);
			local69.anInt4555 = 1;
			@Pc(76) int local76 = local69.method3967();
			local55 &= Static177.aClass171_70.method4327(local76);
		}
		if (!local55) {
			return false;
		}
		@Pc(101) Class37 local101 = new Class37();
		@Pc(107) int local107 = Static35.aClass171_17.method4349(this.anInt3392);
		this.aClass115Array1 = new Class115[local107];
		@Pc(117) int[] local117 = Static35.aClass171_17.method4353(this.anInt3392);
		for (@Pc(119) int local119 = 0; local119 < local117.length; local119++) {
			@Pc(126) byte[] local126 = this.aByteArrayArray9[local119];
			@Pc(131) Class1_Sub6 local131 = new Class1_Sub6(local126);
			local131.anInt4555 = 1;
			@Pc(138) int local138 = local131.method3967();
			@Pc(140) Class1_Sub20 local140 = null;
			for (@Pc(145) Class1_Sub20 local145 = (Class1_Sub20) local101.method977(); local145 != null; local145 = (Class1_Sub20) local101.method971()) {
				if (local145.anInt2900 == local138) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class1_Sub20(local138, Static177.aClass171_70.method4361(local138));
				local101.method970(local140);
			}
			this.aClass115Array1[local117[local119]] = new Class115(local126, local140);
		}
		this.aByteArrayArray9 = null;
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!go", name = "B", descriptor = "[I")
	public static final int[] anIntArray136 = new int[32];

	@OriginalMember(owner = "client!go", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!go", name = "D", descriptor = "[Lclient!jm;")
	public Class126[] aClass126Array1;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	private final int anInt2482;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray136[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt2482 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
	public boolean method1999(@OriginalArg(1) int arg0) {
		return this.aClass126Array1[arg0].aBoolean212;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)Z")
	public boolean method2000(@OriginalArg(0) int arg0) {
		return this.aClass126Array1[arg0].aBoolean213;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)Z")
	public boolean method2001() {
		if (this.aClass126Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray4 == null) {
			if (!Static279.aClass243_152.method5481(this.anInt2482)) {
				return false;
			}
			@Pc(27) int[] local27 = Static279.aClass243_152.method5467(this.anInt2482);
			this.aByteArrayArray4 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray4[local34] = Static279.aClass243_152.method5455(local27[local34], this.anInt2482);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray4.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray4[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static265.aClass243_144.method5463(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(107) Class177 local107 = new Class177();
		local82 = Static279.aClass243_152.method5472(this.anInt2482);
		this.aClass126Array1 = new Class126[local82];
		@Pc(129) int[] local129 = Static279.aClass243_152.method5467(this.anInt2482);
		for (@Pc(131) int local131 = 0; local131 < local129.length; local131++) {
			@Pc(138) byte[] local138 = this.aByteArrayArray4[local131];
			@Pc(152) int local152 = local138[1] & 0xFF | (local138[0] & 0xFF) << 8;
			@Pc(154) Class5_Sub21 local154 = null;
			for (@Pc(159) Class5_Sub21 local159 = (Class5_Sub21) local107.method3618(); local159 != null; local159 = (Class5_Sub21) local107.method3619()) {
				if (local159.anInt3191 == local152) {
					local154 = local159;
					break;
				}
			}
			if (local154 == null) {
				local154 = new Class5_Sub21(local152, Static265.aClass243_144.method5459(local152));
				local107.method3615(local154);
			}
			this.aClass126Array1[local129[local131]] = new Class126(local138, local154);
		}
		this.aByteArrayArray4 = null;
		return true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Z")
	public boolean method2002(@OriginalArg(0) int arg0) {
		return this.aClass126Array1[arg0].aBoolean214;
	}
}

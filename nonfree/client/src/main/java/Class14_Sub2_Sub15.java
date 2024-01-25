import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class14_Sub2_Sub15 extends Class14_Sub2 {

	@OriginalMember(owner = "client!om", name = "w", descriptor = "[Lclient!hi;")
	public Class84[] aClass84Array1;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	private final int anInt4577;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
	public Class14_Sub2_Sub15(@OriginalArg(0) int arg0) {
		this.anInt4577 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	public boolean method4103(@OriginalArg(0) int arg0) {
		return this.aClass84Array1[arg0].aBoolean182;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)Z")
	public boolean method4104() {
		if (this.aClass84Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray20 == null) {
			if (!Static48.aClass143_33.method3759(this.anInt4577)) {
				return false;
			}
			@Pc(27) int[] local27 = Static48.aClass143_33.method3738(this.anInt4577);
			this.aByteArrayArray20 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray20[local34] = Static48.aClass143_33.method3745(this.anInt4577, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray20.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray20[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static86.aClass143_50.method3736(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class18 local103 = new Class18();
		local82 = Static48.aClass143_33.method3732(this.anInt4577);
		this.aClass84Array1 = new Class84[local82];
		@Pc(124) int[] local124 = Static48.aClass143_33.method3738(this.anInt4577);
		for (@Pc(126) int local126 = 0; local126 < local124.length; local126++) {
			@Pc(133) byte[] local133 = this.aByteArrayArray20[local126];
			@Pc(147) int local147 = local133[1] & 0xFF | (local133[0] & 0xFF) << 8;
			@Pc(149) Class14_Sub9 local149 = null;
			for (@Pc(154) Class14_Sub9 local154 = (Class14_Sub9) local103.method459(); local154 != null; local154 = (Class14_Sub9) local103.method453()) {
				if (local147 == local154.anInt1543) {
					local149 = local154;
					break;
				}
			}
			if (local149 == null) {
				local149 = new Class14_Sub9(local147, Static86.aClass143_50.method3750(local147));
				local103.method451(local149);
			}
			this.aClass84Array1[local124[local126]] = new Class84(local133, local149);
		}
		this.aByteArrayArray20 = null;
		return true;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Z")
	public boolean method4107(@OriginalArg(0) int arg0) {
		return this.aClass84Array1[arg0].aBoolean183;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class1_Sub6_Sub15 extends Class1_Sub6 {

	@OriginalMember(owner = "client!un", name = "x", descriptor = "[Lclient!af;")
	public Class6[] aClass6Array1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	private final int anInt5838;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub15(@OriginalArg(0) int arg0) {
		this.anInt5838 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)Z")
	public boolean method5011() {
		if (this.aClass6Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray21 == null) {
			if (!Static25.aClass230_6.method4964(this.anInt5838)) {
				return false;
			}
			@Pc(27) int[] local27 = Static25.aClass230_6.method4983(this.anInt5838);
			this.aByteArrayArray21 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray21[local34] = Static25.aClass230_6.method4985(local27[local34], this.anInt5838);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray21.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray21[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static37.aClass230_12.method4966(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(108) Class17 local108 = new Class17();
		local82 = Static25.aClass230_6.method4956(this.anInt5838);
		this.aClass6Array1 = new Class6[local82];
		@Pc(124) int[] local124 = Static25.aClass230_6.method4983(this.anInt5838);
		for (@Pc(126) int local126 = 0; local126 < local124.length; local126++) {
			@Pc(133) byte[] local133 = this.aByteArrayArray21[local126];
			@Pc(147) int local147 = (local133[0] & 0xFF) << 8 | local133[1] & 0xFF;
			@Pc(149) Class1_Sub25 local149 = null;
			for (@Pc(154) Class1_Sub25 local154 = (Class1_Sub25) local108.method202(); local154 != null; local154 = (Class1_Sub25) local108.method207()) {
				if (local147 == local154.anInt3663) {
					local149 = local154;
					break;
				}
			}
			if (local149 == null) {
				local149 = new Class1_Sub25(local147, Static37.aClass230_12.method4961(local147));
				local108.method199(local149);
			}
			this.aClass6Array1[local124[local126]] = new Class6(local133, local149);
		}
		this.aByteArrayArray21 = null;
		return true;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)Z")
	public boolean method5014(@OriginalArg(1) int arg0) {
		return this.aClass6Array1[arg0].aBoolean8;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public boolean method5015(@OriginalArg(1) int arg0) {
		return this.aClass6Array1[arg0].aBoolean7;
	}
}

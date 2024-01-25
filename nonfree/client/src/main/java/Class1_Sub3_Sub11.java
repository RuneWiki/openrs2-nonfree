import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "[Lclient!wr;")
	public Class266[] aClass266Array1;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
	private final int anInt3781;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub11(@OriginalArg(0) int arg0) {
		this.anInt3781 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)Z")
	public boolean method3067(@OriginalArg(1) int arg0) {
		return this.aClass266Array1[arg0].aBoolean608;
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)Z")
	public boolean method3068(@OriginalArg(0) int arg0) {
		return this.aClass266Array1[arg0].aBoolean609;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Z")
	public boolean method3069() {
		if (this.aClass266Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray31 == null) {
			if (!Static80.aClass113_28.method2278(this.anInt3781)) {
				return false;
			}
			@Pc(27) int[] local27 = Static80.aClass113_28.method2280(this.anInt3781);
			this.aByteArrayArray31 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray31[local34] = Static80.aClass113_28.method2274(this.anInt3781, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray31.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray31[local34];
			local82 = (local68[0] & 0xFF) << 8 | local68[1] & 0xFF;
			local59 &= Static349.aClass113_107.method2253(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(107) Class254 local107 = new Class254();
		local82 = Static80.aClass113_28.method2271(this.anInt3781);
		this.aClass266Array1 = new Class266[local82];
		@Pc(123) int[] local123 = Static80.aClass113_28.method2280(this.anInt3781);
		for (@Pc(133) int local133 = 0; local133 < local123.length; local133++) {
			@Pc(140) byte[] local140 = this.aByteArrayArray31[local133];
			@Pc(154) int local154 = (local140[0] & 0xFF) << 8 | local140[1] & 0xFF;
			@Pc(156) Class1_Sub17 local156 = null;
			for (@Pc(161) Class1_Sub17 local161 = (Class1_Sub17) local107.method5437(); local161 != null; local161 = (Class1_Sub17) local107.method5433()) {
				if (local154 == local161.anInt2359) {
					local156 = local161;
					break;
				}
			}
			if (local156 == null) {
				local156 = new Class1_Sub17(local154, Static349.aClass113_107.method2273(local154));
				local107.method5430(local156);
			}
			this.aClass266Array1[local123[local133]] = new Class266(local140, local156);
		}
		this.aByteArrayArray31 = null;
		return true;
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(II)Z")
	public boolean method3070(@OriginalArg(1) int arg0) {
		return this.aClass266Array1[arg0].aBoolean610;
	}
}

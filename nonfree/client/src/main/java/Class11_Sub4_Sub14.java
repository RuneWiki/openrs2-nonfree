import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class11_Sub4_Sub14 extends Class11_Sub4 {

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "[Lclient!bm;")
	public Class28[] aClass28Array1;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	private final int anInt4817;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class11_Sub4_Sub14(@OriginalArg(0) int arg0) {
		this.anInt4817 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z")
	public boolean method4229(@OriginalArg(0) int arg0) {
		return this.aClass28Array1[arg0].aBoolean28;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
	public boolean method4230(@OriginalArg(0) int arg0) {
		return this.aClass28Array1[arg0].aBoolean29;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z")
	public boolean method4233() {
		if (this.aClass28Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray36 == null) {
			if (!Static262.aClass144_89.method3915(this.anInt4817)) {
				return false;
			}
			@Pc(27) int[] local27 = Static262.aClass144_89.method3901(this.anInt4817);
			this.aByteArrayArray36 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray36[local34] = Static262.aClass144_89.method3896(local27[local34], this.anInt4817);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray36.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray36[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static42.aClass144_17.method3910(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class16 local103 = new Class16();
		local82 = Static262.aClass144_89.method3890(this.anInt4817);
		this.aClass28Array1 = new Class28[local82];
		@Pc(121) int[] local121 = Static262.aClass144_89.method3901(this.anInt4817);
		for (@Pc(123) int local123 = 0; local123 < local121.length; local123++) {
			@Pc(130) byte[] local130 = this.aByteArrayArray36[local123];
			@Pc(144) int local144 = (local130[0] & 0xFF) << 8 | local130[1] & 0xFF;
			@Pc(146) Class11_Sub43 local146 = null;
			for (@Pc(153) Class11_Sub43 local153 = (Class11_Sub43) local103.method193(); local153 != null; local153 = (Class11_Sub43) local103.method188()) {
				if (local144 == local153.anInt6573) {
					local146 = local153;
					break;
				}
			}
			if (local146 == null) {
				local146 = new Class11_Sub43(local144, Static42.aClass144_17.method3908(local144));
				local103.method190(local146);
			}
			this.aClass28Array1[local121[local123]] = new Class28(local130, local146);
		}
		this.aByteArrayArray36 = null;
		return true;
	}
}

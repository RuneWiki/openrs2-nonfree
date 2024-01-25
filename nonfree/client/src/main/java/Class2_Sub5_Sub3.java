import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "[Lclient!qf;")
	public Class201[] aClass201Array1;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "I")
	private final int anInt1152;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class2_Sub5_Sub3(@OriginalArg(0) int arg0) {
		this.anInt1152 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Z")
	public boolean method885(@OriginalArg(0) int arg0) {
		return this.aClass201Array1[arg0].aBoolean396;
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)Z")
	public boolean method886() {
		if (this.aClass201Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray5 == null) {
			if (!Static425.aClass160_84.method3719(this.anInt1152)) {
				return false;
			}
			@Pc(27) int[] local27 = Static425.aClass160_84.method3723(this.anInt1152);
			this.aByteArrayArray5 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray5[local34] = Static425.aClass160_84.method3696(local27[local34], this.anInt1152);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray5.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray5[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static425.aClass160_83.method3716(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(108) Class14 local108 = new Class14();
		local78 = Static425.aClass160_84.method3722(this.anInt1152);
		this.aClass201Array1 = new Class201[local78];
		@Pc(124) int[] local124 = Static425.aClass160_84.method3723(this.anInt1152);
		for (@Pc(126) int local126 = 0; local126 < local124.length; local126++) {
			@Pc(133) byte[] local133 = this.aByteArrayArray5[local126];
			@Pc(147) int local147 = (local133[0] & 0xFF) << 8 | local133[1] & 0xFF;
			@Pc(149) Class2_Sub16 local149 = null;
			for (@Pc(154) Class2_Sub16 local154 = (Class2_Sub16) local108.method309(); local154 != null; local154 = (Class2_Sub16) local108.method311()) {
				if (local154.anInt3096 == local147) {
					local149 = local154;
					break;
				}
			}
			if (local149 == null) {
				local149 = new Class2_Sub16(local147, Static425.aClass160_83.method3711(local147));
				local108.method300(local149);
			}
			this.aClass201Array1[local124[local126]] = new Class201(local133, local149);
		}
		this.aByteArrayArray5 = null;
		return true;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Z")
	public boolean method888(@OriginalArg(1) int arg0) {
		return this.aClass201Array1[arg0].aBoolean395;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Z")
	public boolean method889(@OriginalArg(1) int arg0) {
		return this.aClass201Array1[arg0].aBoolean397;
	}
}

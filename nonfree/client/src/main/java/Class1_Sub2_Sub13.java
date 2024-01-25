import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "[Lclient!sh;")
	public Class184[] aClass184Array1;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
	private final int anInt5316;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub13(@OriginalArg(0) int arg0) {
		this.anInt5316 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(BI)Z")
	public boolean method4655(@OriginalArg(1) int arg0) {
		return this.aClass184Array1[arg0].aBoolean475;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
	public boolean method4656(@OriginalArg(0) int arg0) {
		return this.aClass184Array1[arg0].aBoolean474;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Z")
	public boolean method4659() {
		if (this.aClass184Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray18 == null) {
			if (!Static195.aClass134_152.method3003(this.anInt5316)) {
				return false;
			}
			@Pc(27) int[] local27 = Static195.aClass134_152.method3001(this.anInt5316);
			this.aByteArrayArray18 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray18[local34] = Static195.aClass134_152.method3009(local27[local34], this.anInt5316);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray18.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray18[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static46.aClass134_25.method3005(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class14 local99 = new Class14();
		local78 = Static195.aClass134_152.method3020(this.anInt5316);
		this.aClass184Array1 = new Class184[local78];
		@Pc(123) int[] local123 = Static195.aClass134_152.method3001(this.anInt5316);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(132) byte[] local132 = this.aByteArrayArray18[local125];
			@Pc(146) int local146 = local132[1] & 0xFF | (local132[0] & 0xFF) << 8;
			@Pc(148) Class1_Sub28 local148 = null;
			for (@Pc(153) Class1_Sub28 local153 = (Class1_Sub28) local99.method302(); local153 != null; local153 = (Class1_Sub28) local99.method313()) {
				if (local153.anInt3990 == local146) {
					local148 = local153;
					break;
				}
			}
			if (local148 == null) {
				local148 = new Class1_Sub28(local146, Static46.aClass134_25.method3014(local146));
				local99.method300(local148);
			}
			this.aClass184Array1[local123[local125]] = new Class184(local132, local148);
		}
		this.aByteArrayArray18 = null;
		return true;
	}
}

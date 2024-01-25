import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class12_Sub4_Sub13 extends Class12_Sub4 {

	@OriginalMember(owner = "client!nv", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!nv", name = "F", descriptor = "[Lclient!ue;")
	public Class295[] aClass295Array1;

	@OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
	private final int anInt6469;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I)V")
	public Class12_Sub4_Sub13(@OriginalArg(0) int arg0) {
		this.anInt6469 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)Z")
	public boolean method5401(@OriginalArg(0) int arg0) {
		return this.aClass295Array1[arg0].aBoolean625;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Z")
	public boolean method5402(@OriginalArg(1) int arg0) {
		return this.aClass295Array1[arg0].aBoolean627;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)Z")
	public boolean method5403(@OriginalArg(0) int arg0) {
		return this.aClass295Array1[arg0].aBoolean626;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
	public boolean method5405() {
		if (this.aClass295Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray17 == null) {
			if (!Static126.aClass16_114.method412(this.anInt6469)) {
				return false;
			}
			@Pc(27) int[] local27 = Static126.aClass16_114.method387(this.anInt6469);
			this.aByteArrayArray17 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray17[local34] = Static126.aClass16_114.method408(this.anInt6469, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray17.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray17[local34];
			local82 = local68[1] & 0xFF | (local68[0] & 0xFF) << 8;
			local59 &= Static220.aClass16_58.method389(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(107) Class73 local107 = new Class73();
		local82 = Static126.aClass16_114.method399(this.anInt6469);
		this.aClass295Array1 = new Class295[local82];
		@Pc(123) int[] local123 = Static126.aClass16_114.method387(this.anInt6469);
		for (@Pc(130) int local130 = 0; local130 < local123.length; local130++) {
			@Pc(137) byte[] local137 = this.aByteArrayArray17[local130];
			@Pc(151) int local151 = local137[1] & 0xFF | (local137[0] & 0xFF) << 8;
			@Pc(153) Class12_Sub11 local153 = null;
			for (@Pc(158) Class12_Sub11 local158 = (Class12_Sub11) local107.method2005(); local158 != null; local158 = (Class12_Sub11) local107.method2009()) {
				if (local151 == local158.anInt2274) {
					local153 = local158;
					break;
				}
			}
			if (local153 == null) {
				local153 = new Class12_Sub11(local151, Static220.aClass16_58.method410(local151));
				local107.method2012(local153);
			}
			this.aClass295Array1[local123[local130]] = new Class295(local137, local153);
		}
		this.aByteArrayArray17 = null;
		return true;
	}
}

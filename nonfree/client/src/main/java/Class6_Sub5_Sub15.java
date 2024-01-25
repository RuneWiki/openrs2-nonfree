import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class6_Sub5_Sub15 extends Class6_Sub5 {

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "[Lclient!qb;")
	public Class258[] aClass258Array1;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
	private final int anInt8021;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
	public Class6_Sub5_Sub15(@OriginalArg(0) int arg0) {
		this.anInt8021 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z")
	public boolean method6374() {
		if (this.aClass258Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray24 == null) {
			if (!Static492.aClass248_95.method5802(this.anInt8021)) {
				return false;
			}
			@Pc(27) int[] local27 = Static492.aClass248_95.method5796(this.anInt8021);
			this.aByteArrayArray24 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray24[local34] = Static492.aClass248_95.method5797(this.anInt8021, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(80) int local80;
		for (local34 = 0; local34 < this.aByteArrayArray24.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray24[local34];
			@Pc(73) Class6_Sub12 local73 = new Class6_Sub12(local68);
			local73.anInt7556 = 1;
			local80 = local73.method6044();
			local59 &= Static503.aClass248_99.method5804(local80);
		}
		if (!local59) {
			return false;
		}
		@Pc(109) Class298 local109 = new Class298();
		local80 = Static492.aClass248_95.method5793(this.anInt8021);
		this.aClass258Array1 = new Class258[local80];
		@Pc(125) int[] local125 = Static492.aClass248_95.method5796(this.anInt8021);
		for (@Pc(127) int local127 = 0; local127 < local125.length; local127++) {
			@Pc(134) byte[] local134 = this.aByteArrayArray24[local127];
			@Pc(139) Class6_Sub12 local139 = new Class6_Sub12(local134);
			local139.anInt7556 = 1;
			@Pc(146) int local146 = local139.method6044();
			@Pc(148) Class6_Sub32 local148 = null;
			for (@Pc(153) Class6_Sub32 local153 = (Class6_Sub32) local109.method6809(); local153 != null; local153 = (Class6_Sub32) local109.method6821()) {
				if (local153.anInt6681 == local146) {
					local148 = local153;
					break;
				}
			}
			if (local148 == null) {
				local148 = new Class6_Sub32(local146, Static503.aClass248_99.method5795(local146));
				local109.method6812(local148);
			}
			this.aClass258Array1[local125[local127]] = new Class258(local134, local148);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)Z")
	public boolean method6375(@OriginalArg(0) int arg0) {
		return this.aClass258Array1[arg0].aBoolean501;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)Z")
	public boolean method6376(@OriginalArg(1) int arg0) {
		return this.aClass258Array1[arg0].aBoolean503;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z")
	public boolean method6377(@OriginalArg(1) int arg0) {
		return this.aClass258Array1[arg0].aBoolean502;
	}
}

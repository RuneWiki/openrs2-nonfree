import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[Lclient!fl;")
	public Class87[] aClass87Array1;

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
	private final int anInt7188;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt7188 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)Z")
	public boolean method5528() {
		if (this.aClass87Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray27 == null) {
			if (!Static210.aClass109_55.method2339(this.anInt7188)) {
				return false;
			}
			@Pc(25) int[] local25 = Static210.aClass109_55.method2341(this.anInt7188);
			this.aByteArrayArray27 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray27[local32] = Static210.aClass109_55.method2349(this.anInt7188, local25[local32]);
			}
		}
		@Pc(52) boolean local52 = true;
		@Pc(74) int local74;
		for (local32 = 0; local32 < this.aByteArrayArray27.length; local32++) {
			@Pc(60) byte[] local60 = this.aByteArrayArray27[local32];
			local74 = (local60[0] & 0xFF) << 8 | local60[1] & 0xFF;
			local52 &= Static401.aClass109_89.method2348(local74);
		}
		if (!local52) {
			return false;
		}
		@Pc(95) Class142 local95 = new Class142();
		local74 = Static210.aClass109_55.method2322(this.anInt7188);
		this.aClass87Array1 = new Class87[local74];
		@Pc(116) int[] local116 = Static210.aClass109_55.method2341(this.anInt7188);
		for (@Pc(118) int local118 = 0; local118 < local116.length; local118++) {
			@Pc(124) byte[] local124 = this.aByteArrayArray27[local118];
			@Pc(138) int local138 = (local124[0] & 0xFF) << 8 | local124[1] & 0xFF;
			@Pc(140) Class1_Sub32 local140 = null;
			for (@Pc(145) Class1_Sub32 local145 = (Class1_Sub32) local95.method3199(); local145 != null; local145 = (Class1_Sub32) local95.method3198()) {
				if (local138 == local145.anInt5023) {
					local140 = local145;
					break;
				}
			}
			if (local140 == null) {
				local140 = new Class1_Sub32(local138, Static401.aClass109_89.method2346(local138));
				local95.method3212(local140);
			}
			this.aClass87Array1[local116[local118]] = new Class87(local124, local140);
		}
		this.aByteArrayArray27 = null;
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Z")
	public boolean method5530(@OriginalArg(0) int arg0) {
		return this.aClass87Array1[arg0].aBoolean169;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)Z")
	public boolean method5531(@OriginalArg(0) int arg0) {
		return this.aClass87Array1[arg0].aBoolean168;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)Z")
	public boolean method5532(@OriginalArg(0) int arg0) {
		return this.aClass87Array1[arg0].aBoolean167;
	}
}

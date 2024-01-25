import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
	public static final int[] anIntArray411 = new int[16384];

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	public static final int[] anIntArray410 = new int[16384];

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[Lclient!ob;")
	public Class218[] aClass218Array1;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private final int anInt5948;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray411[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray410[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub16(@OriginalArg(0) int arg0) {
		this.anInt5948 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	public boolean method4953(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0].aBoolean443;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Z")
	public boolean method4954(@OriginalArg(1) int arg0) {
		return this.aClass218Array1[arg0].aBoolean442;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	public boolean method4956() {
		if (this.aClass218Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray32 == null) {
			if (!Static453.aClass117_189.method2979(this.anInt5948)) {
				return false;
			}
			@Pc(27) int[] local27 = Static453.aClass117_189.method2963(this.anInt5948);
			this.aByteArrayArray32 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray32[local34] = Static453.aClass117_189.method2962(local27[local34], this.anInt5948);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray32.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray32[local34];
			local82 = (local68[0] & 0xFF) << 8 | local68[1] & 0xFF;
			local59 &= Static456.aClass117_191.method2973(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class99 local103 = new Class99();
		local82 = Static453.aClass117_189.method2951(this.anInt5948);
		this.aClass218Array1 = new Class218[local82];
		@Pc(125) int[] local125 = Static453.aClass117_189.method2963(this.anInt5948);
		for (@Pc(127) int local127 = 0; local127 < local125.length; local127++) {
			@Pc(134) byte[] local134 = this.aByteArrayArray32[local127];
			@Pc(148) int local148 = (local134[0] & 0xFF) << 8 | local134[1] & 0xFF;
			@Pc(150) Class5_Sub44 local150 = null;
			for (@Pc(155) Class5_Sub44 local155 = (Class5_Sub44) local103.method2526(); local155 != null; local155 = (Class5_Sub44) local103.method2519()) {
				if (local148 == local155.anInt7814) {
					local150 = local155;
					break;
				}
			}
			if (local150 == null) {
				local150 = new Class5_Sub44(local148, Static456.aClass117_191.method2964(local148));
				local103.method2513(local150);
			}
			this.aClass218Array1[local125[local127]] = new Class218(local134, local150);
		}
		this.aByteArrayArray32 = null;
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Z")
	public boolean method4957(@OriginalArg(0) int arg0) {
		return this.aClass218Array1[arg0].aBoolean444;
	}
}

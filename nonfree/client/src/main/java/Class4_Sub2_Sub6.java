import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!cm", name = "A", descriptor = "[Lclient!rl;")
	public Class221[] aClass221Array1;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
	private final int anInt963;

	static {
		new Class15("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub6(@OriginalArg(0) int arg0) {
		this.anInt963 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z")
	public boolean method780(@OriginalArg(1) int arg0) {
		return this.aClass221Array1[arg0].aBoolean408;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Z")
	public boolean method781(@OriginalArg(1) int arg0) {
		return this.aClass221Array1[arg0].aBoolean407;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Z")
	public boolean method783(@OriginalArg(0) int arg0) {
		return this.aClass221Array1[arg0].aBoolean409;
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Z")
	public boolean method784() {
		if (this.aClass221Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray2 == null) {
			if (!Static177.aClass211_49.method4372(this.anInt963)) {
				return false;
			}
			@Pc(27) int[] local27 = Static177.aClass211_49.method4352(this.anInt963);
			this.aByteArrayArray2 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray2[local34] = Static177.aClass211_49.method4377(this.anInt963, local27[local34]);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray2.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray2[local34];
			local82 = (local68[0] & 0xFF) << 8 | local68[1] & 0xFF;
			local59 &= Static262.aClass211_70.method4382(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(107) Class244 local107 = new Class244();
		local82 = Static177.aClass211_49.method4365(this.anInt963);
		this.aClass221Array1 = new Class221[local82];
		@Pc(123) int[] local123 = Static177.aClass211_49.method4352(this.anInt963);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(132) byte[] local132 = this.aByteArrayArray2[local125];
			@Pc(146) int local146 = (local132[0] & 0xFF) << 8 | local132[1] & 0xFF;
			@Pc(148) Class4_Sub23 local148 = null;
			for (@Pc(153) Class4_Sub23 local153 = (Class4_Sub23) local107.method5263(); local153 != null; local153 = (Class4_Sub23) local107.method5271()) {
				if (local153.anInt4038 == local146) {
					local148 = local153;
					break;
				}
			}
			if (local148 == null) {
				local148 = new Class4_Sub23(local146, Static262.aClass211_70.method4353(local146));
				local107.method5273(local148);
			}
			this.aClass221Array1[local123[local125]] = new Class221(local132, local148);
		}
		this.aByteArrayArray2 = null;
		return true;
	}
}

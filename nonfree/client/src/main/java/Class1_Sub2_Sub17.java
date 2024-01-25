import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sba", name = "x", descriptor = "[Lclient!eaa;")
	public Class77[] aClass77Array1;

	@OriginalMember(owner = "client!sba", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!sba", name = "F", descriptor = "I")
	private final int anInt7697;

	static {
		new Class45("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub17(@OriginalArg(0) int arg0) {
		this.anInt7697 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(II)Z")
	public boolean method6816(@OriginalArg(0) int arg0) {
		return this.aClass77Array1[arg0].aBoolean176;
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)Z")
	public boolean method6817() {
		if (this.aClass77Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray23 == null) {
			if (!Static90.aClass69_24.method1911(this.anInt7697)) {
				return false;
			}
			@Pc(27) int[] local27 = Static90.aClass69_24.method1889(this.anInt7697);
			this.aByteArrayArray23 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray23[local34] = Static90.aClass69_24.method1888(local27[local34], this.anInt7697);
			}
		}
		@Pc(59) boolean local59 = true;
		@Pc(82) int local82;
		for (local34 = 0; local34 < this.aByteArrayArray23.length; local34++) {
			@Pc(68) byte[] local68 = this.aByteArrayArray23[local34];
			local82 = (local68[0] & 0xFF) << 8 | local68[1] & 0xFF;
			local59 &= Static143.aClass69_31.method1896(local82);
		}
		if (!local59) {
			return false;
		}
		@Pc(103) Class295 local103 = new Class295();
		local82 = Static90.aClass69_24.method1884(this.anInt7697);
		this.aClass77Array1 = new Class77[local82];
		@Pc(119) int[] local119 = Static90.aClass69_24.method1889(this.anInt7697);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray23[local121];
			@Pc(142) int local142 = local128[1] & 0xFF | (local128[0] & 0xFF) << 8;
			@Pc(144) Class1_Sub7 local144 = null;
			for (@Pc(149) Class1_Sub7 local149 = (Class1_Sub7) local103.method7543(); local149 != null; local149 = (Class1_Sub7) local103.method7540()) {
				if (local142 == local149.anInt1413) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class1_Sub7(local142, Static143.aClass69_31.method1890(local142));
				local103.method7533(local144);
			}
			this.aClass77Array1[local119[local121]] = new Class77(local128, local144);
		}
		this.aByteArrayArray23 = null;
		return true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)Z")
	public boolean method6818(@OriginalArg(1) int arg0) {
		return this.aClass77Array1[arg0].aBoolean177;
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(II)Z")
	public boolean method6820(@OriginalArg(1) int arg0) {
		return this.aClass77Array1[arg0].aBoolean175;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class10_Sub1_Sub4 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "[Lclient!nj;")
	public Class174[] aClass174Array1;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
	private final int anInt1930;

	static {
		new Class182(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class10_Sub1_Sub4(@OriginalArg(0) int arg0) {
		this.anInt1930 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Z")
	public boolean method1706(@OriginalArg(1) int arg0) {
		return this.aClass174Array1[arg0].aBoolean321;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z")
	public boolean method1708() {
		if (this.aClass174Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray15 == null) {
			if (!Static394.aClass187_117.method4287(this.anInt1930)) {
				return false;
			}
			@Pc(27) int[] local27 = Static394.aClass187_117.method4291(this.anInt1930);
			this.aByteArrayArray15 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray15[local34] = Static394.aClass187_117.method4300(this.anInt1930, local27[local34]);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray15.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray15[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static211.aClass187_73.method4282(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(99) Class163 local99 = new Class163();
		local78 = Static394.aClass187_117.method4306(this.anInt1930);
		this.aClass174Array1 = new Class174[local78];
		@Pc(126) int[] local126 = Static394.aClass187_117.method4291(this.anInt1930);
		for (@Pc(128) int local128 = 0; local128 < local126.length; local128++) {
			@Pc(135) byte[] local135 = this.aByteArrayArray15[local128];
			@Pc(149) int local149 = (local135[0] & 0xFF) << 8 | local135[1] & 0xFF;
			@Pc(151) Class10_Sub13 local151 = null;
			for (@Pc(156) Class10_Sub13 local156 = (Class10_Sub13) local99.method3620(); local156 != null; local156 = (Class10_Sub13) local99.method3621()) {
				if (local149 == local156.anInt1843) {
					local151 = local156;
					break;
				}
			}
			if (local151 == null) {
				local151 = new Class10_Sub13(local149, Static211.aClass187_73.method4303(local149));
				local99.method3613(local151);
			}
			this.aClass174Array1[local126[local128]] = new Class174(local135, local151);
		}
		this.aByteArrayArray15 = null;
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)Z")
	public boolean method1709(@OriginalArg(1) int arg0) {
		return this.aClass174Array1[arg0].aBoolean322;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(ZI)Z")
	public boolean method1711(@OriginalArg(1) int arg0) {
		return this.aClass174Array1[arg0].aBoolean323;
	}
}

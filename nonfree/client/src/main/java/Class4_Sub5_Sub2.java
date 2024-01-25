import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class4_Sub5_Sub2 extends Class4_Sub5 {

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bca", name = "z", descriptor = "[Lclient!dr;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!bca", name = "B", descriptor = "I")
	private final int anInt494;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(I)V")
	public Class4_Sub5_Sub2(@OriginalArg(0) int arg0) {
		this.anInt494 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)Z")
	public boolean method440() {
		if (this.aClass70Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray3 == null) {
			@Pc(15) Class176 local15 = Static307.aClass176_80;
			synchronized (Static307.aClass176_80) {
				if (!Static307.aClass176_80.method3991(this.anInt494)) {
					return false;
				}
				local35 = Static307.aClass176_80.method4002(this.anInt494);
				this.aByteArrayArray3 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray3[local42] = Static307.aClass176_80.method3994(local35[local42], this.anInt494);
				}
			}
		}
		@Pc(73) boolean local73 = true;
		for (@Pc(75) int local75 = 0; local75 < this.aByteArrayArray3.length; local75++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray3[local75];
			@Pc(87) Class4_Sub11 local87 = new Class4_Sub11(local82);
			local87.anInt5831 = 1;
			local42 = local87.method4936();
			@Pc(96) Class176 local96 = Static512.aClass176_126;
			synchronized (Static512.aClass176_126) {
				local73 &= Static512.aClass176_126.method3996(local42);
			}
		}
		if (!local73) {
			return false;
		}
		@Pc(125) Class244 local125 = new Class244();
		@Pc(127) Class176 local127 = Static307.aClass176_80;
		synchronized (Static307.aClass176_80) {
			@Pc(142) int local142 = Static307.aClass176_80.method3999(this.anInt494);
			this.aClass70Array1 = new Class70[local142];
			local35 = Static307.aClass176_80.method4002(this.anInt494);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(167) byte[] local167 = this.aByteArrayArray3[local42];
			@Pc(172) Class4_Sub11 local172 = new Class4_Sub11(local167);
			local172.anInt5831 = 1;
			@Pc(179) int local179 = local172.method4936();
			@Pc(181) Class4_Sub34 local181 = null;
			for (@Pc(186) Class4_Sub34 local186 = (Class4_Sub34) local125.method5963(); local186 != null; local186 = (Class4_Sub34) local125.method5965()) {
				if (local179 == local186.anInt7711) {
					local181 = local186;
					break;
				}
			}
			if (local181 == null) {
				@Pc(210) Class176 local210 = Static512.aClass176_126;
				synchronized (Static512.aClass176_126) {
					local181 = new Class4_Sub34(local179, Static512.aClass176_126.method4005(local179));
				}
				local125.method5960(local181);
			}
			this.aClass70Array1[local35[local42]] = new Class70(local167, local181);
		}
		this.aByteArrayArray3 = null;
		return true;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Z")
	public boolean method442(@OriginalArg(1) int arg0) {
		return this.aClass70Array1[arg0].aBoolean163;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(BI)Z")
	public boolean method445(@OriginalArg(1) int arg0) {
		return this.aClass70Array1[arg0].aBoolean162;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Z")
	public boolean method446(@OriginalArg(1) int arg0) {
		return this.aClass70Array1[arg0].aBoolean161;
	}
}

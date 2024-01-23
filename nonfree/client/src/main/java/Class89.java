import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class89 {

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[Lclient!ia;")
	public Class65[] aClass65Array1;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
	public int anInt3038;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "Lclient!ia;")
	public Class65 aClass65_1;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([BI)V")
	public Class89(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3043 = Static149.method2599(arg0, arg0.length);
		if (this.anInt3043 != arg1) {
			throw new RuntimeException();
		}
		this.method2342(arg0);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[B)V")
	private void method2342(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(Static207.method3771(arg0));
		@Pc(12) int local12 = local8.method2690();
		if (local12 != 5 && local12 != 6) {
			throw new RuntimeException();
		}
		if (local12 < 6) {
			this.anInt3041 = 0;
		} else {
			this.anInt3041 = local8.method2643();
		}
		@Pc(44) int local44 = -1;
		@Pc(48) int local48 = local8.method2690();
		@Pc(50) int local50 = 0;
		this.anInt3038 = local8.method2691();
		this.anIntArray276 = new int[this.anInt3038];
		@Pc(62) int local62;
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			this.anIntArray276[local62] = local50 += local8.method2691();
			if (local44 < this.anIntArray276[local62]) {
				local44 = this.anIntArray276[local62];
			}
		}
		this.anInt3040 = local44 + 1;
		this.anIntArray274 = new int[this.anInt3040];
		this.anIntArray279 = new int[this.anInt3040];
		this.anIntArray278 = new int[this.anInt3040];
		this.anIntArray277 = new int[this.anInt3040];
		this.anIntArrayArray12 = new int[this.anInt3040][];
		if (local48 != 0) {
			this.anIntArray275 = new int[this.anInt3040];
			for (local62 = 0; local62 < this.anInt3040; local62++) {
				this.anIntArray275[local62] = -1;
			}
			for (local62 = 0; local62 < this.anInt3038; local62++) {
				this.anIntArray275[this.anIntArray276[local62]] = local8.method2643();
			}
			this.aClass65_1 = new Class65(this.anIntArray275);
		}
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			this.anIntArray274[this.anIntArray276[local62]] = local8.method2643();
		}
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			this.anIntArray277[this.anIntArray276[local62]] = local8.method2643();
		}
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			this.anIntArray278[this.anIntArray276[local62]] = local8.method2691();
		}
		@Pc(262) int local262;
		@Pc(267) int local267;
		@Pc(257) int local257;
		@Pc(275) int local275;
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			local50 = 0;
			local257 = -1;
			local262 = this.anIntArray276[local62];
			local267 = this.anIntArray278[local262];
			this.anIntArrayArray12[local262] = new int[local267];
			for (local275 = 0; local275 < local267; local275++) {
				@Pc(293) int local293 = this.anIntArrayArray12[local262][local275] = local50 += local8.method2691();
				if (local293 > local257) {
					local257 = local293;
				}
			}
			this.anIntArray279[local262] = local257 + 1;
			if (local267 == local257 + 1) {
				this.anIntArrayArray12[local262] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.anIntArrayArray11 = new int[local44 + 1][];
		this.aClass65Array1 = new Class65[local44 + 1];
		for (local62 = 0; local62 < this.anInt3038; local62++) {
			local262 = this.anIntArray276[local62];
			local267 = this.anIntArray278[local262];
			this.anIntArrayArray11[local262] = new int[this.anIntArray279[local262]];
			for (local257 = 0; local257 < this.anIntArray279[local262]; local257++) {
				this.anIntArrayArray11[local262][local257] = -1;
			}
			for (local257 = 0; local257 < local267; local257++) {
				if (this.anIntArrayArray12[local262] == null) {
					local275 = local257;
				} else {
					local275 = this.anIntArrayArray12[local262][local257];
				}
				this.anIntArrayArray11[local262][local275] = local8.method2643();
			}
			this.aClass65Array1[local262] = new Class65(this.anIntArrayArray11[local262]);
		}
	}
}

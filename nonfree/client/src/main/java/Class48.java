import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class48 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "F")
	public float aFloat10 = 1.0F;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "F")
	public float aFloat13 = 1.0F;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
	public float aFloat12 = 0.25F;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public final int anInt1308;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "F")
	public final float aFloat11;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public final int anInt1307;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public final int anInt1311;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public final int anInt1304;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!vm;")
	public final Class130 aClass130_2;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public final int anInt1305;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public final int anInt1309;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "F")
	public final float aFloat14;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "F")
	public final float aFloat15;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray1[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray1[local18] = (char) (local18 + 71);
		}
		for (@Pc(32) int local32 = 52; local32 < 62; local32++) {
			aCharArray1[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray1[63] = '-';
		aCharArray1[62] = '*';
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class48() {
		this.anInt1308 = -50;
		this.aFloat11 = 1.2F;
		this.anInt1307 = Static444.anInt7592;
		this.anInt1311 = -60;
		this.anInt1304 = Static375.anInt6228;
		this.aClass130_2 = Static575.aClass130_3;
		this.anInt1305 = -50;
		this.anInt1309 = 0;
		this.aFloat14 = 0.69921875F;
		this.aFloat15 = 1.1523438F;
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ofa;)V")
	public Class48(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(16) int local16 = arg0.method5966();
		if (Static97.aClass5_Sub25_8.aClass6_Sub17_1.method5097() == 1 && Static550.aClass133_14.method7245() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1307 = Static444.anInt7592;
			} else {
				this.anInt1307 = arg0.method5913();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat15 = 1.1523438F;
			} else {
				this.aFloat15 = (float) arg0.method5968() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat14 = 0.69921875F;
			} else {
				this.aFloat14 = (float) arg0.method5968() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat11 = 1.2F;
			} else {
				this.aFloat11 = (float) arg0.method5968() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5913();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5968();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5968();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5968();
			}
			this.aFloat14 = 0.69921875F;
			this.aFloat15 = 1.1523438F;
			this.anInt1307 = Static444.anInt7592;
			this.aFloat11 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1305 = -50;
			this.anInt1311 = -60;
			this.anInt1308 = -50;
		} else {
			this.anInt1305 = arg0.method5956();
			this.anInt1311 = arg0.method5956();
			this.anInt1308 = arg0.method5956();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1304 = Static375.anInt6228;
		} else {
			this.anInt1304 = arg0.method5913();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1309 = 0;
		} else {
			this.anInt1309 = arg0.method5968();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass130_2 = Static575.aClass130_3;
		} else {
			@Pc(219) int local219 = arg0.method5968();
			@Pc(223) int local223 = arg0.method5968();
			@Pc(227) int local227 = arg0.method5968();
			@Pc(231) int local231 = arg0.method5968();
			@Pc(235) int local235 = arg0.method5968();
			@Pc(239) int local239 = arg0.method5968();
			this.aClass130_2 = Static376.method5534(local239, local227, local231, local219, local235, local223);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!cd;)Z")
	public boolean method1047(@OriginalArg(1) Class48 arg0) {
		return this.anInt1307 == arg0.anInt1307 && this.aFloat15 == arg0.aFloat15 && arg0.aFloat14 == this.aFloat14 && this.aFloat11 == arg0.aFloat11 && this.aFloat12 == arg0.aFloat12 && arg0.aFloat10 == this.aFloat10 && arg0.aFloat13 == this.aFloat13 && arg0.anInt1304 == this.anInt1304 && this.anInt1309 == arg0.anInt1309 && this.aClass130_2 == arg0.aClass130_2;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method1050(@OriginalArg(1) Class5_Sub22 arg0) {
		this.aFloat10 = (float) (arg0.method5966() * 8) / 255.0F;
		this.aFloat12 = (float) (arg0.method5966() * 8) / 255.0F;
		this.aFloat13 = (float) (arg0.method5966() * 8) / 255.0F;
	}
}

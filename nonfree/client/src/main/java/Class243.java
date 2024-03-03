import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class243 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "[I")
	public static final int[] anIntArray482 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray64 = new boolean[100];

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "J")
	public static long aLong221 = -1L;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!nk;")
	public static Class161 aClass161_14 = null;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!h;")
	public static final Class89 aClass89_246;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "I")
	public static int anInt7038;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	private int anInt7028 = -1;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int anInt7035 = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!ld;")
	private Class135 aClass135_42 = new Class135();

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean aBoolean478 = false;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int anInt7036;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	private final int anInt7027;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[Lclient!wh;")
	private Class2_Sub43[] aClass2_Sub43Array1;

	static {
		new Class79("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
		aClass89_246 = new Class89(75, 0);
		anInt7038 = 0;
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(III)V", line = 280)
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7036 = arg0;
		this.anInt7027 = arg1;
		this.anIntArrayArrayArray14 = new int[this.anInt7036][3][arg2];
		this.aClass2_Sub43Array1 = new Class2_Sub43[this.anInt7027];
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I", line = 3)
	public int[][] method6278(@OriginalArg(0) int arg0) {
		if (this.anInt7027 == this.anInt7036) {
			this.aBoolean478 = this.aClass2_Sub43Array1[arg0] == null;
			this.aClass2_Sub43Array1[arg0] = Class128.aClass2_Sub43_1;
			return this.anIntArrayArrayArray14[arg0];
		} else if (this.anInt7036 == 1) {
			this.aBoolean478 = arg0 != this.anInt7028;
			this.anInt7028 = arg0;
			return this.anIntArrayArrayArray14[0];
		} else {
			@Pc(30) Class2_Sub43 local30 = this.aClass2_Sub43Array1[arg0];
			if (local30 == null) {
				this.aBoolean478 = true;
				if (this.anInt7035 >= this.anInt7036) {
					@Pc(55) Class2_Sub43 local55 = (Class2_Sub43) this.aClass135_42.method3549();
					local30 = new Class2_Sub43(arg0, local55.anInt7164);
					this.aClass2_Sub43Array1[local55.anInt7163] = null;
					local55.method6469();
				} else {
					local30 = new Class2_Sub43(arg0, this.anInt7035);
					this.anInt7035++;
				}
				this.aClass2_Sub43Array1[arg0] = local30;
			} else {
				this.aBoolean478 = false;
			}
			this.aClass135_42.method3546(local30);
			return this.anIntArrayArrayArray14[local30.anInt7164];
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)[[[I", line = 161)
	public int[][][] method6281() {
		if (this.anInt7027 != this.anInt7036) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.anInt7036; local28++) {
			this.aClass2_Sub43Array1[local28] = Class128.aClass2_Sub43_1;
		}
		return this.anIntArrayArrayArray14;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 219)
	public void method6284() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7036; local3++) {
			this.anIntArrayArrayArray14[local3][0] = null;
			this.anIntArrayArrayArray14[local3][1] = null;
			this.anIntArrayArrayArray14[local3][2] = null;
			this.anIntArrayArrayArray14[local3] = null;
		}
		this.aClass2_Sub43Array1 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass135_42.method3545();
		this.aClass135_42 = null;
	}
}

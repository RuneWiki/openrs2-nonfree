import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class154 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	private int anInt3964 = -1;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
	private int anInt3970 = 0;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Lclient!nv;")
	private Class177 aClass177_25 = new Class177();

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
	public boolean aBoolean254 = false;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
	private final int anInt3968;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private final int anInt3973;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "[Lclient!dc;")
	private Class5_Sub9[] aClass5_Sub9Array1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	static {
		new Class198("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(III)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3968 = arg1;
		this.anInt3973 = arg0;
		this.aClass5_Sub9Array1 = new Class5_Sub9[this.anInt3968];
		this.anIntArrayArrayArray13 = new int[this.anInt3973][3][arg2];
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	public void method3173() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3973; local7++) {
			this.anIntArrayArrayArray13[local7][0] = null;
			this.anIntArrayArrayArray13[local7][1] = null;
			this.anIntArrayArrayArray13[local7][2] = null;
			this.anIntArrayArrayArray13[local7] = null;
		}
		this.aClass5_Sub9Array1 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass177_25.method3614();
		this.aClass177_25 = null;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)[[[I")
	public int[][][] method3175() {
		if (this.anInt3968 != this.anInt3973) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt3973; local21++) {
			this.aClass5_Sub9Array1[local21] = Static180.aClass5_Sub9_1;
		}
		return this.anIntArrayArrayArray13;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[[I")
	public int[][] method3176(@OriginalArg(1) int arg0) {
		if (this.anInt3973 == this.anInt3968) {
			this.aBoolean254 = this.aClass5_Sub9Array1[arg0] == null;
			this.aClass5_Sub9Array1[arg0] = Static180.aClass5_Sub9_1;
			return this.anIntArrayArrayArray13[arg0];
		} else if (this.anInt3973 == 1) {
			this.aBoolean254 = arg0 != this.anInt3964;
			this.anInt3964 = arg0;
			return this.anIntArrayArrayArray13[0];
		} else {
			@Pc(46) Class5_Sub9 local46 = this.aClass5_Sub9Array1[arg0];
			if (local46 == null) {
				this.aBoolean254 = true;
				if (this.anInt3973 > this.anInt3970) {
					local46 = new Class5_Sub9(arg0, this.anInt3970);
					this.anInt3970++;
				} else {
					@Pc(81) Class5_Sub9 local81 = (Class5_Sub9) this.aClass177_25.method3617();
					local46 = new Class5_Sub9(arg0, local81.anInt1273);
					this.aClass5_Sub9Array1[local81.anInt1277] = null;
					local81.method6003();
				}
				this.aClass5_Sub9Array1[arg0] = local46;
			} else {
				this.aBoolean254 = false;
			}
			this.aClass177_25.method3611(local46);
			return this.anIntArrayArrayArray13[local46.anInt1273];
		}
	}
}

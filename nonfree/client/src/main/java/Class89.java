import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class89 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	public int anInt2932;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
	public int anInt2933;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	public int anInt2934;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
	public int anInt2936;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public int anInt2937;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
	public int anInt2941;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public int anInt2942;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
	public int anInt2945;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
	public int anInt2947;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!hq;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
	public final int anInt2938;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	public final int anInt2946;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "B")
	public final byte aByte33;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	public final int anInt2939;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	public final int anInt2944;

	static {
		new Class159("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
		new Class159("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIB)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt2938 = arg2;
		this.anInt2946 = arg1;
		this.aByte33 = arg4;
		this.anInt2939 = arg3;
		this.anInt2944 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!hq;I)V")
	public Class89(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		this.aClass89_1 = arg0;
		this.aByte33 = this.aClass89_1.aByte33;
		this.anInt2946 = arg1 + this.aClass89_1.anInt2946;
		this.anInt2939 = arg1 + this.aClass89_1.anInt2939;
		this.anInt2938 = this.aClass89_1.anInt2938 + arg1;
		this.anInt2944 = this.aClass89_1.anInt2944;
	}
}

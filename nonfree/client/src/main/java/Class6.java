import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class6 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public int anInt222;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!ai;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public int anInt229;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public final int anInt224;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public final int anInt227;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public final int anInt233;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public final int anInt225;

	static {
		new Class106("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIB)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte2 = arg4;
		this.anInt224 = arg0;
		this.anInt227 = arg1;
		this.anInt233 = arg3;
		this.anInt225 = arg2;
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ai;I)V")
	public Class6(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		this.aClass6_1 = arg0;
		this.anInt225 = arg1 + this.aClass6_1.anInt225;
		this.anInt227 = arg1 + this.aClass6_1.anInt227;
		this.anInt233 = arg1 + this.aClass6_1.anInt233;
		this.aByte2 = this.aClass6_1.aByte2;
		this.anInt224 = this.aClass6_1.anInt224;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class82 {

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Lclient!um;")
	private final Class243 aClass243_68;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
	public final int anInt2203;

	static {
		new Class198("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class82(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		new Class44(64);
		this.aClass243_68 = arg2;
		this.anInt2203 = this.aClass243_68.method5472(15);
	}
}

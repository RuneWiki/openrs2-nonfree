import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class Class30 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	protected final int anInt8661;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public final int anInt8662;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public final int anInt8664;

	static {
		new Class67("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(III)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8661 = arg2;
		this.anInt8662 = arg1;
		this.anInt8664 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public abstract void method7125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V")
	public abstract void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZ)V")
	public abstract void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

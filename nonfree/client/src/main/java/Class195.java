import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public final class Class195 {

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "Lclient!oh;")
	private final Class237 aClass237_83;

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
	public final int anInt6356;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class195(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		new Class236(64);
		this.aClass237_83 = arg2;
		this.anInt6356 = this.aClass237_83.method6315(15);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class27 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_10;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
	public final int anInt556;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class27(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		new Class6(64);
		this.aClass322_10 = arg2;
		this.anInt556 = this.aClass322_10.method6831(15);
	}
}

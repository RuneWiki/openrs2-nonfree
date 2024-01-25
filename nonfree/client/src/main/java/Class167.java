import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class167 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!mg;")
	private final Class160 aClass160_53;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
	public final int anInt4751;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;)V")
	public Class167(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		new Class171(64);
		this.aClass160_53 = arg2;
		this.anInt4751 = this.aClass160_53.method3722(15);
	}
}

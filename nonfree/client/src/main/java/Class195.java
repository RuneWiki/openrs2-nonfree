import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class195 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_76;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class195(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		new Class233(64);
		this.aClass97_76 = arg2;
		this.anInt5618 = this.aClass97_76.method2569(15);
	}
}

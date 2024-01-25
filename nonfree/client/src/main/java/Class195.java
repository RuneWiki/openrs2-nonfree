import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class195 implements Interface17 {

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_69;

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString70;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lclient!ni;Ljava/lang/String;)V")
	public Class195(@OriginalArg(0) Class223 arg0, @OriginalArg(1) String arg1) {
		this.aClass223_69 = arg0;
		this.aString70 = arg1;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Lclient!mk;")
	@Override
	public Class206 method6325() {
		return Static354.aClass206_3;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I")
	@Override
	public int method6326() {
		return this.aClass223_69.method5943(this.aString70) ? 100 : 0;
	}
}

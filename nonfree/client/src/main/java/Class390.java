import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public final class Class390 {

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "Lclient!rg;")
	private final Class310 aClass310_137;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	public final int anInt10949;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class390(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		new Class317(64);
		this.aClass310_137 = arg2;
		this.anInt10949 = this.aClass310_137.method7773(15);
	}
}

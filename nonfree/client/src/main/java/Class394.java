import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class394 {

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "Lclient!lga;")
	private final Class223 aClass223_123;

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
	public final int anInt10345;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class394(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		new Class359(64);
		this.aClass223_123 = arg2;
		this.anInt10345 = this.aClass223_123.method5264(15);
	}
}

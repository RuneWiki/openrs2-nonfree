import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class255 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!ni;")
	private final Class223 aClass223_94;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public final int anInt7802;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class255(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		new Class94(64);
		this.aClass223_94 = arg2;
		this.anInt7802 = this.aClass223_94.method5970(15);
	}
}

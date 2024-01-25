import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class49 {

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!la;")
	private final Class208 aClass208_10;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public final int anInt842;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class49(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		new Class391(64);
		this.aClass208_10 = arg2;
		this.anInt842 = this.aClass208_10.method5005(15);
	}
}

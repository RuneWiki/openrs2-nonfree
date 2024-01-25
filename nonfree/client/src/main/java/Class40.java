import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class40 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!uq;")
	private final Class362 aClass362_12;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public final int anInt1175;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class40(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		new Class295(64);
		this.aClass362_12 = arg2;
		this.anInt1175 = this.aClass362_12.method8355(15);
	}
}

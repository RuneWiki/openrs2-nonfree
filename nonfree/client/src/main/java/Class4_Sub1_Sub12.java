import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!uv", name = "p", descriptor = "Ljava/lang/String;")
	private String aString118;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	private int anInt9719;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5948(this.aString118, this.anInt9719);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt9719 = arg0.method8850();
		this.aString118 = arg0.method8853();
	}
}

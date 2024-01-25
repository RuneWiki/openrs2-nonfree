import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class278 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!vo;")
	private final Class348 aClass348_102;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public final int anInt8343;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class278(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		new Class167(64);
		this.aClass348_102 = arg2;
		this.anInt8343 = this.aClass348_102.method7981(15);
	}
}

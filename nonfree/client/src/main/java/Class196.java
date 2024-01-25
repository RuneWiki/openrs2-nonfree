import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class Class196 implements Interface24 {

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public final int anInt9132;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public final int anInt9127;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Lclient!kda;")
	public final Class173 aClass173_11;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!cu;")
	public final Class60 aClass60_10;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public final int anInt9129;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILclient!kda;Lclient!cu;II)V")
	public Class196(@OriginalArg(0) int arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9132 = arg0;
		this.anInt9127 = arg3;
		this.aClass173_11 = arg1;
		this.aClass60_10 = arg2;
		this.anInt9129 = arg4;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static81.aClass138_1;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class Class14 implements Interface18 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public final int anInt357;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Lclient!kr;")
	public final Class216 aClass216_2;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public final int anInt354;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public final int anInt359;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!qk;")
	public final Class304 aClass304_2;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(ILclient!qk;Lclient!kr;II)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt357 = arg3;
		this.aClass216_2 = arg2;
		this.anInt354 = arg0;
		this.anInt359 = arg4;
		this.aClass304_2 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static198.aClass409_5;
	}
}

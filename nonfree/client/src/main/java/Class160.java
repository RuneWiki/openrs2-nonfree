import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class160 implements Interface2 {

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "Lclient!in;")
	public final Class168 aClass168_9;

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "Z")
	public final boolean aBoolean305;

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "I")
	public final int anInt4375;

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "Lclient!ti;")
	public final Class339 aClass339_8;

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
	public final int anInt4372;

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
	public final int anInt4376;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
	public final int anInt4368;

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
	public final int anInt4370;

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
	public final int anInt4373;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	public final int anInt4371;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
	public final int anInt4369;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(ILclient!in;Lclient!ti;IIIIIIIZ)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class339 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.aClass168_9 = arg1;
		this.aBoolean305 = arg10;
		this.anInt4375 = arg9;
		this.aClass339_8 = arg2;
		this.anInt4372 = arg8;
		this.anInt4376 = arg4;
		this.anInt4368 = arg0;
		this.anInt4370 = arg5;
		this.anInt4373 = arg6;
		this.anInt4371 = arg7;
		this.anInt4369 = arg3;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static558.aClass310_16;
	}
}

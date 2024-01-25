import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!gl;")
	public final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!sf;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface11_6 = arg0.method6301(Static550.aClass361_15, arg2, arg1, arg3, false);
		this.anInterface11_6.method8761(false, false);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!sf;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface11_6 = arg0.method6276(arg2, false, arg1, arg3);
		this.anInterface11_6.method8761(false, false);
	}
}

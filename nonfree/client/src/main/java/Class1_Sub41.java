import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "Ljava/lang/String;")
	public String aString253;

	@OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
	public final int anInt6347;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
	public final int anInt6340;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString254;

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
	public final int anInt6345;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "J")
	public final long aLong206;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
	public Class1_Sub41(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aString253 = arg1;
		this.anInt6347 = arg5;
		this.anInt6340 = arg6;
		this.anInt6339 = arg3;
		this.aString254 = arg0;
		this.anInt6345 = arg2;
		this.aLong206 = arg4;
	}
}

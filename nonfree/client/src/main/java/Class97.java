import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class Class97 implements Interface24 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public final int anInt6629;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
	public final int anInt6633;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "Lclient!ut;")
	public final Class335 aClass335_13;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "Lclient!gi;")
	public final Class122 aClass122_12;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public final int anInt6628;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILclient!ut;Lclient!gi;II)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6629 = arg3;
		this.anInt6633 = arg0;
		this.aClass335_13 = arg1;
		this.aClass122_12 = arg2;
		this.anInt6628 = arg4;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static31.aClass297_3;
	}
}

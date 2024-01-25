import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class Class167 implements Interface24 {

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!ega;")
	public final Class79 aClass79_16;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	public final int anInt6589;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "Lclient!og;")
	public final Class238 aClass238_11;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
	public final int anInt6590;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILclient!og;Lclient!ega;II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass79_16 = arg2;
		this.anInt6589 = arg4;
		this.anInt6595 = arg3;
		this.aClass238_11 = arg1;
		this.anInt6590 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static378.aClass152_8;
	}
}

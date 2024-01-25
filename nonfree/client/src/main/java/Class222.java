import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class Class222 implements Interface18 {

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!cf;")
	public final Class56 aClass56_13;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!ur;")
	public final Class356 aClass356_11;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public final int anInt6028;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public final int anInt6030;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
	public final int anInt6031;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILclient!ur;Lclient!cf;II)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass56_13 = arg2;
		this.aClass356_11 = arg1;
		this.anInt6028 = arg0;
		this.anInt6030 = arg3;
		this.anInt6031 = arg4;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static237.aClass146_17;
	}
}

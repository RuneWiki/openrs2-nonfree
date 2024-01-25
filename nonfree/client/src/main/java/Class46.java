import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class Class46 implements Interface24 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public final int anInt783;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public final int anInt777;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public final int anInt784;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!pf;")
	public final Class275 aClass275_5;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!dg;")
	public final Class81 aClass81_3;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(ILclient!pf;Lclient!dg;II)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt783 = arg4;
		this.anInt777 = arg0;
		this.anInt784 = arg3;
		this.aClass275_5 = arg1;
		this.aClass81_3 = arg2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static490.aClass139_8;
	}
}

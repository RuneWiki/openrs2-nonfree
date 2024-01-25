import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class Class137 implements Interface15 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public final int anInt4034;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	public final int anInt4035;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!rj;")
	public final Class318 aClass318_11;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!mq;")
	public final Class238 aClass238_6;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public final int anInt4036;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILclient!rj;Lclient!mq;II)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) Class318 arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4034 = arg4;
		this.anInt4035 = arg0;
		this.aClass318_11 = arg1;
		this.aClass238_6 = arg2;
		this.anInt4036 = arg3;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static12.aClass369_2;
	}
}

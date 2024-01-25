import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class Class102 implements Interface24 {

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
	public final int anInt2633;

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "Lclient!rq;")
	public final Class306 aClass306_6;

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
	public final int anInt2636;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "Lclient!vfa;")
	public final Class361 aClass361_5;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(ILclient!vfa;Lclient!rq;II)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2633 = arg4;
		this.aClass306_6 = arg2;
		this.anInt2634 = arg0;
		this.anInt2636 = arg3;
		this.aClass361_5 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static559.aClass8_10;
	}
}

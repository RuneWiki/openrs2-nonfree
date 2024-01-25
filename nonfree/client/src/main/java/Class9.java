import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class Class9 implements Interface22 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "Lclient!dba;")
	public final Class63 aClass63_12;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
	public final int anInt4466;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	public final int anInt4463;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Lclient!pa;")
	public final Class249 aClass249_11;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
	public final int anInt4468;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(ILclient!dba;Lclient!pa;II)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class249 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass63_12 = arg1;
		this.anInt4466 = arg0;
		this.anInt4463 = arg4;
		this.aClass249_11 = arg2;
		this.anInt4468 = arg3;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static578.aClass140_18;
	}
}

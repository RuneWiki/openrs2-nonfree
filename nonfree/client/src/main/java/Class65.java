import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class Class65 implements Interface22 {

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	public final int anInt5462;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Lclient!pa;")
	public final Class249 aClass249_16;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public final int anInt5460;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public final int anInt5458;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public final int anInt5457;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
	public final int anInt5461;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!dba;")
	public final Class63 aClass63_16;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public final int anInt5463;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public final int anInt5459;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!dba;Lclient!pa;IIIIIII)V")
	public Class65(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5462 = arg4;
		this.aClass249_16 = arg1;
		this.anInt5460 = arg3;
		this.anInt5458 = arg8;
		this.anInt5457 = arg2;
		this.anInt5461 = arg5;
		this.aClass63_16 = arg0;
		this.anInt5463 = arg6;
		this.anInt5459 = arg7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return null;
	}
}

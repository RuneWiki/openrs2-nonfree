import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class184 {

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public int anInt4424;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!ip;")
	public Class184 aClass184_1;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	public int anInt4427;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	public int anInt4429;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public int anInt4430;

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
	public int anInt4431;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	public int anInt4434;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public int anInt4438;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
	public int anInt4440;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	private final int anInt4433;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	public final int anInt4428;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
	public final int anInt4439;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "I")
	public final int anInt4426;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIIB)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte65 = arg4;
		this.anInt4433 = arg0;
		this.anInt4428 = arg1;
		this.anInt4439 = arg3;
		this.anInt4426 = arg2;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBII)Lclient!ip;")
	public Class184 method4040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class184(this.anInt4433, arg0, arg2, arg1, this.aByte65);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)Lclient!js;")
	public Class201 method4042() {
		return Static181.method2882(this.anInt4433);
	}
}

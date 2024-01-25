import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class154 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!pd;")
	public Class154 aClass154_1;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public int anInt4575;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public int anInt4576;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	public int anInt4579;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	public int anInt4582;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	public int anInt4585;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public final int anInt4580;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public final int anInt4572;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	public final int anInt4578;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public final int anInt4573;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIB)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte47 = arg4;
		this.anInt4580 = arg3;
		this.anInt4572 = arg0;
		this.anInt4578 = arg1;
		this.anInt4573 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!pd;I)V")
	public Class154(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1) {
		this.aClass154_1 = arg0;
		this.anInt4573 = this.aClass154_1.anInt4573 + arg1;
		this.aByte47 = this.aClass154_1.aByte47;
		this.anInt4572 = this.aClass154_1.anInt4572;
		this.anInt4578 = arg1 + this.aClass154_1.anInt4578;
		this.anInt4580 = arg1 + this.aClass154_1.anInt4580;
	}
}

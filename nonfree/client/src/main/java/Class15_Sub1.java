import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	public int anInt7577;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	public int anInt7574;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
	public int anInt7582;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	public final int anInt7585;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
	public final int anInt7584;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	protected final int anInt7580;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7577 = arg5;
		this.anInt7574 = arg4;
		this.anInt7582 = arg0;
		this.anInt7585 = arg3;
		this.anInt7584 = arg6;
		this.anInt7573 = arg2;
		this.anInt7580 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public final void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public final void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
	public abstract int method6155();
}

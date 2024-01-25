import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class120_Sub4 extends Class120 {

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	private final int anInt10816;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private final int anInt10817;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	private final int anInt10804;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	private final int anInt10815;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	private final int anInt10810;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	private final int anInt10813;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	private final int anInt10808;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	private final int anInt10805;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class120_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt10816 = arg6;
		this.anInt10817 = arg2;
		this.anInt10804 = arg5;
		this.anInt10815 = arg1;
		this.anInt10810 = arg4;
		this.anInt10813 = arg3;
		this.anInt10808 = arg7;
		this.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IBI)V")
	@Override
	public void method9430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	@Override
	public void method9432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt10805 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt10815 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt10817 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt10813 * arg1 >> 12;
		@Pc(46) int local46 = this.anInt10810 * arg0 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt10804 >> 12;
		@Pc(60) int local60 = this.anInt10816 * arg0 >> 12;
		@Pc(67) int local67 = this.anInt10808 * arg1 >> 12;
		Static448.method6544(local46, local10, local24, local31, local67, local53, super.anInt10799, local17, local60);
	}
}

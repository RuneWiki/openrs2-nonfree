import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class2_Sub54 extends Class2 {

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
	public final int anInt10660;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
	private final int anInt10671;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
	private final int anInt10664;

	@OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
	private final int anInt10663;

	@OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
	private final int anInt10670;

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
	public final int anInt10668;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	private final int anInt10669;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public final int anInt10674;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
	public final int anInt10662;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10660 = arg7;
		this.anInt10671 = arg0;
		this.anInt10664 = arg1;
		this.anInt10663 = arg4;
		this.anInt10670 = arg2;
		this.anInt10668 = arg5;
		this.anInt10669 = arg3;
		this.anInt10674 = arg8;
		this.anInt10662 = arg6;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBI[I)V")
	public void method9338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt10668 + arg0 - this.anInt10664;
		arg2[2] = this.anInt10662 + arg1 - this.anInt10670;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)Z")
	public boolean method9340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt10664 && arg1 <= this.anInt10669 && this.anInt10670 <= arg0 && arg0 <= this.anInt10663;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I[III)V")
	public void method9341(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt10670 + arg2 - this.anInt10662;
		arg0[1] = this.anInt10664 + arg1 - this.anInt10668;
		arg0[0] = this.anInt10671;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIII)Z")
	public boolean method9342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt10671 == arg2 && this.anInt10664 <= arg0 && this.anInt10669 >= arg0 && this.anInt10670 <= arg1 && this.anInt10663 >= arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)Z")
	public boolean method9344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt10668 && arg0 <= this.anInt10660 && this.anInt10662 <= arg1 && arg1 <= this.anInt10674;
	}
}

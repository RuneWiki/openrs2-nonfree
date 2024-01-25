import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class187_Sub3 extends Class187 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	private final int anInt7047;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
	private final int anInt7050;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	private final int anInt7053;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	private final int anInt7048;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class187_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7047 = arg2;
		this.anInt7050 = arg3;
		this.anInt7053 = arg0;
		this.anInt7048 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(III)V")
	@Override
	public void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7053 >> 12;
		@Pc(17) int local17 = this.anInt7047 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt7048 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt7050 * arg0 >> 12;
		Static18.method3525(local31, local10, super.anInt8303, local17, local24, super.anInt8298);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7053 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7047 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7048 >> 12;
		@Pc(39) int local39 = this.anInt7050 * arg1 >> 12;
		Static243.method3466(local32, local39, local17, local10, super.anInt8301);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	@Override
	public void method6715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt7053 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt7047 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt7048 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt7050 >> 12;
		Static584.method7575(local15, super.anInt8298, super.anInt8303, super.anInt8301, local29, local36, local22);
	}
}

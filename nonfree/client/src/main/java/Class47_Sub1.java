import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
	private final int anInt946;

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
	private final int anInt943;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
	private final int anInt945;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
	private final int anInt939;

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "I")
	private final int anInt941;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
	private final int anInt938;

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
	private final int anInt949;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
	private final int anInt936;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt946 = arg3;
		this.anInt943 = arg2;
		this.anInt945 = arg7;
		this.anInt939 = arg6;
		this.anInt941 = arg4;
		this.anInt938 = arg0;
		this.anInt949 = arg1;
		this.anInt936 = arg5;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BII)V")
	@Override
	public void method8416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt938 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt949 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt943 * arg0 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt946 >> 12;
		@Pc(46) int local46 = this.anInt941 * arg0 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt936 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt939 >> 12;
		@Pc(67) int local67 = this.anInt945 * arg1 >> 12;
		Static650.method8559(local32, local53, local10, local46, local67, local60, super.anInt10096, local17, local39);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}

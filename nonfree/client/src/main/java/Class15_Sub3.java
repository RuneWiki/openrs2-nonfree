import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	private int anInt5171;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	private int anInt5174;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	private int anInt5169;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private int anInt5170;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIII)V")
	public Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5171 = arg3;
		this.anInt5174 = arg1;
		this.anInt5169 = arg0;
		this.anInt5170 = arg2;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
	@Override
	public void method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt5169 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5170 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5174 >> 12;
		@Pc(31) int local31 = this.anInt5171 * arg1 >> 12;
		Static272.method4158(local24, local6, local31, local17, this.anInt5625);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(III)V")
	@Override
	public void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}

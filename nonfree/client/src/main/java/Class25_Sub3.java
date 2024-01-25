import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
	private final int anInt7035;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	private final int anInt7025;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	private final int anInt7027;

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
	private final int anInt7033;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class25_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7035 = arg2;
		this.anInt7025 = arg1;
		this.anInt7027 = arg3;
		this.anInt7033 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
	@Override
	public void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7033 >> 12;
		@Pc(17) int local17 = this.anInt7035 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt7025 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt7027 >> 12;
		Static118.method2475(local10, super.anInt7038, super.anInt7041, local17, local31, super.anInt7042, local24);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)V")
	@Override
	public void method6074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7033 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt7035 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt7025 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt7027 >> 12;
		Static274.method4880(super.anInt7041, local10, local29, local36, local17);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
	@Override
	public void method6075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}

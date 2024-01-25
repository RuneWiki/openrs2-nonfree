import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	private final int anInt2385;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	private final int anInt2384;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	private final int anInt2386;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	private final int anInt2382;

	static {
		new Class62(null, "Dieses System darf nicht missbraucht werden!", null, null);
		new Class62(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2385 = arg2;
		this.anInt2384 = arg0;
		this.anInt2386 = arg3;
		this.anInt2382 = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZII)V")
	@Override
	public void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)V")
	@Override
	public void method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2384 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2385 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2382 >> 12;
		@Pc(37) int local37 = this.anInt2386 * arg1 >> 12;
		Static221.method5896(local37, local10, super.anInt2476, local30, local17);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2384 * arg0 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt2385 >> 12;
		@Pc(32) int local32 = this.anInt2382 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2386 * arg1 >> 12;
		Static87.method1482(local32, local39, local25, super.anInt2476, super.anInt2475, local10, super.anInt2474);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class77_Sub4 extends Class77 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	private final int anInt6164;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	private final int anInt6163;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private final int anInt6160;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
	private final int anInt6167;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class77_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6164 = arg1;
		this.anInt6163 = arg3;
		this.anInt6160 = arg0;
		this.anInt6167 = arg2;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt6160 >> 12;
		@Pc(23) int local23 = this.anInt6167 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt6164 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt6163 * arg1 >> 12;
		Static84.method1840(super.anInt6155, local16, super.anInt6154, local30, super.anInt6157, local23, local37);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IBI)V")
	@Override
	public void method5256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6160 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6167 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6164 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt6163 >> 12;
		Static307.method1300(super.anInt6155, local17, local10, local31, local24);
	}
}

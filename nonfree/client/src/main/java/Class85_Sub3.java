import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class85_Sub3 extends Class85 {

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	private final int anInt7084;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	private final int anInt7078;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	private final int anInt7085;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	private final int anInt7075;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIII)V")
	public Class85_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt7084 = arg0;
		this.anInt7078 = arg1;
		this.anInt7085 = arg3;
		this.anInt7075 = arg2;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7084 >> 12;
		@Pc(25) int local25 = this.anInt7075 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt7078 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt7085 * arg1 >> 12;
		Static315.method4479(local25, super.anInt7170, local39, local10, local32);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
	@Override
	public void method5867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}

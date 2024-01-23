import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class135 {

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	public int anInt4690;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int anInt4685;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!bh;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIII)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class18 local5 = Static79.method1346(arg0);
		this.anInt4690 = arg2;
		this.anInt4686 = arg3;
		this.anInt4685 = arg1;
		if (Static294.aBoolean367 || local5.anInt518 == -1) {
			this.aClass18_1 = local5;
		} else {
			this.aClass18_1 = Static79.method1346(local5.anInt518);
		}
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!bh;III)V")
	public Class135(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4686 = arg3;
		this.aClass18_1 = arg0;
		this.anInt4690 = arg2;
		this.anInt4685 = arg1;
	}
}

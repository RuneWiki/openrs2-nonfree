import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class88 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!re;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V")
	public Class88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass146_1 = Static52.method1017(arg0);
		this.anInt2769 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!re;I)V")
	public Class88(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1) {
		this.anInt2769 = arg1;
		this.aClass146_1 = arg0;
	}
}

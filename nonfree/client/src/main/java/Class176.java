import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class176 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!nj;")
	public Class121 aClass121_1;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public int anInt5534;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
	public Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass121_1 = Static89.method1576(arg0);
		this.anInt5534 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!nj;I)V")
	public Class176(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1) {
		this.anInt5534 = arg1;
		this.aClass121_1 = arg0;
	}
}

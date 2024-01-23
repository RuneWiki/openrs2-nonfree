import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class176 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!ad;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public int anInt5087;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass5_1 = Static100.method1811(arg0);
		this.anInt5087 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ad;I)V")
	public Class176(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		this.anInt5087 = arg1;
		this.aClass5_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class165 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!ic;")
	private final Class113 aClass113_81;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class165(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		new Class167(64);
		this.aClass113_81 = arg2;
		this.anInt4189 = this.aClass113_81.method2271(15);
	}
}

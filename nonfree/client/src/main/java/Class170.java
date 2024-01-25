import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class170 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!ok;")
	private final Class178 aClass178_81;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public final int anInt4583;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class170(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		new Class126(64);
		this.aClass178_81 = arg2;
		this.anInt4583 = this.aClass178_81.method3833(15);
	}
}

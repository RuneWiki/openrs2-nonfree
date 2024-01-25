import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sla")
public final class Class344 {

	@OriginalMember(owner = "client!sla", name = "n", descriptor = "[Lclient!gv;")
	private static final Class146[] aClass146Array1 = new Class146[32];

	static {
		@Pc(103) Class146[] local103 = Static24.method685();
		for (@Pc(105) int local105 = 0; local105 < local103.length; local105++) {
			aClass146Array1[local103[local105].anInt3686] = local103[local105];
		}
	}

	@OriginalMember(owner = "client!sla", name = "<init>", descriptor = "(II)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sla", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}

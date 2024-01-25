import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class5_Sub3_Sub11 extends Class5_Sub3 {

	@OriginalMember(owner = "client!he", name = "S", descriptor = "[Lclient!cp;")
	public static final Class39[] aClass39Array1 = new Class39[5];

	static {
		for (@Pc(14) int local14 = 0; local14 < aClass39Array1.length; local14++) {
			aClass39Array1[local14] = new Class39();
		}
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		return Static164.anIntArray337;
	}
}

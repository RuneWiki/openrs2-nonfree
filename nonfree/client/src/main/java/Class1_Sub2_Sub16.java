import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			Static319.method514(local5, 0, Static299.anInt5670, Static7.anIntArray13[arg0]);
		}
		return local5;
	}
}

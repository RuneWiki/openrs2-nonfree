import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class Class76 implements Interface14 {

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	public final int anInt1746;

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
	public final int anInt1747;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!fda;")
	public final Class112 aClass112_4;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public final int anInt1745;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!aba;")
	public final Class4 aClass4_4;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILclient!fda;Lclient!aba;II)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1746 = arg0;
		this.anInt1747 = arg3;
		this.aClass112_4 = arg1;
		this.anInt1745 = arg4;
		this.aClass4_4 = arg2;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static428.aClass370_6;
	}
}

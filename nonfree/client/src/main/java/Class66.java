import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class Class66 implements Interface23 {

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "Lclient!rg;")
	public final Class293 aClass293_8;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
	public final int anInt8331;

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
	public final int anInt8333;

	@OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
	public final int anInt8337;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Lclient!al;")
	public final Class15 aClass15_10;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILclient!rg;Lclient!al;II)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Class293 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass293_8 = arg1;
		this.anInt8331 = arg3;
		this.anInt8333 = arg4;
		this.anInt8337 = arg0;
		this.aClass15_10 = arg2;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static518.aClass384_65;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class229 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public int anInt6253;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public int anInt6258;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	public int anInt6259;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
	public boolean aBoolean541;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	public int anInt6260;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	public int anInt6261;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public int anInt6254 = 8;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public int anInt6255 = 16777215;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!cu;)V")
	public void method4868(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2582();
			if (local7 == 0) {
				return;
			}
			this.method4869(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method4869(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6254 = arg0.method2588();
		} else if (arg1 == 2) {
			this.aBoolean541 = true;
		} else if (arg1 == 3) {
			this.anInt6259 = arg0.method2641();
			this.anInt6261 = arg0.method2641();
			this.anInt6258 = arg0.method2641();
		} else if (arg1 == 4) {
			this.anInt6260 = arg0.method2582();
		} else if (arg1 == 5) {
			this.anInt6253 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt6255 = arg0.method2604();
		}
	}
}

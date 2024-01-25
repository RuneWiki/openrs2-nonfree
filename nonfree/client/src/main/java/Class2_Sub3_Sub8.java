import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	private int anInt6757;

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.anInt6757 = arg0.method5172();
		this.aString79 = arg0.method5178();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6024(this.aString79, this.anInt6757);
	}
}

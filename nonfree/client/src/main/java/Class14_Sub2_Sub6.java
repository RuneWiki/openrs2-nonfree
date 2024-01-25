import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class14_Sub2_Sub6 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	private int anInt6512;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.anInt6512 = arg0.method5878();
		this.aString68 = arg0.method5898();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5440(this.aString68, this.anInt6512);
	}
}

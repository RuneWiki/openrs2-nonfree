import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class14_Sub2_Sub2 extends Class14_Sub2 {

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		if (arg0.method5866() != 255) {
			arg0.anInt7264--;
			this.aLong27 = arg0.method5907();
		}
		this.aString10 = arg0.method5886();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.method5441(this.aLong27, this.aString10);
	}
}

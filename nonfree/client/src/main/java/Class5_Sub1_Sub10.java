import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class5_Sub1_Sub10 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
	private int anInt8030;

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt8030 = arg0.method7804();
		this.aString77 = arg0.method7847();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4093(this.aString77, this.anInt8030);
	}
}

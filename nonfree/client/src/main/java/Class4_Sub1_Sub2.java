import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "J")
	private long aLong38 = -1L;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Ljava/lang/String;")
	private String aString11 = null;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		if (arg0.method8865() != 255) {
			arg0.anInt10466--;
			this.aLong38 = arg0.method8830();
		}
		this.aString11 = arg0.method8852();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5959(this.aLong38, this.aString11);
	}
}

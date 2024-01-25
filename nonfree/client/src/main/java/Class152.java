import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class152 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
	public int anInt3373;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Z")
	public boolean aBoolean270 = true;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!ib;)V")
	public void method2968(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method2969(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ib;ZI)V")
	private void method2969(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static101.method1448(arg0.method8488());
		} else if (arg1 == 2) {
			this.anInt3373 = arg0.method8527();
		} else if (arg1 == 4) {
			this.aBoolean270 = false;
		} else if (arg1 == 5) {
			this.aString49 = arg0.method8497();
			return;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	public boolean method2972() {
		return this.aChar2 == 's';
	}
}

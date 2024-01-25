import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class5_Sub10_Sub3 extends Class5_Sub10 {

	@OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "I")
	private int anInt7511;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "B")
	private byte aByte114;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "I")
	private int anInt7505 = -1;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!qc;Z)V")
	@Override
	public void method6635(@OriginalArg(0) Class5_Sub45 arg0) {
		@Pc(9) Class126 local9 = arg0.aClass126Array1[this.anInt7505];
		local9.anInt3599 = this.anInt7511;
		local9.aByte41 = this.aByte114;
		local9.aString26 = this.aString63;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!mc;)V")
	@Override
	public void method6633(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt7505 = arg0.method7860();
		this.aByte114 = arg0.method7861();
		this.anInt7511 = arg0.method7860();
		arg0.method7823();
		this.aString63 = arg0.method7847();
	}
}

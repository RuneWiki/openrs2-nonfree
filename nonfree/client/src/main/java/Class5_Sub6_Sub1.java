import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class5_Sub6_Sub1 extends Class5_Sub6 {

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "B")
	private byte aByte14;

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
	private int anInt652 = -1;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method9152(@OriginalArg(0) Class5_Sub55 arg0) {
		@Pc(16) Class395 local16 = arg0.aClass395Array1[this.anInt652];
		local16.anInt10839 = this.anInt648;
		local16.aByte147 = this.aByte14;
		local16.aString120 = this.aString8;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method9154(@OriginalArg(0) Class5_Sub36 arg0) {
		this.anInt652 = arg0.method7333();
		this.aByte14 = arg0.method7318();
		this.anInt648 = arg0.method7333();
		arg0.method7304();
		this.aString8 = arg0.method7281();
	}
}

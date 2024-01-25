import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class5_Sub10_Sub4 extends Class5_Sub10 {

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
	private int anInt7849;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "J")
	private long aLong215 = -1L;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "Ljava/lang/String;")
	private String aString74 = null;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qc;Z)V")
	@Override
	public void method6635(@OriginalArg(0) Class5_Sub45 arg0) {
		@Pc(11) Class126 local11 = new Class126();
		local11.aString26 = this.aString74;
		local11.aByte41 = this.aByte115;
		local11.anInt3599 = this.anInt7849;
		arg0.method6691(local11);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!mc;)V")
	@Override
	public void method6633(@OriginalArg(1) Class5_Sub41 arg0) {
		if (arg0.method7816() != 255) {
			arg0.anInt9230--;
			this.aLong215 = arg0.method7823();
		}
		this.aString74 = arg0.method7815();
		this.anInt7849 = arg0.method7860();
		this.aByte115 = arg0.method7861();
		arg0.method7823();
		if (Static543.aBoolean760) {
			System.out.println("memberhash:" + this.aLong215 + " membername:" + this.aString74);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class5_Sub6_Sub4 extends Class5_Sub6 {

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "B")
	private byte aByte148;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	private int anInt10856;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Ljava/lang/String;")
	private String aString121 = null;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "J")
	private long aLong307 = -1L;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method9152(@OriginalArg(0) Class5_Sub55 arg0) {
		@Pc(7) Class395 local7 = new Class395();
		local7.anInt10839 = this.anInt10856;
		local7.aByte147 = this.aByte148;
		local7.aString120 = this.aString121;
		arg0.method9191(local7);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!wq;I)V")
	@Override
	public void method9154(@OriginalArg(0) Class5_Sub36 arg0) {
		if (arg0.method7291() != 255) {
			arg0.anInt8456--;
			this.aLong307 = arg0.method7304();
		}
		this.aString121 = arg0.method7312();
		this.anInt10856 = arg0.method7333();
		this.aByte148 = arg0.method7318();
		arg0.method7304();
		if (Static438.aBoolean484) {
			System.out.println("memberhash:" + this.aLong307 + " membername:" + this.aString121);
		}
	}
}

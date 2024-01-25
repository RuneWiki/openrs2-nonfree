import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub31_Sub3 extends Class3_Sub31 {

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	private int anInt9216;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "B")
	private byte aByte135;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "J")
	private long aLong268 = -1L;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Ljava/lang/String;")
	private String aString109 = null;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!hka;)V")
	@Override
	public void method8255(@OriginalArg(1) Class3_Sub30 arg0) {
		@Pc(7) Class391 local7 = new Class391();
		local7.aString127 = this.aString109;
		local7.aByte181 = this.aByte135;
		local7.anInt10842 = this.anInt9216;
		arg0.method3903(local7);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8254(@OriginalArg(1) Class3_Sub25 arg0) {
		if (arg0.method8632() != 255) {
			arg0.anInt9765--;
			this.aLong268 = arg0.method8600();
		}
		this.aString109 = arg0.method8617();
		this.anInt9216 = arg0.method8593();
		this.aByte135 = arg0.method8621();
		arg0.method8600();
		if (Static469.aBoolean575) {
			System.out.println("memberhash:" + this.aLong268 + " membername:" + this.aString109);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uka")
public final class Class2_Sub34_Sub3 extends Class2_Sub34 {

	@OriginalMember(owner = "client!uka", name = "u", descriptor = "B")
	private byte aByte131;

	@OriginalMember(owner = "client!uka", name = "z", descriptor = "I")
	private int anInt10204;

	@OriginalMember(owner = "client!uka", name = "B", descriptor = "Ljava/lang/String;")
	private String aString114 = null;

	@OriginalMember(owner = "client!uka", name = "v", descriptor = "J")
	private long aLong316 = -1L;

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!nw;B)V")
	@Override
	public void method8955(@OriginalArg(0) Class2_Sub43 arg0) {
		@Pc(15) Class233 local15 = new Class233();
		local15.anInt6059 = this.anInt10204;
		local15.aByte80 = this.aByte131;
		local15.aString65 = this.aString114;
		arg0.method6389(local15);
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!et;Z)V")
	@Override
	public void method8952(@OriginalArg(0) Class2_Sub20 arg0) {
		if (arg0.method8581(-17416) != 255) {
			arg0.anInt9723--;
			this.aLong316 = arg0.method8590();
		}
		this.aString114 = arg0.method8569();
		this.anInt10204 = arg0.method8575();
		this.aByte131 = arg0.method8536();
		arg0.method8590();
		if (Static669.aBoolean900) {
			System.out.println("memberhash:" + this.aLong316 + " membername:" + this.aString114);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class2_Sub34_Sub4 extends Class2_Sub34 {

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "B")
	private byte aByte132;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	private int anInt10218;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Ljava/lang/String;")
	private String aString115;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	private int anInt10216 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!nw;B)V")
	@Override
	public void method8955(@OriginalArg(0) Class2_Sub43 arg0) {
		@Pc(17) Class233 local17 = arg0.aClass233Array1[this.anInt10216];
		local17.aByte80 = this.aByte132;
		local17.aString65 = this.aString115;
		local17.anInt6059 = this.anInt10218;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!et;Z)V")
	@Override
	public void method8952(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt10216 = arg0.method8575();
		this.aByte132 = arg0.method8536();
		this.anInt10218 = arg0.method8575();
		arg0.method8590();
		this.aString115 = arg0.method8553();
	}
}

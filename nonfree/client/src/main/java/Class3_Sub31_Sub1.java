import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class3_Sub31_Sub1 extends Class3_Sub31 {

	@OriginalMember(owner = "client!iea", name = "t", descriptor = "B")
	private byte aByte66;

	@OriginalMember(owner = "client!iea", name = "u", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!iea", name = "w", descriptor = "B")
	private byte aByte67;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8254(@OriginalArg(1) Class3_Sub25 arg0) {
		this.aString41 = arg0.method8617();
		if (this.aString41 != null) {
			arg0.method8632();
			this.aByte66 = arg0.method8621();
			this.aByte67 = arg0.method8621();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLclient!hka;)V")
	@Override
	public void method8255(@OriginalArg(1) Class3_Sub30 arg0) {
		if (this.aString41 != null) {
			arg0.aByte61 = this.aByte67;
			arg0.aByte60 = this.aByte66;
		}
		arg0.aString39 = this.aString41;
	}
}

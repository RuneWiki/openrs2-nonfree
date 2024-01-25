import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class3_Sub31_Sub4 extends Class3_Sub31 {

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
	private int anInt9435;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "Ljava/lang/String;")
	private String aString112;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "B")
	private byte aByte140;

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
	private int anInt9438 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8254(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt9438 = arg0.method8593();
		this.aByte140 = arg0.method8621();
		this.anInt9435 = arg0.method8593();
		arg0.method8600();
		this.aString112 = arg0.method8613();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!hka;)V")
	@Override
	public void method8255(@OriginalArg(1) Class3_Sub30 arg0) {
		@Pc(9) Class391 local9 = arg0.aClass391Array1[this.anInt9438];
		local9.aString127 = this.aString112;
		local9.aByte181 = this.aByte140;
		local9.anInt10842 = this.anInt9435;
	}
}

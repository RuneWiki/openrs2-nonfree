import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!au", name = "r", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "I")
	private int anInt907 = -1;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZLclient!gca;)V")
	@Override
	public void method5405(@OriginalArg(1) Class3_Sub20 arg0) {
		@Pc(16) Class170 local16 = arg0.aClass170Array1[this.anInt907];
		local16.aString55 = this.aString8;
		local16.aByte66 = this.aByte19;
		local16.anInt4576 = this.anInt913;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!fca;Z)V")
	@Override
	public void method5404(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt907 = arg0.method4858();
		this.aByte19 = arg0.method4861();
		this.anInt913 = arg0.method4858();
		arg0.method4865();
		this.aString8 = arg0.method4847();
	}
}

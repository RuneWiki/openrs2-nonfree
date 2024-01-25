import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class3_Sub18_Sub3 extends Class3_Sub18 {

	@OriginalMember(owner = "client!rga", name = "s", descriptor = "B")
	private byte aByte120;

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
	private int anInt8218;

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "Ljava/lang/String;")
	private String aString99 = null;

	@OriginalMember(owner = "client!rga", name = "v", descriptor = "J")
	private long aLong230 = -1L;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!dt;I)V")
	@Override
	public void method7416(@OriginalArg(0) Class3_Sub4 arg0) {
		if (arg0.method7954() != 255) {
			arg0.anInt9739--;
			this.aLong230 = arg0.method7946();
		}
		this.aString99 = arg0.method7917();
		this.anInt8218 = arg0.method7951();
		this.aByte120 = arg0.method7960();
		arg0.method7946();
		if (Static508.aBoolean558) {
			System.out.println("memberhash:" + this.aLong230 + " membername:" + this.aString99);
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!hr;B)V")
	@Override
	public void method7415(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) Class78 local7 = new Class78();
		local7.anInt2026 = this.anInt8218;
		local7.aByte39 = this.aByte120;
		local7.aString30 = this.aString99;
		arg0.method3516(local7);
	}
}

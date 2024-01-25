import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class3_Sub18_Sub1 extends Class3_Sub18 {

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	private int anInt2929;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "B")
	private byte aByte52;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	private int anInt2927 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!dt;I)V")
	@Override
	public void method7416(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt2927 = arg0.method7951();
		this.aByte52 = arg0.method7960();
		this.anInt2929 = arg0.method7951();
		arg0.method7946();
		this.aString41 = arg0.method7922();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!hr;B)V")
	@Override
	public void method7415(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(13) Class78 local13 = arg0.aClass78Array1[this.anInt2927];
		local13.aByte39 = this.aByte52;
		local13.aString30 = this.aString41;
		local13.anInt2026 = this.anInt2929;
	}
}

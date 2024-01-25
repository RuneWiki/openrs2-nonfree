import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class217 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "B")
	public byte aByte75;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!mp;")
	public Interface8 anInterface8_6;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "B")
	public final byte aByte76;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_40;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!ig;Lclient!mp;III)V")
	public Class217(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte75 = (byte) arg4;
		this.aShort94 = (short) arg2;
		this.anInterface8_6 = arg1;
		this.aByte76 = (byte) arg3;
		this.aClass47_Sub2_40 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public void method5567() {
		this.aClass47_Sub2_40.method2812(this.anInterface8_6);
		this.anInterface8_6.method2118(this);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	public void method5568() {
		this.aClass47_Sub2_40.method2812(this.anInterface8_6);
		this.anInterface8_6.method2115(this);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method5569() {
		this.aClass47_Sub2_40.method2812(this.anInterface8_6);
		this.anInterface8_6.method2117(this);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
	public void method5570() {
		this.aClass47_Sub2_40.method2812(this.anInterface8_6);
		this.anInterface8_6.method2113(this);
	}
}

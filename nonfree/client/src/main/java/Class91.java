import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class91 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "B")
	public final byte aByte21;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_20;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "B")
	public byte aByte20;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!va;")
	public Interface8 anInterface8_4;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!h;Lclient!va;III)V")
	public Class91(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte21 = (byte) arg3;
		this.aShort30 = (short) arg2;
		this.aClass32_Sub2_20 = arg0;
		this.aByte20 = (byte) arg4;
		this.anInterface8_4 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public void method2597() {
		this.aClass32_Sub2_20.method2251(this.anInterface8_4);
		this.anInterface8_4.method1848(this);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public void method2598() {
		this.aClass32_Sub2_20.method2251(this.anInterface8_4);
		this.anInterface8_4.method1850(this);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public void method2599() {
		this.aClass32_Sub2_20.method2251(this.anInterface8_4);
		this.anInterface8_4.method1849(this);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	public void method2600() {
		this.aClass32_Sub2_20.method2251(this.anInterface8_4);
		this.anInterface8_4.method1851(this);
	}
}

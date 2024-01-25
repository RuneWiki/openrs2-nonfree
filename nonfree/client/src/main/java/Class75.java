import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class75 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "B")
	public final byte aByte23;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_3;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!eb;")
	public Interface2 anInterface2_2;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ic;Lclient!eb;III)V")
	public Class75(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte23 = (byte) arg3;
		this.aShort33 = (short) arg2;
		this.aClass48_Sub2_3 = arg0;
		this.anInterface2_2 = arg1;
		this.aByte24 = (byte) arg4;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method1734() {
		this.aClass48_Sub2_3.method2614(this.anInterface2_2);
		this.anInterface2_2.method2377(this);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public void method1735() {
		this.aClass48_Sub2_3.method2614(this.anInterface2_2);
		this.anInterface2_2.method2376(this);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public void method1736() {
		this.aClass48_Sub2_3.method2614(this.anInterface2_2);
		this.anInterface2_2.method2374(this);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	public void method1737() {
		this.aClass48_Sub2_3.method2614(this.anInterface2_2);
		this.anInterface2_2.method2373(this);
	}
}

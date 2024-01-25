import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class126 {

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "B")
	public byte aByte43;

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!ec;")
	public Interface3 anInterface3_3;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_22;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!nm;Lclient!ec;III)V")
	public Class126(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte44 = (byte) arg3;
		this.aByte43 = (byte) arg4;
		this.anInterface3_3 = arg1;
		this.aShort57 = (short) arg2;
		this.aClass164_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
	public void method2614() {
		this.aClass164_Sub1_22.method3611(this.anInterface3_3);
		this.anInterface3_3.method2569(this);
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public void method2615() {
		this.aClass164_Sub1_22.method3611(this.anInterface3_3);
		this.anInterface3_3.method2570(this);
	}

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V")
	public void method2616() {
		this.aClass164_Sub1_22.method3611(this.anInterface3_3);
		this.anInterface3_3.method2568(this);
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	public void method2617() {
		this.aClass164_Sub1_22.method3611(this.anInterface3_3);
		this.anInterface3_3.method2571(this);
	}
}

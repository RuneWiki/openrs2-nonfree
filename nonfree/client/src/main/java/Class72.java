import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class72 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_15;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!pc;")
	public Interface6 anInterface6_4;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "B")
	public final byte aByte8;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!fu;Lclient!pc;III)V")
	public Class72(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass63_Sub2_15 = arg0;
		this.aByte9 = (byte) arg4;
		this.anInterface6_4 = arg1;
		this.aShort19 = (short) arg2;
		this.aByte8 = (byte) arg3;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	public void method1866() {
		this.aClass63_Sub2_15.method2117(this.anInterface6_4);
		this.anInterface6_4.method3369(this);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public void method1867() {
		this.aClass63_Sub2_15.method2117(this.anInterface6_4);
		this.anInterface6_4.method3367(this);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	public void method1868() {
		this.aClass63_Sub2_15.method2117(this.anInterface6_4);
		this.anInterface6_4.method3366(this);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public void method1869() {
		this.aClass63_Sub2_15.method2117(this.anInterface6_4);
		this.anInterface6_4.method3365(this);
	}
}

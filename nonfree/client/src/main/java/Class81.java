import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class81 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "B")
	public byte aByte25;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!um;")
	public Interface8 anInterface8_3;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_14;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ao;Lclient!um;III)V")
	public Class81(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte25 = (byte) arg4;
		this.aByte24 = (byte) arg3;
		this.anInterface8_3 = arg1;
		this.aShort42 = (short) arg2;
		this.aClass4_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method2499() {
		this.aClass4_Sub1_14.method579(this.anInterface8_3);
		this.anInterface8_3.method4973(this);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public void method2500() {
		this.aClass4_Sub1_14.method579(this.anInterface8_3);
		this.anInterface8_3.method4975(this);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public void method2501() {
		this.aClass4_Sub1_14.method579(this.anInterface8_3);
		this.anInterface8_3.method4976(this);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method2502() {
		this.aClass4_Sub1_14.method579(this.anInterface8_3);
		this.anInterface8_3.method4974(this);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class161 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_33;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!kd;")
	public Interface6 anInterface6_5;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!ks;Lclient!kd;III)V")
	public Class161(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort68 = (short) arg2;
		this.aClass63_Sub1_33 = arg0;
		this.aByte46 = (byte) arg4;
		this.anInterface6_5 = arg1;
		this.aByte47 = (byte) arg3;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method4364() {
		this.aClass63_Sub1_33.method3367(this.anInterface6_5);
		this.anInterface6_5.method5381(this);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public void method4365() {
		this.aClass63_Sub1_33.method3367(this.anInterface6_5);
		this.anInterface6_5.method5382(this);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public void method4366() {
		this.aClass63_Sub1_33.method3367(this.anInterface6_5);
		this.anInterface6_5.method5383(this);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	public void method4367() {
		this.aClass63_Sub1_33.method3367(this.anInterface6_5);
		this.anInterface6_5.method5385(this);
	}
}

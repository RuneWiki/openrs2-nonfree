import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class190 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "B")
	public final byte aByte66;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_38;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "B")
	public byte aByte65;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!na;")
	public Interface7 anInterface7_4;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!cg;Lclient!na;III)V")
	public Class190(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte66 = (byte) arg3;
		this.aShort85 = (short) arg2;
		this.aClass37_Sub1_38 = arg0;
		this.aByte65 = (byte) arg4;
		this.anInterface7_4 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method5150() {
		this.aClass37_Sub1_38.method770(this.anInterface7_4);
		this.anInterface7_4.method5588(this);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method5151() {
		this.aClass37_Sub1_38.method770(this.anInterface7_4);
		this.anInterface7_4.method5585(this);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public void method5152() {
		this.aClass37_Sub1_38.method770(this.anInterface7_4);
		this.anInterface7_4.method5589(this);
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public void method5153() {
		this.aClass37_Sub1_38.method770(this.anInterface7_4);
		this.anInterface7_4.method5586(this);
	}
}

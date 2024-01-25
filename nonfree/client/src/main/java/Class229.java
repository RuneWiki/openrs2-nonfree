import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class229 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "B")
	public final byte aByte71;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!la;")
	public Interface7 anInterface7_6;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "S")
	public final short aShort93;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_39;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "B")
	public byte aByte72;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!qi;Lclient!la;III)V")
	public Class229(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aByte71 = (byte) arg3;
		this.anInterface7_6 = arg1;
		this.aShort93 = (short) arg2;
		this.aClass82_Sub2_39 = arg0;
		this.aByte72 = (byte) arg4;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method5369() {
		this.aClass82_Sub2_39.method4586(this.anInterface7_6);
		this.anInterface7_6.method5131(this);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public void method5370() {
		this.aClass82_Sub2_39.method4586(this.anInterface7_6);
		this.anInterface7_6.method5133(this);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public void method5371() {
		this.aClass82_Sub2_39.method4586(this.anInterface7_6);
		this.anInterface7_6.method5134(this);
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public void method5372() {
		this.aClass82_Sub2_39.method4586(this.anInterface7_6);
		this.anInterface7_6.method5129(this);
	}
}

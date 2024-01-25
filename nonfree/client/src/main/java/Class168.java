import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class168 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!eb;")
	public Interface3 anInterface3_4;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "B")
	public final byte aByte54;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_28;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!sq;Lclient!eb;III)V")
	public Class168(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aShort71 = (short) arg2;
		this.anInterface3_4 = arg1;
		this.aByte54 = (byte) arg3;
		this.aClass46_Sub2_28 = arg0;
		this.aByte53 = (byte) arg4;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public void method4465() {
		this.aClass46_Sub2_28.method5224(this.anInterface3_4);
		this.anInterface3_4.method5381(this);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method4466() {
		this.aClass46_Sub2_28.method5224(this.anInterface3_4);
		this.anInterface3_4.method5383(this);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public void method4467() {
		this.aClass46_Sub2_28.method5224(this.anInterface3_4);
		this.anInterface3_4.method5384(this);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public void method4468() {
		this.aClass46_Sub2_28.method5224(this.anInterface3_4);
		this.anInterface3_4.method5382(this);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lclient!ida;")
	public Class128 aClass128_2;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!fg;)V")
	public Class76_Sub2(@OriginalArg(0) Class39_Sub1 arg0) {
		super(arg0);
		this.aClass128_2 = new Class128(arg0);
		super.aClass63_Sub1_42 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_45 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_44 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_39 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_43 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.lb = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_47 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_46 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_41 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
		super.aClass63_Sub1_40 = new Class63_Sub1_Sub1(super.aClass39_Sub1_14);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	@Override
	public void method5864() {
		this.aClass128_2 = new Class128(super.aClass39_Sub1_14);
	}
}

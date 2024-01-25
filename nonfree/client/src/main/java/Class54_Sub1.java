import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!qk", name = "lb", descriptor = "Lclient!ra;")
	public static Class80 lb;

	@OriginalMember(owner = "client!qk", name = "ib", descriptor = "Lclient!vba;")
	public Class300 aClass300_2;

	static {
		new Class88("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class54_Sub1(@OriginalArg(0) Class42_Sub2 arg0) {
		super(arg0);
		this.aClass300_2 = new Class300(arg0);
		super.aClass26_Sub1_55 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_57 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_58 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_60 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_51 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_56 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_54 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_52 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_59 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
		super.aClass26_Sub1_53 = new Class26_Sub1_Sub2(super.aClass42_Sub2_14);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public void method6537() {
		this.aClass300_2 = new Class300(super.aClass42_Sub2_14);
	}
}

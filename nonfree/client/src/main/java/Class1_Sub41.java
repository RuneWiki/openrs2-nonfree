import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public int anInt7088 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public int anInt7092 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public int anInt7089 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public int anInt7090 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
	public int anInt7094 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public int anInt7096 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
	public int anInt7097 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	public int anInt7095 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!da;")
	public final Class1_Sub8 aClass1_Sub8_1;

	static {
		new Class96("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class1_Sub41(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass1_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public boolean method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt7094 && this.anInt7097 >= arg1 && this.anInt7090 <= arg0 && arg0 <= this.anInt7092) {
			return true;
		} else {
			return this.anInt7095 <= arg1 && this.anInt7096 >= arg1 && this.anInt7089 <= arg0 && this.anInt7088 >= arg0;
		}
	}
}

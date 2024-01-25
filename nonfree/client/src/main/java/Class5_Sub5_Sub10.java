import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class5_Sub5_Sub10 extends Class5_Sub5 {

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	public int anInt3699;

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
	public int anInt3702;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public int anInt3704;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
	public int anInt3708;

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Lclient!hja;")
	public final Class161 aClass161_2;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!dn;")
	public final Class92 aClass92_1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!hja;Lclient!kq;)V")
	public Class5_Sub5_Sub10(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		this.aClass161_2 = arg0;
		this.aClass92_1 = this.aClass161_2.method3220();
		this.method3238();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public void method3238() {
		this.anInt3702 = this.aClass161_2.anInt3675;
		this.anInt3705 = this.aClass161_2.anInt3678;
		this.anInt3708 = this.aClass161_2.anInt3681;
		if (this.aClass161_2.aClass203_5 != null) {
			this.aClass161_2.aClass203_5.method8328(this.aClass92_1.anInt1844, this.aClass92_1.anInt1837, this.aClass92_1.anInt1850, Static475.anIntArray476);
		}
		this.anInt3699 = Static475.anIntArray476[2];
		this.anInt3704 = Static475.anIntArray476[0];
	}
}

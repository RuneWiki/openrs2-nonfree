import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class107 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public int anInt3183;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Lclient!m;")
	public Class129 aClass129_1;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public int anInt3185;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!jo;")
	public Class107 aClass107_1;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public int anInt3186;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	public final int anInt3190;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public final int anInt3189;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3190 = arg1;
		this.anInt3189 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!jo;I)V")
	public Class107(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.aClass107_1 = arg0;
		this.anInt3190 = this.aClass107_1.anInt3190 + arg1;
		this.aClass129_1 = this.aClass107_1.aClass129_1;
		this.anInt3189 = this.aClass107_1.anInt3189;
	}
}

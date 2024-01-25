import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class158 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!mm;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public int anInt3919;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!os;")
	public Class118 aClass118_6;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	public int anInt3922;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	public final int anInt3921;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public final int anInt3925;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3921 = arg0;
		this.anInt3925 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!mm;I)V")
	public Class158(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		this.aClass158_1 = arg0;
		this.aClass118_6 = this.aClass158_1.aClass118_6;
		this.anInt3921 = this.aClass158_1.anInt3921;
		this.anInt3925 = arg1 + this.aClass158_1.anInt3925;
	}
}

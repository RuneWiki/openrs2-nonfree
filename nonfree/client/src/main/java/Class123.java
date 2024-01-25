import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class123 {

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "Lclient!dm;")
	public Class76 aClass76_6;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
	public int anInt3874;

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "Lclient!gfa;")
	public Class123 aClass123_2;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public final int anInt3868;

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
	public final int anInt3872;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(II)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3868 = arg0;
		this.anInt3872 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lclient!gfa;")
	public Class123 method3577(@OriginalArg(0) int arg0) {
		return new Class123(this.anInt3868, arg0);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Lclient!is;")
	public Class172 method3580() {
		return Static661.method9672(this.anInt3868);
	}
}

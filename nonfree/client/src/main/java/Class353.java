import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class353 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
	public int anInt9742;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
	public int anInt9744;

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
	public int anInt9747;

	@OriginalMember(owner = "client!vea", name = "o", descriptor = "Lclient!sk;")
	public Class39 aClass39_13;

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "Lclient!vea;")
	public Class353 aClass353_2;

	@OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
	public final int anInt9753;

	@OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
	public final int anInt9752;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(II)V")
	public Class353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9753 = arg0;
		this.anInt9752 = arg1;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lclient!vea;")
	public Class353 method8350(@OriginalArg(1) int arg0) {
		return new Class353(this.anInt9753, arg0);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)Lclient!hl;")
	public Class142 method8351() {
		return Static17.method867(this.anInt9753);
	}
}

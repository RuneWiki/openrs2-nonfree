import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class123 {

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public int anInt3082;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!kg;")
	public Class123 aClass123_1;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!vj;")
	public Class31 aClass31_4;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt3088;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	public final int anInt3081;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public final int anInt3080;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3081 = arg1;
		this.anInt3080 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!kg;I)V")
	public Class123(@OriginalArg(0) Class123 arg0, @OriginalArg(1) int arg1) {
		this.aClass123_1 = arg0;
		this.anInt3081 = this.aClass123_1.anInt3081 + arg1;
		this.anInt3080 = this.aClass123_1.anInt3080;
		this.aClass31_4 = this.aClass123_1.aClass31_4;
	}
}

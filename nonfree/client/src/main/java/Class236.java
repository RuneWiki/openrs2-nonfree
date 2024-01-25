import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class236 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!c;")
	public Class29 aClass29_7;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	public int anInt6774;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public int anInt6775;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!u;")
	public Class236 aClass236_2;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public int anInt6781;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public final int anInt6773;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public final int anInt6780;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(II)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6773 = arg0;
		this.anInt6780 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!u;I)V")
	public Class236(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.aClass236_2 = arg0;
		this.anInt6773 = this.aClass236_2.anInt6773;
		this.anInt6780 = this.aClass236_2.anInt6780 + arg1;
		this.aClass29_7 = this.aClass236_2.aClass29_7;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lclient!dv;")
	public Class55 method5358() {
		return Static33.method564(this.anInt6773);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!u;")
	public Class236 method5359(@OriginalArg(0) int arg0) {
		return new Class236(this.anInt6773, arg0);
	}
}

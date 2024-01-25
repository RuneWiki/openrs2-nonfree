import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class44 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public int anInt1279;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!nc;")
	public Class133 aClass133_2;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public int anInt1280;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!dj;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public int anInt1281;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public final int anInt1283;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public final int anInt1284;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1283 = arg1;
		this.anInt1284 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!dj;I)V")
	public Class44(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1) {
		this.aClass44_1 = arg0;
		this.aClass133_2 = this.aClass44_1.aClass133_2;
		this.anInt1284 = this.aClass44_1.anInt1284;
		this.anInt1283 = this.aClass44_1.anInt1283 + arg1;
	}
}
